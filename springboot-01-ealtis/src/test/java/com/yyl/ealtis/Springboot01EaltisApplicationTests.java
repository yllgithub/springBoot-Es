package com.yyl.ealtis;

//import com.yyl.ealtis.VO.Article;
import com.yyl.ealtis.VO.Book;
import com.yyl.ealtis.VO.SHutdown;
import com.yyl.ealtis.repository.BookRepository;
import com.yyl.ealtis.repository.ShuzhiX;
//import io.searchbox.client.JestClient;
//import io.searchbox.client.JestResult;
//import io.searchbox.core.Index;
//import io.searchbox.core.Search;
//import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01EaltisApplicationTests {

//    @Autowired
//    JestClient jestClient;

    @Autowired
    BookRepository bookRepository;
    @Autowired
    ShuzhiX shuzhiX;

//    @Test
//    public void contextLoads() {
//        //1.保存一个索引
//        Article article = new Article();
//        article.setId(1);
//        article.setAutor("张三");
//        article.setTitle("hello");
//        article.setContent("是酸奶 是的萨达是大家萨斯的");
//        Index index = new Index.Builder(article).index("book").type("article").build();
//        try {
//            jestClient.execute(index);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void test_seach() {
//        //搜索
//        //查询表达式
//        String json = "{\n" +
//                "    \"query\" : {\n" +
//                "        \"match_phrase\" : {\n" +
//                "            \"content\" : \"是的\"\n" +
//                "        }\n" +
//                "    }\n" +
//                "}";
//        Search sea = new Search.Builder(json).addIndex("book").addType("article").build();
//        try {
//            SearchResult result = jestClient.execute(sea);
//            String jsonString = result.getJsonString();
//            System.out.println(jsonString);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testRespository() {
        Book book = new Book();
        book.setId(1);
        book.setAutor("中国第一人");
        book.setBookName("中国巨作i");
        book.setBookContent("是搜集 i Love chinese Mani");
        Book index = bookRepository.index(book);
        System.out.println(index);
    }

    @Test
    public void ssss() {
        SHutdown su =new SHutdown();
        su.setId(1);
        su.setName("aaa");
        SHutdown index = shuzhiX.index(su);
        System.out.println(index);
    }

    @Test
    public void testListRespository() {
        List<Book> i = bookRepository.findBookByBookContentLike("u");
        for (Book b : i) {
            System.out.println(b);
        }
    }

    @Test
    public void testFindAllRespository() {
        Iterable<Book> all = bookRepository.findAll();
        for (Book b : all) {
            System.out.println(b);
        }
    }

    @Test
    public void dele_Respository() {
        bookRepository.deleteAll();
    }
    @Test
    public void reflush_Respository() {
        bookRepository.refresh();
    }
}

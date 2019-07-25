import org.testng.ISuiteListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
    @DataProvider (name = "test", parallel = true)
    public Object [][] parseLocaleData(){
        return new Object[][]{
                {null},
                {"test1"},
                {"test2"},
                {"test3"},};
        }


    @Test(dataProvider = "test")
    public void Test_method1(String locale){
        System.out.println(locale);
    }

    @Test
    public void Test_method2(){
        System.out.println("Hello. This is a test");
    }

    @Test
    public void Test_method3(){
        System.out.println("Hello. This is a test");
    }

}



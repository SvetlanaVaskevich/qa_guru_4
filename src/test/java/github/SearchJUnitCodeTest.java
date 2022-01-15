package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchJUnitCodeTest {

    @Test
    void searchJUnitCodeOnPagesTest(){
        open("https://github.com/");
        $("input[aria-label='Search GitHub']").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $(byText("Soft assertions")).click();
        $(".highlight.highlight-source-java",3).$("span",1).shouldHave(Condition.text("SoftAssertsExtension"));
    }
}

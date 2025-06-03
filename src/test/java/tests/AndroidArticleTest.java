package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;
import static io.qameta.allure.Allure.step;

public class AndroidArticleTest extends TestBase {

    @BeforeAll
    static void setup() {
        System.setProperty("platform", "android");
    }

    @Test
    void searchJavaTest() {
        step("Type search", () -> {
            $(accessibilityId("Text Button")).click();
            $(accessibilityId("Text Input")).sendKeys("Java" + "\n");
        });

        step("Verify content found", () ->
                $$(accessibilityId("Text Output"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}

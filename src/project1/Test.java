package project1;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;
import java.nio.charset.Charset;

/**
 * Create by wuqinglie on 2019/10/30 14:50
 */
public class Test {

    public static void main(String[] args) {

        File file = new File("");
        FilesKt.readText(file, Charsets.UTF_8);

        TestKt.function();
    }
}

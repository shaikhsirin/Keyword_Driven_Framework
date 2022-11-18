package com.qa.hs.tests;

import com.qa.hs.keyword.engine.KeyWordEngine;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class LoginTest {
    public KeyWordEngine keyWordEngine;
@Test
    public void loginTest() throws FileNotFoundException {
        keyWordEngine = new KeyWordEngine();
        keyWordEngine.startExecution("login");
    }
}

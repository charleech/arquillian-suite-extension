package org.eu.ingwar.tools.arquillian.extension.suite;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class Extension2Test {

    @Test
    public void shouldInject(InjectedObject bm) {
        System.out.println("Test2");
        Assert.assertNotNull(bm);
    }
}
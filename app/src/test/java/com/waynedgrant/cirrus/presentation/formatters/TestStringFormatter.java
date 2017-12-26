package com.waynedgrant.cirrus.presentation.formatters;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestStringFormatter {
    private StringFormatter testee;

    @Test
    public void GIVEN_null_string_WHEN_formatting_requested_THEN_returns_blank_value() {
        testee = new StringFormatter(null);
        assertEquals("-----", testee.format());
    }

    @Test
    public void GIVEN_string_WHEN_formatting_requested_THEN_returns_string_value() {
        testee = new StringFormatter("Clifton, NJ, USA");
        assertEquals("Clifton, NJ, USA", testee.format());
    }
}

/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package io.c19.test;

import static io.c19.test.Inputs.VALUE_0;
import static io.c19.test.Inputs.VALUE_1;
import static io.c19.test.Inputs.VALUE_10;
import static io.c19.test.Inputs.VALUE_11;
import static io.c19.test.Inputs.VALUE_12;
import static io.c19.test.Inputs.VALUE_13;
import static io.c19.test.Inputs.VALUE_14;
import static io.c19.test.Inputs.VALUE_15;
import static io.c19.test.Inputs.VALUE_2;
import static io.c19.test.Inputs.VALUE_3;
import static io.c19.test.Inputs.VALUE_4;
import static io.c19.test.Inputs.VALUE_5;
import static io.c19.test.Inputs.VALUE_6;
import static io.c19.test.Inputs.VALUE_7;
import static io.c19.test.Inputs.VALUE_8;
import static io.c19.test.Inputs.VALUE_9;

public enum Options
{
    VALUE0(VALUE_0),
    VALUE1(VALUE_1),
    VALUE2(VALUE_2),
    VALUE3(VALUE_3),
    VALUE4(VALUE_4),
    VALUE5(VALUE_5),
    VALUE6(VALUE_6),
    VALUE7(VALUE_7),
    VALUE8(VALUE_8),
    VALUE9(VALUE_9),
    VALUE10(VALUE_10),
    VALUE11(VALUE_11),
    VALUE12(VALUE_12),
    VALUE13(VALUE_13),
    VALUE14(VALUE_14),
    VALUE15(VALUE_15);

    private String name;

    Options( String name )
    {
        this.name = name;
    }

    public String getName( )
    {
        return this.name;
    }
}

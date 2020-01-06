/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package io.c19.test.switchversion

import io.c19.test.Inputs
import io.c19.test.InvalidInputException
import io.c19.test.Mapper
import io.c19.test.Outputs
import spock.lang.Specification
import spock.lang.Unroll

class MapperImplTest extends Specification
{
    Mapper instance = new io.c19.test.ifversion.MapperImpl()

    def setup()
    {

    }

    @Unroll
    def "Get value"()
    {
        when:
        String actual = instance.getValue( input )

        then:
        actual == output

        where:
        input || output
        Inputs.VALUE_0 || Outputs.VALUE_0
        Inputs.VALUE_1 || Outputs.VALUE_1
        Inputs.VALUE_2 || Outputs.VALUE_2
        Inputs.VALUE_3 || Outputs.VALUE_3
        Inputs.VALUE_4 || Outputs.VALUE_4
        Inputs.VALUE_5 || Outputs.VALUE_5
        Inputs.VALUE_6 || Outputs.VALUE_6
        Inputs.VALUE_7 || Outputs.VALUE_7
        Inputs.VALUE_8 || Outputs.VALUE_8
        Inputs.VALUE_9 || Outputs.VALUE_9
        Inputs.VALUE_10 || Outputs.VALUE_10
        Inputs.VALUE_11 || Outputs.VALUE_11
        Inputs.VALUE_12 || Outputs.VALUE_12
        Inputs.VALUE_13 || Outputs.VALUE_13
        Inputs.VALUE_14 || Outputs.VALUE_14
        Inputs.VALUE_15 || Outputs.VALUE_15
    }

    def "Invalid throws exception"()
    {
        when:
        instance.getValue( "invalid" )

        then:
        thrown InvalidInputException
    }
}

/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package io.c19.test.switchversion;

import io.c19.test.Inputs;
import io.c19.test.InvalidInputException;
import io.c19.test.Mapper;
import io.c19.test.Outputs;

public class MapperImpl implements Mapper
{
    @Override
    public String getValue( String value )
    {
        switch( value )
        {
            case Inputs.VALUE_0:
                return Outputs.VALUE_0;
            case Inputs.VALUE_1:
                return Outputs.VALUE_1;
            case Inputs.VALUE_2:
                return Outputs.VALUE_2;
            case Inputs.VALUE_3:
                return Outputs.VALUE_3;
            case Inputs.VALUE_4:
                return Outputs.VALUE_4;
            case Inputs.VALUE_5:
                return Outputs.VALUE_5;
            case Inputs.VALUE_6:
                return Outputs.VALUE_6;
            case Inputs.VALUE_7:
                return Outputs.VALUE_7;
            case Inputs.VALUE_8:
                return Outputs.VALUE_8;
            case Inputs.VALUE_9:
                return Outputs.VALUE_9;
            case Inputs.VALUE_10:
                return Outputs.VALUE_10;
            case Inputs.VALUE_11:
                return Outputs.VALUE_11;
            case Inputs.VALUE_12:
                return Outputs.VALUE_12;
            case Inputs.VALUE_13:
                return Outputs.VALUE_13;
            case Inputs.VALUE_14:
                return Outputs.VALUE_14;
            case Inputs.VALUE_15:
                return Outputs.VALUE_15;
            default:
                throw new InvalidInputException( "Should not reach here" );
        }
    }
}

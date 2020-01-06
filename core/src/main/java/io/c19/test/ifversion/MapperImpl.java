/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package io.c19.test.ifversion;

import io.c19.test.Inputs;
import io.c19.test.InvalidInputException;
import io.c19.test.Mapper;
import io.c19.test.Outputs;

public class MapperImpl implements Mapper
{
    @Override
    public String getValue( String value )
    {
        if( value.equals( Inputs.VALUE_0 ) )
        {
            return Outputs.VALUE_0;
        }
        else if( value.equals( Inputs.VALUE_1 ) )
        {
            return Outputs.VALUE_1;
        }
        else if( value.equals( Inputs.VALUE_2 ) )
        {
            return Outputs.VALUE_2;
        }
        else if( value.equals( Inputs.VALUE_3 ) )
        {
            return Outputs.VALUE_3;
        }
        else if( value.equals( Inputs.VALUE_4 ) )
        {
            return Outputs.VALUE_4;
        }
        else if( value.equals( Inputs.VALUE_5 ) )
        {
            return Outputs.VALUE_5;
        }
        else if( value.equals( Inputs.VALUE_6 ) )
        {
            return Outputs.VALUE_6;
        }
        else if( value.equals( Inputs.VALUE_7 ) )
        {
            return Outputs.VALUE_7;
        }
        else if( value.equals( Inputs.VALUE_8 ) )
        {
            return Outputs.VALUE_8;
        }
        else if( value.equals( Inputs.VALUE_9 ) )
        {
            return Outputs.VALUE_9;
        }
        else if( value.equals( Inputs.VALUE_10 ) )
        {
            return Outputs.VALUE_10;
        }
        else if( value.equals( Inputs.VALUE_11 ) )
        {
            return Outputs.VALUE_11;
        }
        else if( value.equals( Inputs.VALUE_12 ) )
        {
            return Outputs.VALUE_12;
        }
        else if( value.equals( Inputs.VALUE_13 ) )
        {
            return Outputs.VALUE_13;
        }
        else if( value.equals( Inputs.VALUE_14 ) )
        {
            return Outputs.VALUE_14;
        }
        else if( value.equals( Inputs.VALUE_15 ) )
        {
            return Outputs.VALUE_15;
        }
        else
        {
            throw new InvalidInputException("Should not reach here" );
        }
    }
}

/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package io.c19.test.mapversion;

import io.c19.test.Inputs;
import io.c19.test.InvalidInputException;
import io.c19.test.Mapper;
import io.c19.test.Outputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapperImpl implements Mapper
{
    private final static Map<String,String> map = new HashMap<>(  );

    static
    {
        map.put( Inputs.VALUE_0, Outputs.VALUE_0 );
        map.put( Inputs.VALUE_1, Outputs.VALUE_1 );
        map.put( Inputs.VALUE_2, Outputs.VALUE_2 );
        map.put( Inputs.VALUE_3, Outputs.VALUE_3 );
        map.put( Inputs.VALUE_4, Outputs.VALUE_4 );
        map.put( Inputs.VALUE_5, Outputs.VALUE_5 );
        map.put( Inputs.VALUE_6, Outputs.VALUE_6 );
        map.put( Inputs.VALUE_7, Outputs.VALUE_7 );
        map.put( Inputs.VALUE_8, Outputs.VALUE_8 );
        map.put( Inputs.VALUE_9, Outputs.VALUE_9 );
        map.put( Inputs.VALUE_10, Outputs.VALUE_10 );
        map.put( Inputs.VALUE_11, Outputs.VALUE_11 );
        map.put( Inputs.VALUE_12, Outputs.VALUE_12 );
        map.put( Inputs.VALUE_13, Outputs.VALUE_13 );
        map.put( Inputs.VALUE_14, Outputs.VALUE_14 );
        map.put( Inputs.VALUE_15, Outputs.VALUE_15 );
    }

    @Override
    public String getValue( String value )
    {
        return Optional.ofNullable( map.get( value ) )
                .orElseThrow( ()-> new InvalidInputException( "Should not be possible"  ) );
    }
}

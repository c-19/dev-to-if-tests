/*
 * Copyright (c) 2018 - 2020, C19, all rights reserved.
 *
 * This software is licensed under under GPL-3.0-only or GPL-3.0-or-later, https://opensource.org/licenses/GPL-3.0
 */

package io.c19.test;

public class InvalidInputException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public InvalidInputException( String message )
    {
        super( message );
    }
}

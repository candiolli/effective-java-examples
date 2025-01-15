package com.silascandiolli.builder;

/**
 * Hello world!
 *
 */
public class BuildExamplesMain
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        User user = new User.Builder("Silas", "sss@bbb.com")
                .age(35)
                .lastName("Candiolli").build();

        System.out.println(user.toString());
    }
}

package com.kkj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // MagicMoja = 애노테이션프로세서로 만든 클래스
//        Moja moja = new MagicMoja();
//        System.out.println(moja.pullOut() );

        Moja magicMoja = new MagicMoja();
        System.out.println(magicMoja.pullOut());
    }
}

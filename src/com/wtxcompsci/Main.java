package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner inf = new Scanner(new File("input.dat"));

        int validCount = 0;

        while(inf.hasNext()){
            String line = inf.nextLine();

            Scanner dat = new Scanner(line);
            String range = dat.next();
            String req = dat.next().substring(0,1);
            String pass = dat.next();

            Scanner proc = new Scanner(range);
            proc.useDelimiter("\\-");
            int one = proc.nextInt();
            int two = proc.nextInt();

            boolean valid = req.charAt(0)==pass.charAt(one-1) ^ req.charAt(0)==pass.charAt(two-1);

//            int passCount = 0;
//            for (char c: pass.toCharArray()){
//                if (c==req.charAt(0))
//                    passCount++;
//            }
            if(valid)
                validCount++;

        }
        System.out.println(validCount);

    }
}

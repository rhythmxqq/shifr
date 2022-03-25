package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.println("введите число P");
        long pp = gg.nextLong();
        BigInteger p = BigInteger.valueOf(pp);
        System.out.println("введите число q");
        long qq = gg.nextLong();
        BigInteger q = BigInteger.valueOf(qq);
       // int p = 3;
       // int q = 7;
        BigInteger N = (p.multiply(q));
        //int N = q * p;
        System.out.println("введите число e");
        long ee = gg.nextLong();
        int e = (int)ee;
        //e and N - открытый ключ
        // M - сообщение
        System.out.println("введите число M");
        long m = gg.nextLong();
        BigInteger M = BigInteger.valueOf(m);
        int i = 1;
        BigInteger C = (M.pow(e)).mod(N);
        //double C = (Math.pow(M, e) % N);
        System.out.println(C);
        BigInteger zxc = (q.subtract(BigInteger.valueOf(1))).multiply(p.subtract(BigInteger.valueOf(1)));
        //int zxc = (q - 1) * (p - 1);
        for (i = 1;;){
            BigInteger  resault = BigInteger.valueOf(e*i).mod(zxc);
            if (resault.equals(BigInteger.valueOf(1))){
                break;
            }
            i++;
        }
        /*for (i = 1;;) {
            int resault = e * i;
            int xxx = resault % zxc;
            if (xxx == 1) {
                break;
            }
            i++;
        }
         */
        BigInteger new_M = C.pow(i);
        //double new_M = Math.pow(C,i);
        BigInteger qqqq = new_M.mod(N);
        //double qqqq = new_M % N;
        System.out.println("обратная расшифровка, ваше начальное число = "+qqqq);
    }
}

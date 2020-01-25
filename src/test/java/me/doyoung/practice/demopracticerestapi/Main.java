package me.doyoung.practice.demopracticerestapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int stoi(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String []args) throws IOException {
        /*
         *  시간 초과났던 코드
         */
//        solution2();
        /*
         * 올바른 코드
         */
        solution();
    }

    static void solution() throws IOException {
        // given
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();

        int n = stoi(bufferedReader.readLine());            // 카드 개수

        String str;
        str = bufferedReader.readLine();
        st = new StringTokenizer(str);

        for(int i = 0; i < n; i++) {
            set.add(stoi(st.nextToken()));
        }

        int m = stoi(bufferedReader.readLine());            // 맞춰볼 숫자 개수
        str = bufferedReader.readLine();
        st = new StringTokenizer(str);
        int temp = 0;

        for(int i = 0; i < m; i++) {
            temp = stoi(st.nextToken());
            if(set.contains(temp)) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            System.out.print(" ");
        }
    }

    static void solution2() throws IOException {
        // given
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> list = new LinkedList<>();            // 카드 저장
        Map<Integer, Integer> map = new LinkedHashMap<>();      // 딕셔너리 형태로 저장

        int n = stoi(bufferedReader.readLine());            // 카드 개수

        String str;
        str = bufferedReader.readLine();
        st = new StringTokenizer(str);

        for(int i = 0; i < n; i++) {
            list.add(stoi(st.nextToken()));
        }

        int m = stoi(bufferedReader.readLine());            // 맞춰볼 숫자 개수
        str = bufferedReader.readLine();
        st = new StringTokenizer(str);
        int temp = 0;

        for(int i = 0; i < m; i++) {
            temp = stoi(st.nextToken());
            map.put(temp, 0);
        }

        for(int i = 0; i < n; i++) {
            temp = list.get(i);

            if(map.containsKey(temp)) {
                map.replace(temp, 1);
            }
        }

        for (int key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }
}

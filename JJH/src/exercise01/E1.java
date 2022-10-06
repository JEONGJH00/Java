package exercise01;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class E1{
    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	String s = bf.readLine();
    	StringTokenizer st = new StringTokenizer(s);
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	int V = Integer.parseInt(st.nextToken());
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	double dday =(double)(V-B)/(A-B);
    	bw.write((int)Math.ceil(dday)+"\n");
    	bw.close();
    }
}
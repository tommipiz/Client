package it.itismeucci;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 5637);
        System.out.println("Il client si è collegato");


        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        out.writeBytes("Client" + "\n");

        String stringRicevuta = in.readLine();
        System.out.println("La stringa ricevuta: " + stringRicevuta);

        s.close();



    }
}
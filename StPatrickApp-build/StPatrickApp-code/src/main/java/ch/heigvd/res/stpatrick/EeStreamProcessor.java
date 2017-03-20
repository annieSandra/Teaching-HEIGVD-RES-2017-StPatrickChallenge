/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author annie
 */
public class EeStreamProcessor implements IStreamProcessor{
   
   public String name;
   public EeStreamProcessor(String name){
            this.name = name;
   }
   
     @Override
  public void process(Reader in, Writer out) throws IOException {
    BufferedReader br = new BufferedReader(in);
    BufferedWriter bw = new BufferedWriter(out);
    int c = br.read();
    while (c != -1) {
      if(c != 'e' && c != 'E'){   
         bw.write(c);
      }
      c = br.read();
    
    }
    bw.flush();
  }
}

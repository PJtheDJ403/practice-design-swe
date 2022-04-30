package com.practice;

import com.practice.structural.composite.ClientComposite;

//use the bridge design pattern when your application is scalling in two
//orthogonal axis and you don't want an explosion of subclasses
public class App {
  public static void main(String[] args) {
    ClientComposite.execute();
  }
}

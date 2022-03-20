package Composition;

public class Computer {
    RAM ram = new RAM(4098);
    CPU cpu = new CPU("AMD");
}

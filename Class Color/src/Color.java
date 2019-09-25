public class Color implements Comparable<Object>{
final static int BYTE_MASK=255;
private long red,green,blue;
protected long color;
 
public void rgb2color() {
color=(red<<16)|(green<<8)|(blue);
}
 
public void color2rgb() {
red=color>>16; 
green=(color>>8)&BYTE_MASK;
blue=color&BYTE_MASK;
}
 
public Color() {}
 
public Color(long c) {
    this.color=c;
    color2rgb();
    }
 
public long getRed() {
    return red;}
public void setRed(long r) {
red=r;
rgb2color();}
 
public long getGreen() {
    return green;}
public void setGreen(long g) {
green=g;
rgb2color();}
 
public long Blue() {
    return blue;}
public void setBlue(long b) {
blue=b;
rgb2color();}
 
public String toString() {
    return "Red: "+red+" Green: "+green+" Blue: "+blue+", Compound: "+color;
}
 
public boolean equals(Object r) {
    return this.color==((Color)r).color;
}
 
public int compareTo(Object c) {
    if(this.color<((Color)c).color) return-1;
    if(this.color>((Color)c).color) return 1;
    return 0;
}
}
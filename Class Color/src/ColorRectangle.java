public class ColorRectangle extends Color implements Comparable<Object>{
    private int ix1,ix2,iy1,iy2;
    public ColorRectangle() {}                              //    1) Подразбиращ се: public ColorRectangle()
    public ColorRectangle(int x1,int y1, int x2, int y2,long c) {  //    2) Експлицитен: public ColorRectangle(int x1, int y1, int x2, int y2);         Методи:
        super(c);           //прави връзка с предния клас
        this.ix1=x1;
        this.iy1=y1;
        this.ix2=x2;
        this.iy2=y2;   
    }
   
   
    public int getIX1() {                               //   3) четене на членовете: getIX1, getIX2, getIY1,getIY2
        return ix1;
    }
   
    public int getIY1() {
        return iy1;
    }
   
    public int getIX2() {
        return ix2;
    }
   
    public int getIY2() {
        return iy2;
    }
   
    public void setIX1(int x1) {
        ix1=x1;}
    public void setIY1(int y1) {
        iy1=y1;}
    public void setIX2(int x2) {
        ix1=x2;}
    public void setIY2(int y2) {
        ix1=y2;}
   
    public int calcArea() {                                //  4) Изчислява/връща площ на правоъгълника int calcArea()
    return Math.abs((ix2-ix1)*(iy2-iy1));  
    }
   
     
    public int compareTo(Object r) {                       // 5) Сравнява  с подадения като параметър за "по-малък" по площ -1,0,+1     (public int compareTo(Object r))
        if(this.calcArea()<((ColorRectangle)r).calcArea())
            return -1;
        if(this.calcArea()>((ColorRectangle)r).calcArea())
            return 1;
        return 0;
    }
 
   
    public String toString() {                             //  6) Стрингова интерпретация на обектите:     (public String toString())
        return "x1: "+ix1+",y1: "+iy1+",x2: "+ix2+",y2: "+iy2+" Color: "+super.toString();
    }
   
   
    public boolean equals(ColorRectangle r) {                   //  7)Еквивалентност с подадения параметър – по площ     (public boolean equals(ColorRectangle r))
        return (this.calcArea()==r.calcArea()&&this.equals(r));
    }
 
   
    public void translateX(int iPoints) {                  //  8)Изместване по X на подадените точки:     (public void translateX(int iPoints))
        ix1=ix1+iPoints;
        ix2=ix2+iPoints;
    }
   
   
    public void translateY(int iPoints) {                  //  9) Изместване по  Y на подадените точки      (public void translateY(int iPoints))
        iy1+=iPoints;
        iy2+=iPoints;
    }
   
   
    public void translateXY(int iPoints) {                 //  10) Изместване по X и Y на подадените точки     (public void translateXY(int iPoints))
        translateX(iPoints);
        translateY(iPoints);   
        }
 
   
    public boolean isInside(int ptx, int pty) {            //  11) Точката с координати ptX и ptY в правоъгълника ли са:     (public boolean isInside(int ptX, int ptY ))  
        if(ix1<ptx && ix2>ptx && iy1<pty && iy2>pty) {
            return true;}
        return false;
    }
   
   
    public ColorRectangle unionRect(ColorRectangle r) {              //  12) Изчислява/връща обграждащ правоъгълник с подадения параметър:          (public ColorRectangle unionRect(ColorRectangle r) )
        long c=this.color&r.color;
        int x1=Math.min(ix1,r.ix1);
        int y1=Math.min(iy1,r.iy1);
        int x2=Math.min(ix2,r.ix2);
        int y2=Math.min(iy2,r.iy2);
        ColorRectangle current=new ColorRectangle(x1,y1,x2,y2,c);
        return current;
    }
   
   
    public ColorRectangle intersectionRect(ColorRectangle r) {        //   13) Изчислява/връща общ правоъгълник между подадения параметър и члена:          (public ColorRectangle intersectionRect( ColorRectangle r))
        long c=this.color&r.color;
        int x1=Math.max(ix1,r.ix1);
        int y1=Math.max(iy1,r.iy1);
        int x2=Math.max(ix2,r.ix2);
        int y2=Math.max(iy2,r.iy2);
        ColorRectangle current=new ColorRectangle(x1,y1,x2,y2,c);            
        return current;
    }  
 
   
    public static void main(String[] args) {
        ColorRectangle r1=new ColorRectangle(1,1,5,5,23423);
        ColorRectangle r2=new ColorRectangle(3,3,10,10,4234234);
        System.out.println("r1:"+r1.toString());
        System.out.println("r2:"+r2.toString());
        ColorRectangle r3=r1.unionRect(r2);
        System.out.println("r3:"+r3.toString());
        if(r1.equals(r2)) {
            System.out.println("Areas are equal");}
            else {System.out.println("Areas are NOT equal");}
           
        }
       
       
}
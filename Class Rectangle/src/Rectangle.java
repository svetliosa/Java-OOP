public class Rectangle {
    private int ix1,ix2,iy1,iy2;
    public Rectangle() {}                              //    1) ����������� ��: public Rectangle()
    public Rectangle(int x1,int y1, int x2, int y2) {  //    2) �����������: public Rectangle(int x1, int y1, int x2, int y2);         ������:
        this.ix1=x1;
        this.iy1=y1;
        this.ix2=x2;
        this.iy2=y2;
    }
   
   
    public int getIX1() {                               //   3) ������ �� ���������: getIX1, getIX2, getIY1,getIY2
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
   
   
    public int calcArea() {                                //  4) ���������/����� ���� �� ������������� int calcArea()
    return Math.abs((ix2-ix1)*(iy2-iy1));  
    }
   
     
    public int compareTo(Object r) {                       // 5) ��������  � ��������� ���� ��������� �� "��-�����" �� ���� -1,0,+1     (public int compareTo(Object r))
        if(this.calcArea()<((Rectangle)r).calcArea())
            return -1;
        if(this.calcArea()>((Rectangle)r).calcArea())
            return 1;
        return 0;
    }
 
   
    public String toString() {                             //  6) ��������� ������������� �� ��������:     (public String toString())
        return "x1="+ix1+", y1="+iy1+", x2="+ix2+", y2="+iy2;
    }
   
   
    public boolean equals(Rectangle r) {                   //  7)�������������� � ��������� ��������� � �� ����     (public boolean equals(Rectangle r))
        return this.calcArea()==r.calcArea();
    }
 
   
    public void translateX(int iPoints) {                  //  8)���������� �� X �� ���������� �����:     (public void translateX(int iPoints))
        ix1=ix1+iPoints;
        ix2=ix2+iPoints;
    }
   
   
    public void translateY(int iPoints) {                  //  9) ���������� ��  Y �� ���������� �����      (public void translateY(int iPoints))
        iy1+=iPoints;
        iy2+=iPoints;
    }
   
   
    public void translateXY(int iPoints) {                 //  10) ���������� �� X � Y �� ���������� �����     (public void translateXY(int iPoints))
        translateX(iPoints);
        translateY(iPoints);   
        }
 
   
    public boolean isInside(int ptx, int pty) {            //  11) ������� � ���������� ptX � ptY � ������������� �� ��:     (public boolean isInside(int ptX, int ptY ))  
        if(ix1<ptx && ix2>ptx && iy1<pty && iy2>pty) {
            return true;}
        return false;
    }
   
   
    public Rectangle unionRect(Rectangle r) {              //  12) ���������/����� ��������� ������������ � ��������� ���������:          (public Rectangle unionRect(Rectangle r) )
        int x1=Math.min(ix1,r.ix1);
        int y1=Math.min(iy1,r.iy1);
        int x2=Math.min(ix2,r.ix2);
        int y2=Math.min(iy2,r.iy2);
        Rectangle current=new Rectangle(x1,y1,x2,y2);
        return current;
    }
   
   
    public Rectangle intersectionRect(Rectangle r) {        //   13) ���������/����� ��� ������������ ����� ��������� ��������� � �����:          (public Rectangle intersectionRect( Rectangle r))
        int x1=Math.max(ix1,r.ix1);
        int y1=Math.max(iy1,r.iy1);
        int x2=Math.max(ix2,r.ix2);
        int y2=Math.max(iy2,r.iy2);
        Rectangle current=new Rectangle(x1,y1,x2,y2);            
        return current;
    }
   
   
    /*������ �������
     *  ������� ������, �������:
     *  �������� �� � � Y, �������,
     *   ��������� �� ��������������,�������
     *   ��������� �� ��-�����,�������
     *   ���������  ��������� ������������, �������
     *   ���������  ��� ������������, ������� */
   
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(1,1,5,5);
        Rectangle r2=new Rectangle(3,3,10,10);
        System.out.println("r1:"+r1.toString());
        System.out.println("r2:"+r2.toString());
        Rectangle r3=r1.unionRect(r2);
        System.out.println("r3:"+r3.toString());
        if(r1.equals(r2)) {
            System.out.println("Areas are equal");}
            else {System.out.println("Areas are NOT equal");}
           
        }
       
       
    }
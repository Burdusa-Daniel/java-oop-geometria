public class Rettangolo {
    int altezza;
    int base;
    public Rettangolo(){
        altezza=0;
        base=0;
    }
    public int perimetro(int h, int b){
        int perimetro = (h*2)+(b*2);
        return perimetro;
    }
    public int area (int h , int b){
        int area = b*h;
        return area;
    }
}

package BangundDatar;
/**
 *
 * @author fadil
 */
public class PersegiPanjang implements BangunDatar {
    public static void main(String[] args){
        
    }
    
    PersegiPanjang(){
    
}
    @Override
    public double luas(int s1, int s2){
        return(s1 * s2);
    }
    
    @Override
    public double keliling(int s1, int s2){
        return (2 * (s1 + s2));
    }
    }

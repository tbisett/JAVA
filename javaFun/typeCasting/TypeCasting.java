// class name should always be the same as your file name(case sensitive)
// Type casting is changing an already existing variable type to a different variable type. In this case, converting a int to a byte.
public class TypeCasting {
    public static void main(String[] args) {
        int i = 121;
        byte b = (byte) i;
        System.out.println(i);
    }
}
// This changed an int value of 121 to a byte value. if the value was too big to be changed from an int to a byte(130 or >) you would get an error or a different value. 
// You can always type cast to a larger variable type(implicet casting), but not always to smaller variable type(primitive casting)
// VARIABLE TYPED AND THEIR VALUES:

// Type	Size in Bytes	Range
// byte	1 byte	-128 to 127
// short	2 bytes	-32,768 to 32,767
// int	4 bytes	-2,147,483,648 to 2,147,483, 647
// long	8 bytes	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	4 bytes	approximately ±3.40282347E+38F
// double	8 bytes	approximately ±1.79769313486231570E+308
// char	2 bytes	0 to 65,536
// boolean	n/a	true of false

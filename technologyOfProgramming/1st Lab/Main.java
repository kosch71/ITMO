/** Make javadoc for 1st Lab */
public class Main{
	public static void main(String[] args){
		byte v_byte=120;
		short v_short=129;
		char v_char='a';
		int v_int=65999;
		long v_long=4294967296L;
		float v_float=0.3333334f;
		double v_double=0.3333333333333333;
		boolean v_boolean=true; 

		System.out.println("Starting project");
		System.out.println("This is a byte: "+v_byte);
		System.out.println("This is a short: "+v_short);
		System.out.println("This is a char: "+v_char);
		System.out.println("This is a int: "+v_int);
		System.out.println("This is a long: "+v_long);
		System.out.println("This is a float: "+v_float);
		System.out.println("This is a double: "+v_double);
		System.out.println("This is a boolean: "+v_boolean);
		for(char i = '\u0061'; i <= '\u007A'; i++){
            		System.out.print(i + " ");
        	}
		System.out.println();
		long begin = new java.util.Date().getTime();
		long end = new java.util.Date().getTime();
		System.out.println(end-begin); 
		int i = 0;
		for(int j =0; j<100000000; j++){
			i+=1;
		}
		System.out.println(i);
		System.out.println((long) i );
		int[] mas = {12,43,12,-65,778,123,32,76};
		int max =mas[0];
		for(int j = 1; j < mas.length; j++ ){
			if (max < mas[j]){
				max=mas[j];
			}
		}
		System.out.println(max);
		int n = 3;
		int[][] a = new int[n][n];

		for (int k = 0; k < n; k++) {
            		for (int j = 0; j < n; j++) {
                		a[k][j] = (int)Math.round(Math.random()*10); 
            		}
        	}

		for (int k = 0; k < n; k++) {
            		for (int j = 0; j < n; j++) {
                		System.out.printf("%3d", a[k][j]);
            		}
            		System.out.println();
        	}
		for (int k = 0; k < n; k++) {
            		for (int j = k+1; j < n; j++) {
                		int temp = a[k][j];
                		a[k][j] = a[j][k];
                		a[j][k] = temp;
            		}
        	}
		for (int k = 0; k < n; k++) {
            		for (int j = 0; j < n; j++) {
                		System.out.printf("%3d", a[k][j]);
            		}
            		System.out.println();
        	}
					

	}
}


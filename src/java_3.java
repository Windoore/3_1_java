public class java_3 {
    public static void main(String[] args) {
        String[] sa = new String[6];
        sa[0]="vjddddhv";
        sa[1]="jnhbd";
        sa[2]="jnhbdf";
        sa[3]="jnhbdf";
        sa[4]="jn";
        sa[5]="jh";
        String max="";

        for (int i = 0; i < sa.length-1 ; i++) {
            if (sa[i].length() > max.length()) {// на то чтобы это додумать ушло полчаса до этого тупил с
                max = sa[i];                     // sa[i].length() > sa[i+1].length()
            }
        }
        System.out.println("самая большая строка: "+max);
    }
}
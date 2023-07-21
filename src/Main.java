public class Main {
    public static void main(String[] args) {
        String names[] = {"Dharani", "Rajesh"};
//        firstName.concat(lastName)
        String finalName ="";
        for (int i = 0; i < names.length; i++){
            finalName = finalName.concat(names[i]);
        }
        System.out.println(finalName);
        int finalNameLength = finalName.length();
        Integer data;
        String encrypted ="";
        for (int k = 0; k < finalNameLength; k++){
            data = (int)finalName.charAt(k);
            encrypted = encrypted.concat(data.toString());
        }
        System.out.println(encrypted);
    }
}
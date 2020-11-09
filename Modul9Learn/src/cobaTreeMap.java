import java.util.Map;
import java.util.TreeMap;

public class cobaTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> hari = new TreeMap<>();

        hari.put(1, "Senin");
        hari.put(2, "Selasa");
        hari.put(3, "Rabu");
        hari.put(4, "Kamis");
        hari.put(5, "Jumat");
        hari.put(6, "Sabtu");
        hari.put(7, "Minggu");



//        int key = 4;
//            if(hari.containsKey(key)){
//                System.out.println("Key : "+ key +" Data : "+ hari.get(key));
//            }else{
//                System.out.println("Key tidak terdaftar");
//            }
//
//        Integer iKey = null;
//        String data ="Sabtu";
//        for(Map.Entry<Integer,String> hariEntry : hari.entrySet()){
//            if(hariEntry.getValue().equals(data)){
//                iKey = hariEntry.getKey();
//                break;
//            }else{
//                iKey = null;
//            }
//        }
//        if(iKey != null){
//            System.out.println("Key : "+ iKey +" Data : "+ hari.get(iKey));
//        }else{
//            System.out.println("Key tidak terdaftar");
//
//        }
        System.out.println("Jumlah data " + hari.size());
        int key = 5;
        System.out.println("Jumlah data sebelum di hapus "+hari.size());
        hari.remove(key);
        System.out.println("Jumlah data sesudah di hapus "+hari.size());

        System.out.println("Jumlah data sebelum di hapus "+hari.size());
        hari.clear();
        System.out.println("Jumlah data sesudah di hapus "+hari.size());
        }

    }





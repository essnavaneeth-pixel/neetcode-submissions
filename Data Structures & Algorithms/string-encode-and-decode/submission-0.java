class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoder = new StringBuilder();
        for(String str :strs){
            encoder.append(str.length()).append('#').append(str);
        }
        return encoder.toString();
   
    }

    public List<String> decode(String str) {
        List<String> r= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            
           int l=Integer.parseInt(str.substring(i,j));
           j++;
           String s=str.substring(j,j+l);
           r.add(s);
           i=j+l;
        }
        return r;

    }
}

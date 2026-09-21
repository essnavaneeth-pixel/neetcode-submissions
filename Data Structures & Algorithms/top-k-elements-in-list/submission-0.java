class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> freq = new HashMap <>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        List <Integer>[] b =new List[nums.length + 1];
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            int num = entry.getKey();
            int count=entry.getValue();
            if(b[count]==null){
                b[count]=new ArrayList<>();
            }
            b[count].add(num);
        }
        int [] r = new int [k];
        int index=0;
        for(int count=b.length-1;count>=0&& index< k;count--){
            if(b[count]!=null){
                for(int n:b[count]){
                    r[index++]=n;
                    if(index==k){
                        break;
                    }
                }
            }
        }

    return r;
    }
}

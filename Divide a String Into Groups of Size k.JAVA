class Solution {
    public String[] divideString(String s, int k, char fill)
    {
        int n = s.length();
        
        List<String> l = new ArrayList<>();
        
        int i= 0;
        
        while(i<n)
        {
            int j = 0;
            
            String a = "";
            
            while(i<n && j<k)
            {
                a += s.charAt(i);
                i++;
                j++;
            }
            
            while(a.length()<k)
            {
                a += fill;
            }
            
            l.add(a);
        }
        
        return l.toArray(new String[0]);
    }
}

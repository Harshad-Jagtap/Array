//create a program for dna=000 and rna=111

class DNARNA
{
       String dna[]={"11101001","00010100","11100001","00010101"};

       public static void main(String[] args)
       {
         Dna_array ref=new Dna_array();
         ref.dna_rna();
       }

       public void dna_rna()
       {
            for(int i=0;i<dna.length;i++)   //outer for  :array
            {
            String concat=" ";
                for(int j=0;j<3;j++)  //inner for   :String
                {
                    if(dna[i].charAt(j)=='0' || dna[i].charAt(j)=='1')
                     {
                      concat=concat+dna[i].charAt(j);
                     }
                          if(concat.equals("000"))
                          {
                            System.out.printf("DNA");
                          }
                             else if(concat.equals("111"))
                              {
                              System.out.printf("RNA");
                              }
                                 else
                              {
                                System.out.println("Not valid info");
                              }                              
}      // inner for
}    //outer for
}
}
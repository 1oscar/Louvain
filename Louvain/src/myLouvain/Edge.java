package myLouvain;  
  
public class Edge implements Cloneable{  //ǳ���Ʊ���ʵ��Cloneable�ӿ�
    int v;     //v��ʾ���ӵ�ı��,w��ʾ�˱ߵ�Ȩֵ  
    double weight;  
    int next;    //next�������Ӻʹ˵���صı�  
    Edge(){}  
    public Object clone(){  
        Edge temp=null;  
        try{    
            temp = (Edge)super.clone();   //ǳ����    
        }catch(CloneNotSupportedException e) {    
            e.printStackTrace();    
        }     
        return temp;  
    }  
}  



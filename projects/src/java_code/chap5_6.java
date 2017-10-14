package java_code;

public class chap5_6 {
    public static void main(String[] args) throws LinkedListException {
        List list = new List(2);
        try{
            list.addElement("广东");
            list.addElement("浙江");
            list.addElement("山东");
        }catch (LinkedListException e){
            System.out.println("err: "+e.getMessage());
        }
        try{
            System.out.println(list.getElement(2));
        }catch (LinkedListException e){
            System.out.println("err: "+e.getMessage());
        }
        try{
            System.out.println(list.FirstElement());
        }catch (LinkedListException e){
            System.out.println("err: "+e.getMessage());
        }
        try {
            list.delElement(1);
        }catch (LinkedListException e){
            System.out.println("err: "+e.getMessage());
        }
    }
}
class List{
    Object[] items;
    int size = 0;
    public List(int len){
        items = new Object[len];
    }
    public void addElement(Object o) throws LinkedListException{
        if(size == items.length){
            throw new LinkedListException("列表已满");
        }else{
            items[size] = o;
            size++;
        }
    }
    public void delElement(int i) throws LinkedListException{
        if(i<0||i>=items.length){
            throw new LinkedListException("下标越界!");
        }else {
            Object e = items[i];
            items[i] = "";
            int j = i+1;
            System.out.println("已删除第"+j+"项"+e);
        }
    }
    public Object getElement(int n) throws LinkedListException {
        if(n<0||n>=items.length){
            throw new LinkedListException("下标越界");
        }else{
            return items[n];
        }
    }
    public Object FirstElement() throws LinkedListException {
        if(items.length==0){
            throw new LinkedListException("列表无对象");
        }else{
            return items[0];
        }
    }
}

class LinkedListException extends Exception{
    private static final long serialVersionUID = 1L;
    public LinkedListException(){
        super();
    }
    public LinkedListException(String s){
        super(s);
    }
}
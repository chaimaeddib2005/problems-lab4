package problem2;

public class IntegerList
{
    int[] list;
    int index;
    int size;
    //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        index = 0;
        this.size = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
            index++;
        }

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        this.size = size * 2;
        int[] Lista = new int[size];
        for (int i=0; i<list.length; i++){
            Lista[i] = list[i];
        }
        this.list = Lista;
    }
    public void addElement(int newVal){
        if(index == list.length)
        {
            increaseSize();
        }
        list[index] = newVal;
        index++;
    }
    public void removeAll(int Val){
        for(int i=0; i<list.length; i++){
            if(list[i] == Val){
                for(int j = i; j<list.length - 1; j++){
                    list[j] = list[j+1];
                }
                list[list.length-1] = 0;

            }
        }
    }
}
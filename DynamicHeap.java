
public class DynamicHeap {
    private Node[] heapData;
    private static final int DEFAULT_SIZE = 50;
    private int size;
    private int currentSize;

    public DynamicHeap() {
        this.heapData = new Node[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        this.currentSize = 0;
    }

    private boolean isFull() {
        return this.size == this.currentSize;
    }

    private void reallocate() {
        Node[] temp = new Node[this.size*2];
        System.arraycopy(this.heapData,0,temp,0,this.heapData.length);
        this.heapData = temp;
        this.size = this.size*2;
    }

    public int getSize() {
        return this.currentSize;
    }
    private void swap(int index1, int index2) {
        Node temp = this.heapData[index1];
        this.heapData[index1] = this.heapData[index2];
        this.heapData[index2] = temp;
    }
    public void insert(Node data) {

        if (this.isFull()) {
            this.reallocate();
        }

        this.heapData[this.currentSize++] = data;

        int insertionIndex = this.currentSize - 1;
        int parentIndex = (insertionIndex - 1)/2;

        while(insertionIndex>0) {
            if (this.heapData[insertionIndex].compareTo(this.heapData[parentIndex]) > 0) {
                this.swap(insertionIndex,parentIndex);
                insertionIndex = parentIndex;
                parentIndex = (insertionIndex - 1) / 2;
            }
            else {
                break;
            }
        }
    }

    public Node remove() {
        Node temp = this.heapData[0];

        this.heapData[0] = this.heapData[--currentSize];
        int presentIndex = 0;
        int childIndex1 = 1;
        int childIndex2 = 2;

        while (childIndex2 < currentSize) {
            if (this.heapData[presentIndex].compareTo(this.heapData[childIndex1])>0 || this.heapData[presentIndex].compareTo(this.heapData[childIndex2])>0) {
                int swapIndex = this.getMin(childIndex1, childIndex2);
                this.swap(presentIndex,swapIndex);
                presentIndex = swapIndex;
                childIndex1 = 2 * presentIndex + 1;
                childIndex2 = 2 * presentIndex + 2;
            }
            else break;
        }

        return temp;
    }

    private int getMin(int childIndex1, int childIndex2) {
        return (this.heapData[childIndex1].compareTo(this.heapData[childIndex2])<0)? childIndex1 : childIndex2;
    }

}

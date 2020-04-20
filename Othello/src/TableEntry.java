public class TableEntry {
    public byte type;//type of entry
    public int v;//value of this entry
    public byte depth;//depth of seacch of gave this entry's value
    //create new TableEntry
    public TableEntry(int v,byte type)
    {
        this.v = v;
        this.type= type;
        this.depth = Node.searchDepth;
    }

}

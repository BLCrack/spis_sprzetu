package pl.cm;

public class Worker
{
    private int ID;
    private String name;
    private String secondName;

    public Worker(int ID, String name, String secondName)
    {
        this.ID = ID;
        this.name = name;
        this.secondName = secondName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {return name;    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondNameo() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}

package ie.tudublin;

public class Note 
{
    private char Note;
	private int Duration;
    

    public Note(char note, int duration) {
        Note = note;
        Duration = duration;
    }


    @Override
    public String toString() {
        return "Note [Duration=" + Duration + ", Note=" + Note + "]";
    }

    public int getDuration()
    {
        return this.Duration;
    }

    public void setDuration(int duration) 
    {
        this.Duration = Duration;
    }

    public char getNote()
    {
        return this.Note;

    }

    public void setNote(char Note)
    {
        this.Note = Note;
    }

}
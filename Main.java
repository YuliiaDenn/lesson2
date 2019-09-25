package lesson1;

public class Main {

	public static void main(String[] args) {

		NoteBook notebook = new NoteBook();
		notebook.addNotes(new Note("Yuliia", "Denysenko", "Olecsandrivna", "+380976647613"));
		notebook.addNotes(new Note("Iryna", "Rogovets", "Sergiivna", "+380980000001"));
		notebook.addNotes(new Note("Yanna", "Rogovets", "Oleksandrivna", "+380970000000"));
		notebook.addNotes(new Note("Inna", "Rogovets", "Oleksandrivna", "+380970000002"));
		notebook.addNotes(new Note("Maryna", "Rogovets", "Oleksandrivna", "+380970002000"));
		notebook.addNotes(new Note("Olga", "Rogovets", "Oleksandrivna", "+380970000030"));
		System.out.println("count of notes");
		System.out.println(notebook.getCountOfNotes());

		System.out.println("notes by phone");
		Note notes[] = notebook.findNoteByPhoneNumber("+380980000001");
		showNotes(notes);

		System.out.println("notes by last name");
		notes = notebook.findNoteByLastName("Denysenko");
		showNotes(notes);

		System.out.println("all notes");
		notes = notebook.getAllNotes();
		showNotes(notes);
		System.out.println();

		System.out.println("delete notes");
		notebook.deleteNotes(6);

		System.out.println("all notes");
		notes = notebook.getAllNotes();
		showNotes(notes);
		System.out.println();

		System.out.println("delete notes");
		notebook.deleteNotes(3);

		System.out.println("all notes");
		notes = notebook.getAllNotes();
		showNotes(notes);
		System.out.println();

		System.out.println("add new notes");
		notebook.addNotes(new Note("Oleksandr", "Rogovets", "Viktorovych", "+380970000600"));
		System.out.println("all notes");
		notes = notebook.getAllNotes();
		showNotes(notes);
		System.out.println();

		System.out.println("Up date notes");
		Note yuliia = notes[0];
		yuliia.setPhoneNumber("+380730621593");
		
		notebook.upDate(yuliia);

		System.out.println("all notes");
		notes = notebook.getAllNotes();
		showNotes(notes);
	}

	public static void showNotes(Note[] notes) {
		for (Note note : notes) {
			System.out.println(note);
		}

	}
}

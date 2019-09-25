package lesson1;

public class Main2 {

	public static void main(String[] args) {

		NoteBook2 notebook = new NoteBook2();
		notebook.addNotes(new Note2("Yuliia", "Denysenko", "56623"));
		notebook.addNotes(new Note2("Tamara", "Rogovets", "57726"));
		notebook.addNotes(new Note2("Yuliia", "Stecenko", "53223"));
		notebook.addNotes(new Note2("Igor", "Rogovets", "58896"));

		System.out.println("total amount notes");
		System.out.println(notebook.totalAmountNotes());
		System.out.println();

		System.out.println("notes of number phone");
		Note2[] note = notebook.findEntryByPhoneNumber("56623");
		showNotes(note);
		System.out.println();

		System.out.println("notes of second name");
		note = notebook.findEntryBySecondName("Rogovets");
		showNotes(note);
		System.out.println();

		System.out.println("all notes");
		note = notebook.allNotes();
		showNotes(note);
		System.out.println();

		System.out.println("delete note");
		notebook.deleteNotes(2);
		System.out.println();

		System.out.println("all notes");
		note = notebook.allNotes();
		showNotes(note);
		System.out.println();

		Note2 yuliia;
		yuliia = note[0];
		yuliia.setPhoneNumber("52222");
		notebook.upDate(yuliia);

		System.out.println("all notes");
		note = notebook.allNotes();
		showNotes(note);
		System.out.println();
	}

	public static void showNotes(Note2[] notes) {
		for (Note2 note : notes) {
			System.out.println(note);
		}
	}

}

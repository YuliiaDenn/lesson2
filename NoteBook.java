package lesson1;

import java.util.Arrays;

public class NoteBook {
	public static int ID_NUMBER;
	private Note[] notes = new Note[2];
	private int currentIndex = 0;

	public void addNotes(Note note) {

		if (isFull()) {

			recreate();
		}

		note.setId(ID_NUMBER++);
		notes[currentIndex] = note;
		currentIndex++;

	}

	public Note[] getAllNotes() {

		return Arrays.copyOf(notes, currentIndex);
	}

	public Note[] findNoteByPhoneNumber(String phone) {

		Note[] result = new Note[currentIndex];
		int index = 0;

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getPhoneNumber().equals(phone)) {
				result[index] = notes[i];
				index++;
			}
		}
		return Arrays.copyOf(result, index);
	}

	public Note[] findNoteByLastName(String lastname) {
		Note[] result = new Note[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getLastName().equals(lastname)) {
				result[index] = notes[i];
				index++;
			}
		}
		return Arrays.copyOf(result, index);
	}

	public int getCountOfNotes() {
		return currentIndex;
	}

	private boolean isFull() {

		if (currentIndex == notes.length) {
			return true;
		}
		return false;
	}

	private void recreate() {
		int length = notes.length * 2;
		notes = Arrays.copyOf(notes, length);
	}

	public void deleteNotes(int id) {

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == id) {
				currentIndex--;
				notes[i] = notes[currentIndex];
				notes[i].setId(id);
			}
		}
	}

	public void upDate(Note note) {

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == note.getId()) {
				notes[i] = note;
			}
		}

	}

}

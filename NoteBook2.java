package lesson1;

import java.util.Arrays;

public class NoteBook2 {

	public static int ID_NUMBER;
	Note2[] notes = new Note2[2];
	int currentIndex = 0;

	public void addNotes(Note2 note) {

		if (isFull()) {
			recreate();
		}
		note.setId(ID_NUMBER++);
		notes[currentIndex] = note;
		currentIndex++;
	}

	private boolean isFull() {
		if (currentIndex == notes.length) {
			return true;
		} else {
			return false;
		}
	}

	private void recreate() {
		int lenght = notes.length * 2;
		notes = Arrays.copyOf(notes, lenght);
	}

	public int totalAmountNotes() {
		return currentIndex;
	}

	public Note2[] allNotes() {
		return Arrays.copyOf(notes, currentIndex);
	}

	public Note2[] findEntryByPhoneNumber(String number) {
		Note2[] result = new Note2[currentIndex];
		int index = 0;

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getPhoneNumber().equals(number)) {
				result[index] = notes[i];
				index++;
			}
		}
		return Arrays.copyOf(result, index);
	}

	public Note2[] findEntryBySecondName(String secondName) {
		Note2[] result = new Note2[currentIndex];
		int index = 0;

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getSecondName().equals(secondName)) {
				result[index] = notes[i];
				index++;
			}
		}
		return Arrays.copyOf(result, index);
	}

	public void deleteNotes(int id) {
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == id) {
				currentIndex--;
				notes[i] = notes[currentIndex];

			}
		}
	}

	public void upDate(Note2 note) {
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == note.getId()) {
				notes[i] = note;
			}
		}
	}

}

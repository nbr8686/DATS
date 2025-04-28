package tests;

import org.testng.annotations.Test;
import pages.NotepadPage;
import static org.testng.Assert.assertTrue;

public class NotepadTests {

    @Test
    public void testTypingInNotepad() throws Exception {
        NotepadPage notepad = new NotepadPage();

        notepad.openNotepad();
        notepad.typeText("Hello World via SikuliX on Mac!");

        assertTrue(notepad.verifyTypedText(), "Typed text not found on screen!");
    }
}

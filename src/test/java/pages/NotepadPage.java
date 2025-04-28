package pages;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import utils.OSUtil;

public class NotepadPage {

    Screen screen = new Screen();
    Pattern notepadIcon;
    Pattern typedText;

    public NotepadPage() {
        if (OSUtil.isMac()) {
            notepadIcon = new Pattern("images/mac/notepad_icon_mac.png");
            typedText = new Pattern("images/mac/typed_text_mac.png");
        } else if (OSUtil.isWindows()) {
            notepadIcon = new Pattern("images/windows/notepad_icon_win.png");
            typedText = new Pattern("images/windows/typed_text_win.png");
        } else {
            throw new RuntimeException("Unsupported OS: " + OSUtil.getOSName());
        }
    }

    public void openNotepad() throws Exception {
        screen.wait(notepadIcon, 10);
        screen.click(notepadIcon);
    }

    public void typeText(String text) {
        screen.type(text);
    }

    public boolean verifyTypedText() {
        return screen.exists(typedText) != null;
    }
}

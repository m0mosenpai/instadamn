package X;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;

/* renamed from: X.ADb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23019ADb {
    public static final String A01(CharSequence charSequence, int i, boolean z) {
        CharSequence subSequence;
        for (int i2 = i; -1 < i2 && charSequence.charAt(i2) != ' '; i2--) {
            if (charSequence.charAt(i2) == '#') {
                if (i2 == i) {
                    if (!z) {
                        return null;
                    }
                    subSequence = "#";
                } else {
                    subSequence = charSequence.subSequence(i2, i + 1);
                    if (subSequence == null) {
                        return null;
                    }
                }
                return subSequence.toString();
            }
        }
        return null;
    }

    public static String A00(EditText editText, boolean z) {
        Editable text = editText.getText();
        C14360o3.A07(text);
        return A01(text, Selection.getSelectionEnd(text) - 1, z);
    }
}

package X;

import android.text.Editable;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class VBC extends WKa {
    public EditText A00;
    public Integer A01;
    public static Pattern A03 = Pattern.compile("\\s+\\Z", 8);
    public static Pattern A02 = Pattern.compile("\\A\\s+", 8);

    private boolean A00(CharSequence charSequence) {
        Matcher matcher = A02.matcher(charSequence);
        if (!matcher.find()) {
            return false;
        }
        EditText editText = this.A00;
        int selectionStart = editText.getSelectionStart();
        String group = matcher.group(0);
        group.getClass();
        int length = selectionStart - group.length();
        editText.setText(matcher.replaceFirst(""));
        editText.setSelection(Math.max(length, 0));
        return true;
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int intValue = this.A01.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                if (intValue == 0) {
                    A00(editable);
                    return;
                }
                return;
            }
        } else if (A00(editable)) {
            editable = this.A00.getText();
        }
        Matcher matcher = A03.matcher(editable);
        if (!matcher.find()) {
            return;
        }
        EditText editText = this.A00;
        int selectionStart = editText.getSelectionStart();
        editText.setText(matcher.replaceFirst(""));
        editText.setSelection(Math.min(selectionStart, editText.length()));
    }
}

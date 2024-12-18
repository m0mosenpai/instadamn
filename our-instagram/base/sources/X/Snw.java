package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes10.dex */
public final class Snw implements TextWatcher {
    public AbstractC106884rp A00;
    public boolean A01 = true;
    public final EditText A02;

    public static void A00(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C58341Ptc A00 = C58341Ptc.A00();
            if (editableText == null) {
                length = 0;
            } else {
                length = editableText.length();
            }
            A00.A02(editableText, 0, length);
            if (selectionStart >= 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                    return;
                } else {
                    Selection.setSelection(editableText, selectionStart);
                    return;
                }
            }
            if (selectionEnd < 0) {
                return;
            }
            Selection.setSelection(editableText, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.A02;
        if (!editText.isInEditMode() && this.A01 && C58341Ptc.A09 != null && i2 <= i3 && (charSequence instanceof Spannable)) {
            int A01 = C58341Ptc.A00().A01();
            if (A01 != 0) {
                if (A01 != 1) {
                    if (A01 != 3) {
                        return;
                    }
                } else {
                    C58341Ptc.A00().A02(charSequence, i, i + i3);
                    return;
                }
            }
            C58341Ptc A00 = C58341Ptc.A00();
            AbstractC106884rp abstractC106884rp = this.A00;
            if (abstractC106884rp == null) {
                abstractC106884rp = new RunnableC58753Q7a(editText);
                this.A00 = abstractC106884rp;
            }
            A00.A04(abstractC106884rp);
        }
    }

    public Snw(EditText editText) {
        this.A02 = editText;
    }
}

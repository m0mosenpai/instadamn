package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: X.9qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221549qJ extends WKa {
    public CharSequence A00 = "";
    public final int A01;
    public final EditText A02;

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.A02;
        if (editText.getLineCount() > this.A01) {
            editText.getText().replace(0, editText.getText().length(), this.A00);
        }
        this.A00 = new SpannableStringBuilder(editText.getText());
    }

    public C221549qJ(EditText editText, int i) {
        this.A02 = editText;
        this.A01 = i;
    }

    public static void A00(EditText editText) {
        C14360o3.A0A(editText);
        editText.addTextChangedListener(new C221519qG(editText));
        editText.addTextChangedListener(new C221549qJ(editText, 3));
    }
}

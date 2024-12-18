package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.9qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221519qG extends WKa {
    public final EditText A00;

    public C221519qG(EditText editText) {
        C14360o3.A0B(editText, 1);
        this.A00 = editText;
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        int length = editable.length();
        EditText editText = this.A00;
        int i = 17;
        if (length == 0) {
            i = 8388611;
        }
        editText.setGravity(i);
    }
}

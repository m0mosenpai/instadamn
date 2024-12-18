package X;

import android.widget.EditText;

/* renamed from: X.SVx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62892SVx {
    public final EditText A00;
    public final C63482Snv A01;

    public C62892SVx(EditText editText) {
        this.A00 = editText;
        C63482Snv c63482Snv = new C63482Snv(editText);
        this.A01 = c63482Snv;
        editText.addTextChangedListener(c63482Snv);
        if (C58707Q3w.A02 == null) {
            synchronized (C58707Q3w.A01) {
                if (C58707Q3w.A02 == null) {
                    C58707Q3w.A02 = new C58707Q3w();
                }
            }
        }
        editText.setEditableFactory(C58707Q3w.A02);
    }

    public C62892SVx() {
    }
}

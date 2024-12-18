package X;

import android.widget.EditText;

/* renamed from: X.SVy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62893SVy {
    public final EditText A00;
    public final Snw A01;

    public C62893SVy(EditText editText) {
        this.A00 = editText;
        Snw snw = new Snw(editText);
        this.A01 = snw;
        editText.addTextChangedListener(snw);
        if (C58708Q3x.A02 == null) {
            synchronized (C58708Q3x.A01) {
                if (C58708Q3x.A02 == null) {
                    C58708Q3x.A02 = new C58708Q3x();
                }
            }
        }
        editText.setEditableFactory(C58708Q3x.A02);
    }

    public C62893SVy() {
    }
}

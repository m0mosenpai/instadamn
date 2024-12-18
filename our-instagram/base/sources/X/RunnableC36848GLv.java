package X;

import android.widget.EditText;

/* renamed from: X.GLv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36848GLv implements Runnable {
    public final /* synthetic */ EL3 A00;

    public RunnableC36848GLv(EL3 el3) {
        this.A00 = el3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EL3 el3 = this.A00;
        EditText editText = el3.A01;
        if (editText != null) {
            if (editText.requestFocus()) {
                EditText editText2 = el3.A01;
                if (editText2 != null) {
                    AbstractC13880nE.A0R(editText2);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("password");
        throw C00O.createAndThrow();
    }
}

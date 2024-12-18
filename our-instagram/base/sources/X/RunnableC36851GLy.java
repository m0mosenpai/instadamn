package X;

import android.widget.EditText;

/* renamed from: X.GLy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36851GLy implements Runnable {
    public final /* synthetic */ C33000Egn A00;

    public RunnableC36851GLy(C33000Egn c33000Egn) {
        this.A00 = c33000Egn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33000Egn c33000Egn = this.A00;
        EditText editText = c33000Egn.A00;
        if (editText != null && editText.requestFocus()) {
            AbstractC13880nE.A0R(c33000Egn.A00);
        }
    }
}

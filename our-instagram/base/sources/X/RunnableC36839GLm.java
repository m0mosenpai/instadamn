package X;

import android.widget.EditText;

/* renamed from: X.GLm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36839GLm implements Runnable {
    public final /* synthetic */ C32271EJg A00;

    public RunnableC36839GLm(C32271EJg c32271EJg) {
        this.A00 = c32271EJg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32271EJg c32271EJg = this.A00;
        EditText editText = c32271EJg.A02;
        if (editText != null && editText.requestFocus()) {
            AbstractC13880nE.A0R(c32271EJg.A02);
        }
    }
}

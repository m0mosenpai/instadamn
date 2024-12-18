package X;

import android.widget.EditText;

/* renamed from: X.POj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56942POj implements Runnable {
    public final /* synthetic */ C56162OwU A00;

    public RunnableC56942POj(C56162OwU c56162OwU) {
        this.A00 = c56162OwU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText = this.A00.A07;
        editText.requestFocus();
        AbstractC13880nE.A0R(editText);
    }
}

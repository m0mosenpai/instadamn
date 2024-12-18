package X;

import android.view.Window;

/* renamed from: X.GNp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36894GNp implements Runnable {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ C32736Eb2 A01;

    public RunnableC36894GNp(Window window, C32736Eb2 c32736Eb2) {
        this.A00 = window;
        this.A01 = c32736Eb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setSoftInputMode(16);
        C32736Eb2 c32736Eb2 = this.A01;
        c32736Eb2.A03().requestFocus();
        AbstractC13880nE.A0S(c32736Eb2.A03());
    }
}

package X;

import android.view.View;

/* renamed from: X.PNz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56932PNz implements Runnable {
    public final /* synthetic */ C51379Mme A00;

    public RunnableC56932PNz(C51379Mme c51379Mme) {
        this.A00 = c51379Mme;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51379Mme c51379Mme = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View view = c51379Mme.A05;
        C14360o3.A07(view);
        view.setVisibility(8);
    }
}

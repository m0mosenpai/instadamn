package X;

import android.view.ViewGroup;

/* renamed from: X.PNe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56911PNe implements Runnable {
    public final /* synthetic */ NT5 A00;

    public RunnableC56911PNe(NT5 nt5) {
        this.A00 = nt5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NT5 nt5 = this.A00;
        ViewGroup viewGroup = nt5.A08;
        C03O.A00(viewGroup, new PRO(viewGroup, nt5));
    }
}

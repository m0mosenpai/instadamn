package X;

import android.view.View;

/* renamed from: X.PSi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57043PSi implements Runnable {
    public final /* synthetic */ C55087Oak A00;
    public final /* synthetic */ C26044BfX A01;
    public final /* synthetic */ boolean A02;

    public RunnableC57043PSi(C55087Oak c55087Oak, C26044BfX c26044BfX, boolean z) {
        this.A02 = z;
        this.A00 = c55087Oak;
        this.A01 = c26044BfX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A02;
        C55087Oak c55087Oak = this.A00;
        if (z) {
            View A02 = c55087Oak.A02();
            if (A02 != null) {
                A02.post(new PRF(c55087Oak, this.A01));
                return;
            }
            return;
        }
        C55087Oak.A01(c55087Oak, this.A01);
    }
}

package X;

import android.app.Application;
import android.content.res.Resources;

/* renamed from: X.M3k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49943M3k implements Runnable {
    public final /* synthetic */ C5QE A00;
    public final /* synthetic */ C44464JlW A01;

    public RunnableC49943M3k(C5QE c5qe, C44464JlW c44464JlW) {
        this.A01 = c44464JlW;
        this.A00 = c5qe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44464JlW c44464JlW = this.A01;
        Application A0D = c44464JlW.A0D();
        Resources A0M = AbstractC166997dE.A0M(c44464JlW.A0D());
        C5QE c5qe = this.A00;
        C14360o3.A0B(c5qe, 1);
        C9GR.A09(A0D, c5qe.A01(A0M));
    }
}

package X;

import android.view.View;

/* renamed from: X.AuY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24577AuY implements Runnable {
    public final /* synthetic */ C4RP A00;
    public final /* synthetic */ boolean A01;

    public RunnableC24577AuY(C4RP c4rp, boolean z) {
        this.A00 = c4rp;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00.A04;
        if (view != null) {
            view.setKeepScreenOn(this.A01);
        }
    }
}

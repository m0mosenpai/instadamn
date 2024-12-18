package X;

import android.view.Surface;

/* renamed from: X.AzG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24855AzG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Surface A02;
    public final /* synthetic */ AbstractServiceC201348vN A03;

    public RunnableC24855AzG(Surface surface, AbstractServiceC201348vN abstractServiceC201348vN, int i, int i2) {
        this.A03 = abstractServiceC201348vN;
        this.A02 = surface;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC201348vN abstractServiceC201348vN = this.A03;
        abstractServiceC201348vN.A0A = this.A02;
        abstractServiceC201348vN.A03 = this.A01;
        abstractServiceC201348vN.A02 = this.A00;
    }
}

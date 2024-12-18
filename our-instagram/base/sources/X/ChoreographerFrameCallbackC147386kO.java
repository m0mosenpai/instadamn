package X;

import android.view.Choreographer;

/* renamed from: X.6kO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC147386kO implements Choreographer.FrameCallback {
    public final /* synthetic */ C147376kN A00;

    public ChoreographerFrameCallbackC147386kO(C147376kN c147376kN) {
        this.A00 = c147376kN;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C147376kN c147376kN = this.A00;
        if (c147376kN.A08) {
            long j2 = c147376kN.A02;
            long currentTimeMillis = System.currentTimeMillis();
            c147376kN.A02 = currentTimeMillis;
            float f = c147376kN.A01 + (((float) (currentTimeMillis - j2)) / c147376kN.A00);
            c147376kN.A01 = f;
            C41181vS c41181vS = c147376kN.A04;
            if (c41181vS != null) {
                InterfaceC147306kG interfaceC147306kG = c147376kN.A0B;
                interfaceC147306kG.Dbz(c41181vS, f);
                if (c147376kN.A01 >= 1.0f) {
                    interfaceC147306kG.Dbs(c41181vS);
                } else {
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }
}

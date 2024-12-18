package X;

import android.view.Choreographer;

/* renamed from: X.6kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC147366kM implements Choreographer.FrameCallback {
    public final /* synthetic */ C147356kL A00;

    public ChoreographerFrameCallbackC147366kM(C147356kL c147356kL) {
        this.A00 = c147356kL;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C147356kL c147356kL = this.A00;
        if (c147356kL.A07) {
            long j2 = c147356kL.A02;
            long currentTimeMillis = System.currentTimeMillis();
            c147356kL.A02 = currentTimeMillis;
            float f = c147356kL.A01 + (((float) (currentTimeMillis - j2)) / c147356kL.A00);
            c147356kL.A01 = f;
            C41181vS c41181vS = c147356kL.A04;
            if (c41181vS != null) {
                InterfaceC147306kG interfaceC147306kG = c147356kL.A0A;
                interfaceC147306kG.Dbz(c41181vS, f);
                if (c147356kL.A01 >= 1.0f) {
                    interfaceC147306kG.Dbs(c41181vS);
                } else {
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }
}

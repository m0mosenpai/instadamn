package X;

import android.view.Choreographer;

/* loaded from: classes12.dex */
public final class XOC implements Choreographer.FrameCallback {
    public final /* synthetic */ C72094XNo A00;

    public XOC(C72094XNo c72094XNo) {
        this.A00 = c72094XNo;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C72094XNo c72094XNo = this.A00;
        if (c72094XNo.A07) {
            Choreographer choreographer = c72094XNo.A04;
            if (choreographer != null) {
                choreographer.removeFrameCallback(c72094XNo.A01);
            }
            c72094XNo.A05 = null;
            c72094XNo.A07 = false;
            return;
        }
        InterfaceC175577rX interfaceC175577rX = c72094XNo.A05;
        Long l = c72094XNo.A06;
        if (l != null && interfaceC175577rX != null) {
            if (c72094XNo.A00 <= j) {
                long longValue = l.longValue();
                c72094XNo.A00 = longValue * ((j / longValue) + 1);
                interfaceC175577rX.EGZ(Long.valueOf(j));
                return;
            }
            C72094XNo.A00(c72094XNo);
            return;
        }
        Choreographer choreographer2 = c72094XNo.A04;
        if (choreographer2 == null) {
            return;
        }
        choreographer2.removeFrameCallback(c72094XNo.A01);
    }
}

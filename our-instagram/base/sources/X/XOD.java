package X;

import android.view.Choreographer;

/* loaded from: classes12.dex */
public final class XOD implements Runnable {
    public final /* synthetic */ C72094XNo A00;

    public XOD(C72094XNo c72094XNo) {
        this.A00 = c72094XNo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72094XNo c72094XNo = this.A00;
        Choreographer choreographer = c72094XNo.A04;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            c72094XNo.A04 = choreographer;
        }
        XOC xoc = c72094XNo.A01;
        choreographer.removeFrameCallback(xoc);
        choreographer.postFrameCallback(xoc);
    }
}

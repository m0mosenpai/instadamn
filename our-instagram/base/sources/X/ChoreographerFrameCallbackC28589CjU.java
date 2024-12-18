package X;

import android.view.Choreographer;

/* renamed from: X.CjU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ChoreographerFrameCallbackC28589CjU implements Choreographer.FrameCallback {
    public final C25735BYv A00;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C25735BYv c25735BYv = this.A00;
        C25735BYv.A01(c25735BYv, j);
        c25735BYv.invalidate();
        Choreographer.getInstance().postFrameCallback(this);
    }

    public ChoreographerFrameCallbackC28589CjU(C25735BYv c25735BYv) {
        this.A00 = c25735BYv;
    }
}

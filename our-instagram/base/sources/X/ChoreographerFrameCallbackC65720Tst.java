package X;

import android.view.Choreographer;

/* renamed from: X.Tst, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ChoreographerFrameCallbackC65720Tst implements Choreographer.FrameCallback {
    public final /* synthetic */ C99614de A00;
    public final /* synthetic */ Runnable A01;

    public ChoreographerFrameCallbackC65720Tst(C99614de c99614de, Runnable runnable) {
        this.A00 = c99614de;
        this.A01 = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C99614de c99614de = this.A00;
        c99614de.A04.postAtFrontOfQueue(this.A01);
    }
}

package X;

import android.view.Choreographer;

/* loaded from: classes11.dex */
public final class U4L implements Runnable {
    public final /* synthetic */ C6TA A00;

    public U4L(C6TA c6ta) {
        this.A00 = c6ta;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Choreographer.getInstance().postFrameCallback(this.A00.A02);
    }
}

package X;

import android.view.Choreographer;

/* renamed from: X.4tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC107664tB implements Choreographer.FrameCallback {
    public final /* synthetic */ AbstractC107524sx A00;

    public ChoreographerFrameCallbackC107664tB(AbstractC107524sx abstractC107524sx) {
        this.A00 = abstractC107524sx;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        AbstractC107524sx.A00(this.A00, j);
    }
}

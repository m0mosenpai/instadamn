package X;

import android.view.Choreographer;

/* loaded from: classes4.dex */
public final class APs implements Choreographer.FrameCallback {
    public final /* synthetic */ AbstractC197318o2 A00;

    public APs(AbstractC197318o2 abstractC197318o2) {
        this.A00 = abstractC197318o2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A00.A00(j);
    }
}

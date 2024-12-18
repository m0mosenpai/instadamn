package X;

import android.view.Choreographer;

/* renamed from: X.9IR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IR {
    public static final C9IR A01 = new C9IR();
    public Choreographer A00 = Choreographer.getInstance();

    public final void A00(C7LH c7lh) {
        Choreographer.FrameCallback frameCallback = c7lh.A00;
        if (frameCallback == null) {
            frameCallback = new WKp(c7lh, 2);
            c7lh.A00 = frameCallback;
        }
        this.A00.postFrameCallback(frameCallback);
    }

    public final void A01(C7LH c7lh) {
        Choreographer.FrameCallback frameCallback = c7lh.A00;
        if (frameCallback == null) {
            frameCallback = new WKp(c7lh, 2);
            c7lh.A00 = frameCallback;
        }
        this.A00.removeFrameCallback(frameCallback);
    }
}

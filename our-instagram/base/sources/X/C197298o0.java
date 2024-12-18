package X;

import android.view.Choreographer;

/* renamed from: X.8o0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197298o0 {
    public static final C197298o0 A01 = new C197298o0();
    public Choreographer A00 = Choreographer.getInstance();

    public final void A00(AbstractC197318o2 abstractC197318o2) {
        Choreographer.FrameCallback frameCallback = abstractC197318o2.A00;
        if (frameCallback == null) {
            frameCallback = new APs(abstractC197318o2);
            abstractC197318o2.A00 = frameCallback;
        }
        this.A00.postFrameCallback(frameCallback);
    }
}

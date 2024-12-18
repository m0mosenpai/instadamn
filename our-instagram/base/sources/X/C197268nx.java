package X;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197268nx {
    public static final long A05 = TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / 30;
    public long A00;
    public AbstractC197318o2 A01;
    public volatile boolean A04 = false;
    public volatile boolean A03 = false;
    public final C197298o0 A02 = C197298o0.A01;

    public final void A00() {
        this.A04 = true;
        C197298o0 c197298o0 = this.A02;
        AbstractC197318o2 abstractC197318o2 = this.A01;
        Choreographer.FrameCallback frameCallback = abstractC197318o2.A00;
        if (frameCallback == null) {
            frameCallback = new APs(abstractC197318o2);
            abstractC197318o2.A00 = frameCallback;
        }
        c197298o0.A00.removeFrameCallback(frameCallback);
    }

    public C197268nx(InterfaceC197288nz interfaceC197288nz) {
        this.A01 = new C197308o1(interfaceC197288nz, this);
    }
}

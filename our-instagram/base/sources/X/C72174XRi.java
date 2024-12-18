package X;

import android.view.Choreographer;

/* renamed from: X.XRi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72174XRi extends AbstractC197318o2 {
    public final /* synthetic */ C73347Y9c A00;

    public C72174XRi(C73347Y9c c73347Y9c) {
        this.A00 = c73347Y9c;
    }

    @Override // X.AbstractC197318o2
    public final void A00(long j) {
        C73347Y9c c73347Y9c = this.A00;
        if (c73347Y9c.A07) {
            C197298o0 c197298o0 = c73347Y9c.A04;
            C72174XRi c72174XRi = c73347Y9c.A05;
            Choreographer.FrameCallback frameCallback = ((AbstractC197318o2) c72174XRi).A00;
            if (frameCallback == null) {
                frameCallback = new APs(c72174XRi);
                ((AbstractC197318o2) c72174XRi).A00 = frameCallback;
            }
            c197298o0.A00.removeFrameCallback(frameCallback);
            c73347Y9c.A01 = null;
            c73347Y9c.A07 = false;
            return;
        }
        if (c73347Y9c.A01 == null) {
            return;
        }
        if ((c73347Y9c.A02 == null || c73347Y9c.A00 <= j) && c73347Y9c.A06) {
            Long l = c73347Y9c.A02;
            if (l != null) {
                long longValue = l.longValue();
                c73347Y9c.A00 = longValue * ((j / longValue) + 1);
            }
            C73348Y9d c73348Y9d = c73347Y9c.A01;
            System.nanoTime();
            if (Thread.currentThread() == c73348Y9d.A01) {
                c73348Y9d.A03.A0I(c73347Y9c);
                return;
            } else {
                C73348Y9d.A00(c73348Y9d, c73347Y9c, 3);
                return;
            }
        }
        c73347Y9c.A04.A00(c73347Y9c.A05);
    }
}

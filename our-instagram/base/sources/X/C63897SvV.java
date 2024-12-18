package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.SvV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63897SvV implements InterfaceC107844tT {
    public final CountDownLatch A00 = AbstractC58319PtB.A15();
    public volatile boolean A01;

    @Override // X.InterfaceC107844tT
    public final void E1W(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}

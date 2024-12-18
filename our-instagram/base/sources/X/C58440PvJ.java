package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.PvJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58440PvJ implements InterfaceC73609YNz, InterfaceC65424Tjv, YO1 {
    public final CountDownLatch A00 = AbstractC58319PtB.A15();

    @Override // X.InterfaceC73609YNz
    public final void D1x() {
        this.A00.countDown();
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        this.A00.countDown();
    }

    @Override // X.YO1
    public final void onSuccess(Object obj) {
        this.A00.countDown();
    }

    public /* synthetic */ C58440PvJ(AbstractC61516Ror abstractC61516Ror) {
    }

    public C58440PvJ() {
    }
}

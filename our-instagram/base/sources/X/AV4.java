package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class AV4 implements InterfaceC203698zY {
    public final /* synthetic */ CountDownLatch A00;

    public AV4(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    @Override // X.InterfaceC203698zY
    public final void DFx(RkH rkH) {
        this.A00.countDown();
    }

    @Override // X.InterfaceC203698zY
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.countDown();
    }
}

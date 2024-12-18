package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class OJJ {
    public final /* synthetic */ C197368o7 A00;
    public final /* synthetic */ OEN A01;
    public final /* synthetic */ OZr A02;
    public final /* synthetic */ CountDownLatch A03;
    public final /* synthetic */ AtomicReference A04;

    public final void A00(Exception exc) {
        C197368o7 c197368o7 = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Render single config failure: ");
        OEN oen = this.A01;
        EnumC53116NeT enumC53116NeT = oen.A02;
        String A0v = AbstractC166997dE.A0v(enumC53116NeT, A1C);
        OZr oZr = this.A02;
        c197368o7.A0D(A0v, "OneCameraImageRenderer", exc);
        C0K8.A0L("OneCameraImageRenderer", "IO exception for %s", exc, enumC53116NeT);
        this.A04.set(new C54791OJj(null, null, oen, null, null, exc, C05F.A01, 0));
        MX1.A01(oZr.A09).A0B(false, exc.getMessage());
        this.A03.countDown();
    }

    public OJJ(C197368o7 c197368o7, OEN oen, OZr oZr, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A04 = atomicReference;
        this.A03 = countDownLatch;
        this.A00 = c197368o7;
        this.A01 = oen;
        this.A02 = oZr;
    }
}

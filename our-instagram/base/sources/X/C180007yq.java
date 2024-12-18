package X;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180007yq extends AbstractC178807ws implements InterfaceC180017yr {
    public InterfaceC175067qg A00;
    public final C22810A4d A01;
    public final C1814082s A02;
    public final Object A03;
    public volatile BD8 A04;
    public volatile Integer A05;

    @Override // X.InterfaceC180017yr
    public final void Eon(boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.A03) {
            if (this.A05 == C05F.A01) {
                this.A00.Eop(new C212649bX(this, countDownLatch), false);
            }
        }
    }

    public static void A00(C180007yq c180007yq) {
        List list = c180007yq.A02.A00;
        if (0 < list.size()) {
            list.get(0);
            throw new NullPointerException("onVideoCaptureError");
        }
    }

    public C180007yq(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        this.A03 = new Object();
        this.A02 = new C1814082s();
        this.A05 = C05F.A00;
        this.A01 = new C22810A4d(this);
    }
}

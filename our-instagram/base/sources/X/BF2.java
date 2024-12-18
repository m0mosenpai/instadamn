package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class BF2 {
    public final AtomicInteger A00;
    public final InterfaceC16620sF A01;
    public final C19L A02;
    public final InterfaceC24731Iq A03;

    public BF2(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, C19L c19l) {
        C14360o3.A0B(interfaceC16620sF, 3);
        this.A02 = c19l;
        this.A01 = interfaceC16620sF2;
        this.A03 = AbstractC25229BEm.A12();
        this.A00 = new AtomicInteger(0);
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c19l.Arv().get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            anonymousClass195.CPD(new DHZ(14, interfaceC16660sJ, this, interfaceC16620sF));
        }
    }

    public final void A00(Object obj) {
        Object F8s = this.A03.F8s(obj);
        if (F8s instanceof C89973zd) {
            Throwable A01 = C2QV.A01(F8s);
            if (A01 == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
            throw A01;
        }
        if (!(F8s instanceof C2QW)) {
            if (this.A00.getAndIncrement() == 0) {
                AbstractC166987dD.A1Z(new D52(this, (InterfaceC23621Ds) null, 26), this.A02);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Check failed.");
    }
}

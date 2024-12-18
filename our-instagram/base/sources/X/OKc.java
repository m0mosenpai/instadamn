package X;

import java.util.List;

/* loaded from: classes9.dex */
public abstract class OKc {
    public double A00 = 1.0d;
    public long A01 = -1;
    public AnonymousClass195 A02;

    public final void A00() {
        if (this instanceof N11) {
            ((N11) this).A00 = AbstractC31171DnF.A0p();
            return;
        }
        N12 n12 = (N12) this;
        List list = n12.A02;
        if (list != null) {
            list.clear();
        }
        List list2 = n12.A01;
        if (list2 == null) {
            return;
        }
        list2.clear();
    }

    public final void A01(InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC195978lm.A02.A01("sup:SUPMediaStreamLatencyManager", "startTrackingLatency");
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A02);
        this.A02 = AbstractC25226BEj.A1L(new C57172PZq(this, interfaceC16820sZ, A0s, 46, 42), AnonymousClass194.A02(C12P.A00));
    }
}

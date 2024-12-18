package X;

import java.util.List;

/* renamed from: X.IxF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42839IxF implements JGR {
    public final /* synthetic */ HCF A00;

    public C42839IxF(HCF hcf) {
        this.A00 = hcf;
    }

    @Override // X.JGR
    public final void DVd() {
        HCF hcf = this.A00;
        C39325HYq c39325HYq = (C39325HYq) hcf.A06.getValue();
        ISE.A00(c39325HYq.A00, c39325HYq.A01, c39325HYq.A04, c39325HYq.A03, null);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = hcf.A09;
        List A0S = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A0S();
        if (A0S != null && A0S.size() > 0) {
            FBV.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC25225BEi.A15(hcf.A0B), EnumC33406Epd.A0A.toString());
        }
        C1XJ.A00.A0a(hcf.requireActivity(), hcf, AbstractC166987dD.A0r(interfaceC09390do), AbstractC25225BEi.A15(hcf.A0B), AbstractC111324zv.A00(3084));
    }
}

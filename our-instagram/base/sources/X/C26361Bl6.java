package X;

import android.widget.ImageView;

/* renamed from: X.Bl6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26361Bl6 extends AbstractC51572Yf {
    public final InterfaceC59172nI A00;
    public final C51722Yv A01;
    public final InterfaceC30847DhM A02;

    public C26361Bl6(InterfaceC59172nI interfaceC59172nI, C51722Yv c51722Yv, InterfaceC30847DhM interfaceC30847DhM) {
        C14360o3.A0B(interfaceC30847DhM, 3);
        this.A00 = interfaceC59172nI;
        this.A01 = c51722Yv;
        this.A02 = interfaceC30847DhM;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A01;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        InterfaceC59172nI interfaceC59172nI = this.A00;
        if (interfaceC59172nI != null) {
            A0P.A00(new C26620BpH(null, null, ImageView.ScaleType.CENTER_CROP, null, null, interfaceC59172nI, new C66590UOa(5, 335544320, 2), c51722Yv, "ImagineEditLoadingComponent", 0));
        }
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25227BEk.A0W(new C26367BlC(C9CU.A00(AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE), C05F.A01, 1, AbstractC25229BEm.A0D()), this.A02, false), A0P, c76223bS, c51722Yv);
    }
}

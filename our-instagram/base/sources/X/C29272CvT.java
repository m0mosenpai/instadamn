package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.CvT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29272CvT implements InterfaceC162977Ri {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ C7ZX A02;
    public final /* synthetic */ C7T7 A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ C15080pO A05;

    public C29272CvT(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, C7ZX c7zx, C7T7 c7t7, InterfaceC16660sJ interfaceC16660sJ, C15080pO c15080pO) {
        this.A04 = interfaceC16660sJ;
        this.A01 = interfaceC74953Yl;
        this.A00 = interfaceC74953Yl2;
        this.A02 = c7zx;
        this.A03 = c7t7;
        this.A05 = c15080pO;
    }

    @Override // X.InterfaceC162977Ri
    public final float Abt() {
        return this.A05.A00 / 2.0f;
    }

    @Override // X.InterfaceC162977Ri
    public final void CwW() {
        this.A02.DkV(new MessageIdentifier(this.A03.A03, null));
    }

    @Override // X.InterfaceC162977Ri
    public final void Dx5(float f, float f2, float f3, float f4, float f5) {
        this.A01.Egh(new C119235af(AbstractC113765Bo.A00((int) f3, -((int) f4))));
        AbstractC25226BEj.A1T(this.A04, f);
        AbstractC25227BEk.A18(this.A00, f5);
    }
}

package X;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.CUn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27967CUn {
    public final ViewStub A00;
    public final AbstractC59962oe A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC16660sJ A05;

    public C27967CUn(ViewStub viewStub, AbstractC59962oe abstractC59962oe, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(viewStub, 1);
        this.A00 = viewStub;
        this.A01 = abstractC59962oe;
        this.A05 = interfaceC16660sJ;
        this.A02 = AbstractC25225BEi.A0a(new C57521Pfv(abstractC59962oe, 39), DBM.A00, new C57256Pbe(28, null, abstractC59962oe), AbstractC25225BEi.A1D(C25817BbY.class));
        this.A04 = C1XM.A00(new C57521Pfv(this, 38));
        InterfaceC09390do A00 = C1XM.A00(new C57521Pfv(this, 37));
        this.A03 = A00;
        ComposeView composeView = (ComposeView) A00.getValue();
        composeView.setViewCompositionStrategy(C25320BIp.A00);
        composeView.setContent(C5UA.A04(new C30192DRx(this, 34), -1012546335, true));
    }

    public final void A01(EnumC222619s2 enumC222619s2) {
        EnumC222619s2 enumC222619s22 = EnumC222619s2.A03;
        View A0d = AbstractC166987dD.A0d(this.A04);
        if (enumC222619s2 == enumC222619s22) {
            A0d.setVisibility(8);
            AbstractC166987dD.A0d(this.A03).setVisibility(8);
        } else {
            A0d.setVisibility(0);
            AbstractC166987dD.A0d(this.A03).setVisibility(0);
        }
        ((C25817BbY) this.A02.getValue()).A00.Egh(enumC222619s2);
    }

    public final EnumC222619s2 A00() {
        return (EnumC222619s2) ((C25817BbY) this.A02.getValue()).A01.getValue();
    }
}

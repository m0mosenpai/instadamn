package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bs4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26781Bs4 extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC31032DkW {
    public static final String __redex_internal_original_name = "AiCreationConfigurationFragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 5), C29909DGx.A01(this, 6), new C29898DGm(21, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A00 = C1XM.A00(C29909DGx.A01(this, 4));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_creation_configuration_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        InterfaceC09390do interfaceC09390do = this.A02;
        String A03 = C25879Bce.A03(interfaceC09390do);
        String A02 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, "ai_configuration_screen_shown", A03), A02);
        }
    }

    @Override // X.InterfaceC31032DkW
    public final void Cxm(String str) {
        AbstractC25226BEj.A0n(this.A02).A0E(str);
    }

    @Override // X.InterfaceC31032DkW
    public final void D5d() {
        AbstractC25226BEj.A0n(this.A02).A0B();
    }

    @Override // X.InterfaceC31032DkW
    public final void Dm2(boolean z) {
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        InterfaceC09390do interfaceC09390do = this.A02;
        String A03 = C25879Bce.A03(interfaceC09390do);
        String A02 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, "ai_configuration_screen_show_on_profile_row_clicked", A03), A02);
        }
        AbstractC25226BEj.A0n(interfaceC09390do).A0I(z);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952707);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1572276546);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 36), -1725909248);
        C0f9.A09(1294541042, A02);
        return A00;
    }
}

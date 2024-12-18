package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bsm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26824Bsm extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC31032DkW {
    public static final String __redex_internal_original_name = "AiCreationAdvancedEditFragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(DGW.A00(this, 36), DGW.A00(this, 37), new C29898DGm(15, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(DGW.A00(this, 35));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A03 = "kirby_ai_creation_advanced_edit_fragment";

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
        AbstractC25226BEj.A0n(this.A02).A0I(z);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C25531Mh A02 = C28484Chc.A02(this.A00);
        if (AbstractC25226BEj.A1Z(A02)) {
            A02.A0k("ai_creation_advanced_settings_back_button_clicked");
            A02.Cht();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952716);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-18693750);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 27), 472283342);
        C0f9.A09(1542836475, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-355853269);
        C25531Mh A022 = C28484Chc.A02(this.A00);
        if (AbstractC25226BEj.A1Z(A022)) {
            A022.A0k("creation_advanced_edit_screen_shown");
            A022.Cht();
        }
        super.onResume();
        C0f9.A09(-2061184215, A02);
    }
}

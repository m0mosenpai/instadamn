package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26802BsQ extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SchoolSettingsFragment";
    public final EnumC39642HiX A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131972921);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25226BEj.A12(this.A02).A03(EnumC39642HiX.PROFILE_BIO, C8n.SCHOOL_SETTINGS);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A12(this.A02).A04(this.A00, C8n.SCHOOL_SETTINGS);
        return false;
    }

    public C26802BsQ() {
        C29886DGa c29886DGa = new C29886DGa(this, 47);
        C29886DGa c29886DGa2 = new C29886DGa(this, 44);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29886DGa(c29886DGa2, 45));
        this.A04 = AbstractC25225BEi.A0a(new C29886DGa(A00, 46), c29886DGa, new C57252Pba(0, null, A00), AbstractC25225BEi.A1D(C25828Bbj.class));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C29886DGa(this, 42));
        this.A02 = AbstractC09440dt.A01(new C29886DGa(this, 43));
        this.A00 = EnumC39642HiX.SWITCH_SCHOOL_SETTING;
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1030760437);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 4), -200929325);
        C0f9.A09(-1183381117, A02);
        return A00;
    }
}

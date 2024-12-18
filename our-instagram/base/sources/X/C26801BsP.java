package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26801BsP extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditBadgeFragment";
    public final EnumC39642HiX A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;
    public final C8n A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(requireContext().getString(2131961567));
        interfaceC56362iU.Ect(requireContext().getString(2131972699), ViewOnClickListenerC28666ClE.A00(this, 27));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_settings_edit_banner";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25226BEj.A12(this.A01).A03(EnumC39642HiX.PROFILE_BIO, this.A04);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C29138Ct5 A12 = AbstractC25226BEj.A12(this.A01);
        EnumC39642HiX enumC39642HiX = this.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C29138Ct5.A01(A12, enumC39642HiX, 0), "ig_school_reliability_edit_banner_page_cancel_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            AbstractC25234BEr.A0w(C8n.EDIT_BANNER, A0f);
        }
        return false;
    }

    public C26801BsP() {
        C37016GSx c37016GSx = new C37016GSx(this, 37);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37016GSx(new C37016GSx(this, 34), 35));
        this.A03 = AbstractC25225BEi.A0a(new C37016GSx(A00, 36), c37016GSx, new C57536PgA(36, null, A00), AbstractC25225BEi.A1D(C25827Bbi.class));
        this.A01 = AbstractC09440dt.A01(new C37016GSx(this, 33));
        this.A04 = C8n.EDIT_BANNER;
        this.A00 = EnumC39642HiX.SWITCH_SCHOOL_SETTING;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-664613786);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 41), 1027186980);
        C0f9.A09(1490083781, A02);
        return A00;
    }
}

package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26803BsR extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "KirbyAiCreationEditProfilePictureFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A05 = "kirby_ai_creation_edit_profile_picture_fragment";
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(DGX.A00(this, 16), DGX.A00(this, 17), new C29897DGl(6, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(DGX.A00(this, 13));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(DGX.A00(this, 14));

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A01);
        InterfaceC09390do interfaceC09390do = this.A04;
        String A03 = C25879Bce.A03(interfaceC09390do);
        String A02 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, "edit_ai_details_avatar_screen_shown", A03), A02);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A01);
        InterfaceC09390do interfaceC09390do = this.A04;
        String A03 = C25879Bce.A03(interfaceC09390do);
        String A02 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, "edit_ai_details_avatar_cancel_clicked", A03), A02);
        }
        if (AbstractC25226BEj.A0n(interfaceC09390do).A0K()) {
            AbstractC27520CCq.A00(requireContext(), DGX.A00(this, 15), DA2.A00, 2131952827, 2131952826);
            return true;
        }
        InterfaceC09390do interfaceC09390do2 = this.A02;
        AbstractC25226BEj.A0r(interfaceC09390do2).A06.markerPoint(673058094, "avatar_gen_dismissed");
        AbstractC25226BEj.A0r(interfaceC09390do2).A03(C05F.A0C);
        C27271C1v c27271C1v = AbstractC25226BEj.A0n(interfaceC09390do).A00;
        AnonymousClass195 anonymousClass195 = c27271C1v.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        c27271C1v.A0Y.Egh(null);
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952777);
        ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 11, 2131961124);
        interfaceC56362iU.ARk(A10 ? 1 : 0, ((C26035BfO) AbstractC25226BEj.A0n(this.A04).A0Q.getValue()).A01 instanceof C26115Bgz);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1317297476);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 5), 652402944);
        C0f9.A09(480340177, A02);
        return A00;
    }
}

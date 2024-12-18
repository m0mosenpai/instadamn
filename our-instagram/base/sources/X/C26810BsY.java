package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;

/* renamed from: X.BsY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26810BsY extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiPreparationFragment";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A05 = "kirby_ai_preparation_fragment";
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(C29907DGv.A01(this, 16), C29907DGv.A01(this, 17), new C29898DGm(40, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC41501vz A04 = new C29152CtJ(this, 0);
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C29907DGv.A01(this, 14));
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(C29907DGv.A01(this, 15));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("");
        C3LO c3lo = new C3LO();
        c3lo.A0K = getString(2131956237);
        c3lo.A0D = R.style.ActionBarTextButton;
        ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, 8);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        InterfaceC09390do interfaceC09390do = this.A03;
        String A03 = C25879Bce.A03(interfaceC09390do);
        String A02 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, "creation_preparation_screen_dismiss_clicked", A03), A02);
        }
        AbstractC25226BEj.A0r(this.A01).A09(AbstractC111324zv.A00(1906));
        AbstractC33649Etz.A00(requireActivity(), "ugc_ai_creation");
        AbstractC25226BEj.A0n(interfaceC09390do).A0A();
        AbstractC25231BEo.A16(this);
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-296565543);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 47), 890927296);
        C0f9.A09(-1183045488, A02);
        return A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-411690388);
        super.onPause();
        AbstractC25651Mw.A00(AbstractC166987dD.A0o(this.A02)).A02(this.A04, C2Io.class);
        C0f9.A09(612698572, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1556499869);
        super.onResume();
        AbstractC25651Mw.A00(AbstractC166987dD.A0o(this.A02)).A01(this.A04, C2Io.class);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        InterfaceC09390do interfaceC09390do = this.A03;
        String A03 = C25879Bce.A03(interfaceC09390do);
        String A022 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, "creation_preparation_screen_shown", A03), A022);
        }
        AbstractC25226BEj.A0r(this.A01).A09("ai_preparation_screen_shown");
        C0f9.A09(-1290706686, A02);
    }
}

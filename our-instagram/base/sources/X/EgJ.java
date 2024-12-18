package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.repository.MonetizationRepository;

/* loaded from: classes6.dex */
public final class EgJ extends N6G {
    public static final String __redex_internal_original_name = "UserPaySettingsFragment";
    public final InterfaceC09390do A00 = AbstractC25225BEi.A0a(new C57246PbU(this, 8), new C57246PbU(this, 9), new C57532Pg6(7, null, this), AbstractC25225BEi.A1D(C31824Dyi.class));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131976469);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.N6G, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object value = this.A00.getValue();
        AbstractC166987dD.A1Z(new C57158PZc(value, this, null, 28), AbstractC25235BEs.A0S(this));
    }

    @Override // X.N6G
    public final AbstractC53500NlR A07() {
        return new NQ5("com.instagram.user_pay.badges.utils.onboarding.navigation_handler");
    }

    @Override // X.N6G
    public final void A0A() {
        C31470DsE.A00(this, ((C31824Dyi) this.A00.getValue()).A00, 37);
    }

    @Override // X.N6G
    public final void A0B() {
        C31824Dyi c31824Dyi = (C31824Dyi) this.A00.getValue();
        C41761wQ c41761wQ = c31824Dyi.A02;
        MonetizationRepository monetizationRepository = c31824Dyi.A03;
        C25621Ms A0M = AbstractC31177DnL.A0M(monetizationRepository.A0A.A00);
        A0M.A0B("creators/user_pay/user_pay_summary/");
        GKK.A00(AbstractC34046F0z.A00(AbstractC25227BEk.A0e(A0M, ED4.class, FYH.class)), c41761wQ, c31824Dyi, 28);
        OY3.A02(EnumC53330NiA.A08, monetizationRepository, new C30519Dc2(c31824Dyi, 11));
    }

    @Override // X.N6G
    public final void A0E(boolean z) {
        C2GS c2gs = ((C31824Dyi) this.A00.getValue()).A01;
        E6T e6t = (E6T) c2gs.A02();
        if (e6t != null) {
            e6t.A04 = z;
        }
        c2gs.A0A(c2gs.A02());
    }

    @Override // X.N6G
    public final UserMonetizationProductType A05() {
        return UserMonetizationProductType.A0J;
    }
}

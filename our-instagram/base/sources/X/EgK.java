package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes6.dex */
public final class EgK extends N6G {
    public static final String __redex_internal_original_name = "FanClubSettingsFragment";
    public C64842wi A00;
    public final InterfaceC09390do A01 = AbstractC25225BEi.A0a(new J7K(this, 13), new J7K(this, 14), new C50171MDy(43, null, this), AbstractC25225BEi.A1D(C31834Dyt.class));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131976537);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "UserPayFanclubSettingsFragment";
    }

    @Override // X.N6G, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FR4 fr4 = new FR4(requireActivity(), A06());
        new C35024Fbx(this, requireActivity(), A06(), fr4, A09(), 32).A01(requireContext(), null, i, i2);
    }

    @Override // X.N6G, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Long A0j = AbstractC25231BEo.A0j(0, A06().userId);
        if (A0j != null) {
            C99694dm A00 = AbstractC99684dl.A00(A06());
            String A09 = A09();
            C14360o3.A0B(A09, 2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A00, "ig_creator_subscription_management_screen_impression");
            AbstractC31171DnF.A1I(A0f, "creator_management_settings");
            A0f.A9K("creator_igid", A0j);
            AbstractC31180DnO.A1I(A0f, A09);
        }
        AbstractC31172DnG.A1B(requireContext(), view, AbstractC53242c7.A0D(requireContext()));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
        C141796aw A002 = AbstractC141776au.A00(A0Z);
        MBp mBp = new MBp(A0Z, null, 21);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mBp, A002);
        C27961Xa A003 = AbstractC54912fq.A00();
        UserSession A06 = A06();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A19;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A04 = new GCP(this, 3);
        A0S.A08 = new C31451Drv(this, 3);
        C64842wi A0T = AbstractC31175DnJ.A0T(this, A06, A0S, A003, quickPromotionSlot);
        this.A00 = A0T;
        A0T.DiZ();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCL(viewLifecycleOwner, c07s, this, null, 31), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.N6G
    public final AbstractC53500NlR A07() {
        return new NQ5("com.instagram.user_pay.fan_club.utils.creator_onboarding_navigation_handler");
    }

    @Override // X.N6G
    public final void A0A() {
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 30), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.N6G
    public final void A0B() {
        InterfaceC09390do interfaceC09390do = this.A01;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        MBp mBp = new MBp(A0Z, null, 23);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mBp, A00);
        if (C18U.A06(C06090Tz.A05, A06(), 36321331536471366L)) {
            AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(interfaceC09390do);
            AbstractC23641Du.A05(anonymousClass191, new MBp(A0Z2, null, 22), AbstractC141776au.A00(A0Z2));
        }
    }

    @Override // X.N6G
    public final void A0E(boolean z) {
        AbstractC166997dE.A1Y(((C31834Dyt) this.A01.getValue()).A06, z);
    }

    public static final void A00(EgK egK) {
        C140966Yy A0r = AbstractC25225BEi.A0r(egK.requireActivity(), egK.A06());
        FVI.A00();
        Context requireContext = egK.requireContext();
        UserSession A06 = egK.A06();
        C14360o3.A0B(A06, 1);
        C66277U6x A01 = C66277U6x.A01("com.instagram.user_pay.fan_club.screens.creator_onboarding.creator_side_subscription_settings", AbstractC167017dG.A0r("tooltip", null));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A06);
        AbstractC31171DnF.A10(requireContext, A0C, 2131976535);
        AbstractC31175DnJ.A0s(null, W6d.A02(A0C, A01), A0r);
    }

    @Override // X.N6G
    public final UserMonetizationProductType A05() {
        return UserMonetizationProductType.A0C;
    }
}

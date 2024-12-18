package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ovw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56136Ovw implements InterfaceC13000lm {
    public final C18920wW A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C56136Ovw(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        C19270xB A0D = AbstractC31171DnF.A0D("CreatorMonetizationLogger");
        this.A01 = A0D;
        this.A00 = AbstractC12220kQ.A01(A0D, userSession);
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(str5, 4);
        InterfaceC02590Ai A05 = AbstractC50524MSc.A05(this.A00, "ig_creator_monetization_onboarding_flow", str, str2, str5);
        AbstractC31171DnF.A1A(A05, str4);
        AbstractC31171DnF.A1C(A05, str3);
        EnumC33479ErE enumC33479ErE = null;
        if (str6 != null) {
            try {
                enumC33479ErE = EnumC33479ErE.valueOf(str6);
            } catch (IllegalArgumentException unused) {
            }
        }
        A05.A8R(enumC33479ErE, "origin");
        A05.AAP("client_extra", str7);
        A05.Cht();
    }

    public final void A00(EnumC33479ErE enumC33479ErE, String str, String str2, String str3) {
        InterfaceC02590Ai A05 = AbstractC50524MSc.A05(this.A00, "ig_user_pay_badges_supporters_list_supporter_tap", "live", "badges", N7O.__redex_internal_original_name);
        A05.A8R(enumC33479ErE, "origin");
        A05.AAP("supporter_id", str);
        MSW.A1S(A05, str2);
        A05.AAP("insights_id", str3);
        A05.Cht();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C56136Ovw.class);
    }
}

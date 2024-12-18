package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ovv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56135Ovv implements InterfaceC13000lm {
    public C18920wW A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public final void A00(Integer num, String str, String str2, String str3) {
        String str4;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_creator_incentive_platform_reels_bonus_tagging");
        switch (num.intValue()) {
            case 0:
                str4 = "Entry impression";
                break;
            case 1:
                str4 = "Selection view impression";
                break;
            case 2:
                str4 = "Deal select";
                break;
            case 3:
                str4 = "Deal publish";
                break;
            case 4:
                str4 = "Self Reel Promo Impression";
                break;
            case 5:
                str4 = "Self Reel Promo Tap Primary Action";
                break;
            case 6:
                str4 = "Self Reel Promo Dismiss";
                break;
            case 7:
                str4 = "After Reel Creation Promo Impression";
                break;
            case 8:
                str4 = "After Reel Creation Promo Tap Primary Action";
                break;
            case 9:
                str4 = "After Reel Creation Promo Dismiss";
                break;
            default:
                str4 = "Promo Dialogs Request Error";
                break;
        }
        AbstractC31171DnF.A1C(A0f, str4);
        AbstractC37301Gc2.A15(A0f, this.A01);
        A0f.AAP("tagged_deal_program_name", str);
        MSW.A1S(A0f, str2);
        A0f.AAP("client_extra", str3);
        A0f.Cht();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A03(C56135Ovv.class);
    }

    public C56135Ovv(UserSession userSession) {
        this.A02 = userSession;
        C19270xB A0D = AbstractC31171DnF.A0D("IncentivePlatformLoggingHelper");
        this.A01 = A0D;
        this.A00 = AbstractC12220kQ.A01(A0D, userSession);
    }
}

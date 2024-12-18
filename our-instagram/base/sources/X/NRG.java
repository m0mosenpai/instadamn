package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NRG extends AbstractC56145Ow9 {
    public static NRG A02;
    public final C18920wW A00;
    public final OCW A01 = new OCW();

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A02 = null;
    }

    public final void A00(int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_user_pay_badge_count_updated");
        OCW ocw = this.A01;
        MSW.A1S(A0f, ocw.A02);
        AbstractC31171DnF.A1I(A0f, ocw.A01);
        A0f.AAP("product_type", ocw.A03);
        A0f.A9K("count", AbstractC31171DnF.A0V(i));
        A0f.Cht();
    }

    public final void A01(Integer num, String str, String str2, String str3) {
        String str4;
        if (str != null) {
            OCW ocw = this.A01;
            String str5 = (String) AbstractC001800i.A0J(AbstractC167007dF.A0m(str, "_", 0));
            if (str5 != null) {
                str = str5;
            }
            ocw.A02 = str;
        }
        if (str2 != null) {
            this.A01.A00 = str2;
        }
        OCW ocw2 = this.A01;
        switch (num.intValue()) {
            case 1:
                str4 = "live_supporter_list";
                break;
            case 2:
                str4 = "live_broadcast_ending";
                break;
            case 3:
                str4 = "reel_multiedit_composer";
                break;
            case 4:
                str4 = "live";
                break;
            case 5:
                str4 = "igtv";
                break;
            default:
                str4 = "creator_profile";
                break;
        }
        ocw2.A01 = str4;
        if (str3 != null) {
            ocw2.A03 = str3;
        }
    }

    public NRG(UserSession userSession) {
        this.A00 = AbstractC12220kQ.A02(userSession);
    }
}

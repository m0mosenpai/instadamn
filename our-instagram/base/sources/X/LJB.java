package X;

import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LJB {
    public List A00;
    public final LoggingFanData A01;
    public final LJ3 A02;
    public final UserSession A03;

    public final void A04(int i, Integer num) {
        C44882Jtw A00 = A00(this, num, null);
        AbstractC43594JPz.A1D(A00, i);
        LJ3 A01 = A01(A00, this);
        String str = this.A01.A03;
        C16920sk A0E = AbstractC06930Yk.A0E();
        AbstractC167017dG.A1O(str, A0E);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01.A02, "client_load_appreciationgiver_display");
        if (A0f.isSampled()) {
            LJ3.A01(A0f, A01, str);
            JQ0.A13(A01.A01, A0f, A00);
            AbstractC43593JPy.A1K(A0f, A0E);
        }
    }

    public final void A05(Integer num, int i, boolean z) {
        C44882Jtw A00 = A00(this, num, null);
        AbstractC43594JPz.A1D(A00, i);
        A01(A00, this).A04(A00, this.A01.A03, AbstractC167007dF.A0n("packs_hit_cache", String.valueOf(z)));
    }

    public final void A06(Integer num, String str, String str2, String str3, String str4, int i) {
        AbstractC167017dG.A1R(str, str2);
        C44882Jtw A00 = A00(this, num, C05F.A00);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("star_package_id", str);
        A01(A00, this).A02(A00, this.A01.A03, str2, str3, str4, AbstractC06930Yk.A0E());
    }

    public final void A07(String str, int i, Integer num) {
        C14360o3.A0B(str, 2);
        C44882Jtw A00 = A00(this, num, C05F.A00);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("star_package_id", str);
        A01(A00, this).A03(A00, this.A01.A03, AbstractC06930Yk.A0E());
    }

    public final void A08(String str, int i, Integer num) {
        C14360o3.A0B(str, 2);
        C44882Jtw A00 = A00(this, num, C05F.A00);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("star_package_id", str);
        A01(A00, this).A04(A00, this.A01.A03, AbstractC06930Yk.A0E());
    }

    public final void A09(String str, int i, Integer num) {
        C14360o3.A0B(str, 2);
        C44882Jtw A00 = A00(this, num, C05F.A01);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("star_package_id", str);
        A01(A00, this).A05(A00, this.A01.A03, AbstractC06930Yk.A0E());
    }

    public static final C44882Jtw A00(LJB ljb, Integer num, Integer num2) {
        String str;
        String str2;
        String str3 = ljb.A03.userId;
        LoggingFanData loggingFanData = ljb.A01;
        String str4 = loggingFanData.A00;
        String str5 = loggingFanData.A02;
        String str6 = loggingFanData.A01;
        if (num.intValue() != 0) {
            str = "appreciation_buy_and_send";
        } else {
            str = "appreciation_balance";
        }
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "star_package_option";
                    break;
                case 2:
                    str2 = "stars_terms";
                    break;
                case 3:
                    str2 = "payment_terms";
                    break;
                case 4:
                    str2 = "learn_more";
                    break;
                case 5:
                    str2 = "back";
                    break;
                case 6:
                    str2 = "flow_canceled";
                    break;
                default:
                    str2 = "purchase_outside";
                    break;
            }
        } else {
            str2 = null;
        }
        return LJ3.A00(str3, str4, str5, str6, str, str2);
    }

    public static LJ3 A01(C0Zx c0Zx, LJB ljb) {
        c0Zx.A07(MSV.A00(1616), ljb.A00);
        return ljb.A02;
    }

    public final void A02(int i, Integer num) {
        C44882Jtw A00 = A00(this, num, C05F.A0N);
        AbstractC43594JPz.A1D(A00, i);
        A01(A00, this).A05(A00, this.A01.A03, AbstractC06930Yk.A0E());
    }

    public final void A03(int i, Integer num) {
        C44882Jtw A00 = A00(this, num, C05F.A0j);
        AbstractC43594JPz.A1D(A00, i);
        LJ3 A01 = A01(A00, this);
        String str = this.A01.A03;
        C16920sk A0E = AbstractC06930Yk.A0E();
        AbstractC167017dG.A1O(str, A0E);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01.A02, "user_click_appreciationgiver_exit");
        if (A0f.isSampled()) {
            LJ3.A01(A0f, A01, str);
            JQ0.A13(A01.A01, A0f, A00);
            AbstractC43593JPy.A1K(A0f, A0E);
        }
    }

    public /* synthetic */ LJB(LoggingFanData loggingFanData, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        LJ3 lj3 = new LJ3(AbstractC12220kQ.A01(interfaceC11380iw, userSession));
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = lj3;
        this.A00 = C16930sl.A00;
    }
}

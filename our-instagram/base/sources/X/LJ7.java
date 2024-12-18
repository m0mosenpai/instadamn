package X;

import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LJ7 {
    public List A00;
    public final LoggingFanData A01;
    public final LJ3 A02;
    public final UserSession A03;

    public final void A02(EnumC46198Kca enumC46198Kca, String str, String str2, String str3, List list, int i) {
        C14360o3.A0B(enumC46198Kca, 0);
        AbstractC25233BEq.A0w(1, str, list, str2);
        C44882Jtw A00 = A00(enumC46198Kca, this, null);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("gift_id", str);
        A00.A07("gift_options", list);
        this.A02.A02(A00, this.A01.A03, str2, null, str3, AbstractC06930Yk.A0E());
    }

    public final void A06(String str, int i) {
        C14360o3.A0B(str, 0);
        C44882Jtw A00 = A00(EnumC46198Kca.A03, this, null);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("gift_id", str);
        A00.A07("gift_options", this.A00);
        LJ3 lj3 = this.A02;
        String str2 = this.A01.A03;
        C16920sk A0E = AbstractC06930Yk.A0E();
        AbstractC167017dG.A1O(str2, A0E);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lj3.A02, "client_load_appreciationgiver_display");
        if (A0f.isSampled()) {
            LJ3.A01(A0f, lj3, str2);
            JQ0.A13(lj3.A01, A0f, A00);
            AbstractC43593JPy.A1K(A0f, A0E);
        }
    }

    public static final C44882Jtw A00(EnumC46198Kca enumC46198Kca, LJ7 lj7, Integer num) {
        String str;
        String str2 = lj7.A03.userId;
        LoggingFanData loggingFanData = lj7.A01;
        String str3 = loggingFanData.A00;
        String str4 = loggingFanData.A02;
        String str5 = loggingFanData.A01;
        String str6 = enumC46198Kca.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "add_to_balance";
                    break;
                case 2:
                    str = "send";
                    break;
                case 3:
                    str = "appreciation_balance";
                    break;
                case 4:
                    str = "buy_and_send";
                    break;
                case 5:
                    str = "back";
                    break;
                default:
                    str = "select_gift";
                    break;
            }
        } else {
            str = null;
        }
        return LJ3.A00(str2, str3, str4, str5, str6, str);
    }

    public static void A01(C44882Jtw c44882Jtw, LJ7 lj7) {
        c44882Jtw.A07("gift_options", lj7.A00);
        lj7.A02.A05(c44882Jtw, lj7.A01.A03, AbstractC06930Yk.A0E());
    }

    public final void A05(String str) {
        this.A02.A02(A00(EnumC46198Kca.A06, this, null), this.A01.A03, "query_gifts_failure", null, str, AbstractC06930Yk.A0E());
    }

    public /* synthetic */ LJ7(LoggingFanData loggingFanData, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        LJ3 lj3 = new LJ3(AbstractC12220kQ.A01(interfaceC11380iw, userSession));
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = loggingFanData;
        this.A02 = lj3;
        this.A00 = C16930sl.A00;
    }

    public final void A03(EnumC46198Kca enumC46198Kca, String str, List list, int i) {
        AbstractC167017dG.A1Q(str, list);
        C44882Jtw A00 = A00(enumC46198Kca, this, null);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("gift_id", str);
        A00.A07("gift_options", list);
        this.A02.A03(A00, this.A01.A03, AbstractC06930Yk.A0E());
    }

    public final void A04(EnumC46198Kca enumC46198Kca, String str, List list, int i) {
        AbstractC167017dG.A1N(enumC46198Kca, str);
        C14360o3.A0B(list, 3);
        C44882Jtw A00 = A00(enumC46198Kca, this, null);
        AbstractC43594JPz.A1D(A00, i);
        A00.A06("gift_id", str);
        A00.A07("gift_options", list);
        this.A02.A04(A00, this.A01.A03, AbstractC06930Yk.A0E());
    }
}

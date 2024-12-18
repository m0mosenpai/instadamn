package X;

import android.os.Handler;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* renamed from: X.LIg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47972LIg {
    public LGU A00;
    public Runnable A01;
    public final long A02;
    public final Handler A03 = AbstractC167007dF.A0J();
    public final EnumC46271Ke3 A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final L8Q A07;
    public final String A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16620sF A0B;
    public final C40701ud A0C;

    public static final void A00(C47972LIg c47972LIg, LGU lgu, String str) {
        UserSession userSession = c47972LIg.A06;
        InterfaceC11380iw interfaceC11380iw = c47972LIg.A05;
        String str2 = lgu.A00;
        C14360o3.A06(str2);
        String str3 = lgu.A01;
        LJM.A02(c47972LIg.A04, interfaceC11380iw, userSession, str, str2, str3, c47972LIg.A08, null);
        L8Q l8q = c47972LIg.A07;
        C14360o3.A06(str3);
        JQ0.A1G(l8q.A00, "error", str, 944520647, str3.hashCode());
    }

    public final void A02() {
        LGU lgu = new LGU(this.A00.A00, C16930sl.A00);
        this.A00 = lgu;
        UserSession userSession = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        String str = lgu.A00;
        C14360o3.A06(str);
        String str2 = lgu.A01;
        EnumC46271Ke3 enumC46271Ke3 = this.A04;
        String str3 = this.A08;
        C14360o3.A0B(enumC46271Ke3, 4);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_ai_sticker_regenerate_stickers");
            if (A0f.isSampled()) {
                A0f.AAP("search_query", str);
                JQ1.A0c(enumC46271Ke3, A0f, str2, str3);
                A0f.Cht();
            }
        }
        A01(this, lgu, true);
    }

    public C47972LIg(EnumC46271Ke3 enumC46271Ke3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF) {
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A08 = str;
        this.A0A = interfaceC16820sZ;
        this.A0B = interfaceC16620sF;
        this.A09 = interfaceC16820sZ2;
        this.A04 = enumC46271Ke3;
        this.A0C = AbstractC40691uc.A01(userSession);
        this.A07 = C50252MHh.A00(userSession);
        this.A02 = Math.max(C18U.A01(C06090Tz.A05, userSession, 36599181561630166L) - 300, 0L);
        this.A00 = new LGU(str2, C16930sl.A00);
    }

    public static final void A01(C47972LIg c47972LIg, LGU lgu, boolean z) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        String str = lgu.A00;
        boolean A1X = AbstractC43594JPz.A1X(A0b, "prompt", str);
        JQ1.A0f(A0b);
        A0b.A04("caller", "igd_ai_gen_stickers");
        Boolean valueOf = Boolean.valueOf(z);
        A0b.A02("bypass_cache", valueOf);
        PandoGraphQLRequest A00 = LTE.A00(A0b, A0b2, AbstractC167007dF.A1W(valueOf), A1X);
        UserSession userSession = c47972LIg.A06;
        InterfaceC11380iw interfaceC11380iw = c47972LIg.A05;
        C14360o3.A06(str);
        String str2 = lgu.A01;
        EnumC46271Ke3 enumC46271Ke3 = c47972LIg.A04;
        String str3 = c47972LIg.A08;
        C14360o3.A0B(enumC46271Ke3, 4);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_ai_sticker_model_request_sent");
            if (A0f.isSampled()) {
                A0f.AAP("search_query", str);
                JQ1.A0c(enumC46271Ke3, A0f, str2, str3);
                A0f.Cht();
            }
        }
        L8Q l8q = c47972LIg.A07;
        C14360o3.A06(str2);
        l8q.A00(str2, false);
        C40701ud c40701ud = c47972LIg.A0C;
        C14360o3.A0A(A00);
        c40701ud.ATV(new C48138LSn(2, lgu, c47972LIg), new LTC(8, lgu, c47972LIg), A00);
    }
}

package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IlX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42123IlX implements JI9 {
    public final C18920wW A00;
    public final UserSession A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final InterfaceC11380iw A08;
    public final C42708Iv3 A09;

    public C42123IlX(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C42708Iv3 c42708Iv3, String str) {
        AbstractC167027dH.A0a(1, userSession, str, interfaceC11380iw, c42708Iv3);
        this.A01 = userSession;
        this.A07 = str;
        this.A08 = interfaceC11380iw;
        this.A09 = c42708Iv3;
        this.A00 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
        C38321qM c38321qM = c42708Iv3.A01;
        this.A04 = AbstractC41071vF.A07(userSession, c38321qM);
        this.A05 = AbstractC41071vF.A0F(userSession, c38321qM);
        this.A03 = c38321qM.A2Y();
        this.A02 = AbstractC41071vF.A05(userSession, c38321qM);
        this.A06 = c42708Iv3.getId();
    }

    @Override // X.JI9
    public final void ClL(String str) {
        long j;
        Long A0j;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled()) {
            String str2 = this.A04;
            if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A01(A0f, this, j);
            String str3 = this.A05;
            if (str3 == null) {
                str3 = "";
            }
            A03(A0f, this, str3);
            A0f.AAP("question_id", "interests");
            A02(A0f, this, A00(A0f, this, "answer_id", str));
            A0f.Cht();
        }
    }

    @Override // X.JI9
    public final void CmG(String str) {
        long j;
        Long A0j;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled()) {
            String str2 = this.A04;
            if (str2 != null && (A0j = AbstractC166997dE.A0j(str2)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A01(A0f, this, j);
            String str3 = this.A05;
            if (str3 == null) {
                str3 = "";
            }
            A03(A0f, this, str3);
            A0f.AAP("question_id", "interests");
            A02(A0f, this, A00(A0f, this, "answer_id", str));
            A0f.Cht();
        }
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, C42123IlX c42123IlX, String str) {
        interfaceC02590Ai.AAP("ad_tracking_token", str);
        interfaceC02590Ai.A9M("extra_data", AbstractC16850sd.A0M(new C09530e4("ads_category", c42123IlX.A03)));
        interfaceC02590Ai.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_dwell");
    }

    public static void A04(C0Zx c0Zx, JMH jmh, String str) {
        EnumC39640HiV enumC39640HiV;
        String str2;
        c0Zx.A06(CacheBehaviorLogger.SOURCE, str);
        String CEq = jmh.CEq();
        if (C14360o3.A0K(CEq, "v1")) {
            enumC39640HiV = EnumC39640HiV.V1;
        } else if (C14360o3.A0K(CEq, "v2")) {
            enumC39640HiV = EnumC39640HiV.V2;
        } else {
            enumC39640HiV = EnumC39640HiV.UNKNOWN;
        }
        c0Zx.A01(enumC39640HiV, "version");
        String emoji = jmh.getEmoji();
        if (emoji != null && emoji.length() != 0) {
            str2 = C2UX.A00().Cny(-1, emoji).toString();
        } else {
            str2 = "";
        }
        c0Zx.A06("emoji", str2);
    }

    @Override // X.JI9
    public final String AaQ() {
        return this.A06;
    }

    @Override // X.JI9
    public final void Ciw() {
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_dismiss");
        if (A0f.isSampled()) {
            String str = this.A04;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A01(A0f, this, j);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0f, this, str2);
            A02(A0f, this, A00(A0f, this, "question_id", "interests"));
            A0f.Cht();
        }
    }

    @Override // X.JI9
    public final void Ck6() {
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled()) {
            String str = this.A04;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A01(A0f, this, j);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0f, this, str2);
            A02(A0f, this, A00(A0f, this, "question_id", "interests"));
            A0f.Cht();
        }
    }

    @Override // X.JI9
    public final void Ck8(List list) {
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled()) {
            String str = this.A04;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            A01(A0f, this, j);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0f, this, str2);
            A02(A0f, this, A00(A0f, this, "question_id", "interests"));
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JMH jmh = (JMH) it.next();
                C14360o3.A0B(jmh, 0);
                C0Zx c0Zx = new C0Zx();
                String name = jmh.getName();
                if (name != null) {
                    A04(c0Zx, jmh, AbstractC37305Gc6.A01(c0Zx, jmh, name));
                    A0q.add(c0Zx);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A0f.AAk("interests", A0q);
            A0f.Cht();
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
        long j2;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_timespent");
        if (A0f.isSampled()) {
            String str = this.A04;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j2 = A0j.longValue();
            } else {
                j2 = 0;
            }
            A01(A0f, this, j2);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0f, this, str2);
            A02(A0f, this, A00(A0f, this, "question_id", "interests"));
            A0f.A8I("timespent", AbstractC37302Gc3.A0S(j));
            A0f.Cht();
        }
    }

    public static long A00(InterfaceC02590Ai interfaceC02590Ai, C42123IlX c42123IlX, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        if (c42123IlX.A02 != null) {
            return r0.intValue();
        }
        return -1L;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C42123IlX c42123IlX, long j) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(j));
        interfaceC02590Ai.A9K("ig_userid", Long.valueOf(Long.parseLong(c42123IlX.A01.userId)));
        interfaceC02590Ai.AAP("afi_id", c42123IlX.A06);
        interfaceC02590Ai.AAP("afi_type", AFI_TYPE.A08.A00);
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C42123IlX c42123IlX, long j) {
        interfaceC02590Ai.A9K("global_position", Long.valueOf(j));
        interfaceC02590Ai.AAP("client_session_id", c42123IlX.A07);
    }
}

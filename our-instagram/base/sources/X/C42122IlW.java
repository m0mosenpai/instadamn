package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.IlW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42122IlW implements JI9 {
    public final C18920wW A00;
    public final UserSession A01;
    public final C42710Iv5 A02;
    public final C1M1 A03;
    public final String A04;
    public final InterfaceC11380iw A05;
    public final InterfaceC61432r6 A06;

    public C42122IlW(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C42710Iv5 c42710Iv5, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1) {
        String str;
        AbstractC167027dH.A0a(1, userSession, c1m1, interfaceC11380iw, c42710Iv5);
        C14360o3.A0B(interfaceC61432r6, 5);
        this.A01 = userSession;
        this.A03 = c1m1;
        this.A05 = interfaceC11380iw;
        this.A02 = c42710Iv5;
        this.A06 = interfaceC61432r6;
        C38621GyO c38621GyO = c42710Iv5.A06.A01;
        this.A04 = (c38621GyO == null || (str = c38621GyO.A02) == null) ? "" : str;
        this.A00 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
    }

    @Override // X.JI9
    public final /* synthetic */ void Ck8(List list) {
    }

    @Override // X.JI9
    public final void ClL(String str) {
        String str2;
        String str3;
        C75113Zb c75113Zb;
        List list;
        InterfaceC106374qr interfaceC106374qr;
        AFI_TYPE afi_type;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled()) {
            C42710Iv5 c42710Iv5 = this.A02;
            C38608GyB c38608GyB = c42710Iv5.A06;
            LinkedHashMap A00 = A00(c42710Iv5, false);
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str2 = afi_type.A00) == null) {
                str2 = "";
            }
            long j = c42710Iv5.A00;
            if (c38621GyO == null || (list = c38621GyO.A04) == null || (interfaceC106374qr = (InterfaceC106374qr) AbstractC001800i.A0J(list)) == null || (str3 = interfaceC106374qr.BjV()) == null) {
                str3 = "";
            }
            String A01 = INY.A01(c42710Iv5.A04);
            A01(A0f, c38608GyB, this);
            String str4 = this.A04;
            A0f.AAP("afi_id", str4);
            A0f.AAP("afi_type", str2);
            A0f.AAP("ad_tracking_token", c42710Iv5.A05);
            AbstractC37300Gc1.A0u(A0f, A00);
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, A01);
            AbstractC37302Gc3.A11(A0f, str3, str);
            A02(A0f, this, j);
            A0f.Cht();
            C38321qM c38321qM = c42710Iv5.A02;
            if (c38321qM != null && (c75113Zb = c42710Iv5.A03) != null) {
                this.A06.DVi(new C6T6(null, new XVS(C05F.A00, str4, c42710Iv5.A05, str2, str3, A01, str, A00, j), "", ""), AnonymousClass317.A05, c38321qM, c75113Zb);
            }
        }
    }

    @Override // X.JI9
    public final void CmG(String str) {
        String str2;
        String str3;
        C75113Zb c75113Zb;
        List list;
        InterfaceC106374qr interfaceC106374qr;
        AFI_TYPE afi_type;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled()) {
            C42710Iv5 c42710Iv5 = this.A02;
            C38608GyB c38608GyB = c42710Iv5.A06;
            LinkedHashMap A00 = A00(c42710Iv5, false);
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str2 = afi_type.A00) == null) {
                str2 = "";
            }
            long j = c42710Iv5.A00;
            if (c38621GyO == null || (list = c38621GyO.A04) == null || (interfaceC106374qr = (InterfaceC106374qr) AbstractC001800i.A0J(list)) == null || (str3 = interfaceC106374qr.BjV()) == null) {
                str3 = "";
            }
            String A01 = INY.A01(c42710Iv5.A04);
            A01(A0f, c38608GyB, this);
            String str4 = this.A04;
            A0f.AAP("afi_id", str4);
            A0f.AAP("afi_type", str2);
            A0f.AAP("ad_tracking_token", c42710Iv5.A05);
            AbstractC37300Gc1.A0u(A0f, A00);
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, A01);
            AbstractC37302Gc3.A11(A0f, str3, str);
            A02(A0f, this, j);
            A0f.Cht();
            C38321qM c38321qM = c42710Iv5.A02;
            if (c38321qM != null && (c75113Zb = c42710Iv5.A03) != null) {
                this.A06.DVi(new C6T6(null, new XVS(C05F.A01, str4, c42710Iv5.A05, str2, str3, A01, str, A00, j), "", ""), AnonymousClass317.A05, c38321qM, c75113Zb);
            }
        }
    }

    public static final LinkedHashMap A00(C42710Iv5 c42710Iv5, boolean z) {
        LinkedHashMap A1I;
        String str;
        double d;
        double d2;
        HashMap hashMap;
        C38621GyO c38621GyO = c42710Iv5.A06.A01;
        if (c38621GyO != null && (hashMap = c38621GyO.A03) != null) {
            A1I = new LinkedHashMap(hashMap);
        } else {
            A1I = AbstractC166987dD.A1I();
        }
        if (z) {
            long j = c42710Iv5.A01;
            if (j != -1) {
                d2 = AbstractC37300Gc1.A00(j);
                d = 0.001d;
            } else {
                d = 1.0d;
                d2 = j;
            }
            A1I.put("ad_dwell_time", String.valueOf(d2 * d));
        }
        C38321qM c38321qM = c42710Iv5.A02;
        if (c38321qM == null || (str = c38321qM.A2Y()) == null) {
            str = "";
        }
        A1I.put("ads_category", str);
        return A1I;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C38608GyB c38608GyB, C42122IlW c42122IlW) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(c38608GyB.A00));
        interfaceC02590Ai.A9K("ig_userid", Long.valueOf(Long.parseLong(c42122IlW.A01.userId)));
    }

    @Override // X.JI9
    public final String AaQ() {
        return this.A04;
    }

    @Override // X.JI9
    public final void Ciw() {
        String str;
        AFI_TYPE afi_type;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_dismiss");
        if (A0f.isSampled()) {
            C42710Iv5 c42710Iv5 = this.A02;
            C38608GyB c38608GyB = c42710Iv5.A06;
            LinkedHashMap A00 = A00(c42710Iv5, false);
            A01(A0f, c38608GyB, this);
            A0f.AAP("afi_id", this.A04);
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            A0f.AAP("question_id", INY.A00(A0f, c38621GyO, c42710Iv5, str, A00));
            A02(A0f, this, c42710Iv5.A00);
            A0f.Cht();
        }
    }

    @Override // X.JI9
    public final void Ck6() {
        String str;
        AFI_TYPE afi_type;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled()) {
            C42710Iv5 c42710Iv5 = this.A02;
            C38608GyB c38608GyB = c42710Iv5.A06;
            LinkedHashMap A00 = A00(c42710Iv5, true);
            A01(A0f, c38608GyB, this);
            A0f.AAP("afi_id", this.A04);
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            A0f.AAP("question_id", INY.A00(A0f, c38621GyO, c42710Iv5, str, A00));
            A02(A0f, this, c42710Iv5.A00);
            A0f.Cht();
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
        String str;
        AFI_TYPE afi_type;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_ads_feedback_interface_timespent");
        if (A0f.isSampled()) {
            C42710Iv5 c42710Iv5 = this.A02;
            C38608GyB c38608GyB = c42710Iv5.A06;
            LinkedHashMap A00 = A00(c42710Iv5, false);
            A01(A0f, c38608GyB, this);
            A0f.AAP("afi_id", this.A04);
            C38621GyO c38621GyO = c38608GyB.A01;
            if (c38621GyO == null || (afi_type = c38621GyO.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            A0f.AAP("question_id", INY.A00(A0f, c38621GyO, c42710Iv5, str, A00));
            A02(A0f, this, c42710Iv5.A00);
            A0f.A8I("timespent", AbstractC37302Gc3.A0S(j));
            A0f.Cht();
        }
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C42122IlW c42122IlW, long j) {
        interfaceC02590Ai.A9K("global_position", Long.valueOf(j));
        interfaceC02590Ai.AAP("client_session_id", c42122IlW.A03.getSessionId());
    }
}

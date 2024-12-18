package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H8M extends AbstractC37585Ggg {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C18920wW A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C42709Iv4 A09;
    public final String A0A;
    public final String A0B;

    public H8M(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C42709Iv4 c42709Iv4, String str) {
        long j;
        Long A0j;
        AbstractC167027dH.A0a(1, userSession, str, interfaceC11380iw, c42709Iv4);
        this.A08 = userSession;
        this.A06 = str;
        this.A07 = interfaceC11380iw;
        this.A09 = c42709Iv4;
        this.A03 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
        C38321qM c38321qM = c42709Iv4.A02;
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        this.A01 = j;
        String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
        this.A04 = A0F == null ? "" : A0F;
        String A2Y = c38321qM.A2Y();
        this.A0A = A2Y != null ? A2Y : "";
        this.A00 = AbstractC37302Gc3.A04(AbstractC41071vF.A05(userSession, c38321qM));
        this.A05 = AFI_TYPE.A04.A00;
        this.A0B = String.valueOf(AbstractC41071vF.A0O(userSession, c38321qM));
        this.A02 = Long.parseLong(userSession.userId);
    }

    @Override // X.JI9
    public final void ClL(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A01);
            AbstractC37585Ggg.A01(A0f, this, this.A02);
            AbstractC37585Ggg.A02(A0f, this);
            AbstractC37585Ggg.A03(A0f, A00(this, false));
            A0f.AAP("answer_id", str);
            AbstractC37301Gc2.A11(A0f, this.A00);
            AbstractC37301Gc2.A19(A0f, this.A06);
        }
    }

    @Override // X.JI9
    public final void CmG(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A01);
            AbstractC37585Ggg.A01(A0f, this, this.A02);
            AbstractC37585Ggg.A02(A0f, this);
            AbstractC37585Ggg.A03(A0f, A00(this, false));
            A0f.AAP("answer_id", str);
            AbstractC37301Gc2.A11(A0f, this.A00);
            AbstractC37301Gc2.A19(A0f, this.A06);
        }
    }

    @Override // X.JI9
    public final void Ck6() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A01);
            AbstractC37585Ggg.A01(A0f, this, this.A02);
            AbstractC37585Ggg.A02(A0f, this);
            AbstractC37585Ggg.A03(A0f, A00(this, true));
            AbstractC37301Gc2.A11(A0f, this.A00);
            AbstractC37301Gc2.A19(A0f, this.A06);
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A03, "instagram_ads_feedback_interface_timespent");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A01);
            AbstractC37585Ggg.A01(A0f, this, this.A02);
            AbstractC37585Ggg.A02(A0f, this);
            AbstractC37585Ggg.A03(A0f, A00(this, false));
            AbstractC37301Gc2.A11(A0f, this.A00);
            A0f.AAP("client_session_id", this.A06);
            A0f.A8I("timespent", Double.valueOf(j * 0.001d));
            A0f.Cht();
        }
    }

    public static final LinkedHashMap A00(H8M h8m, boolean z) {
        double d;
        double d2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (z) {
            long j = h8m.A09.A00;
            if (j != -1) {
                d2 = AbstractC37300Gc1.A00(j);
                d = 0.001d;
            } else {
                d = 1.0d;
                d2 = j;
            }
            A1I.put("ad_dwell_time", String.valueOf(d2 * d));
        }
        A1I.put("ads_category", h8m.A0A);
        A1I.put("is_iaa_eligible", h8m.A0B);
        String Bmy = h8m.A09.A01.Bmy();
        if (Bmy == null) {
            Bmy = "";
        }
        A1I.put("repetition_type", Bmy);
        return A1I;
    }
}

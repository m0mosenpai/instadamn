package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GpB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38082GpB {
    public C3FQ A00;
    public Integer A01;
    public String A02;
    public java.util.Set A03;
    public java.util.Set A04;
    public java.util.Set A05;
    public boolean A06;
    public final UserSession A07;
    public final C61712rY A08;
    public final String A09;

    public C38082GpB(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A09 = str;
        this.A08 = AbstractC61702rX.A00(userSession);
        this.A03 = AbstractC166987dD.A1H();
        this.A05 = AbstractC166987dD.A1H();
        this.A04 = AbstractC166987dD.A1H();
    }

    public final void A03(C38321qM c38321qM, String str) {
        C38321qM A00;
        String id;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c38321qM, 1);
        if ("explore_popular".equals(str) && (A00 = A00(c38321qM)) != null && (id = A00.getId()) != null && !this.A05.contains(id)) {
            this.A05.add(id);
            C61712rY c61712rY = this.A08;
            Integer num = C05F.A01;
            c61712rY.A04(A00, num, str);
            if (this.A03.contains(id)) {
                c61712rY.A06(A00, num, str, "is_load_before_start", true);
                c61712rY.A02(A00, num, str);
            }
        }
    }

    public static final C38321qM A00(C38321qM c38321qM) {
        if (c38321qM != null && c38321qM.A5M()) {
            return c38321qM.A1e(c38321qM.A0x());
        }
        return c38321qM;
    }

    public final void A05(boolean z, boolean z2) {
        Integer num;
        if (z) {
            if (!z2) {
                num = C05F.A00;
            } else {
                num = C05F.A0N;
            }
        } else {
            num = C05F.A0C;
        }
        C61712rY c61712rY = this.A08;
        String str = this.A09;
        if (c61712rY.A08(null, num, str)) {
            c61712rY.A05(null, num, str, "cancel_ongoing_marker");
        }
        if (num == C05F.A0N) {
            this.A03 = AbstractC166987dD.A1H();
            this.A05 = AbstractC166987dD.A1H();
            this.A04 = AbstractC166987dD.A1H();
            this.A02 = null;
            this.A06 = true;
        }
        c61712rY.A04(null, num, str);
    }

    public final void A01(C38321qM c38321qM) {
        String id;
        Integer num;
        C38321qM A00 = A00(c38321qM);
        if (A00 != null && (id = A00.getId()) != null) {
            String str = this.A02;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A08;
                String str2 = this.A09;
                if (this.A06) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A00;
                }
                c61712rY.A01(null, num, C05F.A0C, str2);
            }
            this.A08.A01(A00, C05F.A01, C05F.A0C, this.A09);
        }
    }

    public final void A02(C38321qM c38321qM) {
        String id;
        Integer num;
        Integer num2;
        C38321qM A00 = A00(c38321qM);
        if (A00 != null && (id = A00.getId()) != null) {
            this.A03.add(id);
            String str = this.A02;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A08;
                String str2 = this.A09;
                if (this.A06) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A00;
                }
                c61712rY.A01(null, num, C05F.A0Y, str2);
                Integer num3 = this.A01;
                int size = this.A03.size();
                if (num3 != null && num3.intValue() == size) {
                    if (this.A06) {
                        num2 = C05F.A0N;
                    } else {
                        num2 = C05F.A00;
                    }
                    c61712rY.A02(null, num2, str2);
                }
            }
            C61712rY c61712rY2 = this.A08;
            String str3 = this.A09;
            Integer num4 = C05F.A01;
            c61712rY2.A01(A00, num4, C05F.A0Y, str3);
            c61712rY2.A02(A00, num4, str3);
        }
    }

    public final void A04(C38321qM c38321qM, boolean z) {
        String id;
        Integer num;
        Integer num2;
        C38321qM A00 = A00(c38321qM);
        if (A00 != null && (id = A00.getId()) != null) {
            String str = this.A02;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A08;
                String str2 = this.A09;
                if (this.A06) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A00;
                }
                Integer num3 = C05F.A0N;
                c61712rY.A01(null, num, num3, str2);
                if (this.A06) {
                    num2 = num3;
                } else {
                    num2 = C05F.A00;
                }
                c61712rY.A06(null, num2, str2, "is_auto_play", z);
                if (!z) {
                    if (!this.A06) {
                        num3 = C05F.A00;
                    }
                    c61712rY.A02(null, num3, str2);
                }
            }
            C61712rY c61712rY2 = this.A08;
            String str3 = this.A09;
            Integer num4 = C05F.A01;
            c61712rY2.A01(A00, num4, C05F.A0N, str3);
            c61712rY2.A06(A00, num4, str3, "is_auto_play", z);
            if (!z) {
                c61712rY2.A02(A00, num4, str3);
            }
        }
    }
}

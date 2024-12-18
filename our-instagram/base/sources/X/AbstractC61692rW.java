package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2rW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61692rW {
    public C38321qM A00;
    public String A01;
    public String A02;
    public String A03;
    public final C61712rY A04;
    public final String A05;
    public final UserSession A07;
    public final java.util.Set A06 = new HashSet();
    public final java.util.Set A08 = new HashSet();

    public final void A06(C38321qM c38321qM, int i) {
        String id;
        C38321qM c38321qM2 = c38321qM;
        if ((!c38321qM.A5M() || (c38321qM2 = c38321qM.A1e(i)) != null) && (id = c38321qM2.getId()) != null) {
            java.util.Set set = this.A08;
            if (!set.contains(id)) {
                set.add(id);
                C61712rY c61712rY = this.A04;
                String str = this.A05;
                Integer num = C05F.A01;
                c61712rY.A04(c38321qM2, num, str);
                if (this.A06.contains(id)) {
                    c61712rY.A06(c38321qM2, num, str, "is_load_before_start", true);
                    c61712rY.A02(c38321qM2, num, str);
                }
            }
        }
    }

    public abstract boolean A09(AnonymousClass341 anonymousClass341);

    public abstract boolean A0A(String str);

    public static final C38321qM A00(C38321qM c38321qM) {
        if (c38321qM != null && c38321qM.A5M()) {
            return c38321qM.A1e(c38321qM.A0x());
        }
        return c38321qM;
    }

    public final void A08(C38321qM c38321qM, boolean z) {
        Integer num;
        if (z) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        C38321qM A00 = A00(c38321qM);
        C61712rY c61712rY = this.A04;
        String str = this.A05;
        if (c61712rY.A08(A00, num, str)) {
            c61712rY.A05(A00, num, str, "cancel_ongoing_marker");
        }
        c61712rY.A04(A00, num, str);
    }

    public AbstractC61692rW(String str, UserSession userSession, C38321qM c38321qM) {
        String str2;
        this.A05 = str;
        this.A07 = userSession;
        this.A00 = c38321qM;
        this.A04 = AbstractC61702rX.A00(userSession);
        C38321qM A00 = A00(this.A00);
        this.A00 = A00;
        if (A00 != null) {
            str2 = A00.getId();
        } else {
            str2 = null;
        }
        this.A01 = str2;
    }

    public static final C38321qM A01(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C38321qM A02 = C3XH.A02(((C3XG) list.get(i)).A05);
            if (A02 != null) {
                return A00(A02);
            }
        }
        return null;
    }

    public void A02(C38321qM c38321qM) {
        String id = c38321qM.getId();
        if (id != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                this.A04.A03(c38321qM, C05F.A00, this.A05);
            }
            String str2 = this.A03;
            if (str2 != null && str2.equals(id)) {
                this.A04.A03(null, C05F.A0C, this.A05);
            }
            if (this.A08.contains(id)) {
                this.A04.A03(c38321qM, C05F.A01, this.A05);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r12.A5N() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(X.C38321qM r12) {
        /*
            r11 = this;
            java.lang.String r2 = r12.getId()
            if (r2 == 0) goto L2f
            java.util.Set r1 = r11.A06
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L2f
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L30
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L30
            boolean r0 = r12.Cff()
            if (r0 != 0) goto L2f
            r1.add(r2)
            X.2rY r1 = r11.A04
            java.lang.String r4 = r11.A05
            java.lang.Integer r0 = X.C05F.A00
            r1.A02(r12, r0, r4)
        L2a:
            java.lang.Integer r0 = X.C05F.A01
            r1.A02(r12, r0, r4)
        L2f:
            return
        L30:
            java.lang.String r0 = r11.A03
            if (r0 == 0) goto L68
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L68
            r1.add(r2)
            boolean r0 = r12.A5M()
            if (r0 != 0) goto L4a
            boolean r0 = r12.A5N()
            r10 = 0
            if (r0 == 0) goto L4b
        L4a:
            r10 = 1
        L4b:
            X.2rY r1 = r11.A04
            java.lang.String r4 = r11.A05
            java.lang.Integer r3 = X.C05F.A0C
            boolean r6 = r12.Cff()
            r2 = 0
            java.lang.String r5 = "is_video"
            r1.A06(r2, r3, r4, r5, r6)
            java.lang.String r9 = "is_carousel"
            r5 = r1
            r6 = r2
            r7 = r3
            r8 = r4
            r5.A06(r6, r7, r8, r9, r10)
            r1.A02(r2, r3, r4)
            goto L2a
        L68:
            r1.add(r2)
            X.2rY r1 = r11.A04
            java.lang.String r4 = r11.A05
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61692rW.A03(X.1qM):void");
    }

    public void A04(C38321qM c38321qM) {
        String id;
        C38321qM A00 = A00(c38321qM);
        if (A00 != null && (id = A00.getId()) != null) {
            this.A06.add(id);
            String str = this.A01;
            if (str != null && str.equals(id)) {
                this.A04.A01(A00, C05F.A00, C05F.A0C, this.A05);
            }
            this.A04.A01(A00, C05F.A01, C05F.A0C, this.A05);
        }
    }

    public void A05(C38321qM c38321qM) {
        String id;
        C38321qM A00 = A00(c38321qM);
        if (A00 != null && (id = A00.getId()) != null) {
            this.A06.add(id);
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A04;
                String str2 = this.A05;
                Integer num = C05F.A00;
                c61712rY.A01(A00, num, C05F.A0Y, str2);
                c61712rY.A02(A00, num, str2);
            }
            C61712rY c61712rY2 = this.A04;
            String str3 = this.A05;
            Integer num2 = C05F.A01;
            c61712rY2.A01(A00, num2, C05F.A0Y, str3);
            c61712rY2.A02(A00, num2, str3);
        }
    }

    public void A07(C38321qM c38321qM, boolean z) {
        String id;
        C38321qM A00 = A00(c38321qM);
        if (A00 != null && (id = A00.getId()) != null) {
            String str = this.A01;
            if (str != null && str.equals(id)) {
                C61712rY c61712rY = this.A04;
                String str2 = this.A05;
                Integer num = C05F.A00;
                c61712rY.A01(A00, num, C05F.A0N, str2);
                c61712rY.A06(A00, num, str2, "is_auto_play", z);
                if (!z) {
                    c61712rY.A02(A00, num, str2);
                }
            }
            C61712rY c61712rY2 = this.A04;
            String str3 = this.A05;
            Integer num2 = C05F.A01;
            c61712rY2.A01(A00, num2, C05F.A0N, str3);
            c61712rY2.A06(A00, num2, str3, "is_auto_play", z);
            if (!z) {
                c61712rY2.A02(A00, num2, str3);
            }
        }
    }
}

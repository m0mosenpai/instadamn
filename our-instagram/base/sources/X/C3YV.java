package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3YV, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3YV {
    public static final String A02(String str) {
        C14360o3.A0B(str, 0);
        int A04 = AbstractC001900j.A04(str, '_', 0);
        if (A04 != -1) {
            String substring = str.substring(0, A04);
            C14360o3.A07(substring);
            return substring;
        }
        return str;
    }

    public static final String A03(String str) {
        int A04 = AbstractC001900j.A04(str, '_', 0);
        if (A04 != -1) {
            String substring = str.substring(A04 + 1);
            C14360o3.A07(substring);
            return substring;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r0.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(com.instagram.common.session.UserSession r4, X.C38321qM r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            X.1rF r0 = r5.A0C
            java.lang.Integer r3 = r0.CFm()
            boolean r0 = r5.CdW()
            r2 = 1
            if (r0 == 0) goto L41
            X.1rF r0 = r5.A0C
            X.4nl r0 = r0.Aso()
            r1 = 0
            if (r0 == 0) goto L28
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.Bx5()
            if (r0 == 0) goto L28
            java.lang.String r1 = r0.Anz()
        L28:
            java.lang.String r0 = "ig_reels_non_9x16_video"
            if (r1 == 0) goto L41
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            X.1rF r0 = r5.A0C
            java.util.List r0 = r0.ByK()
            if (r0 == 0) goto L41
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L42
        L41:
            r1 = 0
        L42:
            boolean r0 = r5.A5M()
            if (r0 != 0) goto L65
            boolean r0 = r5.A5P()
            if (r0 != 0) goto L65
            if (r3 == 0) goto L65
            int r0 = r3.intValue()
            if (r0 > 0) goto L5c
            int r0 = r5.A0w()
            if (r0 <= 0) goto L65
        L5c:
            boolean r0 = X.C77153d1.A00(r4, r5)
            if (r0 != 0) goto L65
            if (r1 != 0) goto L65
            return r2
        L65:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YV.A05(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM, AnonymousClass341 anonymousClass341, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        if (!AbstractC75103Za.A0O(c38321qM, anonymousClass341) && new C693839y(userSession, str).A00(c38321qM) == C05F.A0Y) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, C38321qM c38321qM, AnonymousClass341 anonymousClass341, String str) {
        List A05;
        List A01;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        if (anonymousClass341 != AnonymousClass341.A0O) {
            C3HM c3hm = C3HM.A00;
            if (!C3HM.A02(str) || !c3hm.A05(userSession) || !C18U.A06(C06090Tz.A05, userSession, 36327658023500554L) || (A01 = C77403dQ.A01(SocialContextType.A0C, userSession, c38321qM, false)) == null || !(!A01.isEmpty())) {
                boolean A06 = c3hm.A06(userSession, str);
                C77403dQ c77403dQ = C77403dQ.A00;
                if (A06) {
                    A05 = c77403dQ.A07(c38321qM);
                } else {
                    A05 = c77403dQ.A05(userSession, c38321qM);
                }
                if (A05 == null || !(!A05.isEmpty()) || A05(userSession, c38321qM)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A08(C38321qM c38321qM) {
        if (c38321qM != null) {
            return C14360o3.A0K(c38321qM.A0C.BJN(), C1XV.A0H.toString()) || C14360o3.A0K(c38321qM.A0C.BJN(), "recommended_end_of_feed_recs");
        }
        return false;
    }

    public static final boolean A09(C38321qM c38321qM) {
        if (c38321qM != null) {
            return C14360o3.A0K(c38321qM.A0C.BJN(), C1XV.A0a.toString()) || C14360o3.A0K(c38321qM.A0C.BJN(), "recommended_in_feed_recs");
        }
        return false;
    }

    public static final String A01(C38321qM c38321qM) {
        InterfaceC104914o3 BMq;
        InterfaceC115285Iz BMn;
        String BDM;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected == null || (BMq = injected.BMq()) == null || (BMn = BMq.BMn()) == null || (BDM = BMn.BDM()) == null) {
            return "";
        }
        return BDM;
    }

    public static final ArrayList A04(C38321qM c38321qM) {
        EnumC84933qh enumC84933qh;
        ArrayList arrayList = new ArrayList();
        C84923qg A1V = c38321qM.A1V();
        if (A1V != null) {
            enumC84933qh = A1V.A06;
        } else {
            enumC84933qh = null;
        }
        if (enumC84933qh == EnumC84933qh.A09) {
            C84923qg A1V2 = c38321qM.A1V();
            if (A1V2 != null) {
                User user = A1V2.A08;
                if (user != null && !user.A2N()) {
                    arrayList.add(user);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Iterator it = c38321qM.A0d.A05.A00.iterator();
        while (it.hasNext()) {
            User user2 = ((C84923qg) it.next()).A08;
            if (user2 != null && !user2.A2N()) {
                arrayList.add(user2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0A(X.C38321qM r1) {
        /*
            X.1rF r0 = r1.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L21
            X.4o3 r0 = r0.BMq()
            if (r0 == 0) goto L21
            X.5Iz r0 = r0.BMn()
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.BDM()
            if (r0 == 0) goto L21
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L22
        L21:
            r0 = 1
        L22:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YV.A0A(X.1qM):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r5.A5m() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(com.instagram.common.session.UserSession r4, X.C38321qM r5) {
        /*
            boolean r0 = r5.A5v()
            r2 = 0
            if (r0 != 0) goto Le
            boolean r0 = r5.A5m()
            r1 = 0
            if (r0 == 0) goto Lf
        Le:
            r1 = 1
        Lf:
            java.util.List r0 = r5.A3Y()
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r2)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            boolean r3 = X.AbstractC75103Za.A0T(r0)
            if (r1 != 0) goto L3e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325008028480144(0x810d6700003290, double:3.035419574053246E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L3e
            if (r3 == 0) goto L38
            r0 = 36606483005314515(0x820d67000215d3, double:3.21342548281206E-306)
        L33:
            long r0 = X.C18U.A01(r2, r4, r0)
            return r0
        L38:
            r0 = 36606483005248978(0x820d67000115d2, double:3.213425482770614E-306)
            goto L33
        L3e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YV.A00(com.instagram.common.session.UserSession, X.1qM):long");
    }
}

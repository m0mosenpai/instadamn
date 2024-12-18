package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75373a4 {
    public static final String A00(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        String obj = C1Q2.A02().toString();
        C14360o3.A07(obj);
        java.util.Set A0J = A00.A0J(AbstractC16830sb.A06(C00Q.A03(obj, 2)));
        if (str != null) {
            str2 = C00Q.A03(str, 2);
        } else {
            str2 = null;
        }
        if (A0J.contains(str2)) {
            return "";
        }
        String language = C1Q2.A02().getLanguage();
        C14360o3.A07(language);
        return language;
    }

    public static final String A01(String str) {
        C14360o3.A0B(str, 0);
        String displayLanguage = new Locale(str).getDisplayLanguage(C1Q2.A02());
        C14360o3.A07(displayLanguage);
        return displayLanguage;
    }

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36323092473129920L);
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36322860544895683L) && !C18U.A06(c06090Tz, userSession, 36322937854307073L) && !C18U.A06(c06090Tz, userSession, 36322937854241536L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        return A00.A01.getBoolean(AbstractC111324zv.A00(1961), C18U.A06(C06090Tz.A06, userSession, 36323092473129920L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(com.instagram.common.session.UserSession r4) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.1Ai r3 = X.AbstractC23021Ah.A00(r4)
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36322860544895683(0x810b7300012ac3, double:3.0340614967872106E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L2c
            r0 = 36322937854307073(0x810b8500012b01, double:3.0341103875702737E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L2c
            r0 = 36322937854241536(0x810b8500002b00, double:3.034110387528828E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r2 = 0
            if (r0 == 0) goto L2d
        L2c:
            r2 = 1
        L2d:
            X.0xq r1 = r3.A01
            java.lang.String r0 = "auto_translate_reels"
            boolean r0 = r1.getBoolean(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75373a4.A07(com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A08(UserSession userSession, C38321qM c38321qM) {
        return c38321qM != null && A0C(c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36322937854307073L);
    }

    public static final boolean A09(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        if (C2TN.A02(userSession, c38321qM) && c38321qM.CFR().A07()) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, C38321qM c38321qM) {
        return c38321qM != null && A0D(c38321qM) && C18U.A06(C06090Tz.A05, userSession, 36322937854241536L);
    }

    public static final boolean A0B(UserSession userSession, C75363a3 c75363a3) {
        Locale A03;
        C14360o3.A0B(userSession, 0);
        if (c75363a3 != null) {
            if (C11X.A01) {
                A03 = C1Q2.A02();
            } else {
                A03 = C1Q2.A03();
            }
            String language = A03.getLanguage();
            C14360o3.A0A(language);
            if (c75363a3.A09(language) && C18U.A06(C06090Tz.A05, userSession, 36323092473129920L) && A05(userSession)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36322860545354442L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            return A00.A01.getBoolean("auto_translate_reels_captions", A07(userSession));
        }
        return A07(userSession);
    }

    public static final boolean A0C(C38321qM c38321qM) {
        List list;
        List A3w = c38321qM.A3w(EnumC75383a5.A0H);
        if (A3w != null && !A3w.isEmpty() && (!(A3w instanceof Collection) || !A3w.isEmpty())) {
            Iterator it = A3w.iterator();
            while (it.hasNext()) {
                H41 h41 = ((C84823qW) it.next()).A0J;
                if (h41 != null && (list = h41.A06) != null && !list.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0D(C38321qM c38321qM) {
        List list;
        List A3w = c38321qM.A3w(EnumC75383a5.A0L);
        if (A3w != null && !A3w.isEmpty() && (!(A3w instanceof Collection) || !A3w.isEmpty())) {
            Iterator it = A3w.iterator();
            while (it.hasNext()) {
                C38798H6n c38798H6n = ((C84823qW) it.next()).A0g;
                if (c38798H6n != null && (list = c38798H6n.A09) != null && !list.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        if (!(A04(userSession) | C18U.A06(C06090Tz.A05, userSession, 36323092473129920L))) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36322860544961220L) && !C18U.A06(c06090Tz, userSession, 36323092473195457L)) {
                return false;
            }
        }
        return true;
    }
}

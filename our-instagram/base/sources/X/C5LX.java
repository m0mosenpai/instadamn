package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5LX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5LX {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(com.instagram.common.session.UserSession r5, X.C38321qM r6) {
        /*
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            boolean r0 = A02(r5, r6)
            java.lang.String r4 = ""
            if (r0 == 0) goto L33
            int r3 = A00(r5)
            int r2 = r3 + (-1)
            X.1rF r0 = r6.A0C
            java.util.List r1 = r0.Atw()
            if (r3 == 0) goto L33
            if (r1 == 0) goto L31
            int r0 = r1.size()
        L24:
            if (r2 >= r0) goto L33
            if (r1 == 0) goto L3a
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        L2e:
            if (r0 == 0) goto L3a
            return r0
        L31:
            r0 = 0
            goto L24
        L33:
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.BNT()
            goto L2e
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5LX.A01(com.instagram.common.session.UserSession, X.1qM):java.lang.String");
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        List Atw;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        if (c38321qM.A0C.Atw() != null && (Atw = c38321qM.A0C.Atw()) != null && Atw.size() >= 3 && A00(userSession) >= 1) {
            return true;
        }
        return false;
    }

    public static final int A00(UserSession userSession) {
        C06090Tz c06090Tz;
        long j;
        long j2;
        String language = C1Q2.A02().getLanguage();
        int hashCode = language.hashCode();
        if (hashCode != 3246) {
            if (hashCode != 3329) {
                if (hashCode != 3588) {
                    if (hashCode == 3700 && language.equals("th")) {
                        c06090Tz = C06090Tz.A05;
                        j = 36600397036785543L;
                        j2 = C18U.A01(c06090Tz, userSession, j);
                    }
                    j2 = 0;
                } else {
                    if (language.equals("pt")) {
                        c06090Tz = C06090Tz.A05;
                        j = 36600397036720006L;
                        j2 = C18U.A01(c06090Tz, userSession, j);
                    }
                    j2 = 0;
                }
            } else {
                if (language.equals("hi")) {
                    c06090Tz = C06090Tz.A05;
                    j = 36600397036654469L;
                    j2 = C18U.A01(c06090Tz, userSession, j);
                }
                j2 = 0;
            }
        } else {
            if (language.equals("es")) {
                c06090Tz = C06090Tz.A05;
                j = 36600397036588932L;
                j2 = C18U.A01(c06090Tz, userSession, j);
            }
            j2 = 0;
        }
        Long valueOf = Long.valueOf(j2);
        C14360o3.A0A(valueOf);
        return (int) valueOf.longValue();
    }
}

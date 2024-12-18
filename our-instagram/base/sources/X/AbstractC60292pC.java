package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.2pC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60292pC {
    public static final void A01(UserSession userSession, C1816783z c1816783z, C183978Ee c183978Ee) {
        Object obj;
        C183978Ee c183978Ee2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1816783z, 2);
        if (!c1816783z.A0E()) {
            C1815483h c1815483h = c1816783z.A01;
            if (c1815483h.A02() == null && !c183978Ee.A13 && !c183978Ee.A17) {
                C1810981l c1810981l = c1815483h.A0Y;
                if (c1810981l != null) {
                    obj = c1810981l.A08.A00;
                } else {
                    obj = null;
                }
                if (!(obj instanceof C81T)) {
                    C196948nP A00 = A00(userSession);
                    if (A00 != null && (c183978Ee2 = A00.A03) != null && c183978Ee2.equals(c183978Ee)) {
                        return;
                    }
                    if (c183978Ee.A0z) {
                        A02(userSession, new C196948nP(c183978Ee));
                    } else {
                        c183978Ee.A0D.A01(new C197658oc(userSession, c183978Ee));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r3.A03() == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C196948nP A00(com.instagram.common.session.UserSession r5) {
        /*
            X.1Ai r0 = X.AbstractC23021Ah.A00(r5)
            java.lang.String r2 = "captured_media_recovery_info"
            java.lang.String r1 = ""
            X.0xq r0 = r0.A01
            java.lang.String r3 = r0.getString(r2, r1)
            X.C14360o3.A07(r3)
            int r2 = r3.length()
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L1a
            r0 = 1
        L1a:
            r4 = 0
            if (r0 == 0) goto L1e
            return r4
        L1e:
            X.16L r0 = X.C16V.A00(r3)     // Catch: java.io.IOException -> L27
            X.8nP r3 = X.AbstractC196968nR.parseFromJson(r0)     // Catch: java.io.IOException -> L27
            goto L4f
        L27:
            r3 = move-exception
            X.0wb r2 = X.C18950wb.A01
            r1 = 817904119(0x30c039f7, float:1.3986313E-9)
            java.lang.String r0 = "CapturedMediaRecoveryUtil"
            X.0f5 r2 = r2.AEp(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Failed to retrieve captured media recovery info"
            r2.ABW(r1, r0)
            r2.ERI(r3)
            r2.report()
            r3 = r4
        L41:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322731696138683(0x810b55000529bb, double:3.0339800123144515E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L57
            return r4
        L4f:
            if (r3 == 0) goto L41
            boolean r0 = r3.A03()
            if (r0 != r1) goto L41
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60292pC.A00(com.instagram.common.session.UserSession):X.8nP");
    }

    public static final void A02(UserSession userSession, C196948nP c196948nP) {
        try {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC196968nR.A00(A0A, c196948nP);
            A0A.close();
            String obj = stringWriter.toString();
            C14360o3.A0B(obj, 0);
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7K("captured_media_recovery_info", obj);
            ARD.apply();
            InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD2.E77("has_ever_captured_media_for_recovery", true);
            ARD2.apply();
        } catch (IOException e) {
            C0f5 AEp = C18950wb.A01.AEp("CapturedMediaRecoveryUtil", 817904119);
            AEp.ABW(DialogModule.KEY_MESSAGE, "Failed to save recovery info");
            AEp.ERI(e);
            AEp.report();
        }
    }

    public static final boolean A03(UserSession userSession, C196948nP c196948nP) {
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        String str = c196948nP.A05;
        if (str != null && str.length() != 0 && c196948nP.A01 >= currentTimeMillis) {
            if (C18U.A06(C06090Tz.A05, userSession, 36322731695810999L)) {
                String A02 = c196948nP.A02();
                if (A02 != null && new File(A02).exists()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

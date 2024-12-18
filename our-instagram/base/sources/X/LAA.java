package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LAA {
    public final C120005by A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r5 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A01(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 0
            boolean r0 = r9.A02
            if (r0 == 0) goto L20
            r0 = 4
            r2 = 15
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r0, r10)
            if (r5 == 0) goto L20
        Le:
            r1 = 0
            r4 = 86
            r3 = r1
            r6 = r1
            r8 = r1
            com.facebook.msys.mci.TraceLogger.log(r1, r2, r3, r4, r5, r6, r7, r8)
            X.C120005by.A02(r2, r5, r10)
            r0 = 1252(0x4e4, float:1.754E-42)
            X.C120005by.A03(r5, r1, r2, r0, r7)
            return r5
        L20:
            boolean r0 = r9.A03
            if (r0 == 0) goto L2e
            r0 = 1
            r2 = 13
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r0, r10)
            if (r5 == 0) goto L2e
            goto Le
        L2e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LAA.A01(java.lang.String):java.lang.String");
    }

    public final String A02(String str, List list) {
        C120005by c120005by = this.A00;
        String createTraceIdForType = TraceLogger.createTraceIdForType(13);
        if (createTraceIdForType != null) {
            c120005by.A04(list, 13, createTraceIdForType);
            C120005by.A02(13, createTraceIdForType, str);
            C120005by.A03(createTraceIdForType, null, 13, 1252, 0);
            return createTraceIdForType;
        }
        return null;
    }

    public final String A00(String str) {
        return (String) AbstractC224517h.A01(AbstractC224517h.A06(new C50269MHy(str, this, 41), AbstractC001800i.A0o(this.A01)));
    }

    public final void A03(List list, int i, String str) {
        if (str != null) {
            C120005by.A03(str, list, 0, i, 0);
        }
    }

    public LAA(UserSession userSession) {
        C120005by A00 = C120005by.A00(userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
        this.A01 = AbstractC43594JPz.A11(13, 15);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A02 = C18U.A06(c06090Tz, userSession, 36323131127901201L);
        this.A03 = C18U.A06(c06090Tz, userSession, 36323131128556568L);
    }

    public final void A04(List list, int i, String str) {
        A03(list, i, A00(str));
    }
}

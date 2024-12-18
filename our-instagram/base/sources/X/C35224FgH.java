package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FgH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35224FgH {
    public static final C35224FgH A00 = new Object();

    public static final Integer A00(UserSession userSession, int i) {
        long j = i;
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession, 36601758542270820L);
        long seconds = TimeUnit.MINUTES.toSeconds(1L);
        if (A01 < seconds) {
            A01 = seconds;
        }
        if (j < A01) {
            return C05F.A00;
        }
        long A012 = C18U.A01(c06090Tz, userSession, 36601758542336357L);
        long seconds2 = TimeUnit.HOURS.toSeconds(1L);
        if (A012 < seconds2) {
            A012 = seconds2;
        }
        if (j < A012) {
            return C05F.A01;
        }
        long A013 = C18U.A01(c06090Tz, userSession, 36601758542401894L);
        long seconds3 = TimeUnit.DAYS.toSeconds(1L);
        if (A013 < seconds3) {
            A013 = seconds3;
        }
        if (j < A013) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }

    public static final List A01(UserSession userSession) {
        List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A05, userSession, 36888542098490163L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            FKM A002 = F26.A00(AbstractC166987dD.A1B(it));
            if (A002 != null) {
                A1E.add(A002);
            }
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r1.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(com.instagram.common.session.UserSession r4, X.C81613kW r5) {
        /*
            boolean r0 = X.C6X6.A0I(r4, r5)
            r3 = 0
            if (r0 == 0) goto L18
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36888542097965874(0x830def00080332, double:3.391800788765583E-306)
            java.lang.String r1 = X.C18U.A04(r2, r4, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L26
        L18:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36883233520681459(0x83091b002b01f3, double:3.388443623114994E-306)
            java.lang.String r1 = X.C18U.A04(r2, r4, r0)
            X.C14360o3.A0A(r1)
        L26:
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r5 = 0
            java.util.List r0 = X.AbstractC001900j.A0R(r1, r0, r3)
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4d
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)
            if (r0 == 0) goto L39
            r2.add(r0)
            goto L39
        L4d:
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r2)
            java.util.Iterator r3 = r2.iterator()
        L55:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6d
            int r2 = X.AbstractC167007dF.A0B(r3)
            r0 = -1
            boolean r1 = X.AbstractC25230BEn.A1S(r2, r0)
            X.FKM r0 = new X.FKM
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            goto L55
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35224FgH.A02(com.instagram.common.session.UserSession, X.3kW):java.util.List");
    }

    public final boolean A03(UserSession userSession, C81613kW c81613kW, Integer num, int i) {
        List A02 = A02(userSession, c81613kW);
        ArrayList A0i = AbstractC167007dF.A0i(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A0i, ((FKM) it.next()).A00);
        }
        if (AbstractC31175DnJ.A1U(i, A0i)) {
            if (num != null) {
                List A01 = A01(userSession);
                ArrayList A0i2 = AbstractC167007dF.A0i(A01);
                Iterator it2 = A01.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1W(A0i2, ((FKM) it2.next()).A01);
                }
                if (A0i2.contains(num)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

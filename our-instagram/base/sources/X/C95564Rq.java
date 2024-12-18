package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95564Rq {
    public final C42351xP A00;
    public final C95524Rm A01;
    public final Map A02 = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C4TA r6, java.lang.String r7) {
        /*
            r5 = this;
            X.1xP r0 = r5.A00
            boolean r0 = r0.A0E
            if (r0 == 0) goto L73
            java.util.Map r0 = r5.A02
            java.lang.Object r4 = r0.get(r7)
            X.4TB r4 = (X.C4TB) r4
            if (r4 != 0) goto L18
            X.4TB r4 = new X.4TB
            r4.<init>()
            r0.put(r7, r4)
        L18:
            X.4TC r0 = r4.A00
            java.util.Map r1 = r0.A00
            java.lang.Object r0 = r1.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L7c
            int r0 = r0.intValue()
        L28:
            int r2 = r0 + 1
            r0 = 10
            if (r2 <= r0) goto L30
            r2 = 10
        L30:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r6, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r0 = 95
            r1.append(r0)
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            X.4TD r2 = r4.A01
            int r1 = r6.ordinal()
            r0 = 6
            if (r1 == r0) goto L74
            r0 = 12
            if (r1 == r0) goto L74
            r0 = 0
            if (r1 == r0) goto L74
            r0 = 1
            if (r1 == r0) goto L77
            r0 = 7
            if (r1 == r0) goto L77
        L61:
            X.4Rm r0 = r5.A01
            if (r0 == 0) goto L73
            int r2 = r7.hashCode()
            r1 = 409476402(0x18681d32, float:3.0000037E-24)
            com.facebook.quicklog.QuickPerformanceLogger r0 = r0.A00
            if (r0 == 0) goto L73
            r0.markerPoint(r1, r2, r3)
        L73:
            return
        L74:
            java.lang.Integer r0 = X.C05F.A00
            goto L79
        L77:
            java.lang.Integer r0 = X.C05F.A01
        L79:
            r2.A00 = r0
            goto L61
        L7c:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95564Rq.A00(X.4TA, java.lang.String):void");
    }

    public final void A01(String str) {
        int hashCode;
        short s;
        if (this.A00.A0E) {
            Map map = this.A02;
            C4TB c4tb = (C4TB) map.get(str);
            if (c4tb == null) {
                c4tb = new C4TB();
                map.put(str, c4tb);
            }
            Integer num = c4tb.A01.A00;
            Integer num2 = C05F.A00;
            C95524Rm c95524Rm = this.A01;
            if (num == num2) {
                if (c95524Rm != null) {
                    hashCode = str.hashCode();
                    s = 3;
                } else {
                    return;
                }
            } else {
                if (c95524Rm == null) {
                    return;
                }
                hashCode = str.hashCode();
                s = 2;
            }
            QuickPerformanceLogger quickPerformanceLogger = c95524Rm.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(409476402, hashCode, s);
            }
        }
    }

    public C95564Rq(C42351xP c42351xP, C95524Rm c95524Rm) {
        this.A01 = c95524Rm;
        this.A00 = c42351xP;
    }
}

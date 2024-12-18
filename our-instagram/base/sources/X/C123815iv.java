package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/* renamed from: X.5iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123815iv {
    public static final C123815iv A00 = new Object();

    public static final ArrayList A02() {
        ArrayList arrayList = new ArrayList(Collections.nCopies(7, 0L));
        int[] A03 = C2A1.A01.A03(0L);
        C14360o3.A07(A03);
        int length = A03.length - 1;
        int i = 6;
        while (length >= 0) {
            arrayList.set(i, Long.valueOf(A03[length]));
            i--;
            length--;
            if (i < 0) {
                break;
            }
        }
        return arrayList;
    }

    public static final long A00() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final long A01() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static final Calendar A03(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A04(com.instagram.common.session.UserSession r12) {
        /*
            r11 = this;
            java.util.ArrayList r8 = A02()
            X.282 r5 = X.AnonymousClass280.A01
            java.lang.String r4 = "Corrupted Aggregated Time Spent Data"
            java.lang.String r3 = "TimeSpentPreferences"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0xq r2 = r5.A06(r12)
            java.lang.String r1 = "AGGREGATED_TIME_SPENT_PER_DAY"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            if (r2 == 0) goto L24
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L25
        L24:
            r0 = 1
        L25:
            if (r0 != 0) goto L3e
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = r1.A08(r2, r0)     // Catch: java.lang.Throwable -> L39
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L3e
            goto L3d
        L39:
            X.C0w9.A03(r3, r4)
            goto L3e
        L3d:
            r7 = r0
        L3e:
            X.0xq r1 = r5.A06(r12)
            java.lang.String r0 = "LAST_SCREEN_TIME_UPLOAD"
            r2 = 0
            long r9 = r1.getLong(r0, r2)
            long r4 = A00()
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L72
            r6 = 0
        L53:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0 = 7
            java.util.List r0 = java.util.Collections.nCopies(r0, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r9 = 6
        L62:
            if (r6 <= 0) goto L7c
            if (r9 < 0) goto L7c
            java.lang.Object r0 = r8.get(r9)
            r10.set(r9, r0)
            int r9 = r9 + (-1)
            int r6 = r6 + (-1)
            goto L62
        L72:
            long r4 = r4 - r9
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 / r0
            r0 = 1
            long r4 = r4 + r0
            int r6 = (int) r4
            goto L53
        L7c:
            int r0 = r7.size()
            int r6 = r0 + (-1)
        L82:
            if (r9 < 0) goto La8
            if (r6 < 0) goto La8
            java.lang.Object r0 = r8.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            java.lang.Object r0 = r7.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            double r2 = r0.doubleValue()
            long r0 = (long) r2
            long r4 = r4 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r10.set(r9, r0)
            int r6 = r6 + (-1)
            int r9 = r9 + (-1)
            goto L82
        La8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123815iv.A04(com.instagram.common.session.UserSession):java.util.ArrayList");
    }
}

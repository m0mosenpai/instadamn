package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.36H, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C36H {
    public static final long A00(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return (j * 1000000) << 1;
        }
        return (C17s.A06(j, -4611686018427387903L, 4611686018427387903L) << 1) + 1;
    }

    public static final long A02(C36G c36g, double d) {
        double A00 = C36I.A00(c36g, C36G.A08, d);
        if (!Double.isNaN(A00)) {
            long A02 = C1H4.A02(A00);
            if (-4611686018426999999L <= A02 && A02 < 4611686018427000000L) {
                return A02 << 1;
            }
            return A00(C1H4.A02(C36I.A00(c36g, C36G.A06, d)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long A04(C36G c36g, long j) {
        C14360o3.A0B(c36g, 1);
        C36G c36g2 = C36G.A08;
        TimeUnit timeUnit = c36g.A00;
        TimeUnit timeUnit2 = c36g2.A00;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return timeUnit2.convert(j, timeUnit) << 1;
        }
        return (C17s.A06(C36G.A06.A00.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
    }

    public static final long A03(C36G c36g, int i) {
        long j = i;
        if (c36g.compareTo(C36G.A09) <= 0) {
            return C36G.A08.A00.convert(j, c36g.A00) << 1;
        }
        return A04(c36g, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (X.AbstractC001900j.A0U("+-", r6.charAt(0)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A01(java.lang.String r6) {
        /*
            int r5 = r6.length()
            r3 = 1
            r4 = 0
            if (r5 <= 0) goto L15
            java.lang.String r1 = "+-"
            char r0 = r6.charAt(r4)
            boolean r0 = X.AbstractC001900j.A0U(r1, r0)
            r2 = 1
            if (r0 != 0) goto L16
        L15:
            r2 = 0
        L16:
            int r1 = r5 - r2
            r0 = 16
            if (r1 <= r0) goto L5f
            int r0 = r5 + (-1)
            X.17u r1 = new X.17u
            r1.<init>(r2, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b
        L30:
            char r1 = r6.charAt(r4)
            r0 = 45
            if (r1 != r0) goto L59
            r0 = -9223372036854775808
            return r0
        L3b:
            java.util.Iterator r2 = r1.iterator()
        L3f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            r0 = r2
            X.0sg r0 = (X.AbstractC16880sg) r0
            int r0 = r0.A00()
            char r1 = r6.charAt(r0)
            r0 = 48
            if (r0 > r1) goto L5f
            r0 = 58
            if (r1 >= r0) goto L5f
            goto L3f
        L59:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L5f:
            java.lang.String r0 = "+"
            boolean r0 = X.AbstractC002300n.A0h(r6, r0, r4)
            if (r0 == 0) goto L6b
            java.lang.String r6 = X.C00Q.A02(r6, r3)
        L6b:
            long r0 = java.lang.Long.parseLong(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36H.A01(java.lang.String):long");
    }
}

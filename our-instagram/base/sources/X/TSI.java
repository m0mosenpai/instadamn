package X;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class TSI implements Comparator {
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.SIA r6) {
        /*
            X.Q7i r1 = r6.A01
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L17
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L2a
            boolean r0 = r1 instanceof X.QE5
            if (r0 != 0) goto L16
            boolean r0 = r1 instanceof X.QE7
            if (r0 == 0) goto L2a
        L16:
            return r2
        L17:
            java.lang.String r1 = r6.A04
            int r0 = r1.hashCode()
            switch(r0) {
                case -1459274090: goto L21;
                case 161743991: goto L39;
                case 2021963056: goto L42;
                default: goto L20;
            }
        L20:
            return r5
        L21:
            java.lang.String r0 = "BLOKS_PAYMENT_USAGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            return r5
        L2a:
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L4b
            boolean r0 = r1 instanceof X.QE5
            if (r0 != 0) goto L38
            boolean r0 = r1 instanceof X.QE7
            if (r0 == 0) goto L20
        L38:
            return r4
        L39:
            java.lang.String r0 = "BLOKS_HYBRID_PAYMENT_USAGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L16
            return r5
        L42:
            java.lang.String r0 = "BLOKS_CONTACT_USAGE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4b
            return r5
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TSI.A00(X.SIA):int");
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        SIA sia = (SIA) obj;
        SIA sia2 = (SIA) obj2;
        int A00 = A00(sia) - A00(sia2);
        if (A00 == 0) {
            long j = sia.A00;
            long j2 = sia2.A00;
            if (j < j2) {
                return -1;
            }
            return AbstractC25230BEn.A1Q((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
        }
        return A00;
    }
}

package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52462al {
    public static final long A0B = TimeUnit.HOURS.toMillis(2);
    public int A00;
    public int A01;
    public long A02;
    public C52482an A03;
    public C52432ai A04;
    public C52432ai A05;
    public final double A06;
    public final C52452ak A07;
    public final C17240tK A08;
    public final String A09;
    public final Map A0A;

    public C52462al(C52452ak c52452ak, C17240tK c17240tK, String str, Map map, double d) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c52452ak, 2);
        C14360o3.A0B(map, 4);
        this.A09 = str;
        this.A07 = c52452ak;
        this.A06 = d;
        this.A0A = map;
        this.A08 = c17240tK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C52432ai A00(X.C52462al r4) {
        /*
            X.2an r0 = r4.A03
            r2 = 0
            if (r0 != 0) goto L10
            java.lang.String r0 = "groupOverrideProvider"
        L8:
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L10:
            java.lang.String r1 = r4.A09
            X.0tP r0 = r0.A00
            X.0xq r0 = r0.A00
            java.lang.String r2 = r0.getString(r1, r2)
            if (r2 == 0) goto L45
            X.2ak r1 = r4.A07
            r0 = 30
            X.MLn r3 = new X.MLn
            r3.<init>(r2, r0)
            java.util.List r0 = r1.A00
            java.util.Iterator r2 = r0.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            X.2ai r1 = (X.C52432ai) r1
            if (r1 != 0) goto L4c
        L45:
            X.2ai r1 = r4.A04
            if (r1 != 0) goto L4c
            java.lang.String r0 = "allocatedGroup"
            goto L8
        L4c:
            return r1
        L4d:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52462al.A00(X.2al):X.2ai");
    }

    public final void A01(String str) {
        C52482an c52482an = this.A03;
        if (c52482an == null) {
            C14360o3.A0F("groupOverrideProvider");
            throw C00O.createAndThrow();
        }
        String str2 = this.A09;
        InterfaceC19610xo ARD = c52482an.A00.A00.ARD();
        ARD.E7K(str2, str);
        ARD.apply();
    }
}

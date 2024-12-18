package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1UU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UU extends C1U8 {
    public final C1UT A00;
    public final C1R8 A01;
    public final String A02;
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final boolean A06 = true;

    public C1UU(C1UT c1ut, C1R8 c1r8, String str) {
        this.A00 = c1ut;
        this.A02 = str;
        this.A01 = c1r8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 != null) goto L9;
     */
    @Override // X.C1U8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(int r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = r5.A06
            if (r0 == 0) goto L26
            java.util.Map r3 = r5.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L1e
            X.1UT r0 = r5.A00
            java.lang.String r2 = r0.A02(r6, r4)
            if (r2 == 0) goto L25
            r3.put(r1, r2)
        L1e:
            X.1R8 r1 = r5.A01
            java.lang.String r0 = r5.A02
            r1.A00(r6, r0)
        L25:
            return r2
        L26:
            X.1UT r0 = r5.A00
            java.lang.String r2 = r0.A02(r6, r4)
            if (r2 == 0) goto L25
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UU.A00(int, int):java.lang.String");
    }

    @Override // X.C1U8
    public final String A01(Integer num, int i, int i2, int i3) {
        C79833hY A01;
        if (this.A06) {
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            A01 = (C79833hY) map.get(valueOf);
            if (A01 == null) {
                A01 = this.A00.A01(i, 0);
                if (A01 != null) {
                    map.put(valueOf, A01);
                } else {
                    return null;
                }
            }
        } else {
            A01 = this.A00.A01(i, 0);
            if (A01 == null) {
                return null;
            }
        }
        this.A01.A02(i, this.A02, i3);
        Map map2 = A01.A00;
        String str = (String) map2.get(Integer.valueOf(num.intValue()));
        if (str == null) {
            return (String) map2.get(5);
        }
        return str;
    }

    @Override // X.C1U8
    public final String A02(String str, int[] iArr, int i) {
        String A03 = this.A00.A03(str, iArr, 0);
        if (A03 != null) {
            C1R8 c1r8 = this.A01;
            String str2 = this.A02;
            C14360o3.A0B(iArr, 2);
            C14360o3.A0B(str2, 3);
            AbstractRunnableC56822jF.A00(c1r8, str, str2, iArr);
        }
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 != null) goto L9;
     */
    @Override // X.C1U8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] A03(int r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = r5.A06
            if (r0 == 0) goto L26
            java.util.Map r3 = r5.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r3.get(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 != 0) goto L1e
            X.1UT r0 = r5.A00
            java.lang.String[] r2 = r0.A04(r6, r4)
            if (r2 == 0) goto L25
            r3.put(r1, r2)
        L1e:
            X.1R8 r1 = r5.A01
            java.lang.String r0 = r5.A02
            r1.A01(r6, r0)
        L25:
            return r2
        L26:
            X.1UT r0 = r5.A00
            java.lang.String[] r2 = r0.A04(r6, r4)
            if (r2 == 0) goto L25
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UU.A03(int, int):java.lang.String[]");
    }
}

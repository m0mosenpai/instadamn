package X;

import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Se6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63157Se6 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (android.text.TextUtils.isEmpty((java.lang.String) r9) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(int r8, java.lang.Object r9) {
        /*
            r0 = 10
            if (r8 <= r0) goto L7
            java.lang.String r0 = "ERROR: Recursive toString calls"
            return r0
        L7:
            java.lang.String r5 = ""
            if (r9 == 0) goto L18
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L19
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le3
        L18:
            return r5
        L19:
            boolean r0 = r9 instanceof java.lang.Integer
            if (r0 == 0) goto L24
            int r4 = X.AbstractC166987dD.A0H(r9)
        L21:
            if (r4 != 0) goto Le3
            return r5
        L24:
            boolean r0 = r9 instanceof java.lang.Long
            if (r0 == 0) goto L31
            long r2 = X.AbstractC166987dD.A0N(r9)
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L21
        L31:
            boolean r0 = r9 instanceof java.lang.Double
            if (r0 == 0) goto L3e
            double r2 = X.MSW.A00(r9)
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L21
        L3e:
            boolean r0 = r9 instanceof java.lang.Boolean
            if (r0 == 0) goto L47
            boolean r4 = X.AbstractC166987dD.A1a(r9)
            goto L21
        L47:
            boolean r0 = r9 instanceof java.util.List
            java.lang.String r7 = ", "
            if (r0 == 0) goto L7f
            java.lang.StringBuilder r6 = X.AbstractC166987dD.A1C()
            if (r8 <= 0) goto L58
            java.lang.String r0 = "["
            r6.append(r0)
        L58:
            java.util.List r9 = (java.util.List) r9
            int r3 = r6.length()
            java.util.Iterator r2 = r9.iterator()
        L62:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r1 = r2.next()
            int r0 = r6.length()
            if (r0 <= r3) goto L75
            r6.append(r7)
        L75:
            int r0 = r8 + 1
            java.lang.String r0 = A00(r0, r1)
            r6.append(r0)
            goto L62
        L7f:
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto Le3
            java.lang.StringBuilder r6 = X.AbstractC166987dD.A1C()
            java.util.Map r9 = (java.util.Map) r9
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r9)
            java.util.Iterator r5 = X.AbstractC166997dE.A14(r0)
            r4 = 0
            r1 = 0
        L94:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ld1
            java.util.Map$Entry r3 = X.AbstractC166987dD.A1K(r5)
            java.lang.Object r2 = r3.getValue()
            int r0 = r8 + 1
            java.lang.String r2 = A00(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L94
            if (r8 <= 0) goto Lbd
            if (r4 != 0) goto Lbd
            java.lang.String r0 = "{"
            r6.append(r0)
            int r1 = r6.length()
            r4 = 1
        Lbd:
            int r0 = r6.length()
            if (r0 <= r1) goto Lc6
            r6.append(r7)
        Lc6:
            java.lang.String r0 = X.AbstractC31172DnG.A17(r3)
            X.AbstractC58322PtE.A1S(r6, r0)
            r6.append(r2)
            goto L94
        Ld1:
            if (r4 == 0) goto Lde
            java.lang.String r0 = "}"
            goto Ldb
        Ld7:
            if (r8 <= 0) goto Lde
            java.lang.String r0 = "]"
        Ldb:
            r6.append(r0)
        Lde:
            java.lang.String r0 = r6.toString()
            return r0
        Le3:
            java.lang.String r0 = r9.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63157Se6.A00(int, java.lang.Object):java.lang.String");
    }

    public final void A02(AbstractC63157Se6 abstractC63157Se6) {
        Map map;
        Map map2;
        if (this instanceof C60643RFt) {
            C60643RFt c60643RFt = (C60643RFt) this;
            C60643RFt c60643RFt2 = (C60643RFt) abstractC63157Se6;
            if (!TextUtils.isEmpty(c60643RFt.A01)) {
                c60643RFt2.A01 = c60643RFt.A01;
            }
            if (!TextUtils.isEmpty(c60643RFt.A02)) {
                c60643RFt2.A02 = c60643RFt.A02;
            }
            if (!TextUtils.isEmpty(c60643RFt.A03)) {
                c60643RFt2.A03 = c60643RFt.A03;
            }
            if (!TextUtils.isEmpty(c60643RFt.A04)) {
                c60643RFt2.A04 = c60643RFt.A04;
            }
            boolean z = true;
            if (c60643RFt.A06) {
                c60643RFt2.A06 = true;
            }
            if (!TextUtils.isEmpty(c60643RFt.A05)) {
                c60643RFt2.A05 = c60643RFt.A05;
            }
            boolean z2 = c60643RFt.A07;
            if (z2) {
                c60643RFt2.A07 = z2;
            }
            double d = c60643RFt.A00;
            if (d != 0.0d) {
                if (d < 0.0d || d > 100.0d) {
                    z = false;
                }
                C3U5.A08(z, "Sample rate must be between 0% and 100%");
                c60643RFt2.A00 = d;
                return;
            }
            return;
        }
        if (this instanceof RFm) {
            RFm rFm = (RFm) this;
            RFm rFm2 = (RFm) abstractC63157Se6;
            if (!TextUtils.isEmpty(rFm.A00)) {
                rFm2.A00 = rFm.A00;
            }
            boolean z3 = rFm.A01;
            if (!z3) {
                return;
            }
            rFm2.A01 = z3;
            return;
        }
        if (this instanceof RFq) {
            RFq rFq = (RFq) this;
            RFq rFq2 = (RFq) abstractC63157Se6;
            if (!TextUtils.isEmpty(rFq.A01)) {
                rFq2.A01 = rFq.A01;
            }
            if (!TextUtils.isEmpty(rFq.A03)) {
                rFq2.A03 = rFq.A03;
            }
            if (!TextUtils.isEmpty(rFq.A02)) {
                rFq2.A02 = rFq.A02;
            }
            long j = rFq.A00;
            if (j == 0) {
                return;
            }
            rFq2.A00 = j;
            return;
        }
        if (this instanceof RFo) {
            RFo rFo = (RFo) this;
            RFo rFo2 = (RFo) abstractC63157Se6;
            rFo2.A01.addAll(rFo.A01);
            rFo2.A00.addAll(rFo.A00);
            Iterator A15 = AbstractC166997dE.A15(rFo.A02);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A1K.getKey();
                Iterator A1J = AbstractC25226BEj.A1J(A1K.getValue());
                while (A1J.hasNext()) {
                    A1J.next();
                }
            }
            return;
        }
        if (this instanceof RFr) {
            RFr rFr = (RFr) this;
            RFr rFr2 = (RFr) abstractC63157Se6;
            int i = rFr.A00;
            if (i != 0) {
                rFr2.A00 = i;
            }
            int i2 = rFr.A01;
            if (i2 != 0) {
                rFr2.A01 = i2;
            }
            int i3 = rFr.A02;
            if (i3 != 0) {
                rFr2.A02 = i3;
            }
            int i4 = rFr.A03;
            if (i4 != 0) {
                rFr2.A03 = i4;
            }
            int i5 = rFr.A04;
            if (i5 != 0) {
                rFr2.A04 = i5;
            }
            if (TextUtils.isEmpty(rFr.A05)) {
                return;
            }
            rFr2.A05 = rFr.A05;
            return;
        }
        if (this instanceof RFl) {
            RFl rFl = (RFl) abstractC63157Se6;
            C3U5.A02(rFl);
            map = rFl.A00;
            map2 = ((RFl) this).A00;
        } else if (this instanceof RFk) {
            map = ((RFk) abstractC63157Se6).A00;
            map2 = ((RFk) this).A00;
        } else if (this instanceof RFj) {
            map = ((RFj) abstractC63157Se6).A00;
            map2 = ((RFj) this).A00;
        } else {
            if (this instanceof C60644RFu) {
                C60644RFu c60644RFu = (C60644RFu) this;
                C60644RFu c60644RFu2 = (C60644RFu) abstractC63157Se6;
                if (!TextUtils.isEmpty(c60644RFu.A00)) {
                    c60644RFu2.A00 = c60644RFu.A00;
                }
                if (!TextUtils.isEmpty(c60644RFu.A02)) {
                    c60644RFu2.A02 = c60644RFu.A02;
                }
                if (!TextUtils.isEmpty(c60644RFu.A03)) {
                    c60644RFu2.A03 = c60644RFu.A03;
                }
                if (!TextUtils.isEmpty(c60644RFu.A04)) {
                    c60644RFu2.A04 = c60644RFu.A04;
                }
                if (!TextUtils.isEmpty(c60644RFu.A05)) {
                    c60644RFu2.A05 = c60644RFu.A05;
                }
                if (!TextUtils.isEmpty(c60644RFu.A01)) {
                    c60644RFu2.A01 = c60644RFu.A01;
                }
                if (!TextUtils.isEmpty(c60644RFu.A06)) {
                    c60644RFu2.A06 = c60644RFu.A06;
                }
                if (!TextUtils.isEmpty(c60644RFu.A07)) {
                    c60644RFu2.A07 = c60644RFu.A07;
                }
                if (!TextUtils.isEmpty(c60644RFu.A08)) {
                    c60644RFu2.A08 = c60644RFu.A08;
                }
                if (TextUtils.isEmpty(c60644RFu.A09)) {
                    return;
                }
                c60644RFu2.A09 = c60644RFu.A09;
                return;
            }
            if (this instanceof C60645RFv) {
                ((C60645RFv) this).A03((C60645RFv) abstractC63157Se6);
                return;
            }
            if (this instanceof RFp) {
                RFp rFp = (RFp) this;
                RFp rFp2 = (RFp) abstractC63157Se6;
                if (!TextUtils.isEmpty(rFp.A02)) {
                    rFp2.A02 = rFp.A02;
                }
                long j2 = rFp.A00;
                if (j2 != 0) {
                    rFp2.A00 = j2;
                }
                if (!TextUtils.isEmpty(rFp.A01)) {
                    rFp2.A01 = rFp.A01;
                }
                if (TextUtils.isEmpty(rFp.A03)) {
                    return;
                }
                rFp2.A03 = rFp.A03;
                return;
            }
            if (this instanceof RFn) {
                RFn rFn = (RFn) this;
                RFn rFn2 = (RFn) abstractC63157Se6;
                if (!TextUtils.isEmpty(rFn.A00)) {
                    rFn2.A00 = rFn.A00;
                }
                if (!TextUtils.isEmpty(rFn.A01)) {
                    rFn2.A01 = rFn.A01;
                }
                if (TextUtils.isEmpty(rFn.A02)) {
                    return;
                }
                rFn2.A02 = rFn.A02;
                return;
            }
            C60642RFs c60642RFs = (C60642RFs) this;
            C60642RFs c60642RFs2 = (C60642RFs) abstractC63157Se6;
            if (!TextUtils.isEmpty(c60642RFs.A02)) {
                c60642RFs2.A02 = c60642RFs.A02;
            }
            int i6 = c60642RFs.A00;
            if (i6 != 0) {
                c60642RFs2.A00 = i6;
            }
            int i7 = c60642RFs.A01;
            if (i7 != 0) {
                c60642RFs2.A01 = i7;
            }
            if (!TextUtils.isEmpty(c60642RFs.A03)) {
                c60642RFs2.A03 = c60642RFs.A03;
            }
            if (!TextUtils.isEmpty(c60642RFs.A04)) {
                String str = c60642RFs.A04;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                c60642RFs2.A04 = str;
            }
            boolean z4 = c60642RFs.A05;
            if (z4) {
                c60642RFs2.A05 = z4;
            }
            boolean z5 = c60642RFs.A06;
            if (!z5) {
                return;
            }
            c60642RFs2.A06 = z5;
            return;
        }
        map.putAll(map2);
    }

    public static String A01(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return A00(0, abstractMap);
    }
}

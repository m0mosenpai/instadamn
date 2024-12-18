package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6Ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139016Ri {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C51232Ww r5, X.C3QZ r6, java.util.Collection r7) {
        /*
            r3 = 0
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            boolean r0 = r5.A09
            r5 = 0
            if (r0 != 0) goto Ld
            if (r6 != 0) goto Ld
        Lc:
            return r3
        Ld:
            java.util.List r2 = X.AbstractC001800i.A0a(r7)
            if (r0 == 0) goto L32
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L1e
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1e
            return r3
        L1e:
            java.util.Iterator r1 = r2.iterator()
        L22:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r1.next()
            X.6Rm r0 = (X.AbstractC139056Rm) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L22
        L32:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C6R9
            if (r0 == 0) goto L52
            r3.add(r1)
            goto L40
        L52:
            r4.add(r1)
            goto L40
        L56:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb0
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L98
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L98
        L66:
            r3 = 0
        L67:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L77
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L7e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7e
        L77:
            r0 = 1
        L78:
            if (r3 == 0) goto L7d
            if (r0 == 0) goto L7d
            r5 = 1
        L7d:
            return r5
        L7e:
            java.util.Iterator r2 = r4.iterator()
        L82:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            X.6Rm r1 = (X.AbstractC139056Rm) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L82
            X.9BN r0 = r1.A01
            if (r0 != 0) goto L82
            r0 = 0
            goto L78
        L98:
            java.util.Iterator r2 = r3.iterator()
        L9c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r2.next()
            X.6Rm r1 = (X.AbstractC139056Rm) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto Lb0
            X.9BN r0 = r1.A01
            if (r0 == 0) goto L9c
        Lb0:
            r3 = 1
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139016Ri.A01(X.2Ww, X.3QZ, java.util.Collection):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C138636Pt A02(X.C9C3 r13, X.C51232Ww r14, X.C919249w r15, java.util.Collection r16, boolean r17) {
        /*
            r12 = this;
            r10 = 2
            r3 = r16
            X.C14360o3.A0B(r3, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            X.6Rm r0 = (X.AbstractC139056Rm) r0
            X.9BN r0 = r0.A01
            if (r0 == 0) goto Lf
            r2.add(r0)
            goto Lf
        L23:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r2.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.9BN r0 = (X.C9BN) r0
            java.lang.Object r1 = r0.A02
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L2c
            r5.add(r2)
            goto L2c
        L43:
            java.util.Iterator r4 = r5.iterator()
            boolean r0 = r4.hasNext()
            r7 = r13
            if (r0 == 0) goto L74
            java.lang.Object r0 = r4.next()
            X.9BN r0 = (X.C9BN) r0
            long r0 = r0.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L5a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r4.next()
            X.9BN r0 = (X.C9BN) r0
            long r0 = r0.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L5a
            r2 = r1
            goto L5a
        L74:
            if (r13 == 0) goto L7c
            boolean r0 = r13.A02
            if (r0 != 0) goto L98
            if (r17 == 0) goto L98
        L7c:
            long r8 = A00(r15, r3)
            goto L8c
        L81:
            if (r2 == 0) goto L74
            boolean r0 = r14.A0A
            if (r0 == 0) goto L93
            long r8 = r2.longValue()
        L8b:
            r10 = 3
        L8c:
            X.6Pt r6 = new X.6Pt
            r11 = r10
            r6.<init>(r7, r8, r10, r11)
            return r6
        L93:
            long r8 = A00(r15, r3)
            goto L8b
        L98:
            java.lang.Object r5 = r13.A00
            X.1KP r5 = (X.C1KP) r5
            boolean r0 = r5 instanceof X.C139046Rl
            if (r0 == 0) goto Lbc
            r10 = 113(0x71, float:1.58E-43)
        La2:
            r11 = r10
        La3:
            java.lang.Object r6 = r13.A04
            X.1KP r6 = (X.C1KP) r6
            X.1KS r0 = r15.A01
            X.1KO r0 = r0.A00
            long r3 = r6.A00
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            r5 = r6
        Lb4:
            long r8 = r5.A00
            X.6Pt r6 = new X.6Pt
            r6.<init>(r7, r8, r10, r11)
            return r6
        Lbc:
            boolean r0 = r5 instanceof X.C93714Jb
            r10 = 3
            if (r0 != 0) goto La2
            r10 = 4
            boolean r0 = r5 instanceof X.C54H
            if (r0 != 0) goto Ld4
            java.lang.Object r0 = r13.A04
            boolean r0 = r0 instanceof X.C919149t
            if (r0 != 0) goto Ld4
            boolean r0 = r5 instanceof X.C1KQ
            r11 = 4
            if (r0 == 0) goto La3
            r11 = 615(0x267, float:8.62E-43)
            goto La3
        Ld4:
            r11 = 630(0x276, float:8.83E-43)
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139016Ri.A02(X.9C3, X.2Ww, X.49w, java.util.Collection, boolean):X.6Pt");
    }

    public static final long A00(C919249w c919249w, Collection collection) {
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9BN c9bn = ((AbstractC139056Rm) it.next()).A01;
            if (c9bn != null) {
                arrayList.add(c9bn);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Object obj = ((C9BN) next).A02;
            if (obj == C05F.A00 || obj == C05F.A01) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            Long valueOf = Long.valueOf(((C9BN) it3.next()).A01);
            while (it3.hasNext()) {
                Long valueOf2 = Long.valueOf(((C9BN) it3.next()).A01);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            if (valueOf != null) {
                j = valueOf.longValue();
                return Math.max(j, c919249w.A00);
            }
        }
        j = ((C1KP) c919249w.A01).A00;
        return Math.max(j, c919249w.A00);
    }
}

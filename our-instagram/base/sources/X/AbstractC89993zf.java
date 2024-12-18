package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3zf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89993zf {
    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds) {
        return A01(interfaceC23621Ds, 500L);
    }

    public static final Object A01(InterfaceC23621Ds interfaceC23621Ds, long j) {
        if (j > 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
            C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
            c24891Jo.A0I();
            if (j < Long.MAX_VALUE) {
                A04(c24891Jo.A01).EM7(c24891Jo, j);
            }
            Object A0E = c24891Jo.A0E();
            if (A0E == C1JX.A02) {
                return A0E;
            }
        }
        return C0eB.A00;
    }

    public static final Object A02(InterfaceC23621Ds interfaceC23621Ds, long j) {
        long j2;
        if (j > 0) {
            j2 = C36J.A03(C36J.A05(j, C36H.A04(C36G.A08, 999999L)));
        } else {
            j2 = 0;
        }
        Object A01 = A01(interfaceC23621Ds, j2);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1JX A03(X.InterfaceC23621Ds r5) {
        /*
            boolean r0 = r5 instanceof X.C167367dp
            if (r0 == 0) goto L25
            r4 = r5
            X.7dp r4 = (X.C167367dp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.A00 = r2
        L12:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L45
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L25:
            X.7dp r4 = new X.7dp
            r4.<init>(r5)
            goto L12
        L2b:
            X.AbstractC09560e7.A00(r1)
            r4.A00 = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C24891Jo.A04
            X.1Ds r1 = X.C1E2.A02(r4)
            X.1Jo r0 = new X.1Jo
            r0.<init>(r2, r1)
            r0.A0I()
            java.lang.Object r0 = r0.A0E()
            if (r0 != r3) goto L48
            return r3
        L45:
            X.AbstractC09560e7.A00(r1)
        L48:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC89993zf.A03(X.1Ds):X.1JX");
    }

    public static final InterfaceC214312v A04(C12W c12w) {
        InterfaceC214312v interfaceC214312v;
        C12V c12v = c12w.get(C12X.A00);
        if (!(c12v instanceof InterfaceC214312v) || (interfaceC214312v = (InterfaceC214312v) c12v) == null) {
            return AbstractC214412w.A00;
        }
        return interfaceC214312v;
    }
}

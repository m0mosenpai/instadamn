package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.3Is */
/* loaded from: classes2.dex */
public abstract class AbstractC71523Is {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.3Iu, X.3Iv, java.lang.Object, X.1Dy] */
    public static final C3Iu A01(Integer num, Integer num2, C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l, int i) {
        int i2;
        InterfaceC24731Iq c71533It;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    i2 = Integer.MAX_VALUE;
                    if (i != Integer.MAX_VALUE) {
                        if (num == C05F.A00) {
                            c71533It = new C24721Ip(i);
                        } else {
                            c71533It = new C71533It(i, num);
                        }
                    }
                    c71533It = new C24721Ip(i2);
                } else {
                    if (num == C05F.A00) {
                        c71533It = new C24721Ip(0);
                    }
                    c71533It = new C71533It(1, num);
                }
            } else if (num == C05F.A00) {
                c71533It = new C71533It(1, C05F.A01);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else {
            if (num == C05F.A00) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = C24721Ip.A03;
                C3JM c3jm = InterfaceC24731Iq.A00;
                i2 = C3JM.A00;
                c71533It = new C24721Ip(i2);
            }
            c71533It = new C71533It(1, num);
        }
        ?? c3Iv = new C3Iv(AbstractC23651Dv.A01(c12w, c19l), c71533It, true);
        c3Iv.A0W(num2, c3Iv, interfaceC16620sF);
        return c3Iv;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.InterfaceC23621Ds r6, X.InterfaceC16820sZ r7, X.InterfaceC71543Iw r8) {
        /*
            r0 = 10
            boolean r0 = X.C9CZ.A00(r6, r0)
            if (r0 == 0) goto L26
            r5 = r6
            X.9CZ r5 = (X.C9CZ) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L30
            java.lang.Object r7 = r5.A02
            X.0sZ r7 = (X.InterfaceC16820sZ) r7
            goto L2c
        L26:
            X.9CZ r5 = new X.9CZ
            r5.<init>(r6)
            goto L16
        L2c:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L76
            goto L70
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L38:
            X.AbstractC09560e7.A00(r1)
            X.12W r1 = r5.getContext()
            X.196 r0 = X.AnonymousClass195.A00
            X.12V r1 = r1.get(r0)
            r0 = 0
            if (r1 != r8) goto L49
            r0 = 1
        L49:
            if (r0 == 0) goto L7b
            r5.A01 = r8     // Catch: java.lang.Throwable -> L76
            r5.A02 = r7     // Catch: java.lang.Throwable -> L76
            r5.A00 = r3     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C24891Jo.A04     // Catch: java.lang.Throwable -> L76
            X.1Ds r0 = X.C1E2.A02(r5)     // Catch: java.lang.Throwable -> L76
            X.1Jo r2 = new X.1Jo     // Catch: java.lang.Throwable -> L76
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L76
            r2.A0I()     // Catch: java.lang.Throwable -> L76
            r1 = 37
            X.9E2 r0 = new X.9E2     // Catch: java.lang.Throwable -> L76
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L76
            r8.CPC(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r2.A0E()     // Catch: java.lang.Throwable -> L76
            if (r0 != r4) goto L70
            return r4
        L70:
            r7.invoke()
            X.0eB r0 = X.C0eB.A00
            return r0
        L76:
            r0 = move-exception
            r7.invoke()
            throw r0
        L7b:
            java.lang.String r1 = "awaitClose() can only be invoked from the producer context"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71523Is.A00(X.1Ds, X.0sZ, X.3Iw):java.lang.Object");
    }

    public static final C3Iu A03(C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l, int i) {
        Integer num = C05F.A00;
        return A01(num, num, c12w, interfaceC16620sF, c19l, i);
    }
}

package X;

import java.util.List;

/* renamed from: X.0UL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UL implements InterfaceC15070pN {
    public final InterfaceC16620sF A00;
    public final InterfaceC15070pN A01;

    @Override // X.InterfaceC15070pN
    public final List Bn0() {
        return this.A01.Bn0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC15070pN, X.InterfaceC19390xP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC19960yQ r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 7
            boolean r0 = X.C0Qe.A01(r8, r3)
            if (r0 == 0) goto L28
            r5 = r8
            X.0Qe r5 = (X.C0Qe) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L43
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L28:
            X.0Qe r5 = new X.0Qe
            r5.<init>(r6, r8, r3)
            goto L15
        L2e:
            X.AbstractC09560e7.A00(r1)
            X.0pN r2 = r6.A01
            X.0sF r1 = r6.A00
            X.0pE r0 = new X.0pE
            r0.<init>(r1, r7)
            r5.A00 = r3
            java.lang.Object r0 = r2.collect(r0, r5)
            if (r0 != r4) goto L46
            return r4
        L43:
            X.AbstractC09560e7.A00(r1)
        L46:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UL.collect(X.0yQ, X.1Ds):java.lang.Object");
    }

    public C0UL(InterfaceC16620sF interfaceC16620sF, InterfaceC15070pN interfaceC15070pN) {
        this.A01 = interfaceC15070pN;
        this.A00 = interfaceC16620sF;
    }
}

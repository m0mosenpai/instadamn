package androidx.compose.foundation.relocation;

import X.C57S;
import X.C5EA;
import X.InterfaceC50412MNo;

/* loaded from: classes9.dex */
public final class BringIntoViewRequesterImpl implements InterfaceC50412MNo {
    public final C57S A00 = new C57S(new C5EA[16]);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r3 < r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:12:0x0031). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC50412MNo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AEF(X.C114205Dh r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.C50584MUu
            if (r0 == 0) goto L58
            r7 = r10
            X.MUu r7 = (X.C50584MUu) r7
            int r0 = r7.A06
            if (r0 != r3) goto L58
            int r2 = r7.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r7.A02 = r2
        L17:
            java.lang.Object r6 = r7.A05
            X.1JX r5 = X.C1JX.A02
            int r0 = r7.A02
            r4 = 1
            if (r0 == 0) goto L38
            if (r0 != r4) goto L5e
            int r3 = r7.A01
            int r1 = r7.A00
            java.lang.Object r2 = r7.A04
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r9 = r7.A03
            X.5Dh r9 = (X.C114205Dh) r9
            X.AbstractC09560e7.A00(r6)
        L31:
            int r3 = r3 + 1
            if (r3 < r1) goto L43
        L35:
            X.0eB r5 = X.C0eB.A00
            return r5
        L38:
            X.AbstractC09560e7.A00(r6)
            X.57S r0 = r8.A00
            int r1 = r0.A00
            if (r1 <= 0) goto L35
            java.lang.Object[] r2 = r0.A02
        L43:
            r0 = r2[r3]
            X.58J r0 = (X.C58J) r0
            r7.A03 = r9
            r7.A04 = r2
            r7.A00 = r1
            r7.A01 = r3
            r7.A02 = r4
            java.lang.Object r0 = X.AbstractC27474CAv.A00(r9, r0, r7)
            if (r0 != r5) goto L31
            return r5
        L58:
            X.MUu r7 = new X.MUu
            r7.<init>(r8, r10, r3)
            goto L17
        L5e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.AEF(X.5Dh, X.1Ds):java.lang.Object");
    }
}

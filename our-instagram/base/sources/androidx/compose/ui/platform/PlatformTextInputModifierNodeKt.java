package androidx.compose.ui.platform;

import X.C5UP;
import X.C5UQ;
import X.D9j;

/* loaded from: classes5.dex */
public abstract class PlatformTextInputModifierNodeKt {
    public static final C5UP A00 = new C5UQ(D9j.A00);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1JX A00(X.InterfaceC1128457r r6, X.InterfaceC23621Ds r7, X.InterfaceC16620sF r8) {
        /*
            r5 = 1
            boolean r0 = X.D3k.A02(r7, r5)
            if (r0 == 0) goto L27
            r4 = r7
            X.D3k r4 = (X.D3k) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 2
            if (r1 == 0) goto L35
            if (r1 == r5) goto L41
            if (r1 == r0) goto L2d
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L27:
            X.D3k r4 = new X.D3k
            r4.<init>(r5, r7)
            goto L15
        L2d:
            X.AbstractC09560e7.A00(r3)
            X.PW2 r0 = X.AbstractC25225BEi.A19()
            throw r0
        L35:
            X.AbstractC09560e7.A00(r3)
            r4.A00 = r5
            X.1JX r0 = r6.Eq2(r4, r8)
            if (r0 != r2) goto L44
            return r2
        L41:
            X.AbstractC09560e7.A00(r3)
        L44:
            X.PW2 r0 = X.AbstractC25225BEi.A19()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.A00(X.57r, X.1Ds, X.0sF):X.1JX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1JX A01(X.InterfaceC31145Dmk r6, X.InterfaceC23621Ds r7, X.InterfaceC16620sF r8) {
        /*
            r3 = 0
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L25
            r5 = r7
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L51
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L25:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r7)
            goto L15
        L2b:
            X.AbstractC09560e7.A00(r1)
            r0 = r6
            X.58J r0 = (X.C58J) r0
            X.58J r0 = r0.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L59
            X.57r r2 = X.AbstractC114335Dx.A05(r6)
            X.599 r0 = X.AbstractC114335Dx.A02(r6)
            X.59R r1 = r0.A02
            X.5UP r0 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.A00
            X.59O r1 = (X.C59O) r1
            X.C5UT.A01(r0, r1)
            r5.A00 = r3
            X.1JX r0 = A00(r2, r5, r8)
            if (r0 != r4) goto L54
            return r4
        L51:
            X.AbstractC09560e7.A00(r1)
        L54:
            X.PW2 r0 = X.AbstractC25225BEi.A19()
            throw r0
        L59:
            java.lang.String r0 = "establishTextInputSession called from an unattached node"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.A01(X.Dmk, X.1Ds, X.0sF):X.1JX");
    }
}

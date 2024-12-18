package androidx.compose.foundation.lazy.layout;

import X.C58m;
import X.C5X5;
import X.InterfaceC118905a7;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
public final class AwaitFirstLayoutModifier implements InterfaceC118905a7 {
    public InterfaceC23621Ds A00;
    public boolean A01;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.C206459Cc.A00(r7, r5)
            if (r0 == 0) goto L53
            r4 = r7
            X.9Cc r4 = (X.C206459Cc) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            if (r0 == 0) goto L30
            if (r0 != r5) goto L59
            java.lang.Object r2 = r4.A02
            X.1Ds r2 = (X.InterfaceC23621Ds) r2
            X.AbstractC09560e7.A00(r1)
        L26:
            if (r2 == 0) goto L2d
            X.0eB r0 = X.C0eB.A00
            r2.resumeWith(r0)
        L2d:
            X.0eB r3 = X.C0eB.A00
            return r3
        L30:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r6.A01
            if (r0 != 0) goto L2d
            X.1Ds r2 = r6.A00
            r4.A01 = r6
            r4.A02 = r2
            r4.A00 = r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01
            X.1Ds r1 = X.C1E2.A02(r4)
            X.3yw r0 = new X.3yw
            r0.<init>(r1)
            r6.A00 = r0
            java.lang.Object r0 = r0.A00()
            if (r0 != r3) goto L26
            return r3
        L53:
            X.9Cc r4 = new X.9Cc
            r4.<init>(r6, r7, r5)
            goto L15
        L59:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.A00(X.1Ds):java.lang.Object");
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }
}

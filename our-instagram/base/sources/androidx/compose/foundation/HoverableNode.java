package androidx.compose.foundation;

import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C19L;
import X.C28733CmR;
import X.C28736CmU;
import X.C58J;
import X.C5DX;
import X.C5XN;
import X.C5XO;
import X.C6KW;
import X.EnumC25334BJd;
import X.InterfaceC23621Ds;
import X.PZA;

/* loaded from: classes3.dex */
public final class HoverableNode extends C58J implements C5DX {
    public C5XO A00;
    public C28733CmR A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Dg2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.foundation.HoverableNode r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 0
            boolean r0 = X.MAO.A02(r7, r3)
            if (r0 == 0) goto L4b
            r5 = r7
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L51
            java.lang.Object r1 = r5.A02
            X.CmR r1 = (X.C28733CmR) r1
            java.lang.Object r6 = r5.A01
            androidx.compose.foundation.HoverableNode r6 = (androidx.compose.foundation.HoverableNode) r6
            X.AbstractC09560e7.A00(r4)
        L2b:
            r6.A01 = r1
        L2d:
            X.0eB r3 = X.C0eB.A00
            return r3
        L30:
            X.AbstractC09560e7.A00(r4)
            X.CmR r0 = r6.A01
            if (r0 != 0) goto L2d
            X.CmR r1 = new X.CmR
            r1.<init>()
            X.5XO r0 = r6.A00
            r5.A01 = r6
            r5.A02 = r1
            r5.A00 = r2
            java.lang.Object r0 = r0.ARN(r1, r5)
            if (r0 != r3) goto L2b
            return r3
        L4b:
            X.MAO r5 = new X.MAO
            r5.<init>(r6, r7, r3)
            goto L15
        L51:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A00(androidx.compose.foundation.HoverableNode, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.compose.foundation.HoverableNode r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 0
            boolean r0 = X.MAN.A02(r6, r3)
            if (r0 == 0) goto L46
            r4 = r6
            X.MAN r4 = (X.MAN) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4c
            java.lang.Object r5 = r4.A01
            androidx.compose.foundation.HoverableNode r5 = (androidx.compose.foundation.HoverableNode) r5
            X.AbstractC09560e7.A00(r1)
        L27:
            r0 = 0
            r5.A01 = r0
        L2a:
            X.0eB r3 = X.C0eB.A00
            return r3
        L2d:
            X.AbstractC09560e7.A00(r1)
            X.CmR r0 = r5.A01
            if (r0 == 0) goto L2a
            X.CmU r1 = new X.CmU
            r1.<init>(r0)
            X.5XO r0 = r5.A00
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r0 = r0.ARN(r1, r4)
            if (r0 != r3) goto L27
            return r3
        L46:
            X.MAN r4 = new X.MAN
            r4.<init>(r5, r6, r3)
            goto L15
        L4c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A01(androidx.compose.foundation.HoverableNode, X.1Ds):java.lang.Object");
    }

    public static final void A02(HoverableNode hoverableNode) {
        C28733CmR c28733CmR = hoverableNode.A01;
        if (c28733CmR != null) {
            ((C5XN) hoverableNode.A00).A00.F8m(new C28736CmU(c28733CmR));
            hoverableNode.A01 = null;
        }
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean COp() {
        return false;
    }

    @Override // X.C5DX
    public final void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        C19L A05;
        int i;
        if (enumC25334BJd == EnumC25334BJd.Main) {
            int i2 = c6kw.A00;
            boolean z = false;
            if (i2 == 4) {
                z = true;
            }
            if (z) {
                A05 = A05();
                i = 1;
            } else {
                if (i2 != 5) {
                    return;
                }
                A05 = A05();
                i = 2;
            }
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZA(this, (InterfaceC23621Ds) null, i), A05);
        }
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean Ehx() {
        return false;
    }

    @Override // X.C5DX
    /* renamed from: D1u */
    public final void E0S() {
        A02(this);
    }

    @Override // X.C5DX
    /* renamed from: D9s */
    public final /* synthetic */ void E0S() {
        A02(this);
    }

    @Override // X.C5DX
    public final /* synthetic */ void E0S() {
        A02(this);
    }
}

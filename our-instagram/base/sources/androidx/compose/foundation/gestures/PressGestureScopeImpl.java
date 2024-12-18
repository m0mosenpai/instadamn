package androidx.compose.foundation.gestures;

import X.AnonymousClass139;
import X.InterfaceC1128957x;
import X.InterfaceC58269PsN;

/* loaded from: classes5.dex */
public final class PressGestureScopeImpl implements InterfaceC1128957x, InterfaceC58269PsN {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass139 A02 = new AnonymousClass139();
    public final /* synthetic */ InterfaceC1128957x A03;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 4
            boolean r0 = X.MAN.A02(r6, r3)
            if (r0 == 0) goto L40
            r4 = r6
            X.MAN r4 = (X.MAN) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L46
            java.lang.Object r1 = r4.A01
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r1
            X.AbstractC09560e7.A00(r3)
        L27:
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            X.0eB r2 = X.C0eB.A00
        L2e:
            return r2
        L2f:
            X.AbstractC09560e7.A00(r3)
            X.139 r0 = r5.A02
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r0 = X.AnonymousClass139.A00(r4, r0)
            if (r0 == r2) goto L2e
            r1 = r5
            goto L27
        L40:
            X.MAN r4 = new X.MAN
            r4.<init>(r5, r6, r3)
            goto L15
        L46:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.A00(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC58269PsN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ADA(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 2
            boolean r0 = X.MAQ.A02(r6, r3)
            if (r0 == 0) goto L38
            r4 = r6
            X.MAQ r4 = (X.MAQ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L48
            X.AbstractC09560e7.A00(r3)
        L23:
            boolean r0 = X.AbstractC166987dD.A1a(r3)
            if (r0 == 0) goto L40
            X.0eB r2 = X.C0eB.A00
            return r2
        L2c:
            X.AbstractC09560e7.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = r5.F8j(r4)
            if (r3 != r2) goto L23
            return r2
        L38:
            r0 = 42
            X.MAQ r4 = new X.MAQ
            r4.<init>(r5, r6, r3, r0)
            goto L15
        L40:
            java.lang.String r0 = "The press gesture was canceled."
            X.D3X r1 = new X.D3X
            r1.<init>(r0)
            throw r1
        L48:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.ADA(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A03.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A03.B7e();
    }

    @Override // X.InterfaceC1128957x
    public final int EL8(float f) {
        return this.A03.EL8(f);
    }

    @Override // X.C57y
    public final float EqG(long j) {
        return this.A03.EqG(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqH(float f) {
        return this.A03.EqH(f);
    }

    @Override // X.InterfaceC1128957x
    public final float EqI(int i) {
        return this.A03.EqI(i);
    }

    @Override // X.InterfaceC1128957x
    public final long EqJ(long j) {
        return this.A03.EqJ(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqS(long j) {
        return this.A03.EqS(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqT(float f) {
        return this.A03.EqT(f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7k(long j) {
        return this.A03.F7k(j);
    }

    @Override // X.C57y
    public final long F7l(float f) {
        return this.A03.F7l(f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7m(float f) {
        return this.A03.F7m(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC58269PsN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F8j(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 5
            boolean r0 = X.MAN.A02(r7, r3)
            if (r0 == 0) goto L50
            r5 = r7
            X.MAN r5 = (X.MAN) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L56
            java.lang.Object r1 = r5.A01
            androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            X.139 r0 = r1.A02
            r0.A04(r2)
        L2d:
            boolean r0 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L34:
            X.AbstractC09560e7.A00(r4)
            boolean r0 = r6.A01
            if (r0 != 0) goto L4e
            boolean r0 = r6.A00
            if (r0 != 0) goto L4e
            X.139 r0 = r6.A02
            r5.A01 = r6
            r5.A00 = r1
            java.lang.Object r0 = X.AnonymousClass139.A00(r5, r0)
            if (r0 != r3) goto L4c
            return r3
        L4c:
            r1 = r6
            goto L28
        L4e:
            r1 = r6
            goto L2d
        L50:
            X.MAN r5 = new X.MAN
            r5.<init>(r6, r7, r3)
            goto L15
        L56:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.F8j(X.1Ds):java.lang.Object");
    }

    public PressGestureScopeImpl(InterfaceC1128957x interfaceC1128957x) {
        this.A03 = interfaceC1128957x;
    }
}

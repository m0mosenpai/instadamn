package X;

import java.util.Map;

/* renamed from: X.IvD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42718IvD implements InterfaceC28011Xf {
    public final long A00;
    public final Map A01;
    public final Map A02;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC28041Xi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r13) {
        /*
            r12 = this;
            X.3XG r13 = (X.C3XG) r13
            r11 = 0
            if (r13 == 0) goto L53
            X.1qM r10 = X.AbstractC37300Gc1.A0E(r13)
            if (r10 == 0) goto L53
            java.util.Map r1 = r12.A02
            boolean r0 = X.C3YV.A09(r10)
            if (r0 == 0) goto L5d
            X.1XV r0 = X.C1XV.A0a
        L15:
            java.lang.Number r0 = X.AbstractC37300Gc1.A0Q(r0, r1)
            if (r0 == 0) goto L5a
            long r5 = r0.longValue()
        L1f:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r8 = r2.toSeconds(r0)
            boolean r0 = X.C3YV.A09(r10)
            if (r0 == 0) goto L54
            java.util.Map r1 = r12.A01
            X.1XV r0 = X.C1XV.A0a
            java.lang.Number r7 = X.AbstractC37300Gc1.A0Q(r0, r1)
            long r3 = r10.A1A()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            if (r7 == 0) goto L54
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.toSeconds(r3)
            long r0 = r7.longValue()
            long r2 = r2 + r0
        L4e:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L53
            r11 = 1
        L53:
            return r11
        L54:
            long r2 = r10.A1B()
            long r2 = r2 + r5
            goto L4e
        L5a:
            long r5 = r12.A00
            goto L1f
        L5d:
            X.1XV r0 = r13.A06
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42718IvD.apply(java.lang.Object):boolean");
    }

    public C42718IvD(Map map, Map map2, long j) {
        this.A02 = map;
        this.A00 = j;
        this.A01 = map2;
    }

    @Override // X.InterfaceC28011Xf
    public final /* synthetic */ boolean AC7(C108104tt c108104tt) {
        return true;
    }
}

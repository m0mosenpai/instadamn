package X;

import java.util.Map;

/* renamed from: X.1Xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28001Xe implements InterfaceC28011Xf {
    public final long A00;
    public final Map A01;

    public C28001Xe(long j, Map map) {
        C14360o3.A0B(map, 1);
        this.A01 = map;
        this.A00 = j;
    }

    @Override // X.InterfaceC28011Xf
    public final /* synthetic */ boolean AC7(C108104tt c108104tt) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r3 != 0) goto L16;
     */
    @Override // X.InterfaceC28041Xi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r12) {
        /*
            r11 = this;
            X.3XG r12 = (X.C3XG) r12
            if (r12 == 0) goto L4b
            X.1XV r1 = r12.A06
        L6:
            X.1XV r0 = X.C1XV.A0y
            r10 = 1
            if (r1 != r0) goto L42
            X.1qS r0 = r12.A05
            X.1qM r9 = X.C3XH.A02(r0)
            if (r9 == 0) goto L4d
            java.util.Map r1 = r11.A01
            X.1XV r0 = r12.A06
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L48
            long r5 = r0.longValue()
        L23:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r7 = r2.toSeconds(r0)
            boolean r0 = X.C3YV.A09(r9)
            if (r0 == 0) goto L43
            long r3 = r9.A1A()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L43
        L3d:
            long r3 = r3 + r5
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4d
        L42:
            return r10
        L43:
            long r3 = r9.A1B()
            goto L3d
        L48:
            long r5 = r11.A00
            goto L23
        L4b:
            r1 = 0
            goto L6
        L4d:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28001Xe.apply(java.lang.Object):boolean");
    }
}

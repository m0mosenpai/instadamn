package X;

import java.util.HashSet;

/* renamed from: X.2Vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51002Vw implements InterfaceC51012Vx {
    public final java.util.Set A01 = new HashSet();
    public Integer A00 = C05F.A00;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Integer r7) {
        /*
            r6 = this;
            r5 = r6
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            X.C2XV.A00()
            java.lang.Integer r3 = X.C05F.A0C
            if (r7 != r3) goto L17
            java.lang.Integer r1 = r6.A00
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L17
            java.lang.Integer r0 = X.C05F.A01
            r6.A00(r0)
        L17:
            java.lang.Integer r1 = r6.A00
            if (r1 == r3) goto L95
            if (r7 == r3) goto L2b
            java.lang.Integer r0 = X.C05F.A00
            if (r7 != r0) goto L24
            if (r1 != r0) goto L2b
        L23:
            return
        L24:
            java.lang.Integer r2 = X.C05F.A01
            if (r7 != r2) goto L95
            if (r1 != r2) goto L2e
            return
        L2b:
            java.lang.Integer r0 = X.C05F.A01
            r2 = r0
        L2e:
            if (r1 != r0) goto L95
            r1 = 1
            r6.A00 = r7
            int r0 = r7.intValue()
            monitor-enter(r5)
            if (r0 == r4) goto L74
            if (r0 == r1) goto L58
            java.util.Set r1 = r6.A01     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r5)
            java.util.Iterator r1 = r0.iterator()
        L48:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            X.2VN r0 = (X.C2VN) r0
            r0.DU0(r3)
            goto L48
        L58:
            java.util.Set r1 = r6.A01     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r5)
            java.util.Iterator r1 = r0.iterator()
        L64:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            X.2VN r0 = (X.C2VN) r0
            r0.DU0(r2)
            goto L64
        L74:
            java.util.Set r1 = r6.A01     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r5)
            java.util.Iterator r2 = r0.iterator()
        L80:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r2.next()
            X.2VN r1 = (X.C2VN) r1
            java.lang.Integer r0 = X.C05F.A00
            r1.DU0(r0)
            goto L80
        L92:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L95:
            java.lang.Integer r4 = X.C05F.A00
            java.lang.String r3 = "Cannot move from state "
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto Lc0;
                case 1: goto Lbd;
                default: goto La0;
            }
        La0:
            java.lang.String r2 = "DESTROYED"
        La2:
            java.lang.String r1 = " to state "
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto Lba;
                case 1: goto Lb7;
                default: goto Lab;
            }
        Lab:
            java.lang.String r0 = "DESTROYED"
        Lad:
            java.lang.String r1 = X.AnonymousClass001.A0u(r3, r2, r1, r0)
            java.lang.String r0 = "LithoVisibilityEventsController"
            X.C2YE.A01(r0, r4, r1)
            return
        Lb7:
            java.lang.String r0 = "HINT_INVISIBLE"
            goto Lad
        Lba:
            java.lang.String r0 = "HINT_VISIBLE"
            goto Lad
        Lbd:
            java.lang.String r2 = "HINT_INVISIBLE"
            goto La2
        Lc0:
            java.lang.String r2 = "HINT_VISIBLE"
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51002Vw.A00(java.lang.Integer):void");
    }

    @Override // X.InterfaceC51012Vx
    public final synchronized void A91(C2VN c2vn) {
        this.A01.add(c2vn);
    }

    @Override // X.InterfaceC51012Vx
    public final synchronized void EFX(C2VN c2vn) {
        this.A01.remove(c2vn);
    }

    @Override // X.InterfaceC51012Vx
    public final Integer CGg() {
        return this.A00;
    }
}

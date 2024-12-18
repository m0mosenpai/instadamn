package X;

/* renamed from: X.Pyw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58628Pyw implements InterfaceC65376Tj9 {
    public final /* synthetic */ C58424Pv2 A00;
    public final /* synthetic */ C58422Pv0 A01;
    public final /* synthetic */ C58427Pv6 A02;

    public C58628Pyw(C58424Pv2 c58424Pv2, C58422Pv0 c58422Pv0, C58427Pv6 c58427Pv6) {
        this.A01 = c58422Pv0;
        this.A00 = c58424Pv2;
        this.A02 = c58427Pv6;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC65376Tj9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6g(X.C58428Pv7 r8) {
        /*
            r7 = this;
            java.lang.String r4 = "AppModuleActionQueryV2"
            java.lang.Object r0 = r8.A04()
            if (r0 == 0) goto L28
            java.lang.Object r3 = r8.A04()
            X.SLm r3 = (X.C62674SLm) r3
        Le:
            X.Pv0 r5 = r7.A01
            java.util.Collection r0 = r5.A05
            java.util.Iterator r2 = r0.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r2.next()
            X.2MN r1 = (X.C2MN) r1
            X.Pv2 r0 = r7.A00
            r1.A09(r0, r3)
            goto L16
        L28:
            java.lang.Exception r2 = r8.A03()
            r1 = 2
            r0 = 0
            X.SLm r3 = new X.SLm
            r3.<init>(r2, r0, r1)
            goto Le
        L34:
            java.lang.Exception r0 = r8.A03()
            if (r0 == 0) goto La4
            java.lang.Exception r0 = r8.A03()
        L3e:
            if (r0 == 0) goto L83
            java.lang.String r1 = "Exception while downloading"
            X.C0K8.A0G(r4, r1, r0)
            X.Pv6 r6 = r7.A02
            X.2MT r1 = r5.A02
            X.2MB r1 = r1.A04
            boolean r5 = r1.Cc3(r8)
            int r2 = r3.A00
            r3 = 0
            X.5kd r1 = new X.5kd
            r1.<init>(r0, r2, r3, r5)
        L57:
            X.5tP r2 = new X.5tP
            r2.<init>(r1, r0, r3)
        L5c:
            r6.A01(r2)
        L5f:
            X.Pv6 r5 = r7.A02
            X.Pv7 r0 = r5.A00
            boolean r0 = r0.A06()
            if (r0 != 0) goto L82
            java.lang.String r0 = "Download completed, but no result or exception is provided"
            X.C0K8.A0E(r4, r0)
            java.lang.RuntimeException r4 = X.AbstractC166987dD.A18(r0)
            r3 = 0
            r2 = 0
            r0 = -1
            X.5kd r1 = new X.5kd
            r1.<init>(r2, r0, r3, r3)
            X.5tP r0 = new X.5tP
            r0.<init>(r1, r4, r3)
            r5.A01(r0)
        L82:
            return
        L83:
            if (r3 == 0) goto L5f
            int r2 = r3.A00
            r1 = 1
            X.Pv6 r6 = r7.A02
            if (r2 != r1) goto L93
            r0 = 0
            X.5tP r2 = new X.5tP
            r2.<init>(r0, r0, r1)
            goto L5c
        L93:
            java.lang.String r0 = "Download failed. result code - "
            java.lang.String r0 = X.AnonymousClass001.A0O(r0, r2)
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            r3 = 0
            X.5kd r1 = new X.5kd
            r1.<init>(r0, r2, r3, r3)
            goto L57
        La4:
            java.lang.Exception r0 = r3.A01
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58628Pyw.D6g(X.Pv7):void");
    }
}

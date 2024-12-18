package X;

/* renamed from: X.Lps, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49237Lps implements InterfaceC29421bJ {
    public final InterfaceC08830cm A00;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // X.InterfaceC29421bJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DUn(X.MNP r12, X.C1OV r13) {
        /*
            r11 = this;
            X.JTV r12 = (X.JTV) r12
            java.lang.String r1 = r12.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1090974990: goto L50;
                case -948696717: goto L4d;
                case 1501196714: goto L2f;
                case 1563991648: goto L15;
                case 1885454214: goto L12;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r1 = X.AbstractC31175DnJ.A0V(r0, r1)
            throw r1
        L12:
            java.lang.String r0 = "upload_failed_transient"
            goto L31
        L15:
            java.lang.String r0 = "uploaded"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.0cm r0 = r11.A00
            java.lang.Object r4 = r0.get()
            X.JX6 r4 = (X.JX6) r4
            java.lang.String r3 = r13.A05
            java.lang.String r2 = r13.A05
            r1 = 1
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            goto L47
        L2f:
            java.lang.String r0 = "upload_failed_permanent"
        L31:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.0cm r0 = r11.A00
            java.lang.Object r4 = r0.get()
            X.JX6 r4 = (X.JX6) r4
            java.lang.String r3 = r13.A05
            java.lang.String r2 = r13.A05
            r1 = 0
            X.C14360o3.A0B(r3, r1)
        L47:
            X.JX5 r0 = r4.A00
            r0.A01(r3, r2, r1)
            return
        L4d:
            java.lang.String r0 = "queued"
            goto L52
        L50:
            java.lang.String r0 = "executing"
        L52:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            X.0cm r0 = r11.A00
            java.lang.Object r1 = r0.get()
            X.JX6 r1 = (X.JX6) r1
            java.lang.String r4 = r13.A05
            java.lang.String r8 = r13.A05
            java.lang.Integer r3 = r13.A01
            java.lang.Integer r2 = r13.A02
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.JX5 r1 = r1.A00
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r9 = X.AbstractC43593JPy.A09(r0)
            r0 = 48
            X.Mtk r7 = new X.Mtk
            r7.<init>(r3, r2, r0)
            X.0nI r6 = r1.A00
            X.L4H r5 = new X.L4H
            r5.<init>(r6, r7, r8, r9)
            java.util.Map r0 = r1.A01
            monitor-enter(r0)
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            return
        L8a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49237Lps.DUn(X.MNP, X.1OV):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
        throw AbstractC166987dD.A14("Cancellations are unsupported");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        DUn(mnp2, (C1OV) c1ow);
    }

    public C49237Lps(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}

package X;

/* renamed from: X.Ffu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35202Ffu {
    public static final C35202Ffu A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C35771lx r7, X.C2DS r8, java.lang.String r9) {
        /*
            X.AbstractC167017dG.A1O(r8, r9)
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L73
            java.util.Iterator r6 = r0.iterator()
            r3 = 0
            r5 = 0
        Ld:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r1 = r6.next()
            int r4 = r5 + 1
            if (r5 >= 0) goto L23
            X.AbstractC16960so.A1U()
        L1e:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L23:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r8
            X.2DU r0 = (X.C2DU) r0
            X.2Dg r0 = r0.A0C
            X.2Rx r1 = r0.A0A(r1)
            if (r1 == 0) goto L71
            int r0 = r9.hashCode()
            switch(r0) {
                case -1090974990: goto L5e;
                case -948696717: goto L5b;
                case 1501196714: goto L42;
                case 1563991648: goto L3f;
                case 1885454214: goto L3c;
                default: goto L37;
            }
        L37:
            java.lang.IllegalStateException r0 = X.AbstractC31177DnL.A0Y(r9)
            throw r0
        L3c:
            java.lang.String r0 = "upload_failed_transient"
            goto L44
        L3f:
            java.lang.String r0 = "uploaded"
            goto L44
        L42:
            java.lang.String r0 = "upload_failed_permanent"
        L44:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L37
            X.3j1 r3 = r1.A04
            java.lang.String r2 = r7.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = A01(r9)
            r3.A04(r1, r2, r0)
            r3 = 1
            goto L71
        L5b:
            java.lang.String r0 = "queued"
            goto L60
        L5e:
            java.lang.String r0 = "executing"
        L60:
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L37
            X.3j1 r2 = r1.A04
            java.lang.String r1 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A05(r1, r0)
        L71:
            r5 = r4
            goto Ld
        L73:
            java.lang.String r0 = "folderSequence"
            X.C14360o3.A0F(r0)
            goto L1e
        L79:
            if (r3 == 0) goto L82
            X.2DU r8 = (X.C2DU) r8
            X.2Dg r0 = r8.A0C
            r0.A0H()
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35202Ffu.A00(X.1lx, X.2DS, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            java.lang.String r1 = "Invalid lifecycleState: "
            switch(r0) {
                case -1090974990: goto L28;
                case -948696717: goto L25;
                case 1501196714: goto L1b;
                case 1563991648: goto L11;
                case 1885454214: goto Le;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0V(r1, r2)
            throw r0
        Le:
            java.lang.String r0 = "upload_failed_transient"
            goto L1d
        L11:
            java.lang.String r0 = "uploaded"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L1b:
            java.lang.String r0 = "upload_failed_permanent"
        L1d:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L25:
            java.lang.String r0 = "queued"
            goto L2a
        L28:
            java.lang.String r0 = "executing"
        L2a:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0V(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35202Ffu.A01(java.lang.String):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C35691lp r6, X.C2DS r7, java.lang.String r8) {
        /*
            r5 = this;
            X.AbstractC167017dG.A1O(r7, r8)
            X.2DU r7 = (X.C2DU) r7
            X.2Dg r4 = r7.A0C
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L58
            X.2Rx r1 = r4.A0A(r0)
            if (r1 == 0) goto L54
            int r0 = r8.hashCode()
            switch(r0) {
                case -1090974990: goto L3e;
                case -948696717: goto L3b;
                case 1501196714: goto L23;
                case 1563991648: goto L20;
                case 1885454214: goto L1d;
                default: goto L18;
            }
        L18:
            java.lang.IllegalStateException r0 = X.AbstractC31177DnL.A0Y(r8)
            throw r0
        L1d:
            java.lang.String r0 = "upload_failed_transient"
            goto L25
        L20:
            java.lang.String r0 = "uploaded"
            goto L25
        L23:
            java.lang.String r0 = "upload_failed_permanent"
        L25:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L18
            X.3j1 r3 = r1.A03
            java.lang.String r2 = r6.A05
            java.lang.String r1 = r6.A01
            if (r1 == 0) goto L55
            boolean r0 = A01(r8)
            r3.A04(r1, r2, r0)
            goto L51
        L3b:
            java.lang.String r0 = "queued"
            goto L40
        L3e:
            java.lang.String r0 = "executing"
        L40:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L18
            X.3j1 r2 = r1.A03
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L55
            r2.A05(r1, r0)
        L51:
            r4.A0H()
        L54:
            return
        L55:
            java.lang.String r0 = "folderName"
            goto L5a
        L58:
            java.lang.String r0 = "folderId"
        L5a:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35202Ffu.A02(X.1lp, X.2DS, java.lang.String):void");
    }
}

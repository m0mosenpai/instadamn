package X;

/* loaded from: classes8.dex */
public final class JTU {
    public int A00;
    public C114675Fx A01;
    public String A02;

    public static JTU A00(C1OW c1ow) {
        C14360o3.A0B(c1ow, 0);
        return new JTU(c1ow.A04, c1ow.A06, c1ow.A00);
    }

    public static JTU A01(MNP mnp) {
        JTV jtv = (JTV) mnp;
        return new JTU(jtv.A01, jtv.A02, jtv.A00);
    }

    public static void A02(JTU jtu, String str, String str2) {
        int i;
        if (!str.equals("executing")) {
            if (str.equals("upload_failed_transient") && str2.equals("queued")) {
                i = 0;
            } else {
                return;
            }
        } else if (!str2.equals("queued")) {
            return;
        } else {
            i = jtu.A00 + 1;
        }
        jtu.A00 = i;
    }

    public final void A04(String str) {
        String str2 = this.A02;
        A03(str2, str);
        A02(this, str2, str);
        this.A02 = str;
        this.A01 = null;
    }

    public JTU(C114675Fx c114675Fx, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        if (!"upload_failed_transient".equals(str) && !"upload_failed_permanent".equals(str)) {
            if (c114675Fx != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid parameters: lifecycleState=");
                sb.append(str);
                sb.append(" sendError=");
                sb.append(c114675Fx);
                C0w9.A03("DirectMutationStateBuilder_init", sb.toString());
                return;
            }
            return;
        }
        if (c114675Fx == null) {
            return;
        }
        this.A01 = c114675Fx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r0 != false) goto L5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            java.lang.String r6 = "upload_failed_transient"
            java.lang.String r5 = "upload_failed_permanent"
            java.lang.String r4 = "executing"
            java.lang.String r3 = "queued"
            switch(r0) {
                case -1090974990: goto L61;
                case -948696717: goto L5b;
                case 1501196714: goto L55;
                case 1885454214: goto L4f;
                default: goto Lf;
            }
        Lf:
            r2 = -1
        L10:
            java.lang.String r1 = "uploaded"
            switch(r2) {
                case 0: goto L2b;
                case 1: goto L42;
                case 2: goto L48;
                case 3: goto L26;
                default: goto L15;
            }
        L15:
            r0 = 3655(0xe47, float:5.122E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = " to "
            java.lang.String r0 = X.AnonymousClass001.A0u(r1, r7, r0, r8)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L26:
            boolean r0 = r8.equals(r3)
            goto L46
        L2b:
            int r0 = r8.hashCode()
            switch(r0) {
                case -948696717: goto L3d;
                case 1501196714: goto L38;
                case 1563991648: goto L48;
                case 1885454214: goto L33;
                default: goto L32;
            }
        L32:
            goto L15
        L33:
            boolean r0 = r8.equals(r6)
            goto L4c
        L38:
            boolean r0 = r8.equals(r5)
            goto L4c
        L3d:
            boolean r0 = r8.equals(r3)
            goto L4c
        L42:
            boolean r0 = r8.equals(r4)
        L46:
            if (r0 != 0) goto L69
        L48:
            boolean r0 = r8.equals(r1)
        L4c:
            if (r0 != 0) goto L69
            goto L15
        L4f:
            boolean r0 = r7.equals(r6)
            r2 = 3
            goto L66
        L55:
            boolean r0 = r7.equals(r5)
            r2 = 2
            goto L66
        L5b:
            boolean r0 = r7.equals(r3)
            r2 = 1
            goto L66
        L61:
            boolean r0 = r7.equals(r4)
            r2 = 0
        L66:
            if (r0 != 0) goto L10
            goto Lf
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTU.A03(java.lang.String, java.lang.String):void");
    }
}

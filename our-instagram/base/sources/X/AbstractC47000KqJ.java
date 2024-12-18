package X;

/* renamed from: X.KqJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47000KqJ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r10.equals("upload_failed_permanent") != false) goto L14;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0037. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C114675Fx r4, X.C2DS r5, com.instagram.model.direct.DirectThreadKey r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC08830cm r11) {
        /*
            r0 = r5
            X.2DU r0 = (X.C2DU) r0
            X.3kb r0 = X.C2DU.A03(r0, r6)
            if (r0 == 0) goto L32
            X.3nh r0 = r5.BSg(r6, r9)
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.A0h()
            if (r1 != 0) goto L32
        L15:
            java.lang.String r1 = "send_live_viewer_invite_message"
            boolean r1 = r1.equals(r7)
            java.lang.String r3 = "upload_failed_permanent"
            java.lang.String r2 = "upload_failed_transient"
            if (r1 == 0) goto L33
            boolean r1 = r10.equals(r2)
            if (r1 != 0) goto L2d
            boolean r1 = r10.equals(r3)
            if (r1 == 0) goto L33
        L2d:
            java.lang.Integer r1 = X.C05F.A0Y
        L2f:
            r5.A9m(r0, r4, r6, r1)
        L32:
            return
        L33:
            int r1 = r10.hashCode()
            switch(r1) {
                case -1090974990: goto L41;
                case -948696717: goto L44;
                case 1501196714: goto L4f;
                case 1563991648: goto L56;
                case 1885454214: goto L61;
                default: goto L3a;
            }
        L3a:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0V(r0, r10)
            throw r0
        L41:
            java.lang.String r1 = "executing"
            goto L46
        L44:
            java.lang.String r1 = "queued"
        L46:
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L3a
            java.lang.Integer r1 = X.C05F.A0C
            goto L2f
        L4f:
            boolean r1 = r10.equals(r3)
            if (r1 == 0) goto L3a
            goto L2d
        L56:
            java.lang.String r1 = "uploaded"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L3a
            java.lang.Integer r1 = X.C05F.A0j
            goto L2f
        L61:
            boolean r1 = r10.equals(r2)
            if (r1 == 0) goto L3a
            java.lang.Integer r1 = X.C05F.A0N
            goto L2f
        L6a:
            java.lang.Object r0 = r11.get()
            X.3nh r0 = (X.C83403nh) r0
            r0.A1f = r8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47000KqJ.A00(X.5Fx, X.2DS, com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0cm):void");
    }
}

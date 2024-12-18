package X;

/* renamed from: X.Nxg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54202Nxg {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if ("*\/*".equals(r4) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r1 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.app.Activity r19, android.content.Intent r20, android.net.Uri r21, X.C45123Jxs r22, X.AbstractC12990ll r23, java.lang.Runnable r24, java.lang.String r25, java.util.HashMap r26, java.util.List r27, int r28, int r29) {
        /*
            r14 = r23
            boolean r9 = X.AbstractC25229BEm.A1Y(r14)
            r5 = 3
            r0 = 6
            r13 = r22
            X.C14360o3.A0B(r13, r0)
            r17 = r20
            java.lang.String r4 = r17.getType()
            X.8pd r0 = X.C198278pc.A0A
            X.8pc r10 = r0.A00()
            X.02i r3 = X.C006802i.A0p
            java.util.Iterator r1 = r27.iterator()
            r6 = 0
            r2 = r6
        L21:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            if (r0 == 0) goto L21
            if (r2 != 0) goto L33
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
        L33:
            r2.add(r0)
            goto L21
        L37:
            X.NgR r8 = X.EnumC53229NgR.A05
            r7 = r8
            if (r4 == 0) goto L5c
            java.lang.String r1 = r17.getAction()
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
        */
        //  java.lang.String r0 = "*/*"
        /*
            boolean r0 = r0.equals(r4)
            r1 = 1
            if (r0 != 0) goto L52
        L51:
            r1 = 0
        L52:
            java.lang.String r0 = "image"
            boolean r0 = X.AbstractC002300n.A0h(r4, r0, r9)
            if (r0 == 0) goto L93
            X.NgR r8 = X.EnumC53229NgR.A06
        L5c:
            r0 = r28
            r10.A01 = r0
            r0 = r29
            r10.A00 = r0
            r20 = r24
            if (r8 == r7) goto La5
            X.PFy r15 = new X.PFy
            r11 = r19
            r16 = r11
            r18 = r3
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            android.os.Bundle r1 = r17.getExtras()
            if (r1 == 0) goto L81
            java.lang.String r0 = "is_dark_mode"
            java.lang.Boolean r6 = X.AbstractC31174DnI.A0n(r1, r0)
        L81:
            r10.A04 = r6
            java.lang.Integer r16 = X.C05F.A00
            r12 = r21
            r18 = r25
            r19 = r26
            r20 = r2
            r17 = r4
            r10.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L93:
            java.lang.String r0 = "video"
            boolean r0 = X.AbstractC002300n.A0h(r4, r0, r9)
            if (r0 != 0) goto La0
            if (r1 == 0) goto L5c
        L9d:
            X.NgR r8 = X.EnumC53229NgR.A04
            goto L5c
        La0:
            if (r1 != 0) goto L9d
            X.NgR r8 = X.EnumC53229NgR.A07
            goto L5c
        La5:
            r2 = 18951415(0x1212cf7, float:2.960329E-38)
            boolean r0 = r3.isMarkerOn(r2)
            if (r0 == 0) goto Lb8
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "ineligible_media_type"
            r3.markerAnnotate(r2, r1, r0)
            r3.markerEnd(r2, r5)
        Lb8:
            r20.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54202Nxg.A00(android.app.Activity, android.content.Intent, android.net.Uri, X.Jxs, X.0ll, java.lang.Runnable, java.lang.String, java.util.HashMap, java.util.List, int, int):void");
    }
}

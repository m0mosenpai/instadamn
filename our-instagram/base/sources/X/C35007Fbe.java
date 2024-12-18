package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fbe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35007Fbe {
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C37025GTh.A00);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C50165MDs(this, 12));
    public final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C25531Mh r8, X.C35007Fbe r9, java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            r1 = 0
            int r0 = r10.length()
            if (r0 == 0) goto L88
            X.0bW r0 = r9.A00
            android.net.Uri r3 = X.AbstractC08820cl.A01(r0, r10)
            if (r3 == 0) goto L88
            java.lang.String r5 = "destination"
            java.lang.String r7 = r3.getQueryParameter(r5)
            java.lang.String r0 = "feed_type"
            java.lang.String r6 = r3.getQueryParameter(r0)
            java.lang.String r0 = r3.getHost()
            java.lang.String r4 = "share_to_direct_preview"
            boolean r2 = r4.equalsIgnoreCase(r0)
            java.lang.String r0 = "is_add_from_share_to_friends_story"
            boolean r1 = r3.getBooleanQueryParameter(r0, r1)
            if (r7 == 0) goto L33
            int r0 = r7.length()
            if (r0 != 0) goto L45
        L33:
            java.lang.String r0 = "reshare_chaining"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L89
            X.0do r0 = r9.A04
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L89
            java.lang.String r7 = "feed_reshare_chaining"
        L45:
            r8.A0R(r5, r7)
        L48:
            X.0sZ r0 = r9.A05
            java.lang.Object r0 = r0.invoke()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ts r2 = r0.BT6()
            if (r11 != 0) goto L58
            java.lang.String r11 = ""
        L58:
            r1 = 0
            com.instagram.model.direct.messageid.MessageIdentifier r0 = new com.instagram.model.direct.messageid.MessageIdentifier
            r0.<init>(r11, r1)
            java.util.Map r2 = r2.BOu(r0)
            java.util.LinkedHashMap r1 = X.AbstractC166987dD.A1I()
            if (r12 == 0) goto L6b
            r1.putAll(r12)
        L6b:
            X.0do r0 = r9.A03
            X.7F3 r0 = X.AbstractC31172DnG.A0c(r0)
            java.util.LinkedHashMap r0 = r0.A03(r3)
            r1.putAll(r0)
            if (r2 == 0) goto L7d
            r1.putAll(r2)
        L7d:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L88
            r8.A0v(r1)
        L88:
            return
        L89:
            if (r1 == 0) goto L8e
            java.lang.String r7 = "story_post_capture"
            goto L45
        L8e:
            if (r2 == 0) goto L48
            r8.A0R(r5, r4)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35007Fbe.A00(X.1Mh, X.Fbe, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (r12.contains("reel") != true) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C2EY r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, java.util.Map r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35007Fbe.A01(X.2EY, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, boolean, boolean, boolean):void");
    }

    public C35007Fbe(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
    }
}

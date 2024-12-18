package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34511jp implements InterfaceC29301b7 {
    public static final C0KV A02 = C34521jq.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // X.InterfaceC29301b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ENr(X.C19260xA r10, X.InterfaceC37261GbE r11, X.C1OW r12) {
        /*
            r9 = this;
            X.1jn r12 = (X.C34491jn) r12
            r3 = 0
            X.C14360o3.A0B(r12, r3)
            r0 = 2
            X.C14360o3.A0B(r11, r0)
            java.util.List r5 = r12.C7R()
            X.C14360o3.A07(r5)
            X.JTa r2 = r12.A02
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto Lab
            com.instagram.common.session.UserSession r4 = r9.A00
            java.lang.Object r5 = r5.get(r3)
            com.instagram.model.direct.DirectThreadKey r5 = (com.instagram.model.direct.DirectThreadKey) r5
            java.lang.String r7 = r12.A01
            if (r7 == 0) goto La0
            java.lang.String r1 = r12.A02
            com.instagram.api.schemas.MessagingOffPlatformShareType r8 = r12.A00
            X.Jvm r6 = X.AbstractC46912Kot.A00(r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "prompt_id"
            r2.put(r0, r7)     // Catch: org.json.JSONException -> L7c
            if (r1 == 0) goto L41
            java.lang.String r0 = "submission_id"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L7c
        L41:
            if (r8 == 0) goto L83
            int r1 = r8.ordinal()     // Catch: org.json.JSONException -> L7c
            r0 = 4
            r7 = 0
            switch(r1) {
                case 1: goto L63;
                case 2: goto L6a;
                case 3: goto L65;
                case 4: goto L67;
                case 5: goto L71;
                case 6: goto L69;
                default: goto L4c;
            }     // Catch: org.json.JSONException -> L7c
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L7c
            r1.<init>()     // Catch: org.json.JSONException -> L7c
            java.lang.String r0 = "Unable to convert string value to server int: "
            r1.append(r0)     // Catch: org.json.JSONException -> L7c
            r1.append(r8)     // Catch: org.json.JSONException -> L7c
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L7c
            java.lang.String r0 = "MessagingOffPlatformShareType"
            X.AbstractC12120kG.A07(r0, r1, r7)     // Catch: org.json.JSONException -> L7c
            goto L83
        L63:
            r0 = 1
            goto L6a
        L65:
            r0 = 2
            goto L6a
        L67:
            r0 = 3
            goto L6a
        L69:
            r0 = 5
        L6a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: org.json.JSONException -> L7c
            if (r1 == 0) goto L83
            goto L75
        L71:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L7c
        L75:
            java.lang.String r0 = "share_type"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L7c
            goto L83
        L7c:
            java.lang.String r1 = "DirectMessageApi"
            java.lang.String r0 = "Error accessing prompt id or embedded type for this prompt share"
            X.C0w9.A03(r1, r0)
        L83:
            X.KVU r0 = X.AbstractC47211Ktk.A0C
            X.1Ms r2 = X.LLX.A00(r4, r0, r6, r5, r2)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0S(r1, r0)
            X.1ON r2 = r2.A0N()
            X.EDz r0 = X.AbstractC46987Kq6.A00(r4, r11)
            r2.A00 = r0
            r1 = -5
            r0 = 3
            X.C1GJ.A06(r2, r1, r0, r3, r3)
            return
        La0:
            java.lang.String r0 = "promptId"
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        Lab:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34511jp.ENr(X.0xA, X.GbE, X.1OW):void");
    }

    public C34511jp(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}

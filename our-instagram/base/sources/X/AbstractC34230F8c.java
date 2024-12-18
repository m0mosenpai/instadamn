package X;

/* renamed from: X.F8c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34230F8c {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r6 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.app.Activity r5, android.os.Bundle r6, X.AbstractC12990ll r7, boolean r8) {
        /*
            r1 = 0
            r4 = 1
            X.2hJ r0 = X.C55772hI.A00(r7)
            r0.A06(r5)
            android.content.Intent r2 = X.AbstractC31171DnF.A04()
            if (r6 == 0) goto L8d
            java.lang.String r0 = "IS_ADD_ACCOUNT_FLOW"
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 != r4) goto L8d
            X.AbstractC31176DnK.A0v(r5)
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L90
            java.lang.String r0 = "SHOULD_START_AT_SAC_REG_FLOW"
            boolean r0 = r6.getBoolean(r0)
            if (r0 != 0) goto L90
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 18312683988203817(0x410f4a00003929, double:1.8979571729575754E-307)
            boolean r0 = X.C1AD.A06(r3, r0)
            if (r0 == 0) goto L90
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.String r1 = r7.userId
            java.lang.String r0 = "active_logged_in_user_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r7.token
            java.lang.String r0 = "last_logged_in_ig_access_token"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_logged_in_switcher"
            r2.putExtra(r0, r4)
            r0 = 822(0x336, float:1.152E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.setClassName(r5, r0)
        L51:
            java.lang.String r1 = X.AbstractC31171DnF.A0a(r6)
            if (r1 == 0) goto L5c
            java.lang.String r0 = "launched_url"
            r2.putExtra(r0, r1)
        L5c:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.setFlags(r0)
            if (r6 == 0) goto L84
            java.lang.String r1 = "confirm_email_encoded_email"
            java.lang.String r0 = r6.getString(r1)
            if (r0 == 0) goto L72
            java.lang.String r0 = X.F9T.A00(r0)
            r6.putString(r1, r0)
        L72:
            java.lang.String r1 = "confirm_email_nonce"
            java.lang.String r0 = r6.getString(r1)
            if (r0 == 0) goto L81
            java.lang.String r0 = X.F9T.A00(r0)
            r6.putString(r1, r0)
        L81:
            r2.putExtras(r6)
        L84:
            X.C12260kU.A0C(r5, r2)
            if (r8 == 0) goto L8c
            r5.finish()
        L8c:
            return
        L8d:
            java.lang.String r0 = "com.instagram.nux.activity.BloksSignedOutFragmentActivity"
            goto L96
        L90:
            r0 = 823(0x337, float:1.153E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
        L96:
            r2.setClassName(r5, r0)
            if (r6 == 0) goto L5c
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34230F8c.A00(android.app.Activity, android.os.Bundle, X.0ll, boolean):void");
    }
}

package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200088tD implements CallerContextable {
    public static final C200088tD A00 = new Object();
    public static final CallerContext A01 = CallerContext.A00(C200088tD.class);
    public static final String __redex_internal_original_name = "NoticeEligibilityMetaDataUtil";

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.AbstractC14490oL.A0B(r5) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2JO A01(android.content.Context r5, com.instagram.common.session.UserSession r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 2
            X.C14360o3.A0B(r7, r0)
            X.2JO r3 = new X.2JO
            r3.<init>()
            if (r5 == 0) goto L16
            boolean r1 = X.AbstractC14490oL.A0B(r5)
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_fb_app_installed"
            r3.A08(r0, r1)
            java.lang.String r0 = "client_session_id"
            r3.A09(r7, r0)
            boolean r0 = A00(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_content_reshare"
            r3.A08(r0, r1)
            if (r5 == 0) goto L55
            X.8lw r1 = X.C196058lv.A08
            com.facebook.common.callercontext.CallerContext r0 = X.C200088tD.A01
            boolean r0 = r1.A04(r0, r6)
            if (r0 != 0) goto L55
            X.2JO r2 = new X.2JO
            r2.<init>()
            X.6oB r0 = X.AbstractC149576oA.A00(r6)
            com.google.common.collect.ImmutableList r1 = r0.A06(r5)
            java.lang.String r0 = "target_accounts"
            r2.A05(r0, r1)
            java.lang.String r0 = "fx_native_auth_input_data"
            r3.A06(r2, r0)
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200088tD.A01(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):X.2JO");
    }

    public static final boolean A00(UserSession userSession) {
        int ordinal = ((C22F) AnonymousClass229.A01(userSession)).A04.A09.ordinal();
        if (ordinal == 5 || ordinal == 571 || ordinal == 179 || ordinal == 16 || ordinal == 155) {
            return true;
        }
        return false;
    }
}

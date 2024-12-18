package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FQ2 {
    public final UserSession A00;
    public final C34703FQo A01;
    public final HashMap A02;
    public final C23031Ai A03;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.AbstractC59962oe r8, java.lang.Runnable r9, java.lang.String r10, java.util.List r11, boolean r12) {
        /*
            r7 = this;
            r6 = 1
            r4 = 0
            if (r10 == 0) goto L93
            X.FQo r5 = r7.A01
            java.util.List r0 = r5.A00(r11)
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r12 == 0) goto L46
            if (r0 == 0) goto L93
            boolean r0 = r5.A01(r11)
            if (r0 == 0) goto L93
            com.instagram.common.session.UserSession r2 = r7.A00
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36314120286374368(0x810380000009e0, double:3.028534122104135E-306)
        L21:
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto L93
            java.util.HashMap r4 = X.AbstractC166987dD.A1G()
            java.lang.String r0 = "thread_id"
            r4.put(r0, r10)
            java.util.List r0 = r5.A00(r11)
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L58
            X.AbstractC167017dG.A1V(r3, r1)
            goto L3c
        L46:
            if (r0 == 0) goto L93
            boolean r0 = r5.A01(r11)
            if (r0 == 0) goto L93
            com.instagram.common.session.UserSession r2 = r7.A00
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36318269224786002(0x81074600001852, double:3.031157927462086E-306)
            goto L21
        L58:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r3)
            java.lang.String r0 = "user_ids_to_show"
            r4.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_igd_group_thread"
            r4.put(r0, r1)
            java.lang.String r0 = "server_params"
            java.util.Map r1 = X.AbstractC167007dF.A0n(r0, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = X.AbstractC166987dD.A19(r0)
            java.lang.String r0 = "params"
            java.util.HashMap r1 = X.AbstractC167017dG.A0r(r0, r1)
            java.util.HashMap r0 = r7.A02
            r0.put(r10, r9)
            java.lang.String r0 = "com.bloks.www.rp_wellbeing.precall_interstitial.router"
            X.8gL r1 = X.C192108fB.A05(r2, r0, r1)
            r0 = 4
            X.C32393EOu.A00(r1, r8, r9, r7, r0)
            r8.schedule(r1)
            return r6
        L93:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQ2.A00(X.2oe, java.lang.Runnable, java.lang.String, java.util.List, boolean):boolean");
    }

    public FQ2(C23031Ai c23031Ai, UserSession userSession) {
        AbstractC167017dG.A1P(c23031Ai, userSession);
        this.A03 = c23031Ai;
        this.A00 = userSession;
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = new C34703FQo(c23031Ai);
    }
}

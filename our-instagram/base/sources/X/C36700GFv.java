package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.GFv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36700GFv implements C08V {
    public static final HashMap A00(Context context, AbstractC12990ll abstractC12990ll, String str) {
        HashMap A1G = AbstractC166987dD.A1G();
        InterfaceC19630xq A0f = AbstractC31174DnI.A0f();
        boolean z = A0f.getBoolean("is_from_log_out", false);
        boolean z2 = A0f.getBoolean("auto_login_success_before", false);
        long A03 = AbstractC31175DnJ.A03(A0f, "last_auto_login_time");
        boolean z3 = false;
        AbstractC31177DnL.A1N(A0f, "is_from_log_out", false);
        String A0p = AbstractC25231BEo.A0p();
        C19700xy c19700xy = C17280tP.A4E;
        c19700xy.A00().A0G(A0p);
        C17280tP A00 = c19700xy.A00();
        A1G.put("logged_out_user", AbstractC31171DnF.A0Y(A00, A00.A09, C17280tP.A4G, 185));
        A1G.put("show_internal_settings", false);
        A1G.put("family_device_id", AbstractC31172DnG.A0P(abstractC12990ll).A02(C19T.A20));
        A1G.put(AbstractC31189DnY.A02(), C16030qx.A00(context));
        A1G.put("qe_device_id", C16030qx.A02.A04(context));
        A1G.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
        A1G.put("waterfall_id", A0p);
        A1G.put("qpl_join_id", str);
        if (z || z2) {
            z3 = true;
        }
        A1G.put("disable_auto_login", Boolean.valueOf(z3));
        A1G.put("last_auto_login_time", Long.valueOf(A03));
        A1G.put("is_from_logged_out", Boolean.valueOf(z));
        return A1G;
    }

    public static final boolean A01() {
        Integer num = C35154Few.A00().A05;
        Integer num2 = C05F.A0C;
        if (num != num2 && C35160Ff2.A02.A00().A01() != num2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.os.Bundle r11, androidx.fragment.app.FragmentActivity r12, X.AbstractC12990ll r13, java.lang.String r14) {
        /*
            r10 = this;
            X.AbstractC167027dH.A13(r12, r13, r14)
            java.util.HashMap r6 = X.AbstractC166987dD.A1G()
            java.lang.String r1 = "flow_name"
            java.lang.String r0 = "secondary_profile_creation_ig_default"
            r6.put(r1, r0)
            java.lang.String r1 = "flow_type"
            java.lang.String r0 = "spc"
            r6.put(r1, r0)
            java.lang.String r0 = X.AbstractC166997dE.A0o()
            java.util.HashMap r2 = A00(r12, r13, r0)
            java.lang.String r1 = X.AbstractC31189DnY.A02()
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto Le6
            java.lang.String r0 = "family_device_id"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto Le6
            java.lang.String r0 = "qe_device_id"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto Le6
            java.lang.String r0 = "waterfall_id"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto Le6
            java.util.HashMap r8 = X.AbstractC166987dD.A1G()
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.put(r1, r0)
            java.lang.String r1 = "soap_creation_source"
            java.lang.String r0 = "profile_switcher"
            r8.put(r1, r0)
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            if (r11 == 0) goto Le6
            java.lang.String r0 = "last_logged_in_ig_access_token"
            r4 = 0
            java.lang.String r0 = r11.getString(r0, r4)
            X.AbstractC31171DnF.A12(r1, r0)
            X.09Y r3 = X.C023409i.A0A
            com.instagram.common.session.UserSession r9 = r3.A07(r1)
            if (r9 == 0) goto Le6
            android.content.Context r7 = X.AbstractC166987dD.A0O(r12)
            java.lang.String r5 = "active_account"
            java.lang.String r1 = "caa_bloks_access_library_spc_account_linking"
            java.lang.String r0 = "MaaSpcHelper"
            java.util.ArrayList r1 = X.C23132AMt.A01(r7, r9, r5, r1, r0)
            boolean r0 = r1.isEmpty()
            java.lang.String r9 = "auth_token"
            if (r0 != 0) goto Lb1
            java.lang.Object r1 = X.AbstractC166997dE.A0k(r1)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto Lb1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r7 = r1.get(r9)
        L91:
            java.util.HashMap r5 = X.AbstractC166987dD.A1G()
            java.util.Iterator r2 = X.AbstractC166997dE.A14(r2)
        L99:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb4
            java.util.Map$Entry r0 = X.AbstractC166987dD.A1K(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L99
            r5.put(r1, r0)     // Catch: java.lang.ClassCastException -> L99
            goto L99
        Lb1:
            java.lang.String r7 = ""
            goto L91
        Lb4:
            r5.put(r9, r7)
            java.lang.String r1 = X.AbstractC31175DnJ.A0d(r8)
            java.lang.String r0 = "reg_info"
            r5.put(r0, r1)
            java.lang.String r1 = X.AbstractC31175DnJ.A0d(r6)
            java.lang.String r0 = "flow_info"
            r5.put(r0, r1)
            X.0a1 r1 = r3.A03(r10)
            X.0xB r0 = X.AbstractC31171DnF.A0D(r14)
            X.2tP r3 = X.C62862tP.A01(r4, r12, r0, r1)
            X.1GK r2 = X.AbstractC202778xv.A00()
            java.lang.String r0 = "com.bloks.www.bloks.caa.reg.spc_create_profile.async"
            X.8gL r1 = X.C192108fB.A02(r4, r1, r0, r5)
            r0 = 7
            X.C32392EOt.A00(r1, r3, r0)
            r2.schedule(r1)
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36700GFv.A02(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0ll, java.lang.String):void");
    }
}

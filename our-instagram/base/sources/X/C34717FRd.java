package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.FRd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34717FRd {
    public final C32262EIw A02(Bundle bundle, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        EnumC33400EpX enumC33400EpX;
        C32262EIw c32262EIw = new C32262EIw();
        bundle.putString("argument_two_fac_identifier", str);
        bundle.putString("argument_username", str2);
        bundle.putString("argument_pk", str3);
        bundle.putString("argument_abfuscated_phone_number", str4);
        bundle.putBoolean("argument_is_from_one_click_flow", z6);
        bundle.putBoolean("argument_show_trusted_device_option", z);
        bundle.putBoolean("argument_sms_two_factor_on", z2);
        bundle.putBoolean("argument_whatsapp_two_factor_on", z4);
        bundle.putBoolean("argument_totp_two_factor_on", z3);
        bundle.putBoolean("argument_is_trusted_device", z9);
        bundle.putBoolean("argument_should_opt_in_trusted_device_option", z5);
        if (z7) {
            enumC33400EpX = EnumC33400EpX.A07;
        } else if (z4) {
            enumC33400EpX = EnumC33400EpX.A09;
        } else if (z3) {
            enumC33400EpX = EnumC33400EpX.A03;
        } else if (z2 && str5 == null) {
            enumC33400EpX = EnumC33400EpX.A05;
        } else {
            enumC33400EpX = EnumC33400EpX.A04;
        }
        bundle.putInt("argument_two_fac_clear_method", enumC33400EpX.A00);
        AbstractC31173DnH.A1B(bundle);
        bundle.putBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD", false);
        bundle.putString("argument_sms_not_allowed_reason", str5);
        bundle.putBoolean("eligible_for_multiple_totp", z8);
        c32262EIw.setArguments(bundle);
        return c32262EIw;
    }

    public final C32320ELo A01(UserSession userSession) {
        C32320ELo c32320ELo = new C32320ELo();
        if (userSession != null) {
            c32320ELo.setArguments(AbstractC31178DnM.A05(userSession));
        }
        return c32320ELo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EKE A03(android.os.Bundle r5, java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            r4 = this;
            java.lang.String r3 = "IgSessionManager.LOGGED_OUT_TOKEN"
            r2 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L10
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r0 = 1
            if (r1 == 0) goto L11
        L10:
            r0 = 0
        L11:
            X.C18C.A0E(r0)
            android.os.Bundle r1 = X.AbstractC166987dD.A0b()
            if (r6 == 0) goto L26
            if (r7 == 0) goto L26
            java.lang.String r0 = "phone_number_key"
            r1.putString(r0, r6)
            java.lang.String r0 = "query_key"
            r1.putString(r0, r7)
        L26:
            java.lang.String r0 = "should_enable_auto_conf"
            r1.putBoolean(r0, r2)
            java.lang.String r0 = "arg_is_reg_flow"
            r1.putBoolean(r0, r2)
            X.AbstractC31171DnF.A12(r1, r3)
            if (r8 == 0) goto L3a
            java.lang.String r0 = "arg_is_multiple_account_recovery"
            r1.putBoolean(r0, r8)
        L3a:
            r1.putAll(r5)
            X.EKE r0 = new X.EKE
            r0.<init>()
            r0.setArguments(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34717FRd.A03(android.os.Bundle, java.lang.String, java.lang.String, boolean):X.EKE");
    }

    public final C32369ENt A00(UserSession userSession, String str) {
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null) {
            A0b.putString(MSV.A00(405), str);
        }
        AbstractC31173DnH.A1C(A0b, userSession);
        C32369ENt c32369ENt = new C32369ENt();
        c32369ENt.setArguments(A0b);
        return c32369ENt;
    }
}

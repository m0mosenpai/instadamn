package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8Y {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FOa] */
    public static C34643FOa parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31182DnR.A01().equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("obfuscated_phone_number".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("sms_two_factor_on".equals(A0s)) {
                    obj.A0A = c16l.A0d();
                } else if ("totp_two_factor_on".equals(A0s)) {
                    obj.A0E = c16l.A0d();
                } else if ("whatsapp_two_factor_on".equals(A0s)) {
                    obj.A0F = c16l.A0d();
                } else if (AbstractC31178DnM.A0a().equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("show_messenger_code_option".equals(A0s)) {
                    obj.A0C = c16l.A0d();
                } else if ("show_trusted_device_option".equals(A0s)) {
                    obj.A0D = c16l.A0d();
                } else if ("should_opt_in_trusted_device_option".equals(A0s)) {
                    obj.A0B = c16l.A0d();
                } else if ("pending_trusted_notification".equals(A0s)) {
                    obj.A09 = c16l.A0d();
                } else if ("sms_not_allowed_reason".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("pk".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("eligible_for_multiple_totp".equals(A0s)) {
                    obj.A07 = c16l.A0d();
                } else if ("is_trusted_device".equals(A0s)) {
                    obj.A08 = c16l.A0d();
                } else if ("trusted_notification_polling_nonce".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("trusted_device_nonce".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

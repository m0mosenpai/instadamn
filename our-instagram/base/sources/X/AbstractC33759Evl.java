package X;

import java.io.IOException;

/* renamed from: X.Evl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33759Evl {
    public static E6Y parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = ST2.A00(31, 8, 99);
                A002 = ST2.A00(10, 21, 114);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("obfuscated_phone_number".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("show_messenger_code_option".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("show_new_login_screen".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("sms_not_allowed_reason".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("sms_two_factor_on".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("totp_two_factor_on".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if (A002.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("whatsapp_two_factor_on".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("obfuscated_phone_number", c16l, "TwoFactorLoginInfoImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_new_login_screen", c16l, "TwoFactorLoginInfoImpl");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sms_two_factor_on", c16l, "TwoFactorLoginInfoImpl");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("totp_two_factor_on", c16l, "TwoFactorLoginInfoImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A002, c16l, "TwoFactorLoginInfoImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "TwoFactorLoginInfoImpl");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("whatsapp_two_factor_on", c16l, "TwoFactorLoginInfoImpl");
                } else {
                    return new E6Y(str, str2, str3, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), str4, bool5.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("show_messenger_code_option", c16l, "TwoFactorLoginInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

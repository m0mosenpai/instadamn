package X;

import com.instagram.login.twofac.model.TotpSeed;
import com.instagram.login.twofac.model.TrustedDevice;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FVb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34799FVb {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1um, X.EDU, X.1ul] */
    public static EDU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("totp_seeds".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            TotpSeed parseFromJson = AbstractC34234F8g.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if ("is_two_factor_enabled".equals(A0s)) {
                    c40791um.A08 = c16l.A0d();
                } else if ("is_totp_two_factor_enabled".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else if ("can_add_additional_totp_seed".equals(A0s)) {
                    c40791um.A09 = c16l.A0d();
                } else if (AbstractC31182DnR.A03().equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("country_code".equals(A0s)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("national_number".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("is_phone_confirmed".equals(A0s)) {
                    c40791um.A0F = c16l.A0d();
                } else if ("backup_codes".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("trusted_devices".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            TrustedDevice parseFromJson2 = AbstractC34235F8h.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A06 = arrayList;
                } else if ("email".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("has_reachable_email".equals(A0s)) {
                    c40791um.A0B = c16l.A0d();
                } else if ("eligible_for_trusted_notifications".equals(A0s)) {
                    c40791um.A0A = c16l.A0d();
                } else if ("is_trusted_notifications_enabled".equals(A0s)) {
                    c40791um.A0H = c16l.A0d();
                } else if ("is_eligible_for_whatsapp_two_factor".equals(A0s)) {
                    c40791um.A0E = c16l.A0d();
                } else if ("is_whatsapp_two_factor_enabled".equals(A0s)) {
                    c40791um.A0I = c16l.A0d();
                } else if ("is_eligible_for_multiple_totp".equals(A0s)) {
                    c40791um.A0C = c16l.A0d();
                } else if ("is_eligible_for_phone_number_confirmed_badge_toggle".equals(A0s)) {
                    c40791um.A0D = c16l.A0d();
                } else if ("is_phone_number_confirmed_badge_enabled".equals(A0s)) {
                    c40791um.A0G = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

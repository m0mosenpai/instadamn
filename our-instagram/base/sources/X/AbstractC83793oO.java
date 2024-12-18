package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.3oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83793oO {
    public static C83803oP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C83803oP c83803oP = new C83803oP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("upsell_seen_before".equals(A0q)) {
                    c83803oP.A0B = c16l.A0d();
                } else if ("allow_non_fb_sso".equals(A0q)) {
                    c83803oP.A08 = c16l.A0d();
                } else if ("rejected_sso_upsell".equals(A0q)) {
                    c83803oP.A0A = c16l.A0d();
                } else {
                    String str = null;
                    if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c83803oP.A06 = str;
                    } else if ("login_nonce".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c83803oP.A05 = str;
                    } else if ("login_token".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c83803oP.A03 = str;
                    } else if (AbstractC31186DnV.A01(31, 8, 86).equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c83803oP.A07 = str;
                    } else if ("profile_pic_url".equals(A0q)) {
                        c83803oP.A02 = AbstractC222616c.A00(c16l);
                    } else if ("last_logout_timestamp".equals(A0q)) {
                        c83803oP.A01 = c16l.A0y();
                    } else if ("login_token_update_timestamp".equals(A0q)) {
                        c83803oP.A00 = c16l.A0y();
                    } else if ("is_fx_sso".equals(A0q)) {
                        c83803oP.A09 = c16l.A0d();
                    } else if ("is_app_level_spi".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c83803oP.A04 = str;
                    }
                }
                c16l.A0z();
            }
            return c83803oP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import fxcache.model.FxCalAccount;
import java.io.IOException;

/* renamed from: X.42c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC906742c {
    public static FxCalAccount parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FxCalAccount fxCalAccount = new FxCalAccount();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("account_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    fxCalAccount.A03 = str;
                } else if ("instagram_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccount.A05 = str;
                } else if ("account_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    fxCalAccount.A04 = str;
                } else if ("account_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccount.A06 = str;
                } else if ("profile_picture_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccount.A08 = str;
                } else if (AbstractC58346Ptm.A01(19, 8, 121).equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccount.A0A = str;
                } else if ("obfuscated_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccount.A07 = str;
                } else if ("badge_count".equals(A0q)) {
                    fxCalAccount.A00 = c16l.A1D();
                } else if ("unfiltered_badge_count".equals(A0q)) {
                    fxCalAccount.A02 = c16l.A1D();
                } else if ("ig_l28".equals(A0q)) {
                    fxCalAccount.A01 = c16l.A1D();
                } else if ("unpacked_notifications".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccount.A09 = str;
                }
                c16l.A0z();
            }
            return fxCalAccount;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.io.IOException;

/* renamed from: X.1vT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41191vT {
    public static FxCalAccountWithSwitcherInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = new FxCalAccountWithSwitcherInfo();
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
                    fxCalAccountWithSwitcherInfo.A03 = str;
                } else if ("instagram_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A05 = str;
                } else if ("account_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    fxCalAccountWithSwitcherInfo.A04 = str;
                } else if ("account_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A06 = str;
                } else if ("profile_picture_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A08 = str;
                } else if (AbstractC58346Ptm.A01(19, 8, 121).equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A0B = str;
                } else if ("obfuscated_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A07 = str;
                } else if ("badge_count".equals(A0q)) {
                    fxCalAccountWithSwitcherInfo.A00 = c16l.A1D();
                } else if ("unfiltered_badge_count".equals(A0q)) {
                    fxCalAccountWithSwitcherInfo.A02 = c16l.A1D();
                } else if ("ig_l28".equals(A0q)) {
                    fxCalAccountWithSwitcherInfo.A01 = c16l.A1D();
                } else if ("unpacked_notifications".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A0A = str;
                } else if ("has_threads_account".equals(A0q)) {
                    fxCalAccountWithSwitcherInfo.A0C = c16l.A0d();
                } else if ("threads_profile_picture_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    fxCalAccountWithSwitcherInfo.A09 = str;
                }
                c16l.A0z();
            }
            return fxCalAccountWithSwitcherInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

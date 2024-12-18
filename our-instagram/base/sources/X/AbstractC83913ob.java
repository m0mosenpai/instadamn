package X;

import java.io.IOException;

/* renamed from: X.3ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83913ob {
    public static C83923oc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fallback_warning_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("fsr_quality".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("show_fallback_warning".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("use_for_flash_cache_only".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C83923oc(bool, bool2, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

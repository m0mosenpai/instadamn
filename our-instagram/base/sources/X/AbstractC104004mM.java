package X;

import com.instagram.model.androidlink.AndroidLinkImpl;
import java.io.IOException;

/* renamed from: X.4mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104004mM {
    public static C104014mN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AndroidLinkImpl androidLinkImpl = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("android_link".equals(A0q)) {
                    androidLinkImpl = AbstractC87683va.parseFromJson(c16l);
                } else if ("secondary_cta_destination".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("secondary_cta_hint_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("secondary_cta_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C104014mN(androidLinkImpl, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

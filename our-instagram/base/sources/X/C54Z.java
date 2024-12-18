package X;

import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import java.io.IOException;

/* renamed from: X.54Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54Z {
    public static DirectAnimatedMediaUser parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (AbstractC58357Ptx.A01(10, 8, 53).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_verified".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (str == null || bool == null) {
                return null;
            }
            return new DirectAnimatedMediaUser(str, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import com.instagram.model.direct.HighlightRange;
import java.io.IOException;

/* renamed from: X.F8z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34253F8z {
    /* JADX WARN: Type inference failed for: r2v2, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    public static HighlightRange parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("offset".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "length");
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (num != null) {
                obj.A02 = num.intValue();
            }
            if (num2 != null) {
                obj.A01 = num2.intValue();
            }
            obj.A00 = (obj.A02 + obj.A01) - 1;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

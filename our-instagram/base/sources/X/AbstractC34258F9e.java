package X;

import com.instagram.nux.cal.model.DpActionContent;
import java.io.IOException;

/* renamed from: X.F9e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34258F9e {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.nux.cal.model.DpActionContent, java.lang.Object] */
    public static DpActionContent parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("header".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("body".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("cta".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
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
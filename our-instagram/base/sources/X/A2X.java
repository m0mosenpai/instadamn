package X;

import com.instagram.ui.text.TextColors;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A2X {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Ai1] */
    public static Ai1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text_colors".equals(A0s)) {
                    TextColors parseFromJson = AEY.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A01 = parseFromJson;
                } else if ("primary_color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
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

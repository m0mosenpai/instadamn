package X;

import java.io.IOException;

/* renamed from: X.Jgf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44235Jgf {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Ku7, java.lang.Object] */
    public static C47234Ku7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("showreel_native_interactive_animation".equals(A0q)) {
                    obj.A00 = C66191U3g.parseFromJson(c16l);
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

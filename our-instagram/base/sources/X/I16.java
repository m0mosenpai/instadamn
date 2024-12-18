package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I16 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ICI, java.lang.Object] */
    public static ICI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("count".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = AbstractC166997dE.A0h(c16l);
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

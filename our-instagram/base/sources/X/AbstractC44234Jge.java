package X;

import java.io.IOException;

/* renamed from: X.Jge, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44234Jge {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Ku8, java.lang.Object] */
    public static C47235Ku8 parseFromJson(C16L c16l) {
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
                if ("data".equals(A0q)) {
                    obj.A00 = AbstractC44235Jgf.parseFromJson(c16l);
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

package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A0D {
    public static C171737l3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C171737l3 c171737l3 = new C171737l3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("scale".equals(AbstractC166997dE.A0s(c16l))) {
                    c171737l3.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c171737l3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

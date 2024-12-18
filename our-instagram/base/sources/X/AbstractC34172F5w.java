package X;

import java.io.IOException;

/* renamed from: X.F5w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34172F5w {
    public static C34371jb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34371jb c34371jb = new C34371jb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                AbstractC47856LCb.A01(c16l, c34371jb, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c34371jb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

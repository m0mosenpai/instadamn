package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FCS {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.EB0, X.Enj, X.1um] */
    public static C33288Enj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                FCQ.A00(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            c40791um.A08 = false;
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

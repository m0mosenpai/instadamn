package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VR5 {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VIw, java.lang.Object] */
    public static C68236VIw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69212Vjf c69212Vjf = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("ig.components.screens.Navbar".equals(AbstractC166997dE.A0s(c16l))) {
                    c69212Vjf = VR7.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = c69212Vjf;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

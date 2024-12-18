package X;

import java.io.IOException;

/* renamed from: X.56V, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56V {
    public static C56W parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C56W c56w = new C56W();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("beforeRenderBitrate".equals(A0q)) {
                    c56w.A01 = c16l.A1D();
                } else if ("afterRenderBitrate".equals(A0q)) {
                    c56w.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c56w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

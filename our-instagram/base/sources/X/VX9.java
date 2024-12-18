package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VX9 {
    public static Wm3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Wm3 wm3 = new Wm3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sticker_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    wm3.A04 = A0m;
                } else if ("image_file_path".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    wm3.A05 = A0m2;
                } else if ("rect_left".equals(A0s)) {
                    wm3.A01 = c16l.A1D();
                } else if ("rect_top".equals(A0s)) {
                    wm3.A03 = c16l.A1D();
                } else if ("rect_right".equals(A0s)) {
                    wm3.A02 = c16l.A1D();
                } else if ("rect_bottom".equals(A0s)) {
                    wm3.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return wm3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VOQ {
    public static UQv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bounding_box_bottom_right_x".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("bounding_box_bottom_right_y".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("bounding_box_top_left_x".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("bounding_box_top_left_y".equals(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new UQv(f, f2, f3, f4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import java.io.IOException;

/* renamed from: X.5MX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5MX {
    public static C9BW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BW c9bw = new C9BW(15);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_viewer_eligible_to_subscribe".equals(A0q)) {
                    c9bw.A01 = Boolean.valueOf(c16l.A0d());
                } else if ("is_viewer_eligible_for_free_trial".equals(A0q)) {
                    c9bw.A00 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return c9bw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

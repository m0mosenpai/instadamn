package X;

import android.graphics.Path;
import java.io.IOException;

/* renamed from: X.VWl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68584VWl {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.6S4] */
    public static C6S4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("rect_left".equals(A0s)) {
                    obj.A03 = (float) c16l.A0U();
                } else if ("rect_top".equals(A0s)) {
                    obj.A05 = (float) c16l.A0U();
                } else if ("rect_right".equals(A0s)) {
                    obj.A04 = (float) c16l.A0U();
                } else if ("rect_bottom".equals(A0s)) {
                    obj.A02 = (float) c16l.A0U();
                } else if ("radius_x".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("radius_y".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("orientation".equals(A0s)) {
                    obj.A06 = Path.Direction.valueOf(c16l.A1Q());
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import android.graphics.PointF;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VXB {
    public static W92 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            W92 w92 = new W92();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("position".equals(A0s)) {
                    PointF pointF = new PointF();
                    if (c16l.A11() == C16R.A0C) {
                        c16l.A1J();
                        Number A0p = c16l.A0p();
                        A0p.getClass();
                        float floatValue = A0p.floatValue();
                        c16l.A1J();
                        float floatValue2 = c16l.A0p().floatValue();
                        c16l.A1J();
                        pointF.x = floatValue;
                        pointF.y = floatValue2;
                    }
                    w92.A04 = pointF;
                } else if ("time".equals(A0s)) {
                    w92.A03 = c16l.A0y();
                } else if ("pressure".equals(A0s)) {
                    w92.A00 = (float) c16l.A0U();
                } else if ("radius".equals(A0s)) {
                    w92.A01 = (float) c16l.A0U();
                } else if ("pos".equals(A0s)) {
                    w92.A02 = c16l.A1D();
                }
                c16l.A0z();
            }
            return w92;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

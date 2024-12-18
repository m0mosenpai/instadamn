package X;

import android.graphics.Rect;
import java.io.IOException;

/* renamed from: X.A2e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22760A2e {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.AAO, java.lang.Object] */
    public static AAO parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bounds_spec_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    if (A1Q.equals("BIAS")) {
                        num = C05F.A00;
                    } else if (A1Q.equals("NORMALIZED_CENTER")) {
                        num = C05F.A01;
                    } else if (A1Q.equals("GRAVITY")) {
                        num = C05F.A0C;
                    } else if (A1Q.equals("ABSOLUTE")) {
                        num = C05F.A0N;
                    } else if (A1Q.equals("NO_OVERLAP")) {
                        num = C05F.A0Y;
                    } else {
                        throw AbstractC166987dD.A12(A1Q);
                    }
                    obj.A08 = num;
                } else if ("bias_x".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("bias_y".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("normalized_center_x".equals(A0s)) {
                    obj.A04 = (float) c16l.A0U();
                } else if ("normalized_center_y".equals(A0s)) {
                    obj.A05 = (float) c16l.A0U();
                } else if ("gravity".equals(A0s)) {
                    obj.A06 = c16l.A1D();
                } else if ("gravity_offset_x".equals(A0s)) {
                    obj.A02 = (float) c16l.A0U();
                } else if ("gravity_offset_y".equals(A0s)) {
                    obj.A03 = (float) c16l.A0U();
                } else if ("rect".equals(A0s)) {
                    obj.A07 = Rect.unflattenFromString(c16l.A1Q());
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

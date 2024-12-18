package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* renamed from: X.6Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC135596Bk {
    public static int A00(C6FG c6fg, C102884kP c102884kP) {
        C102884kP A08 = c102884kP.A08(38);
        if (A08 != null) {
            return C6BK.A00(c6fg, A08, 0);
        }
        try {
            String A0L = c102884kP.A0L(36);
            if (A0L == null) {
                return -16777216;
            }
            return C6BE.A03(A0L);
        } catch (C41M e) {
            AbstractC25241Le.A00(c6fg, "ColorDrawableUtils", "Error parsing border color in BoxDecoration", e);
            return 0;
        }
    }

    public static C135606Bl A01(C6FG c6fg, C102884kP c102884kP, int i) {
        float f;
        int A00;
        int A002;
        float f2;
        float[] A02;
        float f3;
        C135606Bl c135606Bl = new C135606Bl();
        if (c102884kP == null) {
            f = 0.0f;
            A00 = 0;
            A002 = 0;
            f2 = 0.0f;
            A02 = null;
            f3 = 0.0f;
        } else {
            String A0L = c102884kP.A0L(46);
            f = 0.0f;
            if (A0L != null) {
                f = C6BE.A01(A0L);
            }
            A00 = AbstractC135616Bm.A00(c102884kP.A0O(56), 0);
            A002 = A00(c6fg, c102884kP);
            String A0L2 = c102884kP.A0L(40);
            f2 = 0.0f;
            if (A0L2 != null) {
                f2 = C6BE.A01(A0L2);
            }
            A02 = A02(c102884kP.A0O(62));
            String A0L3 = c102884kP.A0L(63);
            f3 = 0.0f;
            if (A0L3 != null) {
                f3 = C6BE.A01(A0L3);
            }
        }
        c135606Bl.A05.setColor(i);
        Paint paint = c135606Bl.A04;
        paint.setColor(A002);
        paint.setStrokeWidth(f2);
        if (f2 > 0.0f && A02 != null) {
            paint.setPathEffect(new DashPathEffect(A02, f3));
        }
        c135606Bl.A02 = f;
        c135606Bl.A03 = A00;
        float f4 = f2 / 2.0f;
        c135606Bl.A00 = f4;
        c135606Bl.A01 = f - f4;
        return c135606Bl;
    }

    public static float[] A02(List list) {
        if (list != null && list.size() != 0) {
            float[] fArr = new float[list.size()];
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                float f = 0.0f;
                if (str != null) {
                    f = C6BE.A01(str);
                }
                fArr[i] = f;
            }
            return fArr;
        }
        return null;
    }
}

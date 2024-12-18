package X;

import android.graphics.RectF;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OPE {
    public static final RectF A00(String str) {
        if (str != null) {
            List A0Q = AbstractC001900j.A0Q(str, new char[]{','}, 0);
            if (A0Q.size() < 4) {
                return AbstractC166987dD.A0X();
            }
            return new RectF(Float.parseFloat(AbstractC25226BEj.A1I(A0Q, 0)), Float.parseFloat(AbstractC25226BEj.A1I(A0Q, 1)), Float.parseFloat(AbstractC25226BEj.A1I(A0Q, 2)), Float.parseFloat(AbstractC25226BEj.A1I(A0Q, 3)));
        }
        return null;
    }

    public static final String A01(RectF rectF) {
        if (rectF != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(rectF.left);
            A1C.append(',');
            A1C.append(rectF.top);
            A1C.append(',');
            A1C.append(rectF.right);
            A1C.append(',');
            A1C.append(rectF.bottom);
            return A1C.toString();
        }
        return null;
    }
}

package X;

import android.graphics.RectF;
import java.util.List;

/* renamed from: X.MVm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50601MVm {
    public static final RectF A00(String str) {
        Float f;
        Float f2;
        Float f3;
        if (str == null) {
            return null;
        }
        List A0Q = AbstractC001900j.A0Q(str, new char[]{','}, 0);
        if (A0Q.size() >= 4) {
            String A14 = MSW.A14(A0Q, 0);
            if (A14 != null) {
                f = AnonymousClass010.A0n(A14);
            } else {
                f = null;
            }
            String A142 = MSW.A14(A0Q, 1);
            if (A142 != null) {
                f2 = AnonymousClass010.A0n(A142);
            } else {
                f2 = null;
            }
            String A143 = MSW.A14(A0Q, 2);
            if (A143 != null) {
                f3 = AnonymousClass010.A0n(A143);
            } else {
                f3 = null;
            }
            String A144 = MSW.A14(A0Q, 3);
            Float A0n = A144 != null ? AnonymousClass010.A0n(A144) : null;
            if (f != null && f2 != null && f3 != null && A0n != null) {
                return new RectF(f.floatValue(), f2.floatValue(), f3.floatValue(), A0n.floatValue());
            }
        }
        return AbstractC166987dD.A0X();
    }

    public static final List A01(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("")) {
            return C16930sl.A00;
        }
        return AbstractC167007dF.A0m(str, "␞", 0);
    }
}

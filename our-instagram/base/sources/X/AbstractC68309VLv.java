package X;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.VLv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68309VLv {
    public static final Number A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        View A05 = A0O.A05(c6fq.A03);
        float height = A05 != null ? A05.getHeight() : 0;
        if (str == null || !str.equalsIgnoreCase("px")) {
            if (str != null && str.equalsIgnoreCase("dp")) {
                DisplayMetrics A0K = AbstractC167007dF.A0K(C1LZ.A00().A00);
                C14360o3.A07(A0K);
                height /= A0K.density;
            } else {
                AbstractC25241Le.A02("bk.action.component.GetHeight2", AnonymousClass001.A0R("Unrecognised unit string ", str));
                return null;
            }
        }
        return C6DZ.A00(height);
    }
}

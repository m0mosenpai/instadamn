package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VQB {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        HashMap A0H = C6BQ.A0H((Map) A02);
        int A0D = AbstractC25230BEn.A0D(c6fw.A00(), "null cannot be cast to non-null type kotlin.Number");
        if (U5E.A0C(A0O)) {
            str = U5E.A07(A0O);
        } else {
            str = null;
        }
        Context context = C1LZ.A00().A00;
        if (str != null) {
            AbstractC191798eb.A04(context, new C191778eZ(C6BQ.A0B(c6fq)), str, A0H, A0D);
        }
        return null;
    }
}

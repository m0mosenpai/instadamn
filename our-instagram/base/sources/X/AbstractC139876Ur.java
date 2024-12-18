package X;

import com.facebook.R;
import java.util.Map;

/* renamed from: X.6Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139876Ur {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C138746Qe c138746Qe;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Map map = (Map) c6fw.A00.get(2);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null && (c138746Qe = (C138746Qe) c6fg.A01.get(R.id.showreel_logger)) != null) {
            C14360o3.A0B(str, 0);
            C138746Qe.A01(c138746Qe, str);
            c138746Qe.A07.execute(new RunnableC139886Us(c138746Qe, str, map, c138746Qe.A04.currentMonotonicTimestampNanos()));
        }
        return null;
    }
}

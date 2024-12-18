package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.A1h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22737A1h {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.A7a, java.lang.Object] */
    public static C22880A7a parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (TraceFieldType.StartTime.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("end_time".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (num != null) {
                obj.A01 = num.intValue();
            }
            if (num2 != null) {
                obj.A00 = num2.intValue();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

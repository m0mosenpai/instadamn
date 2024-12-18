package X;

import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4J {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.model.shopping.sizechart.SizeChartMeasurement, java.lang.Object] */
    public static SizeChartMeasurement parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("dimension".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("max_size".equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("min_size".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("string_measurement".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
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

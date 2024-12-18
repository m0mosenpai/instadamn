package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F74 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FM3, java.lang.Object] */
    public static FM3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("mustache_ctas".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C9CP parseFromJson = C4G0.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("xma_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("media".equals(A0s)) {
                    obj.A00 = AbstractC31176DnK.A0Y(c16l);
                } else if ("item_type".equals(A0s) || TraceFieldType.ContentType.equals(A0s)) {
                    obj.A01 = C2EY.A0A.A00(c16l.A1P());
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

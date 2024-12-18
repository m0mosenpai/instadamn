package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I8S {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IFg] */
    public static C41037IFg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_item".equals(A0s)) {
                    obj.A01 = AbstractC111134zU.parseFromJson(c16l);
                } else if ("metadata".equals(A0s)) {
                    obj.A00 = I8U.parseFromJson(c16l);
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

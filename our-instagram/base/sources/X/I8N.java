package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I8N {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.IH6] */
    public static IH6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("products_description".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("is_published".equals(A0s)) {
                    c16l.A0d();
                } else if (AbstractC111324zv.A00(2283).equals(A0s)) {
                    obj.A00 = I8M.parseFromJson(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("merchant_name".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
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

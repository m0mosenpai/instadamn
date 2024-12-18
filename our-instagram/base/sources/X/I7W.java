package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I7W {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IIP, java.lang.Object] */
    public static IIP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("merchant".equals(A0s)) {
                    obj.A01 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("item_count".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("multi_merchant_bag_id".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("merchant_bag_id".equals(A0s)) {
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

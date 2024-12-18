package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I6S {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IFO, java.lang.Object] */
    public static IFO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("continue_shopping_row".equals(A0s)) {
                    obj.A01 = AbstractC40734I3o.parseFromJson(c16l);
                } else if ("brand_tile_hscroll".equals(A0s)) {
                    obj.A00 = AbstractC40724I3e.parseFromJson(c16l);
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

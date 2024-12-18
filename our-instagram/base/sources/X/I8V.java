package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I8V {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IIT, java.lang.Object] */
    public static IIT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37314GcG.A01(43, 8, 86).equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("pk".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("full_name".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                } else if (AbstractC58317Pt9.A00(927).equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("seller_shoppable_feed_type".equals(A0s)) {
                    AbstractC223416o.A00(AbstractC167017dG.A0m(c16l));
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

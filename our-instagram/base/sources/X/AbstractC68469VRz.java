package X;

import java.io.IOException;

/* renamed from: X.VRz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68469VRz {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Vu2, java.lang.Object] */
    public static C69707Vu2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A03 = A0m;
                } else if ("asset_compression_type".equals(A0q)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("asset_url".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A02 = A0m2;
                } else if (AbstractC58317Pt9.A00(101).equals(A0q)) {
                    obj.A00 = c16l.A0y();
                } else if ("md5_hash".equals(A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("cache_key".equals(A0q)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

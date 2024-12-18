package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I19 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.IIx] */
    public static C41132IIx parseFromJson(C16L c16l) {
        String A1P;
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
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A03 = A1P;
                } else if ("owner".equals(A0q)) {
                    obj.A02 = I1A.parseFromJson(c16l);
                } else if (MSV.A00(106).equals(A0q)) {
                    obj.A04 = c16l.A0d();
                } else if (AbstractC111324zv.A00(1366).equals(A0q)) {
                    c16l.A1D();
                } else if ("edge_media_preview_like".equals(A0q)) {
                    obj.A01 = I16.parseFromJson(c16l);
                } else if ("edge_media_preview_comment".equals(A0q)) {
                    obj.A00 = I16.parseFromJson(c16l);
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

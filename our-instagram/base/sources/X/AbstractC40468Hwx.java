package X;

import java.io.IOException;

/* renamed from: X.Hwx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40468Hwx {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.IBd] */
    public static IBd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item".equals(A0s)) {
                    obj.A00 = C3XG.A00(c16l);
                } else if (AbstractC43591JPw.A00(476).equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("max_push_down".equals(A0s) || "action_type".equals(A0s)) {
                    c16l.A1D();
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

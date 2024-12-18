package X;

import java.io.IOException;

/* renamed from: X.Etx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33647Etx {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.FK7, java.lang.Object] */
    public static FK7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(1088).equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("one_tap_nonce".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("user_info".equals(A0s)) {
                    obj.A00 = AbstractC33648Ety.parseFromJson(c16l);
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

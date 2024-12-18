package X;

import java.io.IOException;

/* renamed from: X.HzI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40598HzI {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IES] */
    public static IES parseFromJson(C16L c16l) {
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
                    C38321qM A00 = C38321qM.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    obj.A00 = A00;
                } else if ("client_gap_rules".equals(A0s)) {
                    obj.A01 = AbstractC38761r8.parseFromJson(c16l);
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

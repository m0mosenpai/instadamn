package X;

import java.io.IOException;

/* renamed from: X.I0p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40657I0p {
    public static C41008IEd parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C41008IEd c41008IEd = new C41008IEd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1E(A0s)) {
                    String A1Q = c16l.A1Q();
                    if (C14360o3.A0K(A1Q, "simple_action")) {
                        num = C05F.A00;
                    } else if (C14360o3.A0K(A1Q, "thank_you")) {
                        num = C05F.A01;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                    C14360o3.A0B(num, 0);
                    c41008IEd.A01 = num;
                } else if ("simple_action".equals(A0s)) {
                    C38611qr parseFromJson = IRW.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c41008IEd.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return c41008IEd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

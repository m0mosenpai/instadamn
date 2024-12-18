package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I60 {
    public static HYX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HYX hyx = new HYX();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("place".equals(A0s)) {
                    C69794Vvd parseFromJson = AbstractC69968Vyj.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    hyx.A00 = parseFromJson;
                } else {
                    AbstractC37930GmS.A01(c16l, hyx, A0s);
                }
                c16l.A0z();
            }
            return hyx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

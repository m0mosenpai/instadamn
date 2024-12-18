package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUZ {
    public static ViC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ViC viC = new ViC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body".equals(A0s)) {
                    viC.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("header".equals(A0s)) {
                    viC.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("photo".equals(A0s)) {
                    viC.A00 = VUY.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return viC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

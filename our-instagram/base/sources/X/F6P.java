package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6P {
    public static C33121ha parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33121ha c33121ha = new C33121ha();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    c33121ha.A00 = AbstractC83623o5.parseFromJson(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c33121ha, A0q);
                }
                c16l.A0z();
            }
            return c33121ha;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

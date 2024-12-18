package X;

import java.io.IOException;

/* renamed from: X.F5j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34159F5j {
    public static C32291gF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32291gF c32291gF = new C32291gF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c32291gF.A00 = AbstractC31172DnG.A0o(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c32291gF, A0q);
                }
                c16l.A0z();
            }
            return c32291gF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

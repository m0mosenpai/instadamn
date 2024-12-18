package X;

import java.io.IOException;

/* renamed from: X.HsP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40200HsP {
    public static C38688GzT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51756Mtf c51756Mtf = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C51756Mtf c51756Mtf2 = null;
            C51756Mtf c51756Mtf3 = null;
            C51756Mtf c51756Mtf4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(1998).equals(A0s)) {
                    c51756Mtf = AbstractC40199HsO.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1999).equals(A0s)) {
                    c51756Mtf2 = AbstractC40199HsO.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3246).equals(A0s)) {
                    c51756Mtf3 = AbstractC40199HsO.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3247).equals(A0s)) {
                    c51756Mtf4 = AbstractC40199HsO.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38688GzT(3, c51756Mtf, c51756Mtf3, c51756Mtf4, c51756Mtf2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

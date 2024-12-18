package X;

import java.io.IOException;

/* renamed from: X.Hw9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40418Hw9 {
    public static C38805H6u parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(1280);
                if (A1J == c16r) {
                    break;
                }
                if (AbstractC31177DnL.A1V(c16l, A00)) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "ThreadHeaderContextRepostInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C38805H6u(c38321qM);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

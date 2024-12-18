package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4F {
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.Esy] */
    public static C33586Esy parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            C106414qv c106414qv = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1337);
                if (A1J == c16r) {
                    break;
                }
                if (AbstractC31177DnL.A1V(c16l, A00)) {
                    c106414qv = AbstractC106404qu.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c106414qv == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "DirectThreadImageInfo");
                throw C00O.createAndThrow();
            }
            C14360o3.A0B(c106414qv, 1);
            ?? obj = new Object();
            obj.A00 = c106414qv;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

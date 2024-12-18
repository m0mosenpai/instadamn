package X;

import java.io.IOException;

/* renamed from: X.Etu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33644Etu {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.Et9] */
    public static C33597Et9 parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            C34389FEf c34389FEf = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            EfU efU = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(5305);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    c34389FEf = AbstractC33646Etw.parseFromJson(c16l);
                } else if ("login_response".equals(A0s)) {
                    efU = C35072Fcj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c34389FEf == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "LoggedInChildAccountInfo");
            } else if (efU == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("login_response", c16l, "LoggedInChildAccountInfo");
            } else {
                ?? obj = new Object();
                obj.A00 = c34389FEf;
                obj.A01 = efU;
                return obj;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

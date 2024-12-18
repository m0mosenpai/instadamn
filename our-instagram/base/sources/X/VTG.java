package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTG {
    public static C66642URg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C38321qM c38321qM = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(836).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(837).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1051).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1052).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1067).equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1087).equals(A0s)) {
                    c38321qM = C38321qM.A0h.A0B(c16l, true);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, AbstractC111324zv.A00(1150));
                }
                c16l.A0z();
            }
            return new C66642URg(c38321qM, bool, bool2, bool3, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

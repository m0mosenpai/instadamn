package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VPG {
    public static C4d9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(781).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(782).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(783).equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(784).equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(971).equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1058).equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1059).equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1163).equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1164).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1165).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C4d9(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

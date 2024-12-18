package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F98 {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.EtP, java.lang.Object] */
    public static C33613EtP parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1265);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_pending_review".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (A00.equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("confirmation_dialog_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("disclaimer_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_pending_review", c16l, "UserForEditing.ProfileEditParam");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("confirmation_dialog_text", c16l, "UserForEditing.ProfileEditParam");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("disclaimer_text", c16l, "UserForEditing.ProfileEditParam");
                } else {
                    boolean booleanValue = bool.booleanValue();
                    boolean booleanValue2 = bool2.booleanValue();
                    ?? obj = new Object();
                    obj.A02 = booleanValue;
                    obj.A03 = booleanValue2;
                    obj.A00 = str;
                    obj.A01 = str2;
                    return obj;
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "UserForEditing.ProfileEditParam");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

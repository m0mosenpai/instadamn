package X;

import java.io.IOException;

/* renamed from: X.1rQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38911rQ {
    public static C38921rR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("should_have_inform_treatment".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("should_have_inform_treatment", "CommentInformTreatmentImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("text", "CommentInformTreatmentImpl");
            } else {
                return new C38921rR(num, str, str2, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import java.io.IOException;

/* renamed from: X.9yX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226149yX {
    public static QJ0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            QJ0 qj0 = new QJ0(4);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("prompt".equals(A0s)) {
                    qj0.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("background_color".equals(A0s)) {
                    qj0.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("original_question_id".equals(A0s)) {
                    qj0.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(508).equals(A0s)) {
                    qj0.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("question_responder_id".equals(A0s)) {
                    qj0.A03 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return qj0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

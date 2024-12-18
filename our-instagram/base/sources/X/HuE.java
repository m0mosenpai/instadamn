package X;

import com.instagram.reels.question.model.QuestionResponsesModel;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class HuE {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.H8r, X.1um, X.1ul] */
    public static C38843H8r parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("responder_info".equals(A0s)) {
                    c40791um.A01 = I5O.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            QuestionResponsesModel questionResponsesModel = c40791um.A01;
            C14360o3.A0A(questionResponsesModel);
            c40791um.A00 = new C38592Gxv(questionResponsesModel);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

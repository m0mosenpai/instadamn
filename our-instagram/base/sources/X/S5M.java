package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class S5M {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.SCf] */
    public static C62452SCf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("live_question_submission_status_event".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = S5L.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

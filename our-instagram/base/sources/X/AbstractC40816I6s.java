package X;

import java.io.IOException;

/* renamed from: X.I6s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40816I6s {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IGu] */
    public static C41077IGu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("permission".equals(A0s)) {
                    obj.A00 = I3Y.parseFromJson(c16l);
                } else if ("megaphone_content".equals(A0s)) {
                    obj.A02 = AbstractC40815I6r.parseFromJson(c16l);
                } else if ("age_prompt_content".equals(A0s)) {
                    obj.A01 = AbstractC40814I6q.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

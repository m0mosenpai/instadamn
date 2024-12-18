package X;

import java.io.IOException;

/* renamed from: X.KpC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46931KpC {
    public static C30671dW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30671dW c30671dW = new C30671dW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_type".equals(A0s)) {
                    c30671dW.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("media_id".equals(A0s)) {
                    c30671dW.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("response_id".equals(A0s)) {
                    c30671dW.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("thread_key".equals(A0s)) {
                    c30671dW.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("text_response".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c30671dW.A05 = A0m;
                } else if ("replied_to_message".equals(A0s)) {
                    c30671dW.A00 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30671dW, A0s);
                }
                c16l.A0z();
            }
            return c30671dW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

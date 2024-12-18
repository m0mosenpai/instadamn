package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5T {
    public static C33941iu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33941iu c33941iu = new C33941iu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("optimistic_admin_text".equals(A0s)) {
                    c33941iu.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("send_prompt_message_mutation".equals(A0s)) {
                    c33941iu.A01 = FV4.parseFromJson(c16l);
                } else if ("prompt_text".equals(A0s)) {
                    c33941iu.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("button_text".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c33941iu.A02 = A0m;
                } else if ("contribution_count".equals(A0s)) {
                    c33941iu.A00 = c16l.A1D();
                } else {
                    FV3.A01(c16l, c33941iu, A0s);
                }
                c16l.A0z();
            }
            return c33941iu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

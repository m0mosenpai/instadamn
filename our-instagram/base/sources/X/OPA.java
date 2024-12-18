package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OPA {
    public static NAM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            NAM nam = new NAM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("structured_survey_submit_responses".equals(AbstractC166997dE.A0s(c16l))) {
                    nam.A00 = AbstractC54024Nua.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return nam;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OP9 {
    public static NAL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            NAL nal = new NAL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("structured_survey_event_logging".equals(AbstractC166997dE.A0s(c16l))) {
                    nal.A00 = AbstractC54022NuY.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return nal;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

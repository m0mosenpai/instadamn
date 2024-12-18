package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV6 {
    public static C69010Vfm parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C69010Vfm c69010Vfm = new C69010Vfm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("param_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c69010Vfm.A01 = A1P;
                } else if ("survey_param_type".equals(A0s)) {
                    c69010Vfm.A00 = (VF1) EnumHelper.A00(c16l.A1Q(), VF1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                c16l.A0z();
            }
            return c69010Vfm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;

/* renamed from: X.NuH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54005NuH {
    public static C54534O7m parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C54534O7m c54534O7m = new C54534O7m();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("signal_rank".equals(A0s)) {
                    c54534O7m.A00 = c16l.A1D();
                } else if ("signal_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c54534O7m.A01 = A1P;
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    EnumHelper.A00(c16l.A1Q(), EnumC53283NhL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                c16l.A0z();
            }
            return c54534O7m;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

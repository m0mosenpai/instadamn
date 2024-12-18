package X;

import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import java.io.IOException;

/* renamed from: X.I3y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40744I3y {
    public static ProductLaunchInformationImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(903).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("has_launched".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1046).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else {
                    l = AbstractC37303Gc4.A0O(c16l, l, A0s, "launch_date");
                }
                c16l.A0z();
            }
            return new ProductLaunchInformationImpl(bool, bool2, l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

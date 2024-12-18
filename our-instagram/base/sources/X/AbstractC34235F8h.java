package X;

import com.facebook.location.platform.api.Location;
import com.instagram.login.twofac.model.TrustedDevice;
import java.io.IOException;

/* renamed from: X.F8h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34235F8h {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.instagram.login.twofac.model.TrustedDevice] */
    public static TrustedDevice parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31182DnR.A05(197, 11, 33).equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("device_name".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("device_type".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("last_login_location".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("last_login_time".equals(A0s)) {
                    obj.A02 = c16l.A0y();
                } else if (Location.LATITUDE.equals(A0s)) {
                    obj.A00 = c16l.A0U();
                } else if ("longitude".equals(A0s)) {
                    obj.A01 = c16l.A0U();
                } else if ("is_current".equals(A0s)) {
                    obj.A09 = c16l.A0d();
                } else if (AbstractC111324zv.A00(3314).equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
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

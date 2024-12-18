package X;

import com.instagram.discovery.mediamap.model.LocationPageInformation;
import java.io.IOException;

/* renamed from: X.VSx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68492VSx {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.VIz] */
    public static VIz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            LocationPageInformation locationPageInformation = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("page_info".equals(AbstractC166997dE.A0s(c16l))) {
                    locationPageInformation = AbstractC68493VSy.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = locationPageInformation;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

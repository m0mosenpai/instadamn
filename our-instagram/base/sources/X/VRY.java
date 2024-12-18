package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VRY {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static AudienceGeoLocation parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("key".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("display_name".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("location_type".equals(A0s)) {
                    AdGeoLocationType adGeoLocationType = (AdGeoLocationType) AdGeoLocationType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (adGeoLocationType == null) {
                        adGeoLocationType = AdGeoLocationType.A0K;
                    }
                    obj.A03 = adGeoLocationType;
                } else if (Location.LATITUDE.equals(A0s)) {
                    obj.A00 = c16l.A0U();
                } else if ("longitude".equals(A0s)) {
                    obj.A01 = c16l.A0U();
                } else if ("radius".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("country_code".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(3001).equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("primary_city_key".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

package X;

import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I9Z {
    public static AdsBizBadgeInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AdsRatingInfo adsRatingInfo = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("rating_info".equals(AbstractC166997dE.A0s(c16l))) {
                    adsRatingInfo = C5QZ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new AdsBizBadgeInfoImpl(adsRatingInfo);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

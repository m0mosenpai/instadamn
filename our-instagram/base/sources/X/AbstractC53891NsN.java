package X;

import android.app.Activity;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import java.util.HashMap;

/* renamed from: X.NsN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53891NsN {
    public static final void A00(Activity activity, UserSession userSession, AnonymousClass841 anonymousClass841) {
        Location location;
        HashMap hashMap;
        CreationSession creationSession = ((MX5) anonymousClass841).A01;
        MediaSession mediaSession = creationSession.A07;
        if (mediaSession != null) {
            location = mediaSession.BOK();
        } else {
            location = null;
        }
        LocationSignalPackage locationSignalPackage = creationSession.A08;
        if (location == null) {
            C1VW c1vw = C1VW.A00;
            if (c1vw != null) {
                C14360o3.A0A(userSession);
                location = c1vw.getLastLocation(userSession, "NearbyVenuePrefetchHelper");
                if (location == null || !AbstractC103794ly.A00(location)) {
                    return;
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        long j = -1;
        if (anonymousClass841.E3z() != null) {
            if (userSession != null) {
                C47Z A03 = C25A.A00(userSession).A03(anonymousClass841.E3z());
                if (A03 != null && (hashMap = A03.A44) != null) {
                    j = S5I.A00(AbstractC31171DnF.A0h("date_time_original", hashMap), AbstractC167007dF.A1X(A03.A1G, EnumC40111tc.A0Q));
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C14360o3.A0A(activity);
        C14360o3.A0A(userSession);
        NearbyVenuesService.A01(activity, location, userSession, locationSignalPackage, Long.valueOf(j));
    }
}

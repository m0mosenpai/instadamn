package X;

import android.location.Location;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationSignalPackageImpl;
import com.instagram.location.intf.LocationSignalPackage;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;

/* renamed from: X.On2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55617On2 implements CallerContextable {
    public static final String __redex_internal_original_name = "NearbyVenuesApi";

    public static final C1ON A00(Location location, UserSession userSession, LocationSignalPackage locationSignalPackage, String str, String str2, long j) {
        Integer num;
        String str3;
        C14360o3.A0B(userSession, 0);
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        if (locationSignalPackage != null) {
            num = C05F.A01;
        } else {
            num = C05F.A0N;
        }
        A0q.A09(num);
        A0q.A0B("location_search/");
        A0q.A0P(null, C73450YDt.class, C54874OOm.class, false);
        if (location != null) {
            A0q.A9s(com.facebook.location.platform.api.Location.LATITUDE, String.valueOf(location.getLatitude()));
            str3 = String.valueOf(location.getLongitude());
        } else {
            str3 = "0.000000";
            A0q.A9s(com.facebook.location.platform.api.Location.LATITUDE, "0.000000");
        }
        A0q.A9s("longitude", str3);
        if (j > 0) {
            A0q.A9s("timestamp", String.valueOf(j));
        }
        if (str != null) {
            A0q.A9s("search_query", str);
        }
        if (str2 != null && str2.length() != 0) {
            A0q.A9s("rankToken", str2);
        }
        if (locationSignalPackage != null) {
            C127685ps A01 = C127625pm.A01(null, null, null, null, null, Collections.singletonList(((LocationSignalPackageImpl) locationSignalPackage).A00), null);
            C127645po c127645po = A01.A02;
            C127635pn c127635pn = A01.A04;
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A0S = AbstractC167007dF.A0S(A0O);
                if (c127635pn != null) {
                    A0S.A0r("wifi_info");
                    AbstractC127705pu.A00(c127635pn, A0S);
                }
                if (c127645po != null) {
                    A0S.A0r(AbstractC111324zv.A00(4020));
                    AbstractC127715pv.A00(c127645po, A0S);
                }
                A0q.A9s("signal_package", AbstractC167017dG.A0l(A0S, A0O));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return A0q.A0N();
    }
}

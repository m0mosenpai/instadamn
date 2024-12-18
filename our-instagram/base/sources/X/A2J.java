package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class A2J {
    public static final C1ON A00(UserSession userSession, String str, String str2) {
        Location location;
        boolean A1a = AbstractC167017dG.A1a(userSession, str);
        String str3 = null;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        C1VW c1vw = C1VW.A00;
        String str4 = null;
        if (c1vw != null) {
            location = c1vw.getLastLocation(userSession, 10800000L, 50000.0f, A1a, "HashtagSearchApi");
        } else {
            location = null;
        }
        c25621Ms.A06();
        c25621Ms.A0B(AbstractC111324zv.A00(3203));
        c25621Ms.A9s("q", str);
        c25621Ms.A9s("count", String.valueOf(50));
        if (location != null) {
            str3 = Double.valueOf(location.getLatitude()).toString();
        }
        c25621Ms.A9s("lat", str3);
        if (location != null) {
            str4 = Double.valueOf(location.getLongitude()).toString();
        }
        c25621Ms.A9s("lng", str4);
        c25621Ms.A9s(MSV.A00(62), str2);
        c25621Ms.A0H("timezone_offset", String.valueOf(C23831Eq.A00()));
        c25621Ms.A0R(C32212EDl.class, FXN.class);
        return c25621Ms.A0N();
    }
}

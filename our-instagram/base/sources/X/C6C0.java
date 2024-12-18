package X;

import android.location.Location;
import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.6C0, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6C0 {
    public static final void A01(C1P1 c1p1, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A06();
        c25621Ms.A0L("creatives/unlock_sticker/%s/", str);
        c25621Ms.A0R(C214359eZ.class, C23033ADp.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }

    public static final Pair A00(UserSession userSession) {
        Location lastLocation;
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        if (interfaceC19630xq.getString("torch_relay_prefecture", null) != null) {
            float f = interfaceC19630xq.getFloat("torch_relay_lat", 0.0f);
            float f2 = interfaceC19630xq.getFloat("torch_relay_lng", 0.0f);
            if (f != 0.0f && f2 != 0.0f) {
                return new Pair(Float.valueOf(f), Float.valueOf(f2));
            }
        }
        C1VW c1vw = C1VW.A00;
        if (c1vw == null || (lastLocation = c1vw.getLastLocation(userSession, "UnlockableStickersUtil")) == null) {
            return null;
        }
        return new Pair(Float.valueOf((float) lastLocation.getLatitude()), Float.valueOf((float) lastLocation.getLongitude()));
    }
}

package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6VS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VS {
    public static final C1341564a A00(UserSession userSession, String str) {
        if (str.equals("sn_integration_reels")) {
            int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36592245190689145L);
            C41051vD c41051vD = C41051vD.A01;
            c41051vD.A00 = userSession;
            return new C1341564a(c41051vD, A01, false);
        }
        if (str.equals("sn_integration_feed")) {
            int A012 = (int) C18U.A01(C06090Tz.A05, userSession, 36594697615116094L);
            C41051vD c41051vD2 = C41051vD.A01;
            c41051vD2.A00 = userSession;
            return new C1341564a(c41051vD2, A012, true);
        }
        C41051vD c41051vD3 = C41051vD.A01;
        c41051vD3.A00 = userSession;
        return new C1341564a(c41051vD3, 0, false);
    }

    public final C6VU A01(C1341564a c1341564a, UserSession userSession, String str) {
        C6VU c6vu;
        C6VR c6vr = (C6VR) userSession.A01(C6VR.class, C6VT.A00);
        synchronized (C6VR.class) {
            Map map = c6vr.A00;
            c6vu = (C6VU) map.get(str);
            if (c6vu == null) {
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                c6vu = new C6VU(c006802i, c1341564a.A01(), c1341564a, userSession, str);
                map.put(str, c6vu);
            }
        }
        return c6vu;
    }
}

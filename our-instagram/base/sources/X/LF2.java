package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LF2 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final UserSession A09;
    public final C6CF A0A;
    public final C44101JeQ A0B;

    public LF2(UserSession userSession) {
        int i;
        C14360o3.A0B(userSession, 1);
        this.A09 = userSession;
        C6CF A00 = C6CE.A00(userSession);
        this.A0A = A00;
        C44101JeQ A002 = AbstractC46792Kmn.A00(userSession);
        this.A0B = A002;
        UserSession userSession2 = A00.A00;
        String A01 = C6CB.A01(userSession2, 36878878427840735L);
        A01 = AbstractC001900j.A0T(A01) ? "-7,-3" : A01;
        String A012 = C6CB.A01(userSession2, 36878878427709661L);
        A012 = AbstractC001900j.A0T(A012) ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : A012;
        String A013 = C6CB.A01(userSession2, 36878878427447513L);
        A013 = AbstractC001900j.A0T(A013) ? "6" : A013;
        String A014 = C6CB.A01(userSession2, 36878878427775198L);
        A014 = AbstractC001900j.A0T(A014) ? "8" : A014;
        String A015 = C6CB.A01(userSession2, 36878878427513050L);
        A015 = AbstractC001900j.A0T(A015) ? "1,2,3,4,5,6,7,10,14,20,30,40,60" : A015;
        UserSession userSession3 = A002.A01;
        C06090Tz c06090Tz = A002.A00;
        String A04 = C18U.A04(c06090Tz, userSession3, 36889332371751764L);
        A04 = AbstractC001900j.A0T(A04) ? "2" : A04;
        String A042 = C18U.A04(c06090Tz, userSession3, 36889332371817301L);
        A042 = AbstractC001900j.A0T(A042) ? "7" : A042;
        this.A03 = A00(A01);
        this.A07 = A00(A012);
        this.A08 = A00(A013);
        Integer A0i = AbstractC003100w.A0i(AbstractC25228BEl.A1A(A014));
        if (A0i != null) {
            i = A0i.intValue();
        } else {
            i = 8;
        }
        this.A00 = i;
        this.A01 = C6CB.A00(userSession2, 36597403453229883L);
        this.A02 = C6CB.A00(userSession2, 36597403453295420L);
        this.A06 = A00(A015);
        this.A05 = A00(A04);
        this.A04 = A00(A042);
    }

    public static final List A00(String str) {
        List A0m = AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            Integer A0i = AbstractC003100w.A0i(AbstractC25228BEl.A1A(AbstractC166987dD.A1B(it)));
            if (A0i != null) {
                A1E.add(A0i);
            }
        }
        return A1E;
    }
}

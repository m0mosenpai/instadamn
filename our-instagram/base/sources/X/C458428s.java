package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.28s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C458428s implements InterfaceC456127v {
    public List A00;
    public final EnumC456327x A01;
    public final UserSession A02;

    public C458428s(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        EnumC456327x enumC456327x = EnumC456327x.A04;
        this.A01 = enumC456327x;
        AnonymousClass280.A01.A05(userSession, enumC456327x);
        this.A00 = C16930sl.A00;
    }

    @Override // X.InterfaceC456127v
    public final List BOx() {
        return this.A00;
    }

    @Override // X.InterfaceC456127v
    public final EnumC456327x CBj() {
        return this.A01;
    }

    @Override // X.InterfaceC456127v
    public final Map CNY() {
        UserSession userSession = this.A02;
        Object A0J = AbstractC001800i.A0J(AbstractC001900j.A0R(C18U.A04(C06090Tz.A06, userSession, 36888168435352361L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
        if (A0J == null) {
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return c16920sk;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("interval", A0J);
        C458428s c458428s = new C458428s(userSession);
        C16920sk c16920sk2 = C16920sk.A00;
        C14360o3.A0C(c16920sk2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C9BN Cst = c458428s.Cst(c16920sk2);
        if (Cst == null) {
            return linkedHashMap;
        }
        linkedHashMap.put("next_instance", String.valueOf(Cst.A01 - (System.currentTimeMillis() / 1000)));
        return linkedHashMap;
    }

    @Override // X.InterfaceC456127v
    public final C9BN Cst(Map map) {
        UserSession userSession = this.A02;
        Long A00 = AbstractC459829i.A00(userSession);
        if (A00 != null) {
            long longValue = A00.longValue();
            long A02 = C461529z.A02(userSession);
            Long A0k = AbstractC003100w.A0k(10, C18U.A04(C06090Tz.A06, userSession, 36888168435352361L));
            if (A0k != null) {
                long longValue2 = A0k.longValue();
                long j = longValue - longValue2;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long A01 = C123815iv.A01();
                if (A02 != j) {
                    if (A02 < j) {
                        currentTimeMillis += j - A02;
                    } else {
                        currentTimeMillis = 0;
                    }
                }
                if (longValue2 + currentTimeMillis >= A01) {
                    currentTimeMillis = A01 + j;
                }
                return new C9BN(currentTimeMillis, null, 3);
            }
        }
        return null;
    }

    @Override // X.InterfaceC456127v
    public final Long BLw() {
        throw C00O.createAndThrow();
    }
}

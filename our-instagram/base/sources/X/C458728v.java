package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.28v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C458728v implements InterfaceC456127v {
    public List A00;
    public final EnumC456327x A01;
    public final UserSession A02;

    public C458728v(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        EnumC456327x enumC456327x = EnumC456327x.A07;
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
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A02;
        if (!c08730cb.A01(userSession).A1W()) {
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return c16920sk;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C06090Tz c06090Tz = C06090Tz.A05;
        linkedHashMap.put("start_interval", String.valueOf(C18U.A01(c06090Tz, userSession, 36597454985235283L)));
        linkedHashMap.put("end_interval", String.valueOf(C18U.A01(c06090Tz, userSession, 36597454985431893L)));
        C458728v c458728v = new C458728v(userSession);
        C16920sk c16920sk2 = C16920sk.A00;
        C14360o3.A0C(c16920sk2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C9BN Cst = c458728v.Cst(c16920sk2);
        if (Cst == null) {
            return linkedHashMap;
        }
        String valueOf = String.valueOf(Cst.A01 - (System.currentTimeMillis() / 1000));
        if (valueOf == null) {
            valueOf = "no_next_instance";
        }
        linkedHashMap.put("next_instance", valueOf);
        return linkedHashMap;
    }

    @Override // X.InterfaceC456127v
    public final C9BN Cst(Map map) {
        Long l;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A02;
        if (c08730cb.A01(userSession).A1W()) {
            C71603Jf c71603Jf = new C71603Jf(userSession);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (!c71603Jf.A07(currentTimeMillis)) {
                C106834rk A02 = c71603Jf.A02();
                long A03 = AbstractC206099Aq.A03(userSession, currentTimeMillis);
                if (A02 == null || (l = A02.A01) == null || l.longValue() != A03) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36315980008591208L)) {
                        long A01 = C18U.A01(c06090Tz, userSession, 36597454985235283L);
                        if (currentTimeMillis >= AnonymousClass280.A01.A05(userSession, EnumC456327x.A07) + A01) {
                            return new C9BN(A03 - A01, Long.valueOf(A03 - C18U.A01(c06090Tz, userSession, 36597454985431893L)), 3);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC456127v
    public final Long BLw() {
        throw C00O.createAndThrow();
    }
}

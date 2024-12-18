package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.28o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C458028o extends AbstractC455927t {
    public final EnumC456327x A00;
    public final UserSession A01;
    public final Long A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458028o(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        EnumC456327x enumC456327x = EnumC456327x.A08;
        this.A00 = enumC456327x;
        this.A02 = Long.valueOf(AnonymousClass280.A01.A05(userSession, enumC456327x));
    }

    @Override // X.AbstractC455927t
    public final C9C2 A00(Map map) {
        Integer num;
        Long l;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        if (!c08730cb.A01(userSession).A1W()) {
            linkedHashMap.put("qm_enabled", "false");
            num = C05F.A00;
        } else {
            C71603Jf c71603Jf = new C71603Jf(userSession);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            linkedHashMap.put("qm_current_time_in_secs", String.valueOf(currentTimeMillis));
            boolean A07 = c71603Jf.A07(currentTimeMillis);
            linkedHashMap.put("qm_active", String.valueOf(A07));
            if (A07) {
                num = C05F.A01;
            } else {
                C106834rk A02 = c71603Jf.A02();
                long A03 = AbstractC206099Aq.A03(userSession, currentTimeMillis);
                linkedHashMap.put("qm_next_pause_window", String.valueOf(A02));
                linkedHashMap.put("qm_next_start_time", String.valueOf(A03));
                if (A02 != null && (l = A02.A01) != null && l.longValue() == A03) {
                    num = C05F.A0C;
                } else {
                    boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315980008787817L);
                    linkedHashMap.put("qm_bedtime_reminders_enabled", String.valueOf(A06));
                    if (!A06) {
                        num = C05F.A0N;
                    } else {
                        return new C9C2(new C9BN(A03, null, 3), "schedule_qm_start_not_reached", linkedHashMap);
                    }
                }
            }
        }
        switch (num.intValue()) {
            case 0:
                str = "skip_schedule_qm_disabled";
                break;
            case 1:
                str = "skip_schedule_qm_inactive";
                break;
            case 2:
                str = "skip_schedule_qm_paused";
                break;
            default:
                str = "skip_schedule_bedtime_reminders_disabled";
                break;
        }
        return new C9C2((C9BN) null, str, linkedHashMap);
    }

    @Override // X.InterfaceC456127v
    public final Long BLw() {
        return this.A02;
    }

    @Override // X.InterfaceC456127v
    public final EnumC456327x CBj() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r1 != null) goto L19;
     */
    @Override // X.InterfaceC456127v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map CNY() {
        /*
            r7 = this;
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r3 = r7.A01
            com.instagram.user.model.User r0 = r0.A01(r3)
            boolean r0 = r0.A1W()
            if (r0 != 0) goto L17
            X.0sk r6 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r6, r0)
            return r6
        L17:
            X.3Jf r2 = new X.3Jf
            r2.<init>(r3)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            long r0 = r2.A01()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "start_time"
            r6.put(r0, r1)
            long r0 = r2.A00()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "end_time"
            r6.put(r0, r1)
            java.util.List r0 = r2.A04()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r1.next()
            r2.put(r0)
            goto L4a
        L58:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "days"
            r6.put(r0, r1)
            X.28o r2 = new X.28o
            r2.<init>(r3)
            X.0sk r1 = X.C16920sk.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C14360o3.A0C(r1, r0)
            X.9C2 r0 = r2.A00(r1)
            java.lang.Object r0 = r0.A00
            X.9BN r0 = (X.C9BN) r0
            if (r0 == 0) goto L95
            long r4 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            if (r0 == 0) goto L95
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            long r4 = r4 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            if (r0 == 0) goto L95
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L98
        L95:
            java.lang.String r1 = "no_next_instance"
        L98:
            java.lang.String r0 = "next_instance"
            r6.put(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C458028o.CNY():java.util.Map");
    }
}

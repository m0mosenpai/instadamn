package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116215Oa {
    public static final boolean A00(UserSession userSession) {
        C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36327451865266773L);
        InterfaceC19630xq interfaceC19630xq = A00.A00;
        if (!A06 ? interfaceC19630xq.getInt("session_count_for_push_permission_v0", 0) == 2 : interfaceC19630xq.getInt("session_count_for_push_permission", 0) == 1) {
            if (C18U.A06(c06090Tz, userSession, 36327451865135699L)) {
                return false;
            }
        }
        if (!C18U.A06(c06090Tz, userSession, 36320906334708721L) && !C18U.A06(c06090Tz, userSession, 2342164993585260466L)) {
            return false;
        }
        return true;
    }

    public final boolean A01(UserSession userSession, long j) {
        C18720vz c18720vz = AbstractC12960li.A00;
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        InterfaceC19630xq interfaceC19630xq = A00.A00;
        if (!interfaceC19630xq.getBoolean("preference_has_asked_push_permission_recently_in_nux", false) && interfaceC19630xq.getInt("preference_push_permission_impression_count", 0) < j && !interfaceC19630xq.getBoolean("preference_has_allowed_push_system_dialog", false)) {
            if (interfaceC19630xq.getBoolean("preference_in_push_permission_cooldown", false)) {
                InterfaceC19630xq interfaceC19630xq2 = AbstractC19730y1.A00(c18720vz).A00;
                if (interfaceC19630xq2.getBoolean("preference_in_push_permission_cooldown", false) && System.currentTimeMillis() >= interfaceC19630xq2.getLong("preference_push_permission_cooldown_start_timestamp", 0L) + TimeUnit.DAYS.toMillis(C18U.A01(C06090Tz.A05, userSession, 36601015511945311L))) {
                    return true;
                }
            } else {
                return true;
            }
        }
        A00.A03(false);
        return false;
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.54P, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54P {
    public static final boolean A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (!A01(context, userSession)) {
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            if (interfaceC19630xq.getBoolean("has_partially_imported_contacts", false)) {
                if (System.currentTimeMillis() - interfaceC19630xq.getLong("last_partial_ci_timestamp", 0L) < C18U.A01(C06090Tz.A06, userSession, 36603747111080926L) * 86400000) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final boolean A01(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (AbstractC23451Ch.A07(context, "android.permission.READ_CONTACTS") && AbstractC23021Ah.A00(userSession).A01.getBoolean("allow_contacts_sync", false)) {
            return true;
        }
        return false;
    }
}

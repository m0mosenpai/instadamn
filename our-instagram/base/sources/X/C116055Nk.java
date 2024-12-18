package X;

import android.app.usage.UsageStatsManager;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.5Nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116055Nk {
    public static InterfaceC16610sE A00;
    public static final C116055Nk A01 = new Object();

    public final List A00(UserSession userSession, long j) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36324973669003897L)) {
            return null;
        }
        InterfaceC16610sE interfaceC16610sE = A00;
        if (interfaceC16610sE == null) {
            interfaceC16610sE = C25138BAi.A00;
            try {
                Class cls = Long.TYPE;
                Method method = UsageStatsManager.class.getMethod("queryEventsForSelf", cls, cls);
                if (method != null) {
                    interfaceC16610sE = new C30519Dc2(method, 6);
                }
            } catch (Exception e) {
                C0K8.A0G("IGScreenTimeOsUsageStats", "Failed to get queryEventsForSelf method", e);
            }
            A00 = interfaceC16610sE;
        }
        return (List) interfaceC16610sE.invoke(userSession, Long.valueOf(j * 1000), Long.valueOf(System.currentTimeMillis()));
    }
}

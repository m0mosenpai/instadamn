package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.JQh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43601JQh implements C6J5 {
    public final int A00;
    public final Object A01;

    public C43601JQh(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    public static C42221xC A00(C42221xC c42221xC, InterfaceC16660sJ interfaceC16660sJ, int i) {
        return c42221xC.A0M(new C43601JQh(i, interfaceC16660sJ));
    }

    @Override // X.C6J5
    public final /* synthetic */ boolean test(Object obj) {
        switch (this.A00) {
            case 9:
                return ((AbstractC46516KiF) this.A01).A01().isInstance(obj);
            case 14:
                java.util.Set set = (java.util.Set) obj;
                C94054Kp c94054Kp = ((C45703KLg) this.A01).A00;
                UserSession userSession = c94054Kp.A03;
                if (AbstractC46874KoH.A00(userSession).A00 == null || set == null || !set.contains("presence_state_for_all_users")) {
                    return false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - c94054Kp.A00;
                C14360o3.A0B(userSession, 0);
                if (elapsedRealtime < C18U.A01(C06090Tz.A05, userSession, 36594865119365074L)) {
                    return false;
                }
                return true;
            default:
                return ((Boolean) ((InterfaceC16660sJ) this.A01).invoke(obj)).booleanValue();
        }
    }

    public C43601JQh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}

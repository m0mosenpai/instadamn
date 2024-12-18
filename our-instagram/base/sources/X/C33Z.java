package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.common.session.UserSession;

/* renamed from: X.33Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33Z {
    public final long A00;
    public final long A01;
    public final Context A02;
    public final UserSession A03;
    public final boolean A04;

    public C33Z(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = ((long) C18U.A00(c06090Tz, userSession, 37162595372237044L)) * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        this.A00 = (long) C18U.A00(c06090Tz, userSession, 37162595372302581L);
        this.A04 = C18U.A06(c06090Tz, userSession, 36318170441914363L);
    }

    public final boolean A00() {
        ActivityManager activityManager;
        if (!this.A04 || AbstractC15820qc.A0G(this.A02)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = this.A02.getSystemService("activity");
            if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            if (memoryInfo.totalMem >= this.A01 && Runtime.getRuntime().availableProcessors() >= this.A00) {
                return true;
            }
        }
        return false;
    }
}

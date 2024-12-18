package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OVG {
    public static final OVG A00 = new Object();

    public final C09530e4 A00(Context context, UserSession userSession, boolean z) {
        EnumC53141Neu enumC53141Neu;
        C06090Tz c06090Tz;
        boolean z2 = false;
        if (!context.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            enumC53141Neu = EnumC53141Neu.A03;
        } else {
            Object systemService = context.getSystemService("appops");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            if (((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0) {
                if (z) {
                    c06090Tz = C06090Tz.A06;
                } else {
                    c06090Tz = C06090Tz.A05;
                }
                if (AbstractC31177DnL.A1U(c06090Tz, userSession, 36311139579199933L)) {
                    z2 = true;
                    enumC53141Neu = null;
                } else {
                    enumC53141Neu = EnumC53141Neu.A02;
                }
            } else {
                enumC53141Neu = EnumC53141Neu.A04;
            }
        }
        return AbstractC166987dD.A1L(z2, enumC53141Neu);
    }
}

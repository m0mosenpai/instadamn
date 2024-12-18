package X;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.92L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92L {
    public static C92L A01;
    public static final long A02 = TimeUnit.DAYS.toMillis(7);
    public final InterfaceC19630xq A00;

    public static final void A00(NotificationChannel notificationChannel, C92L c92l) {
        String str;
        InterfaceC19610xo ARD = c92l.A00.ARD();
        String id = notificationChannel.getId();
        String A0R = AnonymousClass001.A0R(id, "_IS_ENABLED");
        boolean z = false;
        if (notificationChannel.getImportance() != 0) {
            z = true;
        }
        ARD.E77(A0R, z);
        ARD.E7D(AnonymousClass001.A0R(id, "_IMPORTANCE"), notificationChannel.getImportance());
        ARD.E77(AnonymousClass001.A0R(id, "_SHOULD_SHOW_LIGHT"), notificationChannel.shouldShowLights());
        ARD.E77(AnonymousClass001.A0R(id, "_SHOULD_VIBRATE"), notificationChannel.shouldVibrate());
        ARD.E7D(AnonymousClass001.A0R(id, "_LOCKSCREEN_VISIBILITY"), notificationChannel.getLockscreenVisibility());
        android.net.Uri sound = notificationChannel.getSound();
        if (sound != null) {
            str = sound.toString();
        } else {
            str = "";
        }
        C14360o3.A0A(str);
        ARD.E7K(AnonymousClass001.A0R(id, "_SOUND"), str);
        ARD.apply();
    }

    public C92L(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("NOTIFICATION_CHANNELS", 0);
        C14360o3.A07(sharedPreferences);
        this.A00 = new C17320tT(sharedPreferences, "NotificationChannelsPreferences");
    }

    public final void A01(final boolean z) {
        if (C20150ym.A07(AbstractC20100yh.A00(36316216232710298L))) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9ii
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1457560443, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC19610xo ARD = C92L.this.A00.ARD();
                    ARD.E77("NOTIFICATIONS_ARE_ENABLED", z);
                    ARD.apply();
                }
            });
            return;
        }
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77("NOTIFICATIONS_ARE_ENABLED", z);
        ARD.apply();
    }
}

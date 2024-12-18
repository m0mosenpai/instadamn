package X;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.local.LocalNotificationAlarmReceiver;

/* renamed from: X.971, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass971 implements InterfaceC13000lm {
    public InterfaceC12870lZ A00;
    public final AlarmManager A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass970 A04;

    public static final PendingIntent A00(AnonymousClass971 anonymousClass971) {
        Context context = anonymousClass971.A02;
        Intent intent = new Intent(context, (Class<?>) LocalNotificationAlarmReceiver.class);
        intent.setAction("com.instagram.android.LOCAL_NOTIFICATION_EVENT");
        intent.putExtra(AbstractC111324zv.A00(2678), AbstractC111324zv.A00(697));
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", anonymousClass971.A03.token);
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0B(intent, context.getClassLoader());
        return c04750Mt.A02(context, 0, 134217728);
    }

    public static final boolean A01(AnonymousClass971 anonymousClass971) {
        if (AbstractC23021Ah.A00(anonymousClass971.A03).A01.getInt(MSV.A00(113), 0) == 1) {
            Context context = anonymousClass971.A02;
            C14360o3.A0B(context, 0);
            Object systemService = context.getSystemService("notification");
            C14360o3.A0C(systemService, MSV.A00(15));
            NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel("ig_likes");
            if (notificationChannel != null && notificationChannel.getImportance() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public AnonymousClass971(Context context, UserSession userSession, AnonymousClass970 anonymousClass970) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = anonymousClass970;
        Object systemService = context.getSystemService("alarm");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.A01 = (AlarmManager) systemService;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        PendingIntent A00 = A00(this);
        if (A00 != null) {
            this.A01.cancel(A00);
        }
        InterfaceC12870lZ interfaceC12870lZ = this.A00;
        if (interfaceC12870lZ != null) {
            C218914p.A06(interfaceC12870lZ);
        }
    }
}

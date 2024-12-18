package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ow0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56140Ow0 implements InterfaceC13000lm {
    public final Context A00;
    public final UserSession A01;

    public static final boolean A00(Context context) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        Object systemService = context.getSystemService("notification");
        return !(systemService instanceof NotificationManager) || (notificationManager = (NotificationManager) systemService) == null || (notificationChannel = notificationManager.getNotificationChannel("ig_direct_video_chat")) == null || notificationChannel.getImportance() != 0;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC27671Vv.A00 != null) {
            ((C27661Vu) C3ER.A00()).A06.remove(this);
        }
        this.A01.A03(C56140Ow0.class);
    }

    public C56140Ow0(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}

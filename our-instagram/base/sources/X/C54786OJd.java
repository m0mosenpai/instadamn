package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.facebook.R;

/* renamed from: X.OJd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54786OJd {
    public boolean A00;
    public boolean A01;
    public final int A02 = MSW.A01();
    public final int A03;
    public final NotificationManager A04;
    public final Context A05;
    public final InterfaceC09390do A06;
    public final NotificationChannel A07;

    public C54786OJd(Context context, int i) {
        NotificationManager notificationManager;
        this.A05 = context;
        this.A03 = i;
        NotificationChannel notificationChannel = new NotificationChannel("sg_streaming_notification_channel_id", "sg_streaming_channel_name", 4);
        notificationChannel.setLockscreenVisibility(1);
        this.A07 = notificationChannel;
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager2 = null;
        if ((systemService instanceof NotificationManager) && (notificationManager = (NotificationManager) systemService) != null) {
            notificationManager.createNotificationChannel(notificationChannel);
            notificationManager2 = notificationManager;
        }
        this.A04 = notificationManager2;
        this.A06 = C57549PgN.A01(this, 38);
    }

    public final void A00(boolean z) {
        NotificationManager notificationManager;
        if (this.A00 && z && this.A01 && (notificationManager = this.A04) != null) {
            int i = this.A02;
            C50824MdH c50824MdH = new C50824MdH(this.A05, this.A03);
            C50824MdH.A00(c50824MdH);
            c50824MdH.A0B(c50824MdH.A00.getString(R.string.res_0x7f13011f_name_removed));
            notificationManager.notify(i, c50824MdH.A03());
        }
    }
}

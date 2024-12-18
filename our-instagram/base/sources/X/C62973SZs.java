package X;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: X.SZs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62973SZs {
    public boolean A00;
    public Notification.Builder A02;
    public Queue A04;
    public final Context A05;
    public final int A06;
    public final NotificationManager A07;
    public final String A08;
    public final String A09;
    public String A03 = "";
    public int A01 = 0;

    private Notification.InboxStyle A00() {
        Notification.InboxStyle summaryText = new Notification.InboxStyle().setBigContentTitle(AnonymousClass001.A0g("[", this.A08, "]")).setSummaryText(this.A09);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            summaryText.addLine((CharSequence) it.next());
        }
        return summaryText;
    }

    public final void A01(String str) {
        int i;
        int i2;
        if (!this.A00) {
            try {
                this.A07.cancel("MqttDiagnosticNotification", this.A06);
                return;
            } catch (RuntimeException unused) {
                return;
            }
        }
        synchronized (this) {
            this.A01 = 0;
            this.A03 = str;
            if ("CONNECTED".equals(str)) {
                i = R.drawable.presence_online;
                i2 = -16711936;
            } else {
                boolean equals = "CONNECTING".equals(str);
                i = R.drawable.presence_busy;
                i2 = -65536;
                if (equals) {
                    i = R.drawable.presence_away;
                    i2 = -256;
                }
            }
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean("vrshell_aui_persist", false);
            Context context = this.A05;
            Notification.Builder smallIcon = new Notification.Builder(context).setChannelId("debug_channel").setSmallIcon(i);
            C04750Mt c04750Mt = new C04750Mt();
            c04750Mt.A0D = true;
            Notification.Builder extras = smallIcon.setContentIntent(c04750Mt.A01(context, 0, 0)).setContentTitle(AnonymousClass001.A0g("[", this.A08, "]")).setContentText(str).setExtras(A0b);
            this.A02 = extras;
            extras.setColor(i2);
            this.A02.setStyle(A00());
            this.A07.notify("MqttDiagnosticNotification", this.A06, this.A02.getNotification());
        }
    }

    public final void A02(String str) {
        if (!this.A00) {
            try {
                this.A07.cancel("MqttDiagnosticNotification", this.A06);
                return;
            } catch (RuntimeException unused) {
                return;
            }
        }
        if (this.A02 != null) {
            synchronized (this) {
                Notification.Builder builder = this.A02;
                int i = this.A01 + 1;
                this.A01 = i;
                builder.setSubText(String.valueOf(i));
                String A0g = AnonymousClass001.A0g(new SimpleDateFormat("h:mm:ss a").format(new Date()), " ", str);
                Queue queue = this.A04;
                queue.add(A0g);
                if (queue.size() > 8) {
                    queue.poll();
                }
                this.A02.setContentText(this.A03);
                this.A02.setStyle(A00());
                this.A07.notify("MqttDiagnosticNotification", this.A06, this.A02.getNotification());
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:2|3)|(2:5|(12:7|8|9|10|(3:13|(2:15|16)(1:32)|11)|33|34|17|(1:19)|30|21|(2:23|(2:25|26)(1:28))(1:29)))|37|8|9|10|(1:11)|33|34|17|(0)|30|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:10:0x0024, B:11:0x003a, B:13:0x0040, B:16:0x004a), top: B:9:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62973SZs(android.content.Context r7, X.C74103Uo r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = ""
            r6.A03 = r0
            r2 = 0
            r6.A01 = r2
            r6.A08 = r9
            r6.A05 = r7
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.String r5 = "notification"
            java.lang.Object r1 = r7.getSystemService(r5)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L1f
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            r6.A07 = r1
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L51
            android.content.Context r1 = r6.A05     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L51
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L51
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L51
        L3a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L51
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L51
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> L51
            int r0 = r1.pid     // Catch: java.lang.Throwable -> L51
            if (r0 != r4) goto L3a
            java.lang.String r0 = r1.processName     // Catch: java.lang.Throwable -> L51
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r0 = 42
        L53:
            r6.A06 = r0
            java.lang.String r3 = "Started on "
            java.lang.String r0 = "M/d h:mm:ss a"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.lang.String r0 = X.AnonymousClass001.A0R(r3, r0)
            r6.A09 = r0
            java.util.LinkedList r0 = X.AbstractC58318PtA.A11()
            r6.A04 = r0
            java.lang.String r0 = "mqtt_debug"
            X.4N8 r1 = X.AbstractC58319PtB.A0V(r7, r8, r0)
            java.lang.String r0 = "is_on"
            X.4N7 r1 = (X.C4N7) r1
            boolean r1 = r1.getBoolean(r0, r2)
            if (r10 != 0) goto L86
            r0 = 0
            if (r1 == 0) goto L87
        L86:
            r0 = 1
        L87:
            r6.A00 = r0
            if (r0 == 0) goto La2
            android.content.Context r4 = r6.A05
            r3 = 2
            java.lang.String r2 = "debug_channel"
            java.lang.String r0 = "Debugging Information"
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            r1.<init>(r2, r0, r3)
            java.lang.Object r0 = r4.getSystemService(r5)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            if (r0 == 0) goto La2
            r0.createNotificationChannel(r1)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62973SZs.<init>(android.content.Context, X.3Uo, java.lang.String, boolean):void");
    }
}

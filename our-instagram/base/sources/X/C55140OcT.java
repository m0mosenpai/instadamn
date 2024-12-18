package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioManager;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.OcT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55140OcT {
    public final Context A00;
    public final long[] A01 = {0, 500, 500};
    public final long[] A02 = {0, 250, 200, 250};
    public final AudioManager A03;

    private final Notification A00(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, UserSession userSession, String str, String str2, boolean z) {
        Context context = this.A00;
        C14360o3.A06(context);
        String A00 = AbstractC13180m4.A00(context);
        int i = 2131954480;
        if (z) {
            i = 2131954465;
        }
        String A0u = AbstractC25227BEk.A0u(context, i);
        int i2 = R.drawable.instagram_video_chat_outline_24;
        if (z) {
            i2 = R.drawable.call;
        }
        Notification.Builder lights = new Notification.Builder(context, "ig_direct_video_chat").setOngoing(true).setContentText(A0u).setContentTitle(A00).setTicker(AnonymousClass001.A0R(str, "")).setTimeoutAfter(O14.A00).setAutoCancel(!C18U.A06(C06090Tz.A05, userSession, 36323603575156129L)).setWhen(0L).setOnlyAlertOnce(true).setCategory("call").setSmallIcon(i2).setDeleteIntent(pendingIntent2).setDefaults(1).setLights(context.getColor(R.color.gdpr_notif_led_color), DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 1000);
        Person.Builder name = new Person.Builder().setName(str2);
        C14360o3.A07(name);
        if (pendingIntent2 != null && pendingIntent != null) {
            lights.setStyle(Notification.CallStyle.forIncomingCall(name.build(), pendingIntent2, pendingIntent));
        }
        lights.setFullScreenIntent(pendingIntent3, true).setContentIntent(pendingIntent3);
        int ringerMode = this.A03.getRingerMode();
        if (ringerMode == 1 || ringerMode == 2) {
            lights.setVibrate(this.A01);
        }
        Notification build = lights.build();
        build.flags |= 4;
        return build;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.Xpo] */
    public static final XN9 A02(C55140OcT c55140OcT, String str, String str2, long[] jArr) {
        Bitmap A0H;
        Context context = c55140OcT.A00;
        C14360o3.A06(context);
        String A00 = AbstractC13180m4.A00(context);
        XN9 xn9 = new XN9(context, "ig_direct_video_chat");
        xn9.A0C(A00);
        xn9.A0B(str);
        xn9.A0D(str);
        ?? abstractC72869Xpo = new AbstractC72869Xpo();
        abstractC72869Xpo.A06(str);
        xn9.A0A(abstractC72869Xpo);
        Notification notification = xn9.A0A;
        notification.when = 0L;
        XN9.A02(xn9, 8, true);
        xn9.A0T = "call";
        int i = R.drawable.notification_icon;
        int A0H2 = AbstractC53242c7.A0H(context, R.attr.defaultNotificationIcon);
        if (A0H2 != 0) {
            i = A0H2;
        }
        xn9.A04(i);
        xn9.A05(context.getColor(R.color.gdpr_notif_led_color), DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 1000);
        if (str2 != null && (A0H = C25821No.A00().A0H(AbstractC25225BEi.A0t(str2), null)) != null) {
            xn9.A07(AbstractC55212OeW.A02(context, A0H));
        }
        int ringerMode = c55140OcT.A03.getRingerMode();
        if (ringerMode != 1 && ringerMode != 2) {
            return xn9;
        }
        notification.vibrate = jArr;
        return xn9;
    }

    public final Notification A03() {
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131954480);
        XN9 xn9 = new XN9(context, "ig_other");
        xn9.A0C(A0p);
        xn9.A04(R.drawable.instagram_video_chat_outline_24);
        Notification A03 = xn9.A03();
        C14360o3.A07(A03);
        return A03;
    }

    public final Notification A04(PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, UserSession userSession, Boolean bool, String str, String str2, String str3, boolean z) {
        if (z && str3 != null && str3.length() != 0 && bool != null && pendingIntent3 != null) {
            C18U.A06(C06090Tz.A06, userSession, 36326124719978146L);
            if (Build.VERSION.SDK_INT >= 31) {
                return A00(pendingIntent, pendingIntent2, pendingIntent3, userSession, str, str3, bool.booleanValue());
            }
        }
        XN9 A02 = A02(this, AnonymousClass001.A0R(str, ""), str2, this.A01);
        A02.A05 = 2;
        A02.A09 = O14.A00;
        XN9.A02(A02, 2, true);
        A02.A0E(!C18U.A06(C06090Tz.A05, userSession, 36323603575156129L));
        if (pendingIntent3 != null) {
            A02.A0D = pendingIntent3;
            XN9.A02(A02, 128, true);
            A02.A0C = pendingIntent3;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (pendingIntent != null) {
            Context context = this.A00;
            CharSequence text = context.getText(2131954459);
            C14360o3.A07(text);
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.green_5_pressable)), 0, spannableString.length(), 0);
            A1E.add(new Y0K(pendingIntent, spannableString, 0));
        }
        if (pendingIntent2 != null) {
            Context context2 = this.A00;
            CharSequence text2 = context2.getText(2131954472);
            C14360o3.A07(text2);
            SpannableString spannableString2 = new SpannableString(text2);
            spannableString2.setSpan(new ForegroundColorSpan(context2.getColor(R.color.red_5_pressable)), 0, spannableString2.length(), 0);
            A1E.add(new Y0K(pendingIntent2, spannableString2, 0));
        }
        A02.A0Y = A1E;
        Notification notification = A02.A0A;
        notification.deleteIntent = pendingIntent2;
        notification.defaults = 1;
        Notification A03 = A02.A03();
        A03.flags |= 4;
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r1 == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.Xpo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification A05(android.app.PendingIntent r14, android.app.PendingIntent r15, com.instagram.common.session.UserSession r16, java.lang.String r17, long r18, boolean r20) {
        /*
            r13 = this;
            r9 = r17
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36326124719978146(0x810e6b000036a2, double:3.036125774253138E-306)
            r4 = r16
            boolean r2 = X.C18U.A06(r2, r4, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r3 = 1
            r6 = r13
            if (r1 < r0) goto L42
            r0 = 34
            if (r1 < r0) goto L53
            if (r2 == 0) goto L29
            r1 = 0
            android.content.Context r0 = r13.A00     // Catch: java.lang.RuntimeException -> L44
            android.app.ActivityManager r0 = X.MSZ.A0F(r0)     // Catch: java.lang.RuntimeException -> L44
            boolean r1 = r0.isBackgroundRestricted()     // Catch: java.lang.RuntimeException -> L44
            goto L44
        L29:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326124720043683(0x810e6b000136a3, double:3.036125774294584E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L53
            r1 = 0
            android.content.Context r0 = r13.A00     // Catch: java.lang.RuntimeException -> L51
            android.app.ActivityManager r0 = X.MSZ.A0F(r0)     // Catch: java.lang.RuntimeException -> L51
            boolean r1 = r0.isBackgroundRestricted()     // Catch: java.lang.RuntimeException -> L51
            goto L51
        L42:
            r3 = 0
            goto L53
        L44:
            if (r1 == 0) goto L53
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326124720043683(0x810e6b000136a3, double:3.036125774294584E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
        L51:
            if (r1 != 0) goto L42
        L53:
            r7 = r14
            r8 = r15
            r10 = r18
            r12 = r20
            if (r3 == 0) goto L60
            android.app.Notification r1 = r6.A01(r7, r8, r9, r10, r12)
            return r1
        L60:
            if (r17 != 0) goto L70
            android.content.Context r1 = r13.A00
            r0 = 2131954480(0x7f130b30, float:1.954546E38)
            if (r20 == 0) goto L6c
            r0 = 2131954465(0x7f130b21, float:1.954543E38)
        L6c:
            java.lang.String r9 = X.AbstractC25227BEk.A0u(r1, r0)
        L70:
            android.content.Context r4 = r13.A00
            r0 = 2131954503(0x7f130b47, float:1.9545507E38)
            java.lang.String r6 = X.AbstractC166997dE.A0p(r4, r0)
            r5 = 2131239047(0x7f082087, float:1.809439E38)
            if (r20 == 0) goto L81
            r5 = 2131231280(0x7f080230, float:1.8078637E38)
        L81:
            java.lang.String r0 = "ig_other"
            X.XN9 r2 = new X.XN9
            r2.<init>(r4, r0)
            r1 = 1
            r0 = 2
            X.XN9.A02(r2, r0, r1)
            r2.A0C(r9)
            android.app.Notification r3 = r2.A0A
            r3.when = r10
            r2.A04(r5)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A06(r6)
            r2.A0A(r0)
            r2.A0B(r6)
            r0 = 2131099990(0x7f060156, float:1.7812349E38)
            int r0 = r4.getColor(r0)
            r2.A01 = r0
            r2.A0d = r1
            r2.A0e = r1
            if (r15 == 0) goto Ld8
            r0 = 2131954491(0x7f130b3b, float:1.9545483E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            X.MSZ.A0z(r15, r2, r1, r0)
            r3.deleteIntent = r15
        Lc1:
            if (r14 == 0) goto Ld0
            r2.A0C = r14
        Lc5:
            android.app.Notification r1 = r2.A03()
            int r0 = r1.flags
            r0 = r0 | 32
            r1.flags = r0
            return r1
        Ld0:
            java.lang.String r1 = "RtcCallNotificationFactory"
            java.lang.String r0 = "resumeCallIntent is null"
            X.C0K8.A0E(r1, r0)
            goto Lc5
        Ld8:
            java.lang.String r1 = "RtcCallNotificationFactory"
            java.lang.String r0 = "leaveCallIntent is null"
            X.C0K8.A0E(r1, r0)
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55140OcT.A05(android.app.PendingIntent, android.app.PendingIntent, com.instagram.common.session.UserSession, java.lang.String, long, boolean):android.app.Notification");
    }

    public C55140OcT(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        this.A03 = AbstractC50522MSa.A0E(applicationContext);
    }

    private final Notification A01(PendingIntent pendingIntent, PendingIntent pendingIntent2, String str, long j, boolean z) {
        int i = R.drawable.instagram_video_chat_outline_24;
        if (z) {
            i = R.drawable.call;
        }
        Context context = this.A00;
        Notification.Builder colorized = new Notification.Builder(context, "ig_other").setOngoing(true).setSmallIcon(i).setWhen(j).setShowWhen(true).setContentText(AbstractC166997dE.A0p(context, 2131954503)).setColor(context.getColor(R.color.default_cta_dominant_color)).setColorized(true);
        C14360o3.A07(colorized);
        if (pendingIntent2 != null) {
            if (str == null) {
                int i2 = 2131954480;
                if (z) {
                    i2 = 2131954465;
                }
                str = AbstractC25227BEk.A0u(context, i2);
            }
            Person.Builder name = new Person.Builder().setName(str);
            C14360o3.A07(name);
            C14360o3.A0A(name.setIcon(Icon.createWithResource(context, R.drawable.notification_icon)));
            colorized.setStyle(Notification.CallStyle.forOngoingCall(name.build(), pendingIntent2));
        } else {
            C0K8.A0E("RtcCallNotificationFactory", "chip leaveCallIntent is null");
        }
        if (pendingIntent == null || colorized.setContentIntent(pendingIntent) == null) {
            C0K8.A0E("RtcCallNotificationFactory", "resumeCallIntent is null");
        }
        Notification build = colorized.build();
        build.flags |= 32;
        return build;
    }
}

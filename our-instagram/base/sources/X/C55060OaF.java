package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rtc.notification.NotificationDeletedBroadcastReceiver;

/* renamed from: X.OaF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55060OaF {
    public final android.net.Uri A00;
    public final C55093Ob4 A01;
    public final boolean A02;
    public final long[] A03 = {0, 800, 1838};

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.core.app.NotificationCompat$CallStyle, X.Xpo] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.core.app.NotificationCompat$CallStyle, X.Xpo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification A02(android.content.Context r35, X.AbstractC53622NnT r36, java.lang.String r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55060OaF.A02(android.content.Context, X.NnT, java.lang.String, boolean, boolean):android.app.Notification");
    }

    private final XN9 A01(PendingIntent pendingIntent, Context context, CallModel callModel, String str, String str2, String str3, boolean z, boolean z2) {
        Intent A08 = MSW.A08(context, NotificationDeletedBroadcastReceiver.class);
        A08.putExtra("notification_type_tag", str3);
        A08.putExtra("local_call_id", str);
        A08.putExtra("for_foreground", z2);
        C55093Ob4 c55093Ob4 = this.A01;
        A08.putExtra("end_call_on_notification_dismiss", false);
        C04750Mt A0R = MSZ.A0R(context, A08);
        A0R.A09();
        A0R.A08 = new C64152T1d(C0w9.A01);
        PendingIntent A02 = A0R.A02(context, 7, 134217728);
        XN9 xn9 = new XN9(context, str2);
        xn9.A05 = 2;
        xn9.A0E(false);
        xn9.A0C(c55093Ob4.A05(callModel));
        xn9.A0B(c55093Ob4.A04(callModel));
        XN9.A02(xn9, 2, true);
        xn9.A0C = pendingIntent;
        Notification notification = xn9.A0A;
        notification.deleteIntent = A02;
        notification.when = 0L;
        int i = R.drawable.call;
        if (z) {
            i = R.drawable.instagram_video_chat_outline_24;
        }
        xn9.A04(i);
        if (c55093Ob4.A03().A0A) {
            xn9.A0T = "call";
        }
        return xn9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0055, code lost:
    
        if (X.AbstractC25231BEo.A1b(r6.A03().A01) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C55060OaF(android.content.Context r5, X.C55093Ob4 r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A01 = r6
            r0 = 3
            long[] r0 = new long[r0]
            r0 = {x007c: FILL_ARRAY_DATA , data: [0, 800, 1838} // fill-array
            r4.A03 = r0
            android.content.res.Resources r3 = X.AbstractC166997dE.A0M(r5)
            r2 = 2131886139(0x7f12003b, float:1.9406848E38)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            r0 = 83
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r3.getResourcePackageName(r2)
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = r3.getResourceTypeName(r2)
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = r3.getResourceEntryName(r2)
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri r0 = r0.build()
            X.C14360o3.A07(r0)
            r4.A00 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L57
            X.MsZ r0 = r6.A03()
            X.0sZ r0 = r0.A01
            boolean r1 = X.AbstractC25231BEo.A1b(r0)
            r0 = 1
            if (r1 != 0) goto L58
        L57:
            r0 = 0
        L58:
            r4.A02 = r0
            java.lang.String r3 = "incoming_calls_1"
            android.content.Context r1 = r5.getApplicationContext()
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.NotificationManager"
            X.C14360o3.A0C(r2, r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r1 = "calling_channel_group"
            r2.deleteNotificationChannel(r3)
            java.lang.String r0 = "ongoing_calls"
            r2.deleteNotificationChannel(r0)
            r2.deleteNotificationChannelGroup(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55060OaF.<init>(android.content.Context, X.Ob4):void");
    }

    public static final SpannableString A00(Context context, int i, int i2) {
        SpannableString spannableString = new SpannableString(context.getString(i2));
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), 0, spannableString.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i)), 0, spannableString.length(), 0);
        return spannableString;
    }
}

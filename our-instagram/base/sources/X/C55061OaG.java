package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService;

/* renamed from: X.OaG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55061OaG {
    public final NotificationManager A00;
    public final Context A01;
    public final C23821Ep A02;
    public final AbstractC27671Vv A03;
    public final C55140OcT A04;

    public static final void A00(Context context, Bundle bundle, UserSession userSession, RtcCreateCallArgs rtcCreateCallArgs, C55061OaG c55061OaG, String str, String str2, String str3, String str4, String str5) {
        PendingIntent pendingIntent;
        if (rtcCreateCallArgs != null) {
            pendingIntent = MSZ.A0R(context, AbstractC54147Nwj.A00(context, userSession, rtcCreateCallArgs)).A01(context, 0, 134217728);
        } else {
            pendingIntent = null;
        }
        Context context2 = c55061OaG.A01;
        Intent A01 = AbstractC34770FTt.A01(context2, str2, str, null, "via_push_notification", null, null);
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0A(A01);
        c04750Mt.A09();
        c04750Mt.A08 = new C1QF("IgSecurePendingIntent").A00;
        PendingIntent A012 = c04750Mt.A01(context, 0, 134217728);
        Intent A00 = AbstractC34770FTt.A00(context2, "all", "direct-inbox", null, 67108864);
        C04750Mt c04750Mt2 = new C04750Mt();
        c04750Mt2.A0A(A00);
        c04750Mt2.A09();
        c04750Mt2.A08 = new C1QF("IgSecurePendingIntent").A00;
        PendingIntent A013 = c04750Mt2.A01(context, 0, 134217728);
        C55140OcT c55140OcT = c55061OaG.A04;
        Intent A08 = MSW.A08(context2, RtcCallActionIntentHandlerService.class);
        A08.setAction("DISMISS_MISSED");
        A08.putExtras(bundle);
        PendingIntent A03 = MSZ.A0R(context2, A08).A03(context2, Math.abs(MSW.A01()), 0);
        XN9 A02 = C55140OcT.A02(c55140OcT, str4, str3, c55140OcT.A02);
        A02.A05 = 1;
        A02.A09 = O14.A01;
        A02.A0E(true);
        A02.A0C = A013;
        if (A012 != null) {
            MSZ.A0z(A012, A02, c55140OcT.A00.getString(2131976790), 0);
        }
        if (pendingIntent != null) {
            MSZ.A0z(pendingIntent, A02, c55140OcT.A00.getString(2131976789), 0);
        }
        A02.A0A.deleteIntent = A03;
        A02.A01 = c55140OcT.A00.getColor(R.color.igds_error_or_destructive);
        Notification A032 = A02.A03();
        C14360o3.A07(A032);
        OXE.A00.A00("RtcCallNotificationManager", AnonymousClass001.A0R("showMissedCallNotification ", str5));
        A01(null, userSession, c55061OaG);
        c55061OaG.A02.A00(str5, 1910377639, A032);
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        OXE.A00.A00("RtcCallNotificationManager", AnonymousClass001.A0R("cancelNotification ", str));
        this.A02.A00.cancel(str, 1910377639);
    }

    public /* synthetic */ C55061OaG(Context context) {
        C55140OcT c55140OcT = new C55140OcT(context);
        C23821Ep c23821Ep = new C23821Ep(context);
        Object systemService = context.getSystemService("notification");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        AbstractC27671Vv A00 = C3ER.A00();
        C14360o3.A0B(notificationManager, 4);
        this.A01 = context;
        this.A04 = c55140OcT;
        this.A02 = c23821Ep;
        this.A00 = notificationManager;
        this.A03 = A00;
    }

    public static final void A01(InterfaceC58275PsT interfaceC58275PsT, UserSession userSession, C55061OaG c55061OaG) {
        try {
            NotificationManager notificationManager = c55061OaG.A00;
            long length = notificationManager.getActiveNotifications().length;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (length >= C18U.A01(c06090Tz, userSession, 36605078552253645L)) {
                OXE oxe = OXE.A00;
                oxe.A00("RtcCallNotificationManager", AnonymousClass001.A0O("number of active notifications ", notificationManager.getActiveNotifications().length));
                if (interfaceC58275PsT != null) {
                    interfaceC58275PsT.CnR("active_notif_count", notificationManager.getActiveNotifications().length);
                }
                if (C18U.A06(c06090Tz, userSession, 36323603575483812L)) {
                    StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                    C14360o3.A07(activeNotifications);
                    int length2 = activeNotifications.length;
                    if (length2 != 0) {
                        StatusBarNotification statusBarNotification = activeNotifications[0];
                        int i = length2 - 1;
                        if (i != 0) {
                            long postTime = statusBarNotification.getPostTime();
                            if (1 <= i) {
                                int i2 = 1;
                                while (true) {
                                    StatusBarNotification statusBarNotification2 = activeNotifications[i2];
                                    long postTime2 = statusBarNotification2.getPostTime();
                                    if (postTime > postTime2) {
                                        statusBarNotification = statusBarNotification2;
                                        postTime = postTime2;
                                    }
                                    if (i2 == i) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        } else if (statusBarNotification == null) {
                            return;
                        }
                        if (interfaceC58275PsT != null) {
                            interfaceC58275PsT.CnU("did_cancel_last_notification", true);
                        }
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("cancel oldest notification {");
                        A1C.append(statusBarNotification.getNotification());
                        oxe.A00("RtcCallNotificationManager", AbstractC167027dH.A0R(A1C));
                        notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                    }
                }
            }
        } catch (Exception e) {
            OXE.A00.A02("RtcCallNotificationManager", "DeadSystemException while retrieving active notifications", e);
        }
    }
}

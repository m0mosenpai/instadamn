package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.DeadSystemException;
import android.service.notification.StatusBarNotification;
import com.facebook.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1X8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X8 {
    public static C1X8 A01;
    public final C23821Ep A00;

    public static C1X8 A00() {
        if (A01 == null) {
            synchronized (C1X8.class) {
                if (A01 == null) {
                    A01 = new C1X8(new C23821Ep(AbstractC12290kX.A00));
                }
            }
        }
        return A01;
    }

    public final HashMap A01() {
        HashMap hashMap = new HashMap();
        List<StatusBarNotification> emptyList = Collections.emptyList();
        try {
            NotificationManager notificationManager = (NotificationManager) AbstractC12290kX.A00.getSystemService("notification");
            if (notificationManager != null) {
                emptyList = Arrays.asList(notificationManager.getActiveNotifications());
            }
        } catch (Exception unused) {
        }
        for (StatusBarNotification statusBarNotification : emptyList) {
            hashMap.put(statusBarNotification.getTag(), statusBarNotification);
        }
        return hashMap;
    }

    public final void A02(C47690L3x c47690L3x, AbstractC12990ll abstractC12990ll, Runnable runnable, String str, int i) {
        String str2;
        try {
            C116155Nu c116155Nu = c47690L3x.A04;
            Notification notification = c47690L3x.A03;
            if (abstractC12990ll != null && ((str2 = c116155Nu.A0d) == null || !str2.startsWith("[ug]-"))) {
                String group = notification.getGroup();
                String channelId = notification.getChannelId();
                if (group != null && channelId != null && !"ig_direct".equals(channelId)) {
                    if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36320575622488756L)) {
                        try {
                            List<StatusBarNotification> emptyList = Collections.emptyList();
                            try {
                                NotificationManager notificationManager = (NotificationManager) AbstractC12290kX.A00.getSystemService("notification");
                                if (notificationManager != null) {
                                    emptyList = Arrays.asList(notificationManager.getActiveNotifications());
                                }
                            } catch (Exception unused) {
                            }
                            for (StatusBarNotification statusBarNotification : emptyList) {
                                if (statusBarNotification.getGroupKey() == null || !statusBarNotification.getGroupKey().endsWith(group)) {
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    Context context = AbstractC12290kX.A00;
                    Intent A02 = C14H.A00().A02(context, 67108864);
                    C04750Mt c04750Mt = new C04750Mt();
                    c04750Mt.A05(A02, null);
                    XN9 xn9 = new XN9(context, channelId);
                    int i2 = R.drawable.notification_icon;
                    int A0H = AbstractC53242c7.A0H(context, R.attr.defaultNotificationIcon);
                    if (A0H != 0) {
                        i2 = A0H;
                    }
                    xn9.A04(i2);
                    xn9.A0V = group;
                    xn9.A0C = c04750Mt.A01(context, 64278, 134217728);
                    xn9.A0f = true;
                    this.A00.A00(group, 64278, xn9.A03());
                }
            }
            C23821Ep c23821Ep = this.A00;
            c23821Ep.A00(str, i, notification);
            for (Map.Entry entry : Collections.unmodifiableMap(c47690L3x.A01).entrySet()) {
                C69689Vtf c69689Vtf = (C69689Vtf) entry.getKey();
                c23821Ep.A00(c69689Vtf.A01, c69689Vtf.A00, (Notification) entry.getValue());
            }
            Notification notification2 = c47690L3x.A00;
            if (notification2 != null && notification2.getGroup() != null) {
                c23821Ep.A00(notification2.getGroup(), 64278, notification2);
            }
            AbstractC03270Dk.A01(abstractC12990ll);
            MRU A00 = JQX.A00(c116155Nu.A0j);
            long longValue = c116155Nu.A0K.longValue();
            Integer num = C05F.A00;
            if (c47690L3x.A02) {
                A00.DWB(longValue, num);
            } else {
                A00.Cn5("displayed", longValue);
                A00.DW5(longValue, num);
            }
            C19280xC A012 = JQW.A01(c116155Nu, "notification_displayed", Collections.unmodifiableList(c47690L3x.A05));
            A012.A0C("pi", c116155Nu.A12);
            A012.A08(2, "render_target");
            if ((notification.flags & 8) == 8) {
                A012.A09("is_alert_only_once", Boolean.TRUE);
            }
            AbstractC11060iN.A00(abstractC12990ll).EHW(A012);
            PushChannelType pushChannelType = c116155Nu.A0B;
            if (pushChannelType == null) {
                pushChannelType = PushChannelType.A0D;
            }
            List A022 = C2OJ.A00().A02(AbstractC12290kX.A00);
            JQU jqu = JQU.A01;
            C43606JQm A013 = JQO.A0R.A01(c116155Nu);
            A013.A02 = pushChannelType;
            jqu.A0A(new JQO(A013), A022);
            AbstractC44086JeB.A02(c116155Nu, abstractC12990ll, null, null, 5);
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e) {
            if (e instanceof DeadSystemException) {
                C0w9.A06("NOTIFICATION_MANAGER", "Tried to send push notification when the system was being shut down", e);
                return;
            }
            throw e;
        }
    }

    public final void A03(Runnable runnable, String str, int i) {
        this.A00.A00.cancel(str, i);
        if (runnable != null) {
            runnable.run();
        }
    }

    public C1X8(C23821Ep c23821Ep) {
        this.A00 = c23821Ep;
    }
}

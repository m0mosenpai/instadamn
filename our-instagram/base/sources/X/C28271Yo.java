package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.service.notification.StatusBarNotification;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28271Yo {
    public static C28271Yo A00;

    public final int A00(Context context) {
        NotificationManager notificationManager;
        StatusBarNotification[] activeNotifications;
        int i = 0;
        Object obj = null;
        if (context != null) {
            try {
                obj = context.getSystemService("notification");
            } catch (Throwable unused) {
                return i;
            }
        }
        if (!(obj instanceof NotificationManager) || (notificationManager = (NotificationManager) obj) == null || (activeNotifications = notificationManager.getActiveNotifications()) == null) {
            return 0;
        }
        i = activeNotifications.length;
        return i;
    }

    public final Boolean A01(Context context, UserSession userSession, String str) {
        EnumC47122Ee A03 = C92I.A03(context, userSession, str);
        if (A03 == EnumC47122Ee.A0c) {
            return false;
        }
        return AbstractC47112Ed.A00(context, A03, false);
    }

    public final List A02(Context context) {
        NotificationManager notificationManager;
        StatusBarNotification[] activeNotifications;
        C14360o3.A0B(context, 0);
        try {
            Object systemService = context.getSystemService("notification");
            if (systemService instanceof NotificationManager) {
                notificationManager = (NotificationManager) systemService;
            } else {
                notificationManager = null;
            }
            if (notificationManager != null && (activeNotifications = notificationManager.getActiveNotifications()) != null) {
                return AbstractC009903n.A0J(activeNotifications);
            }
            return C16930sl.A00;
        } catch (Exception e) {
            Map map = C0YZ.A03;
            C0K8.A0F(AbstractC13230m9.A01(C28271Yo.class), AnonymousClass001.A0R("Unable to retrieve statusBarNotifications, ", e.getMessage()), e);
            return C16930sl.A00;
        }
    }

    public final void A03(Context context, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        if (!AbstractC14480oK.A01(context)) {
            C92I.A07(context);
        } else {
            if (C14360o3.A0K(A01(context, userSession, str), true)) {
                return;
            }
            C92I.A08(context, C92I.A03(context, userSession, str));
        }
    }

    public final void A04(Context context, UserSession userSession, String str) {
        Resources resources;
        int i;
        C14360o3.A0B(userSession, 1);
        if (context != null && !AbstractC14480oK.A01(context)) {
            long A01 = C18U.A01(C06090Tz.A05, userSession, 36606281141786005L);
            if (A01 > 0) {
                if (A01 == 1) {
                    resources = context.getResources();
                    i = 2131974829;
                } else {
                    if (A01 != 2) {
                        return;
                    }
                    resources = context.getResources();
                    i = 2131974830;
                }
                String string = resources.getString(i, str);
                C14360o3.A07(string);
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A0A(2131974831);
                c193328hC.A0r(string);
                c193328hC.A0S(new DialogInterfaceOnClickListenerC35305Fhe(context), EnumC193348hE.A03, 2131974827);
                c193328hC.A0N(null, 2131974828, true);
                C0fJ.A00(c193328hC.A02());
            }
        }
    }
}

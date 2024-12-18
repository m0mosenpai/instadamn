package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.2Jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48182Jh extends C1Z6 {
    public static final AbstractC48222Jl[] A04 = {new Object(), new Object(), new Object(), new Object(), new Object(), new Object(), new AbstractC48222Jl() { // from class: X.2KR
        public final Intent A00 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");

        @Override // X.AbstractC48222Jl
        public final boolean A01(Context context, int i) {
            C14360o3.A0B(context, 1);
            try {
                Intent intent = this.A00;
                intent.putExtra("notificationNum", i);
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra("className", AbstractC48222Jl.A00(context).getClassName());
                intent.addFlags(16777216);
                context.sendBroadcast(intent);
                return true;
            } catch (Exception e) {
                C0w9.A06("VivoLauncherBadges", "unexpected exception", e);
                return false;
            }
        }

        @Override // X.AbstractC48222Jl
        public final boolean A02(Context context, String str) {
            C14360o3.A0B(str, 1);
            if (!"com.bbk.launcher2".equalsIgnoreCase(str)) {
                if (Build.VERSION.SDK_INT >= 30) {
                    String str2 = Build.BRAND;
                    if ((str2 == null || !str2.equalsIgnoreCase("vivo")) && (str2 == null || !str2.equalsIgnoreCase("iQOO"))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }, new Object(), new Object()};
    public final Context A00;
    public final UserSession A01;
    public final C2KV A02;
    public final Executor A03 = Executors.newSingleThreadExecutor();

    @Override // X.C1Z6
    public final void A02() {
        C11T.A02(new C4JR(this, null));
    }

    @Override // X.C1Z6
    public final void A01() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            AbstractC23021Ah.A01(userSession, 0);
            C2IZ.A04.A00(userSession.userId).A02(new C4JH(new C71943Kr(new C71933Kq(0, -1, -1), null, null), "force_clear_badges"));
        }
        A02();
    }

    @Override // X.C1Z6
    public final boolean A04() {
        UserSession userSession = this.A01;
        if (userSession != null && C0BQ.A00(userSession).BOZ() > 1 && C1AD.A06(C06090Tz.A05, 18297342365074177L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C11T.A02(new M22(this));
    }

    public C48182Jh(Context context, UserSession userSession) {
        C2KV c2kv = new C2KV() { // from class: X.2KU
            @Override // X.C2KV
            public final void Cz5(C4JH c4jh) {
                C48182Jh c48182Jh = C48182Jh.this;
                String str = c4jh.A02;
                AbstractC48222Jl[] abstractC48222JlArr = C48182Jh.A04;
                C11T.A07(false, new C4JR(c48182Jh, str));
            }
        };
        this.A02 = c2kv;
        this.A00 = context;
        this.A01 = userSession;
        if (userSession != null) {
            C2KW.A01(userSession, c2kv);
        }
    }

    @Override // X.C1Z6
    public final void A03(Notification notification, Context context, List list) {
        if (!list.isEmpty() && AbstractC13180m4.A01(context).equals("com.miui.home")) {
            C50B c50b = ((C116155Nu) list.get(list.size() - 1)).A08;
            int i = 0;
            if (c50b != null) {
                i = c50b.A01 + c50b.A00;
            }
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass();
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
            } catch (Exception e) {
                C0w9.A06(Xj4.class.getName(), "unexpected exception", e);
            }
        }
    }
}

package X;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LH7 {
    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, long j, boolean z) {
        String str;
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        C006802i c006802i = C006802i.A0p;
        InterfaceC02900Bo A0m = AbstractC43592JPx.A0m(userSession, c006802i);
        C6CF A00 = C6CE.A00(userSession);
        AbstractC167017dG.A1R(A0m, A00);
        AbstractC2056898s abstractC2056898s = new AbstractC2056898s(c006802i, A00, A0m);
        abstractC2056898s.A03();
        abstractC2056898s.A05("OTC_NOTIFICATION_TAPPED");
        if (z) {
            str = "OTC_NOTIFICATION";
        } else {
            str = "OTC_ACTIVITY_FEED";
        }
        abstractC2056898s.A07("SOURCE", str);
        AbstractC46742Klz.A00(userSession, C05F.A0j).A06(new C30218DSx(j, fragmentActivity, userSession, abstractC2056898s, 2));
    }

    public static final boolean A02(Context context) {
        ActivityManager activityManager;
        String str;
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("activity");
        if (!(systemService instanceof ActivityManager) || (activityManager = (ActivityManager) systemService) == null) {
            return false;
        }
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            List list = AbstractC47155Ksq.A00;
            ComponentName componentName = appTask.getTaskInfo().topActivity;
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            if (AbstractC001800i.A0u(list, str)) {
                return true;
            }
        }
        return false;
    }

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession) {
        EnumC46208Kck enumC46208Kck;
        Integer num;
        EnumC46149Kbn enumC46149Kbn;
        boolean A02 = C6CB.A02(C6CE.A00(userSession).A00, 36315928476258105L);
        LGY lgy = (LGY) userSession.A01(LGY.class, new MHK(userSession, 1));
        if (A02) {
            enumC46208Kck = EnumC46208Kck.A0H;
            num = C05F.A05;
            enumC46149Kbn = EnumC46149Kbn.A03;
        } else {
            enumC46208Kck = EnumC46208Kck.A0G;
            num = C05F.A05;
            enumC46149Kbn = EnumC46149Kbn.A02;
        }
        LGY.A00(fragmentActivity, enumC46208Kck, enumC46149Kbn, lgy, num);
    }
}

package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180657zt {
    public Runnable A00;
    public final Activity A01;
    public final UserSession A02;
    public final WeakReference A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());

    public final void A00(Dialog dialog) {
        C14360o3.A0B(dialog, 0);
        Runnable runnable = this.A00;
        if (runnable == null) {
            this.A00 = new RunnableC24637AvX(dialog, this);
        } else {
            this.A04.removeCallbacks(runnable);
        }
        Handler handler = this.A04;
        Runnable runnable2 = this.A00;
        if (runnable2 == null) {
            C14360o3.A0F("dialogNuxRunnable");
            throw C00O.createAndThrow();
        }
        handler.postDelayed(runnable2, 200L);
    }

    public final boolean A02() {
        UserSession userSession = this.A02;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!((Boolean) A00.A3o.CES(A00, C23031Ai.A8c[337])).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36320846205363133L)) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        UserSession userSession = this.A02;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!((Boolean) A00.A4V.CES(A00, C23031Ai.A8c[338])).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36330832004400168L)) {
            return true;
        }
        return false;
    }

    public C180657zt(Activity activity, UserSession userSession) {
        this.A01 = activity;
        this.A02 = userSession;
        this.A03 = new WeakReference(activity);
    }

    public final void A01(InterfaceC16820sZ interfaceC16820sZ) {
        Activity activity;
        int i;
        Activity activity2;
        if (A02()) {
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36320846205232059L)) {
                activity = this.A01;
                i = 2131963080;
            } else {
                if (!C18U.A06(c06090Tz, userSession, 36320846205166522L)) {
                    return;
                }
                activity = this.A01;
                i = 2131963081;
            }
            String string = activity.getString(i);
            if (string != null) {
                Context context = activity;
                if (C18U.A06(c06090Tz, userSession, 36323483315088680L)) {
                    context = AbstractC53172bz.A01(activity);
                }
                C193328hC c193328hC = new C193328hC(context);
                c193328hC.A0k(activity.getDrawable(R.drawable.ig_illustrations_illo_camera_roll_reels_refresh));
                c193328hC.A0A(2131963083);
                c193328hC.A0r(string);
                String string2 = activity.getString(2131968948);
                C14360o3.A07(string2);
                c193328hC.A0W(null, EnumC193348hE.A03, string2, activity.getString(2131963082), true);
                c193328hC.A0g(new DialogInterfaceOnDismissListenerC23175AOo(interfaceC16820sZ));
                c193328hC.A0t(true);
                Dialog A02 = c193328hC.A02();
                WeakReference weakReference = this.A03;
                if (weakReference.get() != null && (activity2 = (Activity) weakReference.get()) != null && !activity2.isFinishing()) {
                    A00(A02);
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    A00.A3o.Egi(A00, true, C23031Ai.A8c[337]);
                }
            }
        }
    }
}

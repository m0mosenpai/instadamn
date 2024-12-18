package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.FTi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34763FTi {
    public static final void A01(Context context, UserSession userSession) {
        Intent launchIntentForPackage;
        C14360o3.A0B(userSession, 1);
        String str = AbstractC14490oL.A02;
        if (AbstractC14490oL.A0J(context.getPackageManager(), "com.oculus.twilight")) {
            if (AbstractC115215Is.A00(context, userSession, "oculus.store://link/media")) {
                AbstractC41776Ies.A03(context, "oculus.store://link/media");
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.oculus.twilight")) == null) {
                return;
            }
            C12260kU.A00(context, launchIntentForPackage);
            return;
        }
        AbstractC14490oL.A07(context, "com.oculus.twilight", null);
    }

    public static final void A00(Activity activity, UserSession userSession) {
        if (activity != null) {
            EHU ehu = new EHU();
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            AbstractC25226BEj.A1M(activity, A0y, 2131956281);
            AbstractC31173DnH.A0w(activity, ehu, A0y);
        }
    }
}

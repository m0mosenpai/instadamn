package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: X.F7j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34211F7j {
    public static final boolean A00(Context context) {
        Intent A04;
        String A00 = AbstractC111324zv.A00(4418);
        if (!new C1Ro(context, context.getPackageManager()).A01(14)) {
            boolean z = false;
            try {
                context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (AbstractC61807Ru1.A00(context)) {
                C04750Mt c04750Mt = new C04750Mt();
                c04750Mt.A0D = true;
                c04750Mt.A01(context, 0, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO).getIntentSender();
            }
            A04 = AbstractC33640Etq.A00(true, Boolean.valueOf(z), "com.facebook.katana", "xav:switcher");
        } else {
            A04 = AbstractC31171DnF.A04();
            A04.setClassName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.appupdate.AppUpdateRequestRedirectActivity");
            A04.putExtra("package_name", "com.facebook.katana").putExtra("fallback_intent", (Parcelable) null);
            if (AbstractC61807Ru1.A00(context)) {
                C04750Mt c04750Mt2 = new C04750Mt();
                c04750Mt2.A0D = true;
                A04.putExtra("intent_sender", c04750Mt2.A01(context, 0, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO).getIntentSender());
            }
            A04.putExtra("should_show_back_navigation", (Serializable) true);
            A04.putExtra("referrer", "xav:switcher");
            A04.putExtra("utm_source", "ig4a");
            A04.putExtra("utm_medium", "xav");
            A04.putExtra("utm_campaign", "switcher");
            A04.putExtra("utm_content", A00);
        }
        return C0b3.A00().A06().A0G(context, A04);
    }
}

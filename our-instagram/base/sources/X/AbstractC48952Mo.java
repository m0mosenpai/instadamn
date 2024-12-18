package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.2Mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48952Mo {
    static {
        C48442Kl.A01("PackageManagerHelper");
    }

    public static void A00(Context context, Class klazz, boolean enabled) {
        try {
            String name = klazz.getName();
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, name));
            boolean z = false;
            if (componentEnabledSetting != 0) {
                z = true;
                if (componentEnabledSetting != 1) {
                    z = false;
                }
            }
            if (enabled != z) {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, name);
                int i = 2;
                if (enabled) {
                    i = 1;
                }
                packageManager.setComponentEnabledSetting(componentName, i, 1);
            }
            C48442Kl.A00();
        } catch (Exception unused) {
            C48442Kl.A00();
        }
    }
}

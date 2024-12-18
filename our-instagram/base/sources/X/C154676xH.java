package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154676xH {
    public final PackageManager A00;
    public final EnumC12920le A01;
    public final Context A02;
    public final boolean A03;

    public C154676xH(Context context, PackageManager packageManager, EnumC12920le enumC12920le, boolean z) {
        C14360o3.A0B(enumC12920le, 4);
        this.A02 = context;
        this.A03 = z;
        this.A00 = packageManager;
        this.A01 = enumC12920le;
    }

    public static final C154676xH A00(Context context, UserSession userSession) {
        return AbstractC154666xG.A00(context, userSession);
    }

    public final void A01() {
        if (this.A03) {
            Context context = this.A02;
            ComponentName componentName = new ComponentName(context, "com.instagram.android.InternalLauncher");
            ComponentName componentName2 = new ComponentName(context, "com.instagram.android.activity.MainTabActivity");
            PackageManager packageManager = this.A00;
            if (packageManager.getComponentEnabledSetting(componentName2) == 2) {
                packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        }
    }

    public final void A02() {
        if (this.A03) {
            Context context = this.A02;
            ComponentName componentName = new ComponentName(context, "com.instagram.android.InternalLauncher");
            ComponentName componentName2 = new ComponentName(context, "com.instagram.android.activity.MainTabActivity");
            PackageManager packageManager = this.A00;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
            EnumC12920le enumC12920le = this.A01;
            if ((enumC12920le == EnumC12920le.A09 || enumC12920le == EnumC12920le.A0A) && componentEnabledSetting != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                packageManager.setComponentEnabledSetting(componentName2, 2, 1);
            } else {
                if (enumC12920le != EnumC12920le.A0C || componentEnabledSetting2 != 2) {
                    return;
                }
                packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        }
    }
}

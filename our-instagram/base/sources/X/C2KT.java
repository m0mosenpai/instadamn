package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* renamed from: X.2KT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KT extends AbstractC48222Jl {
    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        String str;
        C14360o3.A0B(context, 1);
        try {
            if ("com.sec.android.app.launcher".equals(AbstractC13180m4.A01(context))) {
                str = "com.sec.intent.action.BADGE_COUNT_UPDATE";
            } else {
                str = "android.intent.action.BADGE_COUNT_UPDATE";
            }
            Intent intent = new Intent(str);
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", context.getPackageName());
            intent.putExtra("badge_count_class_name", AbstractC48222Jl.A00(context).getClassName());
            context.sendBroadcast(intent);
            return true;
        } catch (Exception e) {
            C0w9.A06("GenericLauncherBadges", "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        String str2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        if ("com.sec.android.app.launcher".equals(str)) {
            str2 = "com.sec.intent.action.BADGE_COUNT_UPDATE";
        } else {
            str2 = "android.intent.action.BADGE_COUNT_UPDATE";
        }
        C14360o3.A07(packageManager.queryBroadcastReceivers(new Intent(str2), 0));
        return !r0.isEmpty();
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;

/* renamed from: X.2Jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48332Jy extends AbstractC48222Jl {
    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        C14360o3.A0B(context, 1);
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", AbstractC48222Jl.A00(context).getClassName());
        bundle.putInt("badgenumber", i);
        try {
            if (context.getContentResolver().call(AbstractC08820cl.A03("content://com.hihonor.android.launcher.settings/badge/"), "change_badge", (String) null, bundle) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C0w9.A06("HonorLauncherBadges", "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        if (str.equals("com.hihonor.android.launcher") && Boolean.parseBoolean(Settings.Global.getString(context.getContentResolver(), "msc.launcher.enable_number_badge")) && C1AD.A06(C06090Tz.A05, 18301628742373254L)) {
            return true;
        }
        return false;
    }
}

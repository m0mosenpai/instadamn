package X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.2Jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48292Jt extends AbstractC48222Jl {
    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        C14360o3.A0B(context, 1);
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", AbstractC48222Jl.A00(context).getClassName());
        bundle.putInt("badgenumber", i);
        try {
            if (context.getContentResolver().call(AbstractC08820cl.A03("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C0w9.A06("HuaweiLauncherBadges", "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        C14360o3.A0B(str, 1);
        return str.equals("com.huawei.android.launcher");
    }
}

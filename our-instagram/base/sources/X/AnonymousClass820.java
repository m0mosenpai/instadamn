package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.820, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass820 {
    public static final EnumC177227uI A00(Context context) {
        C14360o3.A0B(context, 0);
        if (C8Li.A00(context)) {
            return EnumC177227uI.CAMERA2;
        }
        return EnumC177227uI.CAMERA1;
    }

    public static final boolean A01(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && ((packageManager.hasSystemFeature("android.hardware.camera.concurrent") || AbstractC176937tp.A02(AbstractC177127u8.A00)) && A00(context) == EnumC177227uI.CAMERA2)) {
            return true;
        }
        return false;
    }
}

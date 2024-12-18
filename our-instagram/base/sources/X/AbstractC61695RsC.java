package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.RsC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61695RsC {
    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        if (Build.VERSION.SDK_INT >= 35 && context.getApplicationInfo().targetSdkVersion >= 35) {
            return true;
        }
        return false;
    }
}

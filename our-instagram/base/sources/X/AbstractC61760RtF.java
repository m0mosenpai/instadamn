package X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.RtF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61760RtF {
    public static void A00(ComponentName componentName, Context context, IllegalArgumentException illegalArgumentException) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 0) {
                return;
            } else {
                throw illegalArgumentException;
            }
        }
        throw illegalArgumentException;
    }
}

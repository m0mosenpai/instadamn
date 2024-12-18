package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: X.Rqo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61624Rqo {
    public static int A00(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager A01 = AbstractC63039SbE.A01(context);
            int A00 = AbstractC63039SbE.A00(A01, str, str2, Binder.getCallingUid());
            if (A00 == 0) {
                return AbstractC63039SbE.A00(A01, str, AbstractC63039SbE.A02(context), i);
            }
            return A00;
        }
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }
}

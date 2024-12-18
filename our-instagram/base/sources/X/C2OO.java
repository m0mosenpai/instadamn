package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.2OO, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2OO {
    public static final boolean A00(Context context, C2L2 c2l2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c2l2, 1);
        String processName = Application.getProcessName();
        C14360o3.A07(processName);
        String str = c2l2.A04;
        if (str == null || str.length() == 0) {
            str = context.getApplicationInfo().processName;
        }
        return processName.equals(str);
    }

    static {
        C14360o3.A07(C48442Kl.A01("ProcessUtils"));
    }
}

package X;

import android.content.Context;
import android.os.Build;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.2Tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50492Tt {
    public static final void A00(Context context) {
        String str;
        if (EndToEnd.isRunningEndToEndTest()) {
            if (Build.VERSION.SDK_INT >= 30) {
                C07740aq.A00(context);
            }
            C14360o3.A0B(C57087PUa.A00, 1);
            if (!EndToEnd.isRunningEndToEndTest()) {
                str = "Device is not in E2E tests mode!";
            } else {
                str = "ResourceCoverageTracer can only be run on e2e, perftest and debug builds!";
            }
            C0K8.A0C("ResourceCoverageTracer", str);
        }
    }
}

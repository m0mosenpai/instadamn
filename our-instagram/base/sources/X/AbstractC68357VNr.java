package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* renamed from: X.VNr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68357VNr {
    public static final C140966Yy A00(FragmentActivity fragmentActivity, AnalyticsEventDebugInfo analyticsEventDebugInfo, AbstractC12990ll abstractC12990ll) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EventInfoFragment.EventInfo", analyticsEventDebugInfo);
        new C38K().setArguments(bundle);
        if (fragmentActivity != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
            c140966Yy.A0B(bundle, new C38K());
            return c140966Yy;
        }
        throw AbstractC166997dE.A0g();
    }
}

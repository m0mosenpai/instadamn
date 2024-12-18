package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.HashSet;

/* renamed from: X.2u3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63252u3 {
    public final Fragment A00;
    public final UserSession A01;
    public final java.util.Set A02 = new HashSet();

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C14360o3.A0B(str2, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            java.util.Set set = this.A02;
            boolean contains = set.contains(str);
            if (!contains) {
                set.add(str);
            }
            boolean z = true;
            if (AbstractC52812bN.A02(AbstractC52812bN.A00(activity))) {
                z = false;
            }
            C140966Yy c140966Yy = new C140966Yy(activity, this.A01);
            ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
            contextualFeedFragment.setArguments(C31569Dtv.A00(null, null, null, null, null, null, str, str2, str7, null, str3, str6, str5, null, null, null, null, null, str4, null, null, 0, false, true, false, false, contains, false, false, false, true, z));
            c140966Yy.A0B(null, contextualFeedFragment);
            c140966Yy.A08();
            c140966Yy.A04();
        }
    }

    public C63252u3(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}

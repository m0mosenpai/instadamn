package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public abstract class A3A {
    public static final void A00(Fragment fragment) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        FragmentActivity activity = fragment.getActivity();
        if (abstractC10360h2 != null && C06P.A01(abstractC10360h2) && !C06P.A00(abstractC10360h2) && activity != null) {
            activity.onBackPressed();
        }
    }
}

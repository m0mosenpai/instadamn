package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class W8Q {
    public static final /* synthetic */ W8Q A00 = new Object();

    public static final XF6 A00(Fragment fragment) {
        Fragment fragment2 = fragment;
        while (true) {
            if (fragment2 != null) {
                if (fragment2 instanceof XF6) {
                    break;
                }
                fragment2 = fragment2.mParentFragment;
            } else {
                if (fragment != null) {
                    fragment2 = fragment.getActivity();
                } else {
                    fragment2 = null;
                }
                if (!(fragment2 instanceof XF6)) {
                    return null;
                }
            }
        }
        return (XF6) fragment2;
    }
}

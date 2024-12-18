package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FAk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34290FAk {
    public static final boolean A00(Fragment fragment) {
        FragmentActivity activity;
        boolean z = false;
        if (fragment != null && (activity = fragment.getActivity()) != null && !activity.isDestroyed()) {
            z = true;
        }
        return !z;
    }
}

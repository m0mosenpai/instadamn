package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes7.dex */
public abstract class Hx9 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C56352iT A00(FragmentActivity fragmentActivity, C6FG c6fg) {
        AbstractC167017dG.A1N(c6fg, fragmentActivity);
        for (Fragment fragment = C6BQ.A00(c6fg); fragment != 0; fragment = fragment.mParentFragment) {
            if (fragment instanceof C2d4) {
                return ((C2d4) fragment).AYT();
            }
        }
        return C56352iT.A0t.A03(fragmentActivity);
    }
}

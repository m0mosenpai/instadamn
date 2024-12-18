package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.SVa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62876SVa {
    public final AbstractC12990ll A00;

    public static Fragment A00(Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 != null && !(fragment instanceof C60958Rcg)) {
            return A00(fragment2);
        }
        return fragment;
    }

    public C62876SVa(AbstractC12990ll abstractC12990ll) {
        this.A00 = abstractC12990ll;
    }
}

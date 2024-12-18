package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.NvN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54063NvN {
    public static final void A00(Fragment fragment, Fragment fragment2, boolean z) {
        C14360o3.A0B(fragment, 0);
        if (!z || (fragment = fragment.mParentFragment) != null) {
            AbstractC10360h2 parentFragmentManager = fragment.getParentFragmentManager();
            int i = fragment.mFragmentId;
            C14240no c14240no = new C14240no(parentFragmentManager);
            c14240no.A0A(fragment2, i);
            c14240no.A0I(null);
            c14240no.A01();
        }
    }
}

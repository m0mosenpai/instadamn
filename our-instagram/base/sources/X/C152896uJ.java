package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.profile.fragment.ProfileMediaTabFragment;

/* renamed from: X.6uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152896uJ {
    public final /* synthetic */ ProfileMediaTabFragment A00;

    public C152896uJ(ProfileMediaTabFragment profileMediaTabFragment) {
        this.A00 = profileMediaTabFragment;
    }

    public final void A00() {
        HY3 hy3;
        ProfileMediaTabFragment profileMediaTabFragment = this.A00;
        RecyclerView recyclerView = profileMediaTabFragment.mRecyclerView;
        if (recyclerView != null && recyclerView.A1D()) {
            recyclerView.post(new Runnable() { // from class: X.J3J
                @Override // java.lang.Runnable
                public final void run() {
                    HY3 hy32;
                    ProfileMediaTabFragment profileMediaTabFragment2 = C152896uJ.this.A00;
                    if (profileMediaTabFragment2.A08 && (hy32 = profileMediaTabFragment2.A01) != null) {
                        hy32.A01();
                    } else {
                        profileMediaTabFragment2.A02.A01();
                    }
                }
            });
        } else if (profileMediaTabFragment.A08 && (hy3 = profileMediaTabFragment.A01) != null) {
            hy3.A01();
        } else {
            profileMediaTabFragment.A02.A01();
        }
    }
}

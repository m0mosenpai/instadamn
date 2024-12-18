package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.profile.fragment.UserDetailFragment;

/* loaded from: classes4.dex */
public final class ATZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UserDetailFragment A00;

    public ATZ(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        UserDetailFragment userDetailFragment = this.A00;
        C151656sB c151656sB = userDetailFragment.A0s;
        if (c151656sB != null) {
            C151656sB.A00(c151656sB);
            C151656sB.A01(c151656sB);
        }
        ViewGroup viewGroup = userDetailFragment.A06;
        if (viewGroup != null) {
            AbstractC166997dE.A1K(viewGroup, this);
        }
    }
}

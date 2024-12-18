package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ODG {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final AbstractC10360h2 A02;
    public final UserSession A03;
    public final C41181vS A04;

    public ODG(Fragment fragment, UserSession userSession, C41181vS c41181vS) {
        this.A03 = userSession;
        this.A00 = fragment;
        this.A04 = c41181vS;
        this.A02 = fragment.getParentFragmentManager();
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            this.A01 = activity;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}

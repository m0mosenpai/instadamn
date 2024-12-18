package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FN8 {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final FHW A03;
    public final C33220El8 A04;

    public FN8(Fragment fragment, UserSession userSession, C33220El8 c33220El8, FHW fhw) {
        this.A02 = userSession;
        this.A00 = fragment;
        FragmentActivity activity = fragment.getActivity();
        activity.getClass();
        this.A01 = activity;
        this.A03 = fhw;
        this.A04 = c33220El8;
    }
}

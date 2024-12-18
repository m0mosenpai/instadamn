package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G7L implements BC6 {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    @Override // X.BC6
    public final void Czr(C38321qM c38321qM, C75113Zb c75113Zb) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC69888VxF.A00().A09(activity, this.A01, "onboarding_checklist");
        }
    }

    public G7L(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = fragment;
    }
}

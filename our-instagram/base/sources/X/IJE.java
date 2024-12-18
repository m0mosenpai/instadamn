package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IJE {
    public boolean A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;

    public IJE(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC37302Gc3.A1U(userSession, str);
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A04 = str;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            this.A01 = activity;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}

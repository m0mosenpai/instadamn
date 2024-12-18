package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GJM implements InterfaceC37142GYd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public GJM(Context context, Fragment fragment, UserSession userSession, User user) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = user;
    }

    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        FDP.A00(this.A01.getActivity(), this.A00, this.A02, this.A03.getUsername());
    }
}

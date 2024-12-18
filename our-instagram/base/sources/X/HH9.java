package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HH9 extends AbstractC60592pi {
    public InterfaceC11380iw A00;
    public C57112jm A01;
    public final UserSession A02;
    public final LinkedHashMap A03;

    public HH9(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm) {
        AbstractC25229BEm.A1I(userSession, 1, c57112jm);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = c57112jm;
        this.A03 = AbstractC166987dD.A1I();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A03.clear();
    }
}

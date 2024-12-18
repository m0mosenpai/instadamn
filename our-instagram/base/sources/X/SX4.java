package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes10.dex */
public final class SX4 {
    public final InterfaceC65675Tr5 A00;
    public final List A01;
    public final List A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final InterfaceC60442pS A05;

    public SX4(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        this();
        this.A03 = userSession;
        this.A05 = interfaceC60442pS;
        this.A04 = c38321qM;
        this.A02 = AbstractC16960so.A1N(new SPM(interfaceC60442pS, userSession, AbstractC41071vF.A07(userSession, c38321qM), null, "watch_and_leadgen"));
    }

    public SX4() {
        this.A01 = AbstractC166987dD.A1E();
        this.A00 = new TH1(this);
    }
}

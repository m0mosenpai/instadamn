package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Imq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42204Imq implements JPb {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C75113Zb A02;

    public C42204Imq(C120985dq c120985dq, UserSession userSession, C75113Zb c75113Zb) {
        this.A01 = userSession;
        this.A00 = c120985dq;
        this.A02 = c75113Zb;
    }

    @Override // X.JPb
    public final C37644Ghd C09(C120985dq c120985dq) {
        UserSession userSession = this.A01;
        return AbstractC37652Ghl.A01(this.A00, userSession, C3YS.A00(userSession), this.A02, null);
    }

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        return this.A02;
    }

    @Override // X.JPb
    public final List C0A(C120985dq c120985dq) {
        return C16930sl.A00;
    }
}

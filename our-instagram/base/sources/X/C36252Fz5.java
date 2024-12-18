package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fz5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36252Fz5 implements InterfaceC1345866i {
    public final /* synthetic */ C7TP A00;
    public final /* synthetic */ InterfaceC83733oI A01;
    public final /* synthetic */ User A02;

    public C36252Fz5(C7TP c7tp, InterfaceC83733oI interfaceC83733oI, User user) {
        this.A00 = c7tp;
        this.A01 = interfaceC83733oI;
        this.A02 = user;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        UserSession userSession = this.A00.A00;
        String A0c = AbstractC31171DnF.A0c(this.A01);
        List A1J = AbstractC166987dD.A1J(this.A02.getId());
        C14360o3.A0A(c1346766r);
        C36449G5y c36449G5y = new C36449G5y(c1346766r);
        C14360o3.A0B(A0c, 1);
        if (AbstractC166987dD.A1b(A1J)) {
            C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
            A0c2.A0L("direct_v2/threads/%s/remove_admins/", A0c);
            AbstractC35173FfQ.A01(A0c2, userSession, c36449G5y, A1J);
        }
    }
}

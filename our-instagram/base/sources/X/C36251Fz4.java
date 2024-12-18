package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fz4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36251Fz4 implements InterfaceC1345866i {
    public final /* synthetic */ C7TP A00;
    public final /* synthetic */ InterfaceC83733oI A01;
    public final /* synthetic */ List A02;

    public C36251Fz4(C7TP c7tp, InterfaceC83733oI interfaceC83733oI, List list) {
        this.A00 = c7tp;
        this.A01 = interfaceC83733oI;
        this.A02 = list;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        UserSession userSession = this.A00.A00;
        String A0c = AbstractC31171DnF.A0c(this.A01);
        List list = this.A02;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((MessagingUser) it.next()).A03);
        }
        C36450G5z c36450G5z = new C36450G5z(c1346766r, 3);
        C14360o3.A0B(A0c, 1);
        if (AbstractC25226BEj.A1b(A0q)) {
            C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
            AbstractC31173DnH.A1P(A0c2, "direct_v2/remove_invites_from_channel/", A0c);
            A0c2.A9s("invitee_ids", AbstractC35173FfQ.A00(A0q));
            AbstractC35173FfQ.A02(AbstractC25227BEk.A0e(A0c2, C1574875f.class, C75g.class), userSession, c36450G5z);
        }
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fz8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36255Fz8 implements InterfaceC1345866i {
    public final /* synthetic */ C7TP A00;
    public final /* synthetic */ InterfaceC83733oI A01;
    public final /* synthetic */ List A02;

    public C36255Fz8(C7TP c7tp, InterfaceC83733oI interfaceC83733oI, List list) {
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
        EV0 A00 = EV0.A00(c1346766r, 17);
        if (A0c != null) {
            C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
            AbstractC31173DnH.A1P(A0c2, "direct_v2/demote_moderators_from_channel/", A0c);
            EE9.A00(AbstractC31178DnM.A0K(A0c2, "demoted_moderator_igids", AbstractC35173FfQ.A00(A0q)), userSession, A00, 3);
        }
    }
}

package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FzE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36261FzE implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7TP A01;
    public final /* synthetic */ InterfaceC83733oI A02;
    public final /* synthetic */ EnumC31337Dq2 A03;
    public final /* synthetic */ List A04;

    public C36261FzE(C7TP c7tp, InterfaceC83733oI interfaceC83733oI, EnumC31337Dq2 enumC31337Dq2, List list, int i) {
        this.A00 = i;
        this.A03 = enumC31337Dq2;
        this.A01 = c7tp;
        this.A02 = interfaceC83733oI;
        this.A04 = list;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        UserSession userSession;
        C222015v c222015v;
        C25621Ms A0c;
        String A00;
        String str;
        C14360o3.A0B(c1346766r, 0);
        C36450G5z c36450G5z = new C36450G5z(c1346766r, 2);
        if (this.A00 == 29) {
            EnumC31337Dq2 enumC31337Dq2 = this.A03;
            EnumC31337Dq2 enumC31337Dq22 = EnumC31337Dq2.A02;
            userSession = this.A01.A00;
            String A0c2 = AbstractC31171DnF.A0c(this.A02);
            List list = this.A04;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            if (enumC31337Dq2 == enumC31337Dq22) {
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A0i, it);
                }
                C14360o3.A0B(A0c2, 1);
                if (AbstractC25226BEj.A1b(A0i)) {
                    c222015v = null;
                    A0c = AbstractC167017dG.A0c(userSession);
                    AbstractC31173DnH.A1P(A0c, "direct_v2/invite_moderators_to_channel/", A0c2);
                    A00 = AbstractC35173FfQ.A00(A0i);
                    str = "invited_moderator_igids";
                } else {
                    return;
                }
            } else {
                while (it.hasNext()) {
                    AbstractC167017dG.A1V(A0i, it);
                }
                C14360o3.A0B(A0c2, 1);
                if (AbstractC25226BEj.A1b(A0i)) {
                    c222015v = null;
                    A0c = AbstractC167017dG.A0c(userSession);
                    AbstractC31173DnH.A1P(A0c, "direct_v2/invite_collaborators_to_broadcast_chat/", A0c2);
                    A00 = AbstractC35173FfQ.A00(A0i);
                    str = "invited_collaborator_igids";
                } else {
                    return;
                }
            }
        } else {
            userSession = this.A01.A00;
            String A0c3 = AbstractC31171DnF.A0c(this.A02);
            List list2 = this.A04;
            ArrayList A0i2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1V(A0i2, it2);
            }
            C14360o3.A0B(A0c3, 1);
            if (AbstractC25226BEj.A1b(A0i2)) {
                c222015v = null;
                A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0L("direct_v2/threads/%s/add_user/", A0c3);
                A00 = AbstractC35173FfQ.A00(A0i2);
                str = "user_ids";
            } else {
                return;
            }
        }
        A0c.A9s(str, A00);
        AbstractC35173FfQ.A02(AbstractC31172DnG.A0R(c222015v, A0c, C1574875f.class, C75g.class, false), userSession, c36450G5z);
    }
}

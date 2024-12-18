package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class G4G implements InterfaceC164907Zd {
    public final Activity A00;
    public final UserSession A01;
    public final LEK A02;
    public final InterfaceC163877Vb A03;
    public final InterfaceC08830cm A04;

    public G4G(Activity activity, UserSession userSession, LEK lek, InterfaceC163877Vb interfaceC163877Vb, InterfaceC08830cm interfaceC08830cm) {
        AbstractC25233BEq.A0x(1, interfaceC08830cm, lek, interfaceC163877Vb);
        this.A04 = interfaceC08830cm;
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = lek;
        this.A03 = interfaceC163877Vb;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean AFt(DirectMessageIdentifier directMessageIdentifier) {
        return false;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIu(DirectMessageIdentifier directMessageIdentifier, InterfaceC16820sZ interfaceC16820sZ) {
        C7BW c7bw;
        String str;
        Object obj;
        String fbidV2;
        C14360o3.A0B(directMessageIdentifier, 0);
        C7U0 c7u0 = (C7U0) this.A04.get();
        LEK lek = this.A02;
        UserSession userSession = this.A01;
        C83403nh A00 = LEK.A00(lek, ((MessageIdentifier) directMessageIdentifier).A01, "DirectThreadFragment.giveCreatorAIFeedback", false);
        if (A00 != null && (c7bw = A00.A0Q) != null && (str = c7bw.A05) != null && str.length() != 0) {
            String str2 = null;
            Iterator it = c7u0.C7r().BSH().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(AbstractC31171DnF.A0g(obj), A00.A1u)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            InterfaceC163557Ts BT6 = c7u0.BT6();
            if (BT6.CYV(directMessageIdentifier)) {
                User A10 = AbstractC166987dD.A10(userSession);
                String Arm = BT6.Arm(directMessageIdentifier);
                String AaT = BT6.AaT(directMessageIdentifier);
                this.A03.CMc();
                InterfaceC37261oP A002 = C37321oV.A00();
                Activity activity = this.A00;
                C09530e4 A1L = AbstractC166987dD.A1L(AbstractC111324zv.A00(199), AaT);
                C09530e4 A1L2 = AbstractC166987dD.A1L(AbstractC111324zv.A00(380), Arm);
                C09530e4 A1L3 = AbstractC166987dD.A1L(AbstractC111324zv.A00(858), str);
                C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(198), A00.A0h());
                C09530e4 A1L5 = AbstractC166987dD.A1L(AbstractC111324zv.A00(381), A00.A0g());
                C83693oE A0U = A00.A0U();
                if (A0U != null) {
                    str2 = A0U.A00;
                }
                C09530e4 A1L6 = AbstractC166987dD.A1L(AbstractC111324zv.A00(382), str2);
                if (user == null || (fbidV2 = user.A03.Aaa()) == null) {
                    fbidV2 = A10.A03.getFbidV2();
                }
                A002.Cgn(activity, AbstractC61636Rr0.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AbstractC166987dD.A1L(MSV.A00(425), fbidV2)), userSession);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIv(DirectMessageIdentifier directMessageIdentifier) {
        return false;
    }
}

package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LAC {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public LAC(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = MHR.A00(this, EnumC09460dv.A02, 46);
    }

    public final void A01(C206409Bx c206409Bx, InterfaceC37261GbE interfaceC37261GbE, C34411jf c34411jf) {
        C14360o3.A0B(c206409Bx, 0);
        new ArmadilloExpressLinkMessageSender(this.A00).A05(c34411jf.A07(), interfaceC37261GbE, new C29481bP(c206409Bx, null, ((C1OW) c34411jf).A02, null, (DirectThreadKey) c34411jf.C7R().get(0), ((AbstractC29011ae) c34411jf).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) c34411jf).A00, false, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(EnumC46252KdU enumC46252KdU, EnumC46251KdT enumC46251KdT, InterfaceC37261GbE interfaceC37261GbE, AbstractC29011ae abstractC29011ae, Object obj, String str) {
        InterfaceC29491bQ interfaceC29491bQ;
        AbstractC167027dH.A0a(1, interfaceC37261GbE, enumC46252KdU, obj, enumC46251KdT);
        if (A05((DirectThreadKey) JQ1.A0H(abstractC29011ae), abstractC29011ae.A02())) {
            A03(A00(enumC46252KdU, enumC46251KdT, obj), null, interfaceC37261GbE, abstractC29011ae, str);
            return;
        }
        if (abstractC29011ae instanceof InterfaceC29491bQ) {
            interfaceC29491bQ = (InterfaceC29491bQ) abstractC29011ae;
        } else {
            interfaceC29491bQ = null;
        }
        A04(interfaceC37261GbE, interfaceC29491bQ);
    }

    public final void A03(C44920JuY c44920JuY, DirectForwardingParams directForwardingParams, InterfaceC37261GbE interfaceC37261GbE, AbstractC29011ae abstractC29011ae, String str) {
        UserSession userSession = this.A00;
        AbstractC46925Kp6.A00(userSession).A02(LGK.A00.A00(c44920JuY, userSession, null, directForwardingParams, abstractC29011ae, str), interfaceC37261GbE, abstractC29011ae, (DirectThreadKey) JQ1.A0H(abstractC29011ae), 9);
    }

    public final void A04(InterfaceC37261GbE interfaceC37261GbE, InterfaceC29491bQ interfaceC29491bQ) {
        C29481bP ACZ;
        if (interfaceC29491bQ instanceof C33571iJ) {
            C33571iJ c33571iJ = (C33571iJ) interfaceC29491bQ;
            String str = c33571iJ.A02;
            if (str != null) {
                C29271b4 c29271b4 = new C29271b4(null, ((C1OW) c33571iJ).A02, null, (DirectThreadKey) AbstractC166987dD.A16(c33571iJ.C7R()), C2EY.A1H, ((AbstractC29011ae) c33571iJ).A02, Long.valueOf(((AbstractC29011ae) c33571iJ).A00), str);
                C47779L8e c47779L8e = new C47779L8e(this.A00);
                new C19260xA();
                c47779L8e.A01(null, interfaceC37261GbE, c29271b4);
                return;
            }
            return;
        }
        if (interfaceC29491bQ == null || (ACZ = interfaceC29491bQ.ACZ()) == null) {
            return;
        }
        new ArmadilloExpressLinkMessageSender(this.A00).A05(null, interfaceC37261GbE, ACZ);
    }

    public final C44920JuY A00(EnumC46252KdU enumC46252KdU, EnumC46251KdT enumC46251KdT, Object obj) {
        AbstractC167017dG.A1P(obj, enumC46251KdT);
        List A12 = AbstractC43592JPx.A12(enumC46252KdU, ((C28455Ch5) this.A01.getValue()).A01);
        if (A12 != null) {
            Iterator it = A12.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C47628L1n c47628L1n = (C47628L1n) it.next();
                if (C14360o3.A0K(c47628L1n.A00, obj.getClass())) {
                    C44920JuY c44920JuY = (C44920JuY) c47628L1n.A01.invoke(enumC46251KdT, obj);
                    if (c44920JuY != null) {
                        return c44920JuY;
                    }
                }
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean A05(DirectThreadKey directThreadKey, String str) {
        AbstractC167017dG.A1N(directThreadKey, str);
        UserSession userSession = this.A00;
        C81663kb A0c = AbstractC43594JPz.A0c(userSession, directThreadKey);
        C81613kW c81613kW = null;
        if (A0c != null) {
            c81613kW = A0c.Aic();
        }
        if (!C161867Mw.A01(userSession, c81613kW)) {
            if (A0c != null) {
                C81613kW Aic = A0c.Aic();
                if (Aic == null || Aic.A02 == 0) {
                    if ((A0c.Ay8() || A0c.CWO() || C161857Mv.A02.A03(userSession, A0c.Aic())) && AbstractC453326q.A05(userSession, str)) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

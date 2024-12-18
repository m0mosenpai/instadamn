package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0P implements InterfaceC58169PqZ {
    public C52362NFa A00;
    public final UserSession A01;
    public final C52464NJi A02;
    public final C81X A03;
    public final AbstractC59962oe A04;
    public final C54970OTc A05;

    public P0P(AbstractC59962oe abstractC59962oe, UserSession userSession, C54970OTc c54970OTc, C52464NJi c52464NJi) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, c52464NJi, c54970OTc);
        this.A04 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = c52464NJi;
        this.A05 = c54970OTc;
        this.A03 = C81X.A04;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        UserSession userSession = this.A01;
        AbstractC59962oe abstractC59962oe = this.A04;
        C52362NFa c52362NFa = new C52362NFa(abstractC59962oe, userSession, EnumC53098NeB.A04, AbstractC54949ORz.A00(EnumC40111tc.A0a.A00), abstractC59962oe.getModuleName());
        AbstractC50522MSa.A0z(c52362NFa);
        this.A00 = c52362NFa;
        return c52362NFa;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A03;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        C52362NFa c52362NFa = this.A00;
        if (c52362NFa != null) {
            c52362NFa.A02();
            C54970OTc c54970OTc = this.A05;
            C52362NFa c52362NFa2 = this.A00;
            if (c52362NFa2 != null) {
                UserSession userSession = c54970OTc.A01;
                if (!c54970OTc.A00) {
                    InterfaceC16530ry interfaceC16530ry = AbstractC23021Ah.A00(userSession).A7Z;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    if (!AbstractC167017dG.A1b(r1, interfaceC16530ry, c0yrArr, 408)) {
                        c54970OTc.A00 = true;
                        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                        AbstractC167007dF.A1L(A00, A00.A7Z, c0yrArr, 408, true);
                        C54970OTc.A00(c52362NFa2, c54970OTc, null, EnumC58132lV.A02, AbstractC166997dE.A0q(c52362NFa2.getResources(), 2131952320));
                    }
                }
                AbstractC59962oe abstractC59962oe = this.A04;
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
                AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 19), C07Y.A00(viewLifecycleOwner));
                return;
            }
        }
        C14360o3.A0F("addMessageRow");
        throw C00O.createAndThrow();
    }
}

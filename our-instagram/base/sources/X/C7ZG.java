package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7ZG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7ZG implements C7ZH {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC16820sZ A03;

    public C7ZG(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A03 = interfaceC16820sZ;
        this.A02 = C1XM.A00(new C9EW(this, 38));
    }

    @Override // X.C7ZH
    public final void Cvu(int i, String str, String str2) {
    }

    @Override // X.C7ZH
    public final void Cvv(int i) {
    }

    @Override // X.C7ZH
    public final boolean EkL(InterfaceC83733oI interfaceC83733oI, String str, int i) {
        InterfaceC163837Ux C7r = ((C7U0) this.A03.invoke()).C7r();
        if (interfaceC83733oI.equals(C7r.CCa())) {
            Context requireContext = this.A00.requireContext();
            UserSession userSession = this.A01;
            String C7l = C7r.C7l();
            C193328hC c193328hC = new C193328hC(requireContext);
            c193328hC.A0A(2131961880);
            c193328hC.A0r(C7MK.A00(requireContext, userSession, str, C7l, i));
            c193328hC.A07();
            C0fJ.A00(c193328hC.A02());
            return true;
        }
        return false;
    }
}

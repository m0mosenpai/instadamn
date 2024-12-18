package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.WkH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70913WkH implements InterfaceC65232xL, XG0, InterfaceC71917XAb {
    public C66362zD A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C66096TzX A03;
    public final InterfaceC43406JFw A04;
    public final JIG A05;
    public final InterfaceC60442pS A06;
    public final C68842Vcy A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    public C70913WkH(Fragment fragment, UserSession userSession, InterfaceC43406JFw interfaceC43406JFw, JIG jig, InterfaceC60442pS interfaceC60442pS, C68842Vcy c68842Vcy) {
        C14360o3.A0B(userSession, 2);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A06 = interfaceC60442pS;
        this.A05 = jig;
        this.A07 = c68842Vcy;
        this.A04 = interfaceC43406JFw;
        this.A03 = new C66096TzX();
        C66392zG A00 = C66362zD.A00(fragment.requireContext());
        A00.A01(new Object());
        A00.A01(new C31696Dw1(false, 0));
        A00.A01(new C39077HIb(interfaceC60442pS, userSession, interfaceC43406JFw, jig, c68842Vcy));
        this.A00 = A00.A00();
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A03.BRZ(c38321qM);
    }

    @Override // X.XG0
    public final int AVT(Object obj) {
        C66362zD c66362zD = this.A00;
        String id = ((HKZ) obj).A03.getId();
        if (id != null) {
            return c66362zD.A02(id);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XG0
    public final U0N CFF(int i) {
        InterfaceC127965qP interfaceC127965qP;
        Object A04 = this.A00.A04(i);
        if (!(A04 instanceof InterfaceC127965qP) || (interfaceC127965qP = (InterfaceC127965qP) A04) == null || !interfaceC127965qP.BQN().Cff()) {
            return null;
        }
        C38321qM BQN = interfaceC127965qP.BQN();
        C14360o3.A0B(BQN, 0);
        if (BQN.getId() != null) {
            String id = interfaceC127965qP.getId();
            if (id != null) {
                return new U0N(null, BQN, id, interfaceC127965qP.CQJ());
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XG0
    public final int CFG(U0N u0n) {
        return this.A00.A02(u0n.A02);
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        C66096TzX c66096TzX = this.A03;
        c66096TzX.A00.clear();
        c66096TzX.A01.clear();
    }

    @Override // X.XG0, X.InterfaceC65242xM
    public final int getCount() {
        return this.A00.getItemCount();
    }

    @Override // X.InterfaceC71917XAb
    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        C14360o3.A07(A04);
        return A04;
    }
}

package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50849Mdg extends C9U7 {
    public final Bundle A00;
    public final InterfaceC11380iw A01;

    public C50849Mdg(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A01 = interfaceC11380iw;
        this.A00 = bundle;
    }

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        AbstractC167017dG.A1P(cls, c152406tQ);
        UserSession A06 = C023409i.A0A.A06(this.A00);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        P4X p4x = new P4X(interfaceC11380iw, A06);
        if (cls.isAssignableFrom(NPA.class)) {
            return new NPA(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(NP7.class)) {
            return new NP7(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C51008MgF.class)) {
            return new C51008MgF(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C52589NOk.class)) {
            return new C52589NOk(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(NOU.class)) {
            return new NOU(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C52601NOw.class)) {
            return new C52601NOw(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(C52596NOr.class)) {
            return new C52596NOr(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(NP1.class)) {
            return new NP1(c152406tQ, A06, p4x);
        }
        if (cls.isAssignableFrom(NP0.class)) {
            return new NP0(c152406tQ, interfaceC11380iw, A06);
        }
        if (cls.isAssignableFrom(C52580NOa.class)) {
            return new C52580NOa(c152406tQ, A06);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("viewModel ");
        A1C.append(cls);
        throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" is not supported in LeadGenViewModelFactory", A1C));
    }
}

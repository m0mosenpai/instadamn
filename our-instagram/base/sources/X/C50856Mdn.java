package X;

import android.os.Bundle;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Mdn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50856Mdn extends C9U7 {
    public final W6E A00;
    public final PromoteData A01;
    public final PromoteState A02;
    public final InterfaceC11380iw A03;

    public C50856Mdn(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, W6E w6e, PromoteData promoteData, PromoteState promoteState, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A03 = interfaceC11380iw;
        this.A01 = promoteData;
        this.A02 = promoteState;
        this.A00 = w6e;
    }

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        AbstractC167017dG.A1P(cls, c152406tQ);
        PromoteData promoteData = this.A01;
        if (promoteData != null) {
            P4U p4u = new P4U(promoteData, this.A03);
            if (cls.isAssignableFrom(NP6.class)) {
                return new NP6(p4u, promoteData);
            }
            if (cls.isAssignableFrom(C52604NOz.class)) {
                return new C52604NOz(c152406tQ, p4u, promoteData);
            }
            if (cls.isAssignableFrom(C52590NOl.class)) {
                return new C52590NOl(c152406tQ, p4u, this.A00, promoteData);
            }
            if (cls.isAssignableFrom(C52597NOs.class)) {
                return new C52597NOs(c152406tQ, p4u, promoteData);
            }
            if (cls.isAssignableFrom(C52600NOv.class)) {
                return new C52600NOv(p4u, promoteData);
            }
            if (cls.isAssignableFrom(NOT.class)) {
                return new NOT(p4u, promoteData);
            }
            if (cls.isAssignableFrom(NPB.class)) {
                return new NPB(p4u, promoteData, this.A02);
            }
            if (cls.isAssignableFrom(C44504JmA.class)) {
                return new C44504JmA(c152406tQ, p4u, promoteData, this.A02);
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("viewModel ");
            A1C.append(cls);
            throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" is not supported in PromoteViewModelFactory", A1C));
        }
        throw AbstractC166987dD.A12("promoteData cannot be null");
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ivj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42745Ivj implements InterfaceC61752rc {
    public final C65192xH A00;
    public final C26281Pj A01;
    public final InterfaceC62242sP A02;

    private final void A00() {
        EnumC26291Pk enumC26291Pk;
        C26281Pj c26281Pj = this.A01;
        List A08 = this.A00.A08();
        ArrayList A0q = AbstractC167017dG.A0q(A08);
        for (Object obj : A08) {
            InterfaceC62242sP interfaceC62242sP = this.A02;
            if (interfaceC62242sP.CX6(obj)) {
                enumC26291Pk = EnumC26291Pk.A02;
            } else if (!interfaceC62242sP.CX8(obj) && !interfaceC62242sP.CX7(obj)) {
                enumC26291Pk = EnumC26291Pk.A03;
            } else {
                enumC26291Pk = EnumC26291Pk.A04;
            }
            A0q.add(enumC26291Pk);
        }
        List list = c26281Pj.A01;
        list.clear();
        AnonymousClass016.A16(A0q, list);
    }

    public C42745Ivj(C65192xH c65192xH, C26281Pj c26281Pj, InterfaceC62242sP interfaceC62242sP) {
        AbstractC167017dG.A1R(c26281Pj, interfaceC62242sP);
        this.A00 = c65192xH;
        this.A01 = c26281Pj;
        this.A02 = interfaceC62242sP;
    }

    @Override // X.InterfaceC61752rc
    public final void DNl() {
        A00();
    }

    @Override // X.InterfaceC61752rc
    public final void DNz() {
        A00();
    }

    @Override // X.InterfaceC61752rc
    public final /* bridge */ /* synthetic */ void DNG(Object obj, int i) {
        A00();
    }
}

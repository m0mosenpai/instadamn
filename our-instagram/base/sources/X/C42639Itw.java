package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Itw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42639Itw implements InterfaceC692739n {
    public final InterfaceC60442pS A00;
    public final UserSession A01;
    public final C684636j A02;
    public final InterfaceC692739n A03;
    public final C1M1 A04;

    public C42639Itw(UserSession userSession, C684636j c684636j, InterfaceC60442pS interfaceC60442pS, InterfaceC692739n interfaceC692739n, C1M1 c1m1) {
        AbstractC167027dH.A0a(1, interfaceC692739n, userSession, interfaceC60442pS, c1m1);
        C14360o3.A0B(c684636j, 5);
        this.A03 = interfaceC692739n;
        this.A01 = userSession;
        this.A00 = interfaceC60442pS;
        this.A04 = c1m1;
        this.A02 = c684636j;
    }

    @Override // X.InterfaceC692739n
    public final void Dm3(C38321qM c38321qM, C75113Zb c75113Zb, String str, boolean z, boolean z2) {
        C19260xA c19260xA;
        boolean A1Y = AbstractC25229BEm.A1Y(c75113Zb);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A00;
        EnumC75193Zm enumC75193Zm = c75113Zb.A0m;
        String sessionId = this.A04.getSessionId();
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c19260xA = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM).A00();
        } else {
            c19260xA = null;
        }
        C41771Ien.A03(interfaceC60442pS, c19260xA, userSession, c38321qM, enumC75193Zm, c75113Zb, "sfplt_in_menu", sessionId, AbstractC25226BEj.A1G(c38321qM), c75113Zb.getPosition(), A1Y);
        this.A03.Dm3(c38321qM, c75113Zb, str, z, A1Y);
    }

    @Override // X.InterfaceC692739n
    public final void Dth(C1XV c1xv, C38321qM c38321qM, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A03.Dth(c1xv, c38321qM, str, str2, str3, str4, str5, str6, i, i2, z, z2, z3);
    }

    @Override // X.InterfaceC692739n
    public final void E2W(Integer num) {
        C14360o3.A0B(num, 0);
        this.A03.E2W(num);
    }

    @Override // X.InterfaceC692739n
    public final void Eke(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 1);
        this.A03.Eke(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC692739n
    public final void Ekg(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 1);
        this.A03.Ekg(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC692739n
    public final void ElV(C38321qM c38321qM, C75113Zb c75113Zb, VG2 vg2, String str) {
        C14360o3.A0B(vg2, 3);
        this.A03.ElV(c38321qM, c75113Zb, vg2, str);
    }

    @Override // X.InterfaceC692739n
    public final void ElX(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb, VG2 vg2, String str) {
        AbstractC167017dG.A1Q(c75113Zb, vg2);
        this.A03.ElX(c38321qM, c38525Gwl, c75113Zb, vg2, str);
    }

    @Override // X.InterfaceC692739n
    public final void Cgq(C38321qM c38321qM, String str) {
        this.A03.Cgq(c38321qM, str);
    }

    @Override // X.InterfaceC692739n
    public final void DB5(C38321qM c38321qM) {
        this.A03.DB5(c38321qM);
    }

    @Override // X.InterfaceC692739n
    public final void E2f(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
        this.A03.E2f(c38321qM, c38525Gwl, c75113Zb);
    }

    @Override // X.InterfaceC692739n
    public final void El8(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        this.A03.El8(c38321qM, c75113Zb, str);
    }

    @Override // X.InterfaceC692739n
    public final void F96(C42521Is0 c42521Is0, C42662IuJ c42662IuJ) {
        AbstractC167017dG.A1N(c42521Is0, c42662IuJ);
        this.A03.F96(c42521Is0, c42662IuJ);
    }

    @Override // X.InterfaceC692739n
    public final void F97(C4dV c4dV, C119835bh c119835bh) {
        AbstractC167017dG.A1N(c4dV, c119835bh);
        this.A03.F97(c4dV, c119835bh);
    }
}

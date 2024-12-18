package X;

/* loaded from: classes4.dex */
public final class AlW implements InterfaceC169467hM {
    public final InterfaceC169467hM A00;
    public final boolean A01;
    public final /* synthetic */ FNH A02;

    @Override // X.InterfaceC169477hN
    public final C1ON AN6(UQE uqe, String str) {
        C14360o3.A0B(uqe, 0);
        return AN7(uqe.A01, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        boolean z = this.A02.A00;
        if (z == this.A01) {
            return this.A00.AN7(str, str2);
        }
        if (z) {
            str3 = "searching";
        } else {
            str3 = "sorting";
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0R("FollowListFragmentQueryManager is in a wrong state: ", str3));
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
        C14360o3.A0B(str, 0);
        if (this.A02.A00 == this.A01) {
            this.A00.Dfo(str);
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        C14360o3.A0B(str, 0);
        if (this.A02.A00 == this.A01) {
            this.A00.Dg3(str);
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        C14360o3.A0B(str, 0);
        if (this.A02.A00 == this.A01) {
            this.A00.DgJ(str);
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    public AlW(InterfaceC169467hM interfaceC169467hM, FNH fnh, boolean z) {
        this.A02 = fnh;
        this.A01 = z;
        this.A00 = interfaceC169467hM;
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return this.A00.BqZ();
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        AbstractC167017dG.A1N(str, abstractC115105If);
        if (this.A02.A00 == this.A01) {
            this.A00.Dft(abstractC115105If, str);
        }
    }

    @Override // X.InterfaceC169457hL
    public final void DgS(InterfaceC40821up interfaceC40821up, String str) {
        AbstractC167017dG.A1N(str, interfaceC40821up);
        if (this.A02.A00 == this.A01) {
            this.A00.DgS(interfaceC40821up, str);
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}

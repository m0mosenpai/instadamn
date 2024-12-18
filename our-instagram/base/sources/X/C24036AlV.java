package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AlV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24036AlV implements InterfaceC169467hM {
    public InterfaceC16660sJ A00;
    public final UserSession A01;
    public final C1GL A02;

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A01;
        String substring = str.substring(1);
        C14360o3.A07(substring);
        return A2J.A00(userSession, substring, "story_hashtag_tag_page");
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return this.A02;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C32212EDl c32212EDl = (C32212EDl) interfaceC40821up;
        C14360o3.A0B(c32212EDl, 1);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c32212EDl.getItems());
        }
    }

    public C24036AlV(UserSession userSession, C1GL c1gl) {
        this.A02 = c1gl;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}

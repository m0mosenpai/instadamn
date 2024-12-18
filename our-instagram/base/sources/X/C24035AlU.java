package X;

import android.widget.EditText;
import com.instagram.common.session.UserSession;

/* renamed from: X.AlU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24035AlU implements InterfaceC37294Gbv {
    public EditText A00;
    public final C9NL A01;
    public final InterfaceC169497hP A02;
    public final UserSession A03;
    public final C65974TxR A04;

    public C24035AlU(UserSession userSession, C9NL c9nl) {
        this.A01 = c9nl;
        this.A03 = userSession;
        C169487hO c169487hO = new C169487hO();
        this.A02 = c169487hO;
        this.A04 = AbstractC65980TxZ.A01(null, null, null, this, c169487hO, C05F.A00, false);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        return A2J.A00(this.A01.A0C, str.substring(1), "story_hashtag_tag_page");
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

    public final void A00(EditText editText) {
        this.A00 = editText;
        String A00 = AbstractC23019ADb.A00(editText, false);
        if (A00 != null && A00.length() > 1 && A00.charAt(0) == '#') {
            this.A04.A06(A00);
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C32212EDl c32212EDl = (C32212EDl) interfaceC40821up;
        AbstractC167017dG.A1N(str, c32212EDl);
        EditText editText = this.A00;
        if (editText == null) {
            C14360o3.A0F("editText");
            throw C00O.createAndThrow();
        }
        String A00 = AbstractC23019ADb.A00(editText, false);
        if (!c32212EDl.getItems().isEmpty() && A00 != null && A00.length() != 0 && str.equals(A00)) {
            C9NL c9nl = this.A01;
            c9nl.A0G.A00(c32212EDl.getItems());
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}

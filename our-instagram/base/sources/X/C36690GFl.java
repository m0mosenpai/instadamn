package X;

import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GFl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36690GFl implements InterfaceC169517hR, InterfaceC169507hQ {
    public InterfaceC169507hQ A00;
    public boolean A02;
    public final FNV A04;
    public final C47460Kxp A05;
    public final String A07;
    public final boolean A09;
    public final boolean A0A;
    public String A03 = "";
    public final HashMap A06 = AbstractC166987dD.A1G();
    public Object A01 = AbstractC166987dD.A1E();
    public final List A08 = C16930sl.A00;

    @Override // X.InterfaceC169517hR
    public final String An8() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CZV() {
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final void DEw() {
    }

    @Override // X.InterfaceC169517hR
    public final void EKu() {
    }

    @Override // X.InterfaceC169517hR
    public final void ERL(List list) {
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        InterfaceC169507hQ interfaceC169507hQ = this.A00;
        if (interfaceC169507hQ != null) {
            interfaceC169507hQ.DcI(this);
        }
    }

    @Override // X.InterfaceC169517hR
    public final void EYJ(InterfaceC169507hQ interfaceC169507hQ) {
        if (this.A00 != interfaceC169507hQ) {
            this.A00 = interfaceC169507hQ;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169517hR
    public final void Eby(String str) {
        this.A03 = str;
        FNV fnv = this.A04;
        this.A01 = AbstractC166987dD.A1E();
        this.A02 = true;
        C47460Kxp c47460Kxp = this.A05;
        DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel = fnv.A04;
        AbstractC31174DnI.A1E(fnv.A03, directShareSheetFragmentViewModel.A0J, new C50261MHq(c47460Kxp, 15), 22);
        C15370ps A1F = AbstractC25225BEi.A1F();
        AbstractC166987dD.A1Z(new MCM(fnv, A1F, c47460Kxp, null, 34), AbstractC141776au.A00(directShareSheetFragmentViewModel));
        this.A02 = false;
        InterfaceC169507hQ interfaceC169507hQ = this.A00;
        if (interfaceC169507hQ != null) {
            interfaceC169507hQ.DcI(this);
        }
    }

    public C36690GFl(FNV fnv, C47460Kxp c47460Kxp) {
        this.A04 = fnv;
        this.A05 = c47460Kxp;
        this.A07 = fnv.A00;
        this.A09 = fnv.A01;
        this.A0A = fnv.A02;
    }

    @Override // X.InterfaceC169517hR
    public final /* bridge */ /* synthetic */ Object B3l() {
        return this.A06;
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A03;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        return "";
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        return this.A07;
    }

    @Override // X.InterfaceC169517hR
    public final Object Bov() {
        return this.A01;
    }

    @Override // X.InterfaceC169517hR
    public final List Bri() {
        return this.A08;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CUG() {
        return this.A09;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CXh() {
        return this.A0A;
    }

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        return this.A02;
    }
}

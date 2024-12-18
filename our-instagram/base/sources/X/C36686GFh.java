package X;

import java.util.List;

/* renamed from: X.GFh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36686GFh implements InterfaceC169507hQ, InterfaceC169357h9 {
    public InterfaceC169507hQ A00;
    public final FGP A03;
    public String A02 = "";
    public Object A01 = C16930sl.A00;

    @Override // X.InterfaceC169517hR
    public final String An8() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final Object B3l() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return false;
    }

    @Override // X.InterfaceC169357h9
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC169357h9, X.InterfaceC169517hR
    public final List Bri() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CUG() {
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CXh() {
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

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        return false;
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
        this.A02 = str;
        if (str != null) {
            FGP fgp = this.A03;
            FHP fhp = new FHP(this);
            C25805BbM c25805BbM = fgp.A00;
            c25805BbM.A0F(str);
            AbstractC166987dD.A1Z(new MC6(fgp, fhp, (InterfaceC23621Ds) null, 31), AbstractC141776au.A00(c25805BbM));
        }
    }

    public C36686GFh(FGP fgp) {
        this.A03 = fgp;
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A02;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        return "";
    }

    @Override // X.InterfaceC169517hR
    public final Object Bov() {
        return this.A01;
    }
}

package X;

import java.util.List;

/* renamed from: X.GFj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36688GFj implements InterfaceC169507hQ, InterfaceC169357h9 {
    public InterfaceC169507hQ A00;
    public final C34658FOr A03;
    public final InterfaceC169357h9 A04;
    public final C1GL A05;
    public final Object A06;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public Object A01 = C16930sl.A00;
    public String A02 = "";
    public final List A07 = AbstractC16960so.A1Q("Categories", "Suggested");

    @Override // X.InterfaceC169517hR
    public final String An8() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        return null;
    }

    @Override // X.InterfaceC169357h9
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CZV() {
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final void DEw() {
    }

    @Override // X.InterfaceC169517hR
    public final void ERL(List list) {
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        Object Bov = this.A04.Bov();
        if (Bov != null) {
            this.A01 = this.A03.A00(Bov);
        }
        InterfaceC169507hQ interfaceC169507hQ = this.A00;
        if (interfaceC169507hQ != null) {
            interfaceC169507hQ.DcI(this);
        }
    }

    @Override // X.InterfaceC169517hR
    public final void EKu() {
        this.A04.EKu();
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

    public C36688GFj(C1GL c1gl, C34658FOr c34658FOr, InterfaceC169357h9 interfaceC169357h9) {
        this.A04 = interfaceC169357h9;
        this.A03 = c34658FOr;
        this.A05 = c1gl;
        this.A06 = interfaceC169357h9.B3l();
        this.A0B = interfaceC169357h9.isLoading();
        this.A09 = interfaceC169357h9.CUG();
        this.A0A = interfaceC169357h9.CXh();
        this.A08 = interfaceC169357h9.BC6();
        c1gl.schedule(new G0E(this));
    }

    @Override // X.InterfaceC169517hR
    public final Object B3l() {
        return this.A06;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return this.A08;
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A02;
    }

    @Override // X.InterfaceC169517hR
    public final Object Bov() {
        return this.A01;
    }

    @Override // X.InterfaceC169357h9, X.InterfaceC169517hR
    public final List Bri() {
        return this.A07;
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
        return this.A0B;
    }

    @Override // X.InterfaceC169517hR
    public final void Eby(String str) {
        this.A02 = str;
    }
}

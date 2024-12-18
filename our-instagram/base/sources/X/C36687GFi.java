package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GFi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36687GFi implements InterfaceC169507hQ, InterfaceC169357h9 {
    public InterfaceC169507hQ A00;
    public final UserSession A03;
    public final FGQ A04;
    public String A02 = "";
    public Object A01 = AbstractC166987dD.A1E();
    public final HashMap A05 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC169517hR
    public final String An8() {
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
    public final void Eby(String str) {
        this.A02 = str;
        if (str != null) {
            FGQ fgq = this.A04;
            UserSession userSession = this.A03;
            FHQ fhq = new FHQ(this);
            InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(fgq.A00);
            fgq.A00 = AbstractC25226BEj.A1L(new C57161PZf(userSession, fhq, str, A0s, 14, 42), AnonymousClass194.A02(C12L.A00.A04));
        }
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

    public C36687GFi(UserSession userSession, FGQ fgq) {
        this.A03 = userSession;
        this.A04 = fgq;
    }

    @Override // X.InterfaceC169517hR
    public final /* bridge */ /* synthetic */ Object B3l() {
        return this.A05;
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

package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168677g1 implements InterfaceC169517hR, InterfaceC169507hQ {
    public InterfaceC169507hQ A00;
    public final UserSession A03;
    public final C168667g0 A04;
    public String A02 = "";
    public Object A01 = new ArrayList();
    public final HashMap A05 = new HashMap();

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
    public final String An8() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final /* bridge */ /* synthetic */ Object B3l() {
        return this.A05;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return false;
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
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final Object Bov() {
        return this.A01;
    }

    @Override // X.InterfaceC169517hR
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
        if (C14360o3.A0K(str, "#")) {
            C168667g0 c168667g0 = this.A04;
            UserSession userSession = this.A03;
            A6C a6c = new A6C(this);
            AnonymousClass195 anonymousClass195 = c168667g0.A00;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            C19K A02 = AnonymousClass194.A02(C12L.A00.A04);
            c168667g0.A00 = AbstractC23641Du.A04(AnonymousClass191.A00, new C57173PZr(userSession, a6c, (InterfaceC23621Ds) null), A02);
        }
    }

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        return false;
    }

    public C168677g1(UserSession userSession, C168667g0 c168667g0) {
        this.A03 = userSession;
        this.A04 = c168667g0;
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eix, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33093Eix extends C4A7 implements MSM {
    public Object A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC169517hR A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C0UO A0G;
    public final C0UO A0H;
    public final C0UO A0I;
    public final C0UO A0J;
    public final C0UO A0K;
    public final C0UO A0L;
    public final C0UO A0M;
    public final C0UO A0N;
    public final C0UO A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;

    @Override // X.InterfaceC50482MQk
    public final void FBt(String str) {
        AbstractC166997dE.A1Y(this.A05, true);
        AbstractC166987dD.A1Z(new MCF(this, str, null, 23), super.A01);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33093Eix(Context context, UserSession userSession, InterfaceC169517hR interfaceC169517hR) {
        super("search_interop", C4A8.A00(359266386));
        Boolean A0a = AbstractC166997dE.A0a();
        this.A01 = context;
        this.A03 = interfaceC169517hR;
        this.A02 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A06 = A0o;
        this.A0Q = A0o;
        C008002u A1H = AbstractC25225BEi.A1H(A0a);
        this.A04 = A1H;
        this.A0L = A1H;
        C008002u A0h = AbstractC31179DnN.A0h();
        this.A09 = A0h;
        this.A0I = A0h;
        C008002u A1H2 = AbstractC25225BEi.A1H(A0a);
        this.A05 = A1H2;
        this.A0M = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(A0a);
        this.A0B = A1H3;
        this.A0K = A1H3;
        C008002u A00 = C10E.A00(null);
        this.A0E = A00;
        this.A0P = A00;
        C008002u A002 = C10E.A00(null);
        this.A07 = A002;
        this.A0G = A002;
        C008002u A003 = C10E.A00(null);
        this.A0D = A003;
        this.A0O = A003;
        C008002u A004 = C10E.A00(null);
        this.A0F = A004;
        this.A0R = A004;
        C008002u A1H4 = AbstractC25225BEi.A1H(A0a);
        this.A0C = A1H4;
        this.A0N = A1H4;
        C008002u A1H5 = AbstractC25225BEi.A1H(A0a);
        this.A0A = A1H5;
        this.A0J = A1H5;
        C008002u A0h2 = AbstractC31179DnN.A0h();
        this.A08 = A0h2;
        this.A0H = A0h2;
        Object B3l = interfaceC169517hR.B3l();
        if (B3l != null) {
            A0h.Egh(AbstractC167007dF.A0n("direct_inbox_search_extra_data", B3l));
        }
        A003.Egh(interfaceC169517hR.Bk6());
        A00.Egh(interfaceC169517hR.Bo9());
        A004.Egh(interfaceC169517hR.Bri());
        A1H5.Egh(Boolean.valueOf(interfaceC169517hR.BC6()));
    }

    @Override // X.MSM
    public final C0UO An9() {
        return this.A0G;
    }

    @Override // X.MSM
    public final C0UO B3m() {
        return this.A0I;
    }

    @Override // X.MSM
    public final C0UO Bk7() {
        return this.A0O;
    }

    @Override // X.MSM
    public final C0UO BoA() {
        return this.A0P;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO BrB() {
        return this.A0Q;
    }

    @Override // X.MSM
    public final C0UO Brj() {
        return this.A0R;
    }

    @Override // X.MSM
    public final C0UO CUF() {
        return this.A0K;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO CXg() {
        return this.A0L;
    }

    @Override // X.MSM
    public final C0UO CXi() {
        return this.A0M;
    }

    @Override // X.MSM
    public final C0UO CZU() {
        return this.A0N;
    }
}

package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hbg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39454Hbg extends PJX {
    public final /* synthetic */ C692539l A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C38525Gwl A02;
    public final /* synthetic */ JG9 A03;
    public final /* synthetic */ C75113Zb A04;

    public C39454Hbg(C692539l c692539l, C38321qM c38321qM, C38525Gwl c38525Gwl, JG9 jg9, C75113Zb c75113Zb) {
        this.A00 = c692539l;
        this.A02 = c38525Gwl;
        this.A04 = c75113Zb;
        this.A01 = c38321qM;
        this.A03 = jg9;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        JG9 jg9 = this.A03;
        if (jg9 != null) {
            jg9.DI1(!z, false);
        }
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        C9GR.A0E(this.A00.A00.getActivity(), AbstractC43591JPw.A00(198));
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        EnumC75193Zm enumC75193Zm;
        if ("ig_spam_v3".equals(str)) {
            enumC75193Zm = EnumC75193Zm.A0I;
        } else if ("ig_false_news".equals(str)) {
            enumC75193Zm = EnumC75193Zm.A0H;
        } else {
            enumC75193Zm = EnumC75193Zm.A0G;
        }
        C38525Gwl c38525Gwl = this.A02;
        if (c38525Gwl != null) {
            C75113Zb c75113Zb = this.A04;
            c75113Zb.A0m = enumC75193Zm;
            C693539v c693539v = C693439u.A03;
            C692539l c692539l = this.A00;
            UserSession userSession = c692539l.A01;
            c693539v.A09(new C41695IdO(userSession, c692539l.A02.C9D()).A02(this.A01, c75113Zb), userSession, c38525Gwl, c75113Zb);
            return;
        }
        this.A00.A02.BDf().DKd(null, this.A01, enumC75193Zm, this.A04);
    }
}

package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PII implements InterfaceC147206jw {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C148666mb A01;

    public PII(InterfaceC11380iw interfaceC11380iw, C148666mb c148666mb) {
        this.A01 = c148666mb;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC147206jw
    public final void DZe() {
        C148666mb c148666mb = this.A01;
        if (!c148666mb.A01) {
            c148666mb.A05.EJJ();
        } else {
            c148666mb.A01 = false;
        }
    }

    @Override // X.InterfaceC147206jw
    public final void DZf() {
        C148666mb c148666mb = this.A01;
        C41181vS AuU = c148666mb.A05.AuU();
        if (AuU == null || AuU.A0e != EnumC41231vY.A0E) {
            C51622Yk c51622Yk = c148666mb.A00;
            if (c51622Yk != null) {
                c51622Yk.A03(true);
            }
            c148666mb.A00 = null;
        }
        AbstractC208329Jr.A06(this.A00, c148666mb.A04, C05F.A00);
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        C105804pr c105804pr;
        String str;
        C148666mb c148666mb = this.A01;
        C41181vS AuU = c148666mb.A05.AuU();
        if (AuU != null && (c105804pr = AuU.A0C) != null && (str = c105804pr.A04) != null) {
            InterfaceC11380iw interfaceC11380iw = this.A00;
            c148666mb.A01 = true;
            UserSession userSession = c148666mb.A04;
            AbstractC208329Jr.A06(interfaceC11380iw, userSession, C05F.A01);
            FET.A00.A08(c148666mb.A03.getRootActivity(), C22P.A3W, userSession, "stories", str);
        }
    }
}

package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HHb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39051HHb extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final HCa A02;
    public final IHA A03;
    public final String A04;
    public final String A05;

    public /* synthetic */ C39051HHb(InterfaceC11380iw interfaceC11380iw, UserSession userSession, HCa hCa, String str, String str2, String str3) {
        IHA iha = new IHA(userSession);
        AbstractC167027dH.A13(str, str2, userSession);
        C14360o3.A0B(str3, 6);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = hCa;
        this.A03 = iha;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A05;
        String str2 = this.A04;
        return new C38318GtD(this.A00, this.A01, this.A02, this.A03, str, str2);
    }
}

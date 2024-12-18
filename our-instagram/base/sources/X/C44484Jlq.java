package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jlq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44484Jlq extends AbstractC52922bZ {
    public final KZA A00;
    public final C05A A01;
    public final C0UO A02;

    public /* synthetic */ C44484Jlq(UserSession userSession, String str) {
        KZA A00 = LEP.A02.A00(userSession, str);
        AbstractC167007dF.A1D(str, 1, userSession);
        this.A00 = A00;
        Integer num = C05F.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C51702MsX(num, num, null, null, null, false, false, true));
        this.A01 = A1H;
        this.A02 = A1H;
        C141796aw A002 = AbstractC141776au.A00(this);
        C57156PZa c57156PZa = new C57156PZa(this, userSession, (InterfaceC23621Ds) null, 23);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c57156PZa, A002);
        AbstractC23641Du.A03(num, anonymousClass191, new MCF(this, str, null, 42), AbstractC141776au.A00(this));
    }
}

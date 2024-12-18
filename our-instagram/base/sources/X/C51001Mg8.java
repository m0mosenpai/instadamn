package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mg8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51001Mg8 extends AbstractC52922bZ {
    public final C2GT A00;
    public final C54436O3q A01;
    public final InterfaceC24731Iq A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final UserSession A07;
    public final List A08;
    public final C05A A09;

    public C51001Mg8(UserSession userSession, C54436O3q c54436O3q, List list) {
        AbstractC167007dF.A1E(userSession, 1, c54436O3q);
        this.A07 = userSession;
        this.A08 = list;
        this.A01 = c54436O3q;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A02 = c24721Ip;
        this.A03 = AbstractC07080Za.A03(c24721Ip);
        C008002u A1H = AbstractC25225BEi.A1H(true);
        this.A05 = A1H;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A09 = A0o;
        this.A06 = AbstractC25225BEi.A1H(false);
        this.A04 = AbstractC25225BEi.A1H(false);
        C15150pV A03 = C10Q.A03(new C57176PZz(2, null), A1H, A0o);
        AnonymousClass059 A01 = AbstractC208910l.A01(C1T.A00, AbstractC141776au.A00(this), A03, C10I.A00);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A01);
        A1H.Egh(true);
        if (list != null && list.contains(UserMonetizationProductType.A0G)) {
            AbstractC23641Du.A05(anonymousClass191, new PZG(this, (InterfaceC23621Ds) null, 29), AbstractC141776au.A00(this));
        } else {
            A1H.Egh(false);
            A00(this);
        }
    }

    public static final void A00(C51001Mg8 c51001Mg8) {
        ArrayList A1E = AbstractC166987dD.A1E();
        List list = c51001Mg8.A08;
        if (list != null) {
            if (list.contains(UserMonetizationProductType.A0G)) {
                if (!C18U.A06(C06090Tz.A06, c51001Mg8.A07, 36315112424737808L)) {
                    A1E.add(new Object());
                    A1E.add(new C29341Cwa(AbstractC31176DnK.A1b(c51001Mg8.A06)));
                    A1E.add(new Object());
                }
                A1E.add(new C29342Cwb(IGRevShareProductType.A05, 2131952936));
            }
            if (list.contains(UserMonetizationProductType.A0D)) {
                A1E.add(new C29342Cwb(IGRevShareProductType.A04, 2131952937));
            }
        }
        c51001Mg8.A09.Egh(A1E);
    }
}

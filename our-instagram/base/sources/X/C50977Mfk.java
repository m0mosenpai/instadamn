package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Mfk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50977Mfk extends AbstractC52922bZ {
    public final IGRevShareProductType A00;
    public final UserMonetizationProductType A01;
    public final UserSession A02;
    public final MonetizationRepository A03;
    public final C454527f A04;
    public final OTV A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C0UO A09;

    public C50977Mfk(IGRevShareProductType iGRevShareProductType, UserMonetizationProductType userMonetizationProductType, UserSession userSession, MonetizationRepository monetizationRepository, C454527f c454527f, OTV otv) {
        C14360o3.A0B(monetizationRepository, 4);
        this.A02 = userSession;
        this.A00 = iGRevShareProductType;
        this.A01 = userMonetizationProductType;
        this.A03 = monetizationRepository;
        this.A05 = otv;
        this.A04 = c454527f;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A06 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
        C008002u A1H = AbstractC25225BEi.A1H(new C51722Msz("not_eligible", IGTVAccountLevelMonetizationToggleSetting.A06.A00, true, false));
        this.A08 = A1H;
        this.A09 = AbstractC208910l.A02(A1H);
    }

    public final void A00(AbstractC53505NlW abstractC53505NlW) {
        C141796aw A00;
        int i;
        boolean z;
        InterfaceC16620sF pzo;
        if (abstractC53505NlW.equals(C52639NQm.A00)) {
            A00 = AbstractC141776au.A00(this);
            i = 34;
        } else if (abstractC53505NlW.equals(C52640NQn.A00)) {
            A00 = AbstractC141776au.A00(this);
            i = 35;
        } else if (abstractC53505NlW.equals(C52637NQk.A00)) {
            A00 = AbstractC141776au.A00(this);
            i = 36;
        } else {
            if (abstractC53505NlW instanceof C52636NQj) {
                int ordinal = this.A01.ordinal();
                if (ordinal != 10) {
                    if (ordinal != 13) {
                        return;
                    }
                    C52636NQj c52636NQj = (C52636NQj) abstractC53505NlW;
                    z = c52636NQj.A01;
                    boolean z2 = c52636NQj.A00;
                    if (!z && z2) {
                        A00 = AbstractC141776au.A00(this);
                        i = 38;
                    }
                    IGRevShareProductType iGRevShareProductType = this.A00;
                    A00 = AbstractC141776au.A00(this);
                    pzo = new PZO(iGRevShareProductType, this, null, 24, z);
                } else {
                    C52636NQj c52636NQj2 = (C52636NQj) abstractC53505NlW;
                    z = c52636NQj2.A01;
                    boolean z3 = c52636NQj2.A00;
                    if (!z && z3) {
                        A00 = AbstractC141776au.A00(this);
                        i = 39;
                    }
                    IGRevShareProductType iGRevShareProductType2 = this.A00;
                    A00 = AbstractC141776au.A00(this);
                    pzo = new PZO(iGRevShareProductType2, this, null, 24, z);
                }
                AbstractC166987dD.A1Z(pzo, A00);
            }
            if (abstractC53505NlW.equals(C52638NQl.A00)) {
                A00 = AbstractC141776au.A00(this);
                i = 37;
            } else if (abstractC53505NlW.equals(C52642NQp.A00)) {
                int ordinal2 = this.A01.ordinal();
                if (ordinal2 != 10) {
                    if (ordinal2 != 13) {
                        return;
                    }
                    A00 = AbstractC141776au.A00(this);
                    i = 45;
                } else {
                    A00 = AbstractC141776au.A00(this);
                    i = 44;
                }
            } else if (abstractC53505NlW.equals(C52641NQo.A00)) {
                String str = ((C51722Msz) this.A08.getValue()).A01;
                int ordinal3 = this.A00.ordinal();
                if (ordinal3 != 2) {
                    if (ordinal3 != 1) {
                        return;
                    }
                    String str2 = MonetizationEligibilityDecision.A05.A00;
                    if (!C14360o3.A0K(str, str2) && !C14360o3.A0K(str, MonetizationEligibilityDecision.A04.A00)) {
                        A00 = AbstractC141776au.A00(this);
                        i = 40;
                    } else {
                        if (!C14360o3.A0K(str, str2)) {
                            return;
                        }
                        A00 = AbstractC141776au.A00(this);
                        i = 41;
                    }
                } else {
                    String str3 = MonetizationEligibilityDecision.A05.A00;
                    if (!C14360o3.A0K(str, str3) && !C14360o3.A0K(str, MonetizationEligibilityDecision.A04.A00)) {
                        A00 = AbstractC141776au.A00(this);
                        i = 42;
                    } else {
                        if (!C14360o3.A0K(str, str3)) {
                            return;
                        }
                        A00 = AbstractC141776au.A00(this);
                        i = 43;
                    }
                }
            } else {
                throw B4Z.A00();
            }
        }
        pzo = new PZG(this, (InterfaceC23621Ds) null, i);
        AbstractC166987dD.A1Z(pzo, A00);
    }
}

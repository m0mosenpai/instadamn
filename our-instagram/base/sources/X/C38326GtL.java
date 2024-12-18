package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.GtL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38326GtL extends AbstractC52922bZ {
    public final InterfaceC11380iw A00;
    public final C54566O8s A01;
    public final InterfaceC09390do A02;
    public final InterfaceC16660sJ A03;
    public final C0UO A04;
    public final UserSession A05;
    public final C61582rL A06;
    public final IMF A07;
    public final ShoppingReconFeedEndpoint A08;

    public C38326GtL(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C61582rL c61582rL, IMF imf, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A0k(2, shoppingReconFeedEndpoint, str, imf, c61582rL);
        this.A05 = userSession;
        this.A08 = shoppingReconFeedEndpoint;
        this.A00 = interfaceC11380iw;
        this.A07 = imf;
        this.A06 = c61582rL;
        this.A03 = interfaceC16660sJ;
        C17050sx A00 = J8U.A00(this, 44);
        this.A02 = A00;
        this.A01 = new C54566O8s(imf);
        C15150pV A03 = C10Q.A03(new C57178Pa3(this, null, 1), ((C41598Ial) A00.getValue()).A08, ((C41598Ial) this.A02.getValue()).A09);
        this.A04 = AbstractC208910l.A01(new HZR(C16930sl.A00), AbstractC141776au.A00(this), A03, C10I.A01);
    }

    public static C41598Ial A00(C38933HCg c38933HCg) {
        return (C41598Ial) ((C38326GtL) c38933HCg.A0I.getValue()).A02.getValue();
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.Ial, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41598Ial {
    public C05A A00;
    public final UserSession A01;
    public final C62112sC A02;
    public final C61582rL A03;
    public final IMF A04;
    public final ShoppingReconFeedEndpoint A05;
    public final C55056OaB A06;
    public final C19L A07;
    public final C0UO A08;
    public final C0UO A09;

    public C41598Ial(UserSession userSession, C61582rL c61582rL, IMF imf, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, C19L c19l) {
        AbstractC167027dH.A0a(1, userSession, shoppingReconFeedEndpoint, imf, c61582rL);
        C55056OaB c55056OaB = (C55056OaB) userSession.A01(C55056OaB.class, new J8U(userSession, 48));
        C14360o3.A0B(c55056OaB, 3);
        this.A01 = userSession;
        this.A05 = shoppingReconFeedEndpoint;
        this.A06 = c55056OaB;
        this.A04 = imf;
        this.A03 = c61582rL;
        this.A07 = c19l;
        this.A00 = AbstractC25235BEs.A1A(false);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A02 = new C62112sC(c61582rL);
        this.A08 = C55056OaB.A00(shoppingReconFeedEndpoint, c55056OaB).A03;
        this.A09 = this.A00;
    }

    public static final C38648Gyp A00(C41598Ial c41598Ial, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        ShoppingReconFeedEndpoint shoppingReconFeedEndpoint = c41598Ial.A05;
        return new C38648Gyp(new C38581Gxk(), shoppingReconFeedEndpoint, num, str, new J8V(interfaceC16820sZ, 4), new J8V(interfaceC16820sZ2, 5), new J8V(interfaceC16820sZ3, 6), new C57751Pje(10, interfaceC16660sJ, c41598Ial), z);
    }
}

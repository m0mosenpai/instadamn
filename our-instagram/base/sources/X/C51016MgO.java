package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.MgO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51016MgO extends AbstractC52922bZ {
    public MUD A00;
    public String A01;
    public boolean A02;
    public final C2GS A03;
    public final UserMonetizationProductType A04;
    public final C41761wQ A05;
    public final UserSession A06;
    public final MonetizationRepository A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;

    public static final void A00(C51016MgO c51016MgO) {
        if (C14360o3.A0K(c51016MgO.A01, "not_eligible")) {
            C41761wQ c41761wQ = c51016MgO.A05;
            MonetizationRepository monetizationRepository = c51016MgO.A07;
            UserMonetizationProductType userMonetizationProductType = c51016MgO.A04;
            UserSession userSession = monetizationRepository.A07;
            C14360o3.A0B(userSession, 0);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A06();
            c25621Ms.A0B("business/eligibility/get_product_violations_render_data/");
            c25621Ms.A9s("product_types", userMonetizationProductType.A00);
            C42221xC A00 = AbstractC34046F0z.A00(AbstractC25227BEk.A0e(c25621Ms, C38865H9n.class, C41292IPh.class));
            C25621Ms c25621Ms2 = new C25621Ms(userSession, -2);
            c25621Ms2.A06();
            c25621Ms2.A0B("business/eligibility/get_appeals_data/");
            c41761wQ.A02(C42221xC.A02(new JYF((InterfaceC16620sF) new C30496Dbf(c51016MgO, 32), 6), A00, AbstractC34046F0z.A00(AbstractC25227BEk.A0e(c25621Ms2, C52091N2r.class, OO3.class))), new PKD(c51016MgO, 4));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x01b6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51016MgO.A01():void");
    }

    public C51016MgO(UserMonetizationProductType userMonetizationProductType, UserSession userSession, MonetizationRepository monetizationRepository) {
        AbstractC167027dH.A13(userSession, userMonetizationProductType, monetizationRepository);
        this.A06 = userSession;
        this.A04 = userMonetizationProductType;
        this.A07 = monetizationRepository;
        this.A05 = AbstractC31173DnH.A0S();
        this.A03 = MSW.A0E();
        this.A00 = new MUD();
        C24721Ip A0s = MSY.A0s();
        this.A08 = A0s;
        this.A09 = AbstractC07080Za.A03(A0s);
    }
}

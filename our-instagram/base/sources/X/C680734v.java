package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.34v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C680734v extends AnonymousClass346 {
    public C680834w A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final AnonymousClass355 A03;
    public final AnonymousClass355 A04;
    public final C681134z A05;
    public final AnonymousClass353 A06;
    public final AnonymousClass353 A07;
    public final C28091Xn A08;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        if (AbstractC75423a9.A02(c38321qM, this.A02)) {
            c59072n8.A00(this.A07);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.355] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.355] */
    public C680734v(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C61382r1 c61382r1, C1M1 c1m1) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318883405175542L);
        final C64092vU c64092vU = new C64092vU(AbstractC11060iN.A00(userSession), false);
        if (A06) {
            this.A00 = new C680834w(userSession, interfaceC60442pS, AbstractC63462uT.A00(userSession), c64092vU);
        }
        C28091Xn A00 = C28071Xl.A00(context, userSession);
        this.A08 = A00;
        this.A05 = new C681134z(c64092vU);
        this.A06 = new AnonymousClass353(new AnonymousClass350(userSession, interfaceC60442pS, c61382r1, c1m1, A00, "instagram_organic_vpvd_imp"), c64092vU);
        final AnonymousClass354 anonymousClass354 = new AnonymousClass354(userSession, interfaceC60442pS, c61382r1, c1m1, A00, "instagram_organic_carousel_vpvd_imp");
        this.A04 = new InterfaceC43071ya(anonymousClass354, c64092vU) { // from class: X.355
            public final InterfaceC64122vX A00;
            public final C64092vU A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C64092vU c64092vU2 = this.A01;
                C82383m1 A002 = c64092vU2.A00(c59062n7.A05);
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 0 && intValue != 1) {
                    long BmE = interfaceC57162jr.BmE();
                    long j = A002.A03;
                    if (j > 0) {
                        A002.A02 = BmE - j;
                        A002.A03 = -1L;
                    }
                    C82383m1.A00(A002, BmE);
                    c64092vU2.A01(this.A00, A002, c59062n7.A03, c59062n7.A04);
                    return;
                }
                A002.A03(c59062n7, interfaceC57162jr);
            }

            {
                this.A00 = anonymousClass354;
                this.A01 = c64092vU;
            }
        };
        this.A07 = new AnonymousClass353(new AnonymousClass350(userSession, interfaceC60442pS, c61382r1, c1m1, A00, "instagram_ad_vpvd_imp"), c64092vU);
        final AnonymousClass354 anonymousClass3542 = new AnonymousClass354(userSession, interfaceC60442pS, c61382r1, c1m1, A00, "instagram_ad_carousel_vpvd_imp");
        this.A03 = new InterfaceC43071ya(anonymousClass3542, c64092vU) { // from class: X.355
            public final InterfaceC64122vX A00;
            public final C64092vU A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C64092vU c64092vU2 = this.A01;
                C82383m1 A002 = c64092vU2.A00(c59062n7.A05);
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 0 && intValue != 1) {
                    long BmE = interfaceC57162jr.BmE();
                    long j = A002.A03;
                    if (j > 0) {
                        A002.A02 = BmE - j;
                        A002.A03 = -1L;
                    }
                    C82383m1.A00(A002, BmE);
                    c64092vU2.A01(this.A00, A002, c59062n7.A03, c59062n7.A04);
                    return;
                }
                A002.A03(c59062n7, interfaceC57162jr);
            }

            {
                this.A00 = anonymousClass3542;
                this.A01 = c64092vU;
            }
        };
    }
}

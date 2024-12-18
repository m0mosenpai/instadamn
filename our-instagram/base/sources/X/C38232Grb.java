package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Grb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38232Grb implements InterfaceC43071ya {
    public final AnonymousClass354 A00;
    public final C28091Xn A01;
    public final C64092vU A02;

    public C38232Grb(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A02 = new C64092vU(AbstractC11060iN.A00(userSession), true);
        C28091Xn A00 = C28071Xl.A00(context, userSession);
        this.A01 = A00;
        this.A00 = new AnonymousClass354(userSession, interfaceC60442pS, null, c1m1, A00, "instagram_organic_carousel_vpvd_imp");
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C120985dq c120985dq = (C120985dq) c59062n7.A03;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && c120985dq.A01 == EnumC129395t1.A0G) {
            C64092vU c64092vU = this.A02;
            C82383m1 A00 = c64092vU.A00(c120985dq.getId());
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0 && A01 != A1R) {
                A00.A04(interfaceC57162jr);
                AnonymousClass354 anonymousClass354 = this.A00;
                if (anonymousClass354 instanceof InterfaceC64122vX) {
                    c64092vU.A01(anonymousClass354, A00, c38321qM, c59062n7.A04);
                    return;
                }
                return;
            }
            A00.A03(c59062n7, interfaceC57162jr);
        }
    }
}

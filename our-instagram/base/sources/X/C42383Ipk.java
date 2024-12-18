package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ipk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42383Ipk implements InterfaceC43071ya {
    public final AnonymousClass350 A00;
    public final C28091Xn A01;
    public final C64092vU A02;

    public C42383Ipk(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        this.A02 = new C64092vU(AbstractC11060iN.A00(userSession), true);
        C28091Xn A00 = C28071Xl.A00(context, userSession);
        this.A01 = A00;
        this.A00 = new AnonymousClass350(userSession, interfaceC60442pS, null, c1m1, A00, "instagram_ad_vpvd_imp");
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C40971v4 A07 = ((C120985dq) c59062n7.A03).A07();
        if (A07 != null) {
            C64092vU c64092vU = this.A02;
            C82383m1 A00 = c64092vU.A00(A07.A0S);
            C75113Zb c75113Zb = ((C37644Ghd) c59062n7.A04).A0E;
            if (c75113Zb != null) {
                Integer CFq = interfaceC57162jr.CFq(c59062n7);
                C14360o3.A07(CFq);
                int intValue = CFq.intValue();
                if (intValue != 0 && intValue != A1R) {
                    A00.A04(interfaceC57162jr);
                    c64092vU.A01(this.A00, A00, A07, c75113Zb);
                } else {
                    A00.A03(c59062n7, interfaceC57162jr);
                }
            }
        }
    }
}

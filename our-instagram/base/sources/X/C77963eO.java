package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* renamed from: X.3eO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77963eO {
    public final C77893eH A00;

    public final View.OnTouchListener A00(InterfaceC75453aC interfaceC75453aC, C77903eI c77903eI) {
        C14360o3.A0B(c77903eI, 0);
        C14360o3.A0B(interfaceC75453aC, 1);
        C38321qM c38321qM = c77903eI.A00;
        if (c38321qM.A0A == null) {
            C77893eH c77893eH = this.A00;
            C75643aV c75643aV = C75643aV.A00;
            C75113Zb c75113Zb = c77903eI.A02;
            UserSession userSession = c77893eH.A00;
            Reel A00 = c75643aV.A00(userSession, c38321qM, c75113Zb);
            if (!AbstractC77913eJ.A00(userSession, c38321qM, c77903eI.A05)) {
                boolean z = c77903eI.A08;
                if (A00 != null && !z) {
                    return null;
                }
                return interfaceC75453aC.DuE(c38321qM, c77903eI.A04.getId(), c77903eI.A01.getModuleName());
            }
            return null;
        }
        return null;
    }

    public final void A01(Context context, ImageUrl imageUrl, InterfaceC75453aC interfaceC75453aC, C77903eI c77903eI, C3Ow c3Ow) {
        C14360o3.A0B(c77903eI, 0);
        C14360o3.A0B(interfaceC75453aC, 2);
        C38321qM c38321qM = c77903eI.A00;
        if (c38321qM.A0A == null) {
            C77893eH c77893eH = this.A00;
            C75643aV c75643aV = C75643aV.A00;
            C75113Zb c75113Zb = c77903eI.A02;
            UserSession userSession = c77893eH.A00;
            Reel A00 = c75643aV.A00(userSession, c38321qM, c75113Zb);
            if (AbstractC77913eJ.A00(userSession, c38321qM, c77903eI.A05) && c3Ow != null) {
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    ReelStore A04 = C1OU.A04(userSession);
                    String BNu = c77903eI.A04.A03.BNu();
                    if (BNu != null) {
                        Reel A0K = A04.A0K(new C1N9(A2E), BNu, false);
                        c3Ow.Blo().A05();
                        interfaceC75453aC.D4I(c38321qM, c75113Zb, A0K, c3Ow);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            boolean z = c77903eI.A08;
            if (A00 != null && !z && c3Ow != null) {
                Integer num = C05F.A00;
                if (!AbstractC43607JQo.A00(userSession, num)) {
                    interfaceC75453aC.D4L(c38321qM, c75113Zb, A00, c3Ow);
                } else {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    int i = A002.A01.getInt(AbstractC43591JPw.A00(98), 0);
                    AbstractC34362FDe.A00(context, new ASX(interfaceC75453aC, c77903eI, A00, A002, c3Ow, i), C26661Qv.A00(userSession).C98(), c77903eI.A01, imageUrl, false, num);
                }
                AbstractC46580KjJ.A00(userSession).A00(userSession, c38321qM, c77903eI.A01);
                return;
            }
            if (c38321qM.A52() && C14360o3.A0K(c38321qM.A0C.BZ2(), true) && C18U.A06(C06090Tz.A05, userSession, 36320244913348812L)) {
                interfaceC75453aC.CyL(c38321qM);
            } else {
                interfaceC75453aC.D4G(c38321qM, c75113Zb, false, c75113Zb.getPosition(), c77903eI.A06);
            }
        }
    }

    public final void A02(InterfaceC75453aC interfaceC75453aC, C77903eI c77903eI) {
        C14360o3.A0B(c77903eI, 0);
        C14360o3.A0B(interfaceC75453aC, 1);
        C38321qM c38321qM = c77903eI.A00;
        if (c38321qM.A0A == null) {
            C75113Zb c75113Zb = c77903eI.A02;
            interfaceC75453aC.D3l(c38321qM, c75113Zb, c75113Zb.getPosition(), c77903eI.A06);
        }
    }

    public C77963eO(C77893eH c77893eH) {
        this.A00 = c77893eH;
    }
}

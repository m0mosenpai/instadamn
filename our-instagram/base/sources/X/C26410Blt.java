package X;

import android.content.Context;
import android.graphics.Typeface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Blt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26410Blt extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final InterfaceC31166DnA A03;

    public C26410Blt(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31166DnA interfaceC31166DnA) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A03 = interfaceC31166DnA;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        CUJ As5;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC31166DnA interfaceC31166DnA = this.A03;
        if (interfaceC31166DnA == null || (As5 = interfaceC31166DnA.As5()) == null) {
            return null;
        }
        C51762Yz A00 = C29902DGq.A00(c76223bS, As5, 28);
        C29893DGh.A00(c76223bS, A00, As5, new Object[]{As5}, 0);
        String A0G = AbstractC77623dm.A0G(c76223bS, A00.A03, 2131957639);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CU.A00(null, C05F.A0j, 0, AbstractC77623dm.A04(c76223bS));
        Integer num = C05F.A01;
        C51722Yv A003 = C9CV.A00(A002, num, "android.widget.Button", 0);
        C2XE ArD = c76223bS.ArD();
        Context A0E = AbstractC25225BEi.A0E(ArD);
        int A02 = AbstractC25232BEp.A02(A0E, c76223bS);
        long A09 = AbstractC77623dm.A09(c76223bS);
        Integer num2 = C05F.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C14360o3.A08(typeface);
        Typeface A03 = AbstractC14710oj.A03(A0E, typeface, num2);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, A0G, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(A03, c76223bS, A0a, A0D);
        A0a.A0X(num2);
        AbstractC25234BEr.A1B(A0a, num);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        return AbstractC76963ci.A0I(AbstractC25232BEp.A11(AbstractC25227BEk.A0X(A003, A0a), c76223bS.A05), c76223bS, C9CV.A00(AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(AbstractC25230BEn.A0d(null, num, 1.0f, 1), num2, DRR.A00(As5, 35), null), num, DRR.A00(As5, 36), null), C05F.A0D, "clips_delayed_skip_ads_skip_in_timer", 4));
    }
}

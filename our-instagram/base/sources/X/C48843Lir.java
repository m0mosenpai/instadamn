package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lir, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48843Lir implements C79O {
    public final /* synthetic */ AnonymousClass795 A00;

    public /* synthetic */ C48843Lir(AnonymousClass795 anonymousClass795) {
        this.A00 = anonymousClass795;
    }

    @Override // X.C79O
    public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        C158797Aq c158797Aq;
        C38321qM c38321qM;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        C76T A00 = C76S.A00(context, userSession);
        AnonymousClass442 A0P2 = c83403nh.A0P();
        boolean A1T = c83403nh.A1T();
        boolean z = c83403nh.A2P;
        boolean z2 = c160787Im.A0G.A0x;
        boolean z3 = c83403nh.A2G;
        Long l = c83403nh.A1L;
        boolean A1S = c83403nh.A1S();
        C14360o3.A0B(A0P2, 0);
        C101584hT c101584hT = A0P2.A06;
        if (c101584hT != null && (c38321qM = c101584hT.A05) != null) {
            String str = A0P2.A0U;
            String str2 = A0P2.A0T;
            C2EY c2ey = A0P2.A0F;
            C14360o3.A07(c2ey);
            c158797Aq = C76T.A01(A00, null, c38321qM, c2ey, null, c38321qM.BRp(), Boolean.valueOf(A1S), Long.valueOf(AbstractC25232BEp.A0t(A0P2.A0P)), l, null, str, str2, A0P2.A0R, null, null, null, null, null, null, z2, z, A1T, z3, false, true, false, true, false, false, false, false, false, false, false);
        } else {
            c158797Aq = null;
        }
        return new KT8(c158797Aq, C7QM.A02(userSession, c160787Im, A0P), c83403nh.A0V(), true);
    }
}

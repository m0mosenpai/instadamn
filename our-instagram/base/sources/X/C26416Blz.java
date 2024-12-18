package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Blz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26416Blz extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31159Dn3 A02;
    public final UserSession A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C51722Yv A0S = AbstractC25233BEq.A0S(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A01, 1.0f, 1)), AbstractC25226BEj.A0m(A1Z ? 1 : 0, AbstractC25230BEn.A0H()), A1Z ? 1 : 0, Double.doubleToRawLongBits(30.0d));
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.clips_viewer_comment_bar_background);
        Integer num = C05F.A00;
        C51722Yv A0Y = AbstractC25231BEo.A0Y(C9CV.A00(A0S, num, A0E, 4), DRP.A00(this, 27));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        String A0F = AbstractC77623dm.A0F(A12, 2131956452);
        int A03 = AbstractC77623dm.A03(A12, R.color.baseline_neutral_80);
        long A0r = AbstractC25232BEp.A0r(12.0f);
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A00 = C9CU.A00(C9CU.A00(null, C05F.A0E, A1Z ? 1 : 0, A0J), C05F.A0F, A1Z ? 1 : 0, AbstractC25229BEm.A0G());
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(A12.A00, null, A0F, A1Z ? 1 : 0);
        AbstractC25233BEq.A1B(A12, A0a, A03, A0r);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        A0a.A0X(num);
        AbstractC25234BEr.A1D(A0a, num, 1.0f, A1Z, true);
        AbstractC25233BEq.A1A(A12, A00, A0a);
        return AbstractC76963ci.A0I(A12, c76223bS, A0Y);
    }

    public C26416Blz(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31159Dn3 interfaceC31159Dn3) {
        AbstractC167017dG.A1R(c37644Ghd, interfaceC31159Dn3);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31159Dn3;
        this.A03 = userSession;
    }
}

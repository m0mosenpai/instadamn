package X;

import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bk3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26296Bk3 extends AbstractC51572Yf {
    public final UserSession A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        int A03 = AbstractC25232BEp.A03(c2xe.A0C, c76223bS, R.attr.igds_color_gradient_lavender);
        C75933ay c75933ay = C51722Yv.A02;
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A0R = AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A04, 0, A0J), 0, AbstractC25229BEm.A0B());
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        String A0F = AbstractC77623dm.A0F(A0P, 2131956745);
        int A032 = AbstractC77623dm.A03(A0P, R.color.audio_bar_action_color_enabled);
        Integer num = C05F.A01;
        long A0r = AbstractC25232BEp.A0r(11.0f);
        C2XE c2xe2 = A0P.A00;
        Typeface A01 = AbstractC14710oj.A01(c2xe2.A0C);
        Integer num2 = C05F.A00;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0F, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A032, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A01, A0P, A0a, A0D);
        AbstractC25234BEr.A1F(A0a, num2, num);
        A0a.A0E();
        A0a.A0c(false);
        A0a.A0Z(false);
        A0a.A0a(false);
        A0a.A06(null);
        AbstractC25227BEk.A1J(A0P, A0a);
        return new BS9(AbstractC76963ci.A0H(A0P, c76223bS, A0R), null, 14.0f, 4.0f, A03, false, true, false, false);
    }

    public C26296Bk3(UserSession userSession) {
        this.A00 = userSession;
    }
}

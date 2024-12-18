package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BlL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26376BlL extends AbstractC51572Yf {
    public final C25377BKu A00;
    public final C120985dq A01;
    public final UserSession A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        long A0A;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A01;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c120985dq.A06().A0i);
        if (this.A00.A05) {
            A0H.append((CharSequence) AbstractC77623dm.A0F(c76223bS, 2131961132));
            A0H.append((CharSequence) c120985dq.A06().A0Z);
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A01, 1.0f, 1));
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && c38321qM.A1V() != null) {
            A0A = AbstractC77623dm.A08(c76223bS);
        } else {
            A0A = AbstractC77623dm.A0A(c76223bS);
        }
        C51722Yv A0N = AbstractC25233BEq.A0N(EnumC77673dr.A0S, C9CV.A00(AbstractC25234BEr.A0D(A0h, AbstractC25227BEk.A0c(A0A), 0, AbstractC77623dm.A06(c76223bS)), C05F.A1F, DR6.A00, 4));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int A03 = AbstractC77623dm.A03(A12, R.color.fundraiser_sticker_donate_button_background_color);
        long A05 = AbstractC77623dm.A05(A12);
        UserSession userSession = this.A02;
        long A04 = AbstractC25449BNo.A04(userSession);
        int A02 = AbstractC25449BNo.A02(A12, userSession);
        long A052 = AbstractC25449BNo.A05(userSession);
        Integer A06 = AbstractC25449BNo.A06(A12, userSession);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(A12.A00, null, A0H, 0);
        AbstractC25233BEq.A1B(A12, A0a, A03, A05);
        A0a.A0K(C2Z3.A00(AbstractC25233BEq.A0i(typeface, A12, A0a, 0, A02), A04));
        A0a.A0I(AbstractC25228BEl.A08(A12, A0D));
        A0a.A0J(AbstractC25228BEl.A08(A12, A0D));
        AbstractC25234BEr.A1A(A0a, A12.BoZ(), A06, A052);
        A0a.A0X(num);
        AbstractC25234BEr.A1D(A0a, num, 1.0f, false, true);
        A0a.A06(null);
        AbstractC25227BEk.A1J(A12, A0a);
        return AbstractC76963ci.A0I(A12, c76223bS, A0N);
    }

    public C26376BlL(C25377BKu c25377BKu, C120985dq c120985dq, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = c120985dq;
        this.A00 = c25377BKu;
    }
}

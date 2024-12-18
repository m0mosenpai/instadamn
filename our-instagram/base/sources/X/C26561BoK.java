package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.BoK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26561BoK extends AbstractC51572Yf {
    public final C2Y0 A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final SocialContextBubbleUiState A03;
    public final InterfaceC80043ht A04;
    public final C51722Yv A05;
    public final boolean A06;

    public C26561BoK(C2Y0 c2y0, C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, InterfaceC80043ht interfaceC80043ht, boolean z) {
        AbstractC167007dF.A1H(userSession, 5, c2y0);
        this.A05 = c51722Yv;
        this.A01 = interfaceC11380iw;
        this.A03 = socialContextBubbleUiState;
        this.A06 = z;
        this.A02 = userSession;
        this.A04 = interfaceC80043ht;
        this.A00 = c2y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        double d;
        C14360o3.A0B(c76223bS, 0);
        ?? obj = new Object();
        int A03 = A03(c76223bS) - AbstractC25232BEp.A0l(c76223bS, 48.0d);
        C28359CfJ c28359CfJ = C28359CfJ.A00;
        C2XE ArD = c76223bS.ArD();
        Context A0E = AbstractC25225BEi.A0E(ArD);
        UserSession userSession = this.A02;
        SocialContextBubbleUiState socialContextBubbleUiState = this.A03;
        SpannableStringBuilder A01 = c28359CfJ.A01(A0E, this.A00, userSession, socialContextBubbleUiState, this.A04, R.attr.igds_color_primary_text_on_media, R.attr.textColorBoldLink);
        long A0r = AbstractC25232BEp.A0r(14.0f);
        C75933ay c75933ay = C51722Yv.A02;
        long A0K = AbstractC25229BEm.A0K(A03);
        Integer num = C05F.A0N;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0K);
        int A032 = AbstractC25232BEp.A03(A0E, c76223bS, R.attr.igds_color_primary_text_on_media);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, A01, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A032, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1F(A0a, num, num2);
        A0a.A0M(2);
        AbstractC25234BEr.A17(A00, A0a, false);
        C51682Yq A0A = A0a.A0A();
        C2XE c2xe = c76223bS.A05;
        A0A.A0J(c2xe, obj, 0, 0);
        int i = obj.A00;
        long A0J = AbstractC25230BEn.A0J();
        if (i > AbstractC25228BEl.A07(c76223bS, A0J)) {
            d = 6.0d;
        } else {
            d = 8.0d;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        C51722Yv c51722Yv = this.A05;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        int A0m = obj.A01 + AbstractC25232BEp.A0m(A0P, 42.0d);
        int A08 = obj.A00 + (AbstractC25228BEl.A08(A0P, doubleToRawLongBits) * 2);
        int A033 = A03(A0P);
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A15 = AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE);
        Integer num3 = C05F.A0C;
        C51722Yv A0M = AbstractC25234BEr.A0M(A15, num3, 1, A0D);
        C2Z0 A0K2 = AbstractC25233BEq.A0K(A0P);
        Drawable A0E2 = AbstractC77623dm.A0E(A0K2, R.drawable.friendly_viewer_comment_bubble_transparent);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        Integer num4 = C05F.A01;
        C51722Yv A002 = C9CU.A00(C9CU.A00(C9CU.A00(AbstractC171007jr.A00(c75933ay2, 0.8f), num2, 0, A0m | 9221401712017801216L), num4, 0, A08 | 9221401712017801216L), num, 0, A033 | 9221401712017801216L);
        C80403iV A034 = C80393iU.A03(A0K2.A00);
        A034.A0D(A0E2);
        A034.A0E(scaleType);
        A034.A0C();
        AbstractC77743dy.A00(A034, A002);
        AbstractC25231BEo.A1A(A034.A0A(), A0K2, A0P, A0M);
        long A0B = AbstractC25229BEm.A0B();
        C51722Yv A14 = AbstractC25232BEp.A14(null, 0, A0B);
        Integer num5 = C05F.A09;
        C51722Yv A003 = C9CU.A00(A14, num5, 0, A0B);
        C2Z0 A13 = AbstractC25232BEp.A13(A0P);
        A13.A00(new C77973eP(AbstractC25233BEq.A0T(C9CU.A00(C9CU.A00(null, num2, 0, A0J), num4, 0, A0J), AbstractC25225BEi.A0n(num5, 0, A0B), num3, 0.0f, 1), this.A01, socialContextBubbleUiState.A03, null, A13.BoZ().A02(AbstractC53242c7.A04(A13.ArD().A0C)), 0, -16777216, false, true, false));
        AbstractC25234BEr.A12(A0A, A13.A00, A13, AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0c(doubleToRawLongBits), 0, doubleToRawLongBits));
        return AbstractC25227BEk.A0W(AbstractC76963ci.A0H(A13, A0P, A003), A0P, c76223bS, c51722Yv);
    }

    private final int A03(C2Z1 c2z1) {
        double d;
        int i = AbstractC166997dE.A0M(c2z1.ArD().A0C).getDisplayMetrics().widthPixels;
        if (this.A06) {
            d = 57.0d;
        } else {
            d = 92.0d;
        }
        return i - AbstractC25232BEp.A0o(c2z1, d);
    }
}

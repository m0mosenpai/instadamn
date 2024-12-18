package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.BkG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26309BkG extends AbstractC51572Yf {
    public final C25547BRj A00;
    public final SocialContextBubbleUiState A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        C3e8 c3e8 = C3e8.FLEX_END;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A15, -15.0f, 1));
        float f = this.A00.A00;
        long A09 = AbstractC25225BEi.A09(0.6f * f);
        Integer num = C05F.A0C;
        C51722Yv A00 = C9CU.A00(C9CU.A00(A0h, num, 1, A09), C05F.A1F, 0, AbstractC25225BEi.A09(f));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num2 = C05F.A0Y;
        C51722Yv A002 = C9CV.A00(null, num2, enumC77933eL, 3);
        long A0D = AbstractC25229BEm.A0D();
        C51722Yv A0M = AbstractC25234BEr.A0M(A002, num, 1, A0D);
        C2XE c2xe = A12.A00;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        AbstractC25231BEo.A1A(new C85463rb(ImageView.ScaleType.CENTER_INSIDE, c75933ay, null, R.drawable.fv_bubble_tail, A0P.BoZ().A02(AbstractC53242c7.A02(A0P.A00.A0C))), A0P, A12, A0M);
        BSB bsb = new BSB(c2xe, new BSA());
        BSA bsa = bsb.A01;
        C2XH c2xh = ((AbstractC77733dx) bsb).A02;
        bsa.A00 = c2xh.A00(14.0f);
        bsa.A01 = c2xh.A00(0.0f);
        Context context = c2xe.A0C;
        bsa.A02 = A12.BoZ().A02(AbstractC53242c7.A02(context));
        bsa.A0C = true;
        C51722Yv A003 = C9CU.A00(AbstractC25233BEq.A0Z(AbstractC25233BEq.A0Z(C9CV.A00(null, C05F.A00, EnumC77683ds.CENTER, 3), num2, 34.0d, 0), num, 40.0d, 0), C05F.A0N, 0, Double.doubleToRawLongBits(92.0d));
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A0R = AbstractC25233BEq.A0R(A003, AbstractC25227BEk.A0Y(0, A0J), 0, A0J);
        String str = this.A01.A07;
        int A05 = AbstractC25228BEl.A05(context, A12);
        Integer num3 = C05F.A01;
        long A0r = AbstractC25232BEp.A0r(11.0f);
        Typeface typeface = Typeface.DEFAULT;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A05, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        AbstractC25234BEr.A1F(A0a, num, num3);
        A0a.A0M(4);
        A0a.A0c(false);
        A0a.A0Z(false);
        A0a.A0a(false);
        A0a.A0D();
        BSB.A01(AbstractC25230BEn.A0g(null, A0R, A0a), bsb);
        A12.A00(bsa);
        return AbstractC76963ci.A07(A12, c76223bS, A00, enumC77683ds, c3e8);
    }

    public C26309BkG(C25547BRj c25547BRj, SocialContextBubbleUiState socialContextBubbleUiState) {
        this.A01 = socialContextBubbleUiState;
        this.A00 = c25547BRj;
    }
}

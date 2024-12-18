package X;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.Bnu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26535Bnu extends AbstractC51572Yf {
    public final SocialContextBubbleUiState A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num = C05F.A0Y;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, enumC77933eL, 3));
        long A0J = AbstractC25229BEm.A0J();
        long A0N = AbstractC25230BEn.A0N();
        long A0B = AbstractC25229BEm.A0B();
        Integer num2 = C05F.A0C;
        C51722Yv A00 = C9CU.A00(C9CU.A00(A0h, num2, 1, A0J), num, 1, A0N);
        Integer num3 = C05F.A0j;
        C51722Yv A002 = C9CU.A00(A00, num3, 1, A0B);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        C3e8 c3e8 = C3e8.FLEX_END;
        C51722Yv A0D = AbstractC25234BEr.A0D(C9CU.A00(AbstractC171007jr.A00(c75933ay, 0.8f), C05F.A0u, 0, A0J), AbstractC25225BEi.A0n(C05F.A1F, 0, A0N), 0, A0B);
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        C51722Yv A003 = C9CV.A00(null, num, enumC77933eL, 3);
        long doubleToRawLongBits = Double.doubleToRawLongBits(17.0d);
        C51722Yv A004 = C9CU.A00(C9CU.A00(C9CU.A00(C9CU.A00(A003, C05F.A01, 0, doubleToRawLongBits), C05F.A00, 0, doubleToRawLongBits), num2, 1, A0J), num3, 1, A0B);
        C2Z0 A13 = AbstractC25232BEp.A13(A0K);
        AbstractC25231BEo.A1A(new C85463rb(ImageView.ScaleType.CENTER_INSIDE, c75933ay, null, R.drawable.fv_bubble_tail, AbstractC25228BEl.A06(A13.A00.A0C, A13, R.attr.igds_color_creation_button)), A13, A0K, A004);
        C2XE ArD = A0K.ArD();
        BSB bsb = new BSB(ArD, new BSA());
        BSA bsa = bsb.A01;
        C2XH c2xh = ((AbstractC77733dx) bsb).A02;
        bsa.A00 = c2xh.A00(16.0f);
        bsa.A01 = c2xh.A00(0.0f);
        bsa.A02 = AbstractC25228BEl.A06(ArD.A0C, A0K, R.attr.igds_color_creation_button);
        bsa.A0C = true;
        BSB.A01(A03(A0K, null, 0.0f), bsb);
        A0K.A00(bsa);
        A12.A00(AbstractC76963ci.A07(A0K, A12, A0D, enumC77683ds, c3e8));
        A12.A00(A03(A12, A002, 1.0f));
        return new C2WF(null, null, null, A12.A01, false);
    }

    private final C51682Yq A03(C2Z1 c2z1, C51722Yv c51722Yv, float f) {
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        Integer num = C05F.A00;
        C51722Yv A00 = AbstractC171007jr.A00(C9CU.A00(C9CU.A00(AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0n(num, enumC77683ds)), C05F.A0Y, 0, Double.doubleToRawLongBits(34.0d)), C05F.A0j, 0, AbstractC25229BEm.A0I()), f);
        long A0J = AbstractC25229BEm.A0J();
        C51722Yv A002 = AbstractC25233BEq.A0R(A00, AbstractC25227BEk.A0Y(0, A0J), 0, A0J).A00(c51722Yv);
        String str = this.A00.A07;
        C2XE ArD = c2z1.ArD();
        int A0A = AbstractC25230BEn.A0A(ArD, c2z1);
        Integer num2 = C05F.A01;
        long A0r = AbstractC25232BEp.A0r(11.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, str, A0A);
        AbstractC25230BEn.A1K(A0g, c2z1.BoZ(), 0, A0r);
        A0g.A0T(typeface);
        A0g.A0F();
        AbstractC25234BEr.A18(A0g, c2z1, AbstractC25228BEl.A0A(c2z1, A0D), A0D);
        A0g.A0H(AbstractC25228BEl.A0A(c2z1, A0D));
        AbstractC25234BEr.A1F(A0g, num, num2);
        A0g.A0M(2);
        A0g.A0c(false);
        A0g.A0Z(false);
        A0g.A0a(false);
        A0g.A0D();
        return AbstractC25230BEn.A0g(null, A002, A0g);
    }

    public C26535Bnu(SocialContextBubbleUiState socialContextBubbleUiState) {
        this.A00 = socialContextBubbleUiState;
    }
}

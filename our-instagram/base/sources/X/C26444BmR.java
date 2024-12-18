package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BmR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26444BmR extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final C51722Yv A02;
    public final InterfaceC11380iw A03;
    public final InterfaceC30891Di4 A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30891Di4 interfaceC30891Di4 = this.A04;
        if (interfaceC30891Di4 instanceof D0U) {
            return null;
        }
        if (interfaceC30891Di4 instanceof C26256BjP) {
            C26256BjP c26256BjP = (C26256BjP) interfaceC30891Di4;
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c26256BjP.A01);
            if (c26256BjP.A02) {
                C85963sQ.A08(AbstractC25227BEk.A0A(c76223bS), A0H, false);
            }
            C51722Yv c51722Yv = this.A02;
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            C75933ay c75933ay = C51722Yv.A02;
            int i = this.A00;
            long A0D = AbstractC77623dm.A0D(A12, i);
            Integer num = C05F.A00;
            C51722Yv A00 = C9CU.A00(AbstractC25233BEq.A0X(C9CU.A00(null, num, 0, A0D), A12, i), C05F.A09, 0, AbstractC77623dm.A0A(A12));
            ImageUrl imageUrl = c26256BjP.A00;
            C2XE c2xe = A12.A00;
            Context context = c2xe.A0C;
            int A02 = A12.BoZ().A02(AbstractC53242c7.A04(context));
            int A06 = AbstractC25228BEl.A06(context, A12, R.attr.igds_color_photo_border);
            A12.A00(new C77973eP(A00, this.A03, imageUrl, null, A02, AbstractC25231BEo.A0F(A12, R.dimen.action_sheet_divider_margin_top), A06, false, true, false));
            int A04 = AbstractC25228BEl.A04(context, A12);
            long A0D2 = AbstractC77623dm.A0D(A12, this.A01);
            int A022 = A12.BoZ().A02(R.color.black_30_transparent);
            long A0D3 = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Typeface typeface = Typeface.DEFAULT;
            long A0D4 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0H, 0);
            AbstractC25233BEq.A1B(A12, A0a, A04, A0D2);
            AbstractC25234BEr.A14(A12, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A12, A0a, 1, A022), A0D3), A0D4);
            AbstractC25234BEr.A1I(A0a, num, false);
            A0a.A0M(1);
            AbstractC25234BEr.A15(A12, A0a, false);
            return AbstractC76963ci.A0H(A12, c76223bS, c51722Yv);
        }
        throw B4Z.A00();
    }

    public C26444BmR(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, InterfaceC30891Di4 interfaceC30891Di4, int i, int i2) {
        AbstractC167017dG.A1P(interfaceC11380iw, interfaceC30891Di4);
        this.A03 = interfaceC11380iw;
        this.A04 = interfaceC30891Di4;
        this.A02 = c51722Yv;
        this.A00 = i;
        this.A01 = i2;
    }
}

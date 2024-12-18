package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;

/* renamed from: X.BlT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26384BlT extends AbstractC51572Yf {
    public final int A00 = R.dimen.action_bar_item_spacing_right;
    public final C51722Yv A01;
    public final InterfaceC30887Di0 A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30887Di0 interfaceC30887Di0 = this.A02;
        if (interfaceC30887Di0 instanceof D0Q) {
            return null;
        }
        if (interfaceC30887Di0 instanceof C26252BjL) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = ((C26252BjL) interfaceC30887Di0).A00;
            if (str != null && str.length() != 0) {
                spannableStringBuilder.append((CharSequence) str);
            }
            C51722Yv c51722Yv = this.A01;
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            C2XE c2xe = A12.A00;
            int A0A = AbstractC25230BEn.A0A(c2xe, A12);
            long A0D = AbstractC77623dm.A0D(A12, this.A00);
            int A02 = A12.BoZ().A02(R.color.black_30_transparent);
            long A0D2 = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Typeface typeface = Typeface.DEFAULT;
            long A0D3 = AbstractC25229BEm.A0D();
            Integer num = C05F.A00;
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, spannableStringBuilder, 0);
            AbstractC25233BEq.A1B(A12, A0a, A0A, A0D);
            AbstractC25234BEr.A14(A12, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A12, A0a, 0, A02), A0D2), A0D3);
            AbstractC25234BEr.A1I(A0a, num, false);
            A0a.A0M(2);
            AbstractC25234BEr.A15(A12, A0a, false);
            return AbstractC76963ci.A0H(A12, c76223bS, c51722Yv);
        }
        throw B4Z.A00();
    }

    public C26384BlT(C51722Yv c51722Yv, InterfaceC30887Di0 interfaceC30887Di0) {
        this.A02 = interfaceC30887Di0;
        this.A01 = c51722Yv;
    }
}

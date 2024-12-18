package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.BlS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26383BlS extends AbstractC51572Yf {
    public final int A00;
    public final C51722Yv A01;
    public final InterfaceC30885Dhy A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30885Dhy interfaceC30885Dhy = this.A02;
        if (interfaceC30885Dhy instanceof D0O) {
            return null;
        }
        if (interfaceC30885Dhy instanceof C26249BjI) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C26249BjI c26249BjI = (C26249BjI) interfaceC30885Dhy;
            String str = c26249BjI.A00;
            if (str != null && str.length() != 0) {
                spannableStringBuilder.append((CharSequence) str);
                String str2 = c26249BjI.A01;
                if (str2 != null && str2.length() != 0) {
                    spannableStringBuilder.append((CharSequence) " · ");
                }
            }
            String str3 = c26249BjI.A01;
            if (str3 != null && str3.length() != 0) {
                spannableStringBuilder.append((CharSequence) str3);
            }
            C51722Yv c51722Yv = this.A01;
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            C2XE c2xe = A12.A00;
            Context context = c2xe.A0C;
            Drawable drawable = context.getDrawable(R.drawable.instagram_music_pano_filled_12);
            if (drawable != null) {
                drawable.setTint(AbstractC25228BEl.A04(context, A12));
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                C75933ay c75933ay = C51722Yv.A02;
                AbstractC25228BEl.A1I(drawable, scaleType, A12, C9CU.A00(null, C05F.A1F, 0, AbstractC77623dm.A06(A12)));
            }
            int A04 = AbstractC25228BEl.A04(context, A12);
            long A0D = AbstractC77623dm.A0D(A12, this.A00);
            int A02 = A12.BoZ().A02(R.color.black_30_transparent);
            long A0D2 = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Typeface typeface = Typeface.DEFAULT;
            long A0D3 = AbstractC25229BEm.A0D();
            Integer num = C05F.A00;
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, spannableStringBuilder, 0);
            AbstractC25233BEq.A1B(A12, A0a, A04, A0D);
            AbstractC25234BEr.A14(A12, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A12, A0a, 0, A02), A0D2), A0D3);
            AbstractC25234BEr.A1I(A0a, num, false);
            A0a.A0M(1);
            AbstractC25234BEr.A15(A12, A0a, false);
            return AbstractC76963ci.A0H(A12, c76223bS, c51722Yv);
        }
        throw B4Z.A00();
    }

    public C26383BlS(C51722Yv c51722Yv, InterfaceC30885Dhy interfaceC30885Dhy) {
        C14360o3.A0B(interfaceC30885Dhy, 1);
        this.A02 = interfaceC30885Dhy;
        this.A01 = c51722Yv;
        this.A00 = R.dimen.account_discovery_bottom_gap;
    }
}

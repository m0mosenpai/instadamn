package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class F1V {
    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, Integer num, Integer num2, boolean z) {
        int A03;
        boolean z2;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(charSequence);
        Drawable drawable = context.getDrawable(R.drawable.instagram_gen_ai_pano_filled_24);
        if (num != null) {
            A03 = num.intValue();
        } else {
            A03 = (int) AbstractC13880nE.A03(context, 12.0f);
        }
        if (drawable != null) {
            int i = 0;
            drawable.setBounds(0, 0, A03, A03);
            if (num2 != null) {
                AbstractC166997dE.A1F(drawable, num2.intValue());
            }
            C85973sR c85973sR = new C85973sR(drawable);
            if (AbstractC13620mo.A02(context) ? z : !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                A0H.insert(0, (CharSequence) "  ");
            } else {
                A0H.append((CharSequence) "  ");
                i = A0H.length() - 1;
            }
            A0H.setSpan(c85973sR, i, i + 1, 33);
            return A0H;
        }
        throw AbstractC166997dE.A0g();
    }
}

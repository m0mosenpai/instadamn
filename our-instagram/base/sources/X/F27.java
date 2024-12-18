package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class F27 {
    public static final void A00(C32066E6s c32066E6s, E1L e1l) {
        boolean A1R = AbstractC167007dF.A1R(0, e1l, c32066E6s);
        TextView textView = e1l.A00;
        Context context = textView.getContext();
        Drawable drawable = context.getDrawable(c32066E6s.A01);
        if (drawable != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            int A03 = AbstractC31174DnI.A03(context);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            AbstractC166997dE.A1F(drawable.mutate(), A03);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new C85973sR(drawable), 0, A1R ? 1 : 0, 33);
            String A0p = AbstractC166997dE.A0p(context, c32066E6s.A02);
            spannableStringBuilder.append((CharSequence) AnonymousClass773.A00(AbstractC25227BEk.A0B(c32066E6s.A04), A0p, AbstractC167007dF.A0f(context, A0p, c32066E6s.A03)));
            textView.setText(spannableStringBuilder);
            textView.setContentDescription(spannableStringBuilder);
            AbstractC25227BEk.A11(textView);
            textView.setHighlightColor(0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}

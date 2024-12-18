package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Fgk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35251Fgk {
    public static final C35251Fgk A00 = new Object();

    private final void A00(SpannableStringBuilder spannableStringBuilder, Spanned spanned, TextView textView, Object[] objArr, int i) {
        for (Object obj : objArr) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            spannableStringBuilder.setSpan(obj, spanStart, spanEnd, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getContext().getColor(i)), spanStart, spanEnd, 33);
        }
    }

    public static final void A01(ImageView imageView, int i) {
        AbstractC31177DnL.A0p(AbstractC31173DnH.A06(imageView, 0), imageView, i);
    }

    public static final void A02(TextView textView, int i) {
        Drawable mutate;
        Drawable mutate2;
        ColorFilter A09 = AbstractC31174DnI.A09(AbstractC31173DnH.A06(textView, 0), i);
        Drawable drawable = textView.getCompoundDrawables()[0];
        if (drawable != null && (mutate2 = drawable.mutate()) != null) {
            mutate2.setColorFilter(A09);
        }
        Drawable drawable2 = textView.getCompoundDrawablesRelative()[0];
        if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
            mutate.setColorFilter(A09);
        }
    }

    public static final void A03(TextView textView, int i) {
        Spanned spanned;
        C14360o3.A0B(textView, 0);
        CharSequence text = textView.getText();
        if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(textView.getText());
            Object[] spans = spanned.getSpans(0, textView.getText().length(), StyleSpan.class);
            if (spans == null) {
                spans = new StyleSpan[0];
            }
            C35251Fgk c35251Fgk = A00;
            c35251Fgk.A00(A0H, spanned, textView, spans, i);
            Object[] spans2 = spanned.getSpans(0, textView.getText().length(), AnonymousClass772.class);
            C14360o3.A0A(spans2);
            c35251Fgk.A00(A0H, spanned, textView, spans2, i);
            textView.setText(A0H);
        }
    }

    public static final void A04(SearchEditText searchEditText) {
        C14360o3.A0B(searchEditText, 0);
        searchEditText.setClearButtonColorFilter(AbstractC31174DnI.A09(searchEditText.getContext(), R.color.grey_5));
    }
}

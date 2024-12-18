package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* renamed from: X.4GL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4GL {
    public static final Object A00(Spanned spanned, Class cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        C14360o3.A0A(spans);
        if (spans.length == 0) {
            return null;
        }
        return spans[0];
    }

    public static final void A01(Resources resources, Drawable drawable, int i) {
        C14360o3.A0B(resources, 0);
        C14360o3.A0B(drawable, 1);
        try {
            float dimensionPixelSize = resources.getDimensionPixelSize(i);
            drawable.setBounds(0, 0, (int) dimensionPixelSize, (int) ((dimensionPixelSize / drawable.getIntrinsicWidth()) * drawable.getIntrinsicHeight()));
        } catch (Resources.NotFoundException e) {
            C0K8.A0C("SpannableUtil", e.getMessage());
        }
    }

    public static final void A02(Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        C14360o3.A0B(drawable, 2);
        A03(drawable, spannableStringBuilder, C05F.A01, i, i2, i3);
    }

    public static final void A03(Drawable drawable, SpannableStringBuilder spannableStringBuilder, Integer num, int i, int i2, int i3) {
        C14360o3.A0B(drawable, 2);
        C85973sR c85973sR = new C85973sR(drawable);
        c85973sR.A02 = num;
        c85973sR.A00 = i2;
        c85973sR.A01 = i3;
        spannableStringBuilder.insert(i, " ");
        spannableStringBuilder.setSpan(c85973sR, i, i + 1, 33);
    }

    public static final void A04(Spannable spannable, Spanned spanned, Class... clsArr) {
        C14360o3.A0B(clsArr, 2);
        int length = spannable.length();
        for (Class cls : clsArr) {
            for (Object obj : A06(spanned, cls)) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                int spanFlags = spanned.getSpanFlags(obj);
                if (spanStart >= 0 && spanEnd >= 0) {
                    spannable.setSpan(obj, Math.min(spanStart, length), Math.min(spanEnd, length), spanFlags);
                }
            }
        }
    }

    public static final void A05(Spannable spannable, Class... clsArr) {
        C14360o3.A0B(spannable, 0);
        for (Class cls : clsArr) {
            Object[] spans = spannable.getSpans(0, spannable.length(), cls);
            C14360o3.A07(spans);
            for (Object obj : spans) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static final Object[] A06(Spanned spanned, Class cls) {
        C14360o3.A0B(spanned, 0);
        C14360o3.A0B(cls, 1);
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        C14360o3.A07(spans);
        return spans;
    }
}

package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* renamed from: X.0mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13680mu {
    public static final C13680mu A00 = new Object();

    public static final float A00(Layout.Alignment alignment, TextPaint textPaint, String str, int i, int i2, int i3, int i4) {
        float f;
        List list;
        float f2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(textPaint, 1);
        int i5 = (int) (i3 * 2.0f);
        int i6 = (int) (i4 * 2.0f);
        while (true) {
            int floor = ((int) Math.floor((i6 - i5) / 2.0f)) + i5;
            f = floor / 2.0f;
            if (i5 >= floor) {
                break;
            }
            textPaint.setTextSize(f);
            if (new StaticLayout(str, textPaint, i, alignment, 1.0f, 0.0f, true).getLineCount() <= i2) {
                i5 = floor;
            } else {
                i6 = floor;
            }
        }
        List A03 = new C11L(" ").A03(str);
        if (!A03.isEmpty()) {
            ListIterator listIterator = A03.listIterator(A03.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        float f3 = Float.MAX_VALUE;
        for (String str2 : (String[]) list.toArray(new String[0])) {
            int i7 = i5;
            int i8 = i6;
            while (true) {
                int floor2 = ((int) Math.floor((i8 - i7) / 2.0f)) + i7;
                f2 = floor2 / 2.0f;
                if (i7 < floor2) {
                    textPaint.setTextSize(f2);
                    if (textPaint.measureText(str2) <= i) {
                        i7 = floor2;
                    } else {
                        i8 = floor2;
                    }
                }
            }
            f3 = Math.min(f3, f2);
        }
        return Math.min(f, f3);
    }

    public static final void A02(SpannableString spannableString, String str, int i) {
        C14360o3.A0B(str, 1);
        int length = str.length();
        String obj = spannableString.toString();
        C14360o3.A07(obj);
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        String lowerCase = obj.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        Locale locale2 = Locale.getDefault();
        C14360o3.A07(locale2);
        String lowerCase2 = str.toLowerCase(locale2);
        C14360o3.A07(lowerCase2);
        int A08 = AbstractC001900j.A08(lowerCase, lowerCase2, 0, false);
        if (A08 > -1) {
            spannableString.setSpan(new ForegroundColorSpan(i), A08, length + A08, 0);
        }
    }

    public static final void A03(TextView textView, int i) {
        C14360o3.A0B(textView, 0);
        textView.setLineSpacing(0.0f, 1.0f);
        textView.setLineSpacing(i - textView.getLineHeight(), 1.0f);
    }

    public static final void A04(TextView textView, int i) {
        C14360o3.A0B(textView, 0);
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), AbstractC56842jH.A06(textView.getShadowColor(), i));
    }

    public static final void A05(TextView textView, int i, int i2, int i3) {
        CharSequence text = textView.getText();
        if (text != null && text.length() != 0 && textView.getWidth() != 0) {
            String obj = textView.getText().toString();
            textView.setTextSize(0, A00(Layout.Alignment.ALIGN_CENTER, new TextPaint(textView.getPaint()), obj, textView.getWidth(), i, i2, i3));
        }
    }

    public static final boolean A06(TextView textView, CharSequence charSequence) {
        C14360o3.A0B(charSequence, 1);
        String replaceAll = AbstractC13670mt.A07.matcher(charSequence).replaceAll(" ");
        C14360o3.A07(replaceAll);
        if (charSequence.equals(replaceAll)) {
            return false;
        }
        textView.setText(replaceAll);
        return true;
    }

    public static final int A01(Context context, Typeface typeface, CharSequence charSequence, float f, int i, int i2) {
        TextView textView = new TextView(context);
        textView.setTypeface(typeface);
        textView.setText(charSequence);
        textView.setTextSize(0, i);
        textView.setLineSpacing(0.0f, f);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }
}

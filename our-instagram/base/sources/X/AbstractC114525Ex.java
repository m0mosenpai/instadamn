package X;

import android.graphics.Paint;
import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: X.5Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114525Ex {
    public static void A00(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new NullPointerException("getPrecomputedText");
        }
        new C69767Vv4(textView.getTextMetricsParams());
        throw new NullPointerException("getParams");
    }

    public static void A01(TextView textView, float f, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC224359vM.A00(textView, f, i);
        } else {
            A03(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void A02(TextView textView, int i) {
        int i2;
        C02R.A00(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void A03(TextView textView, int i) {
        C02R.A00(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }
}

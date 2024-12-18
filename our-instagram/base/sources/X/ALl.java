package X;

import android.content.Context;
import android.text.TextPaint;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class ALl {
    public static final ALl A00 = new Object();

    public static final float A00(TextPaint textPaint, ALl aLl, String str, float f, float f2, float f3, int i) {
        float f4;
        float textSize = textPaint.getTextSize();
        float measureText = textPaint.measureText(str);
        textPaint.setTextSize(f);
        float f5 = i;
        if (textPaint.measureText(str) > f5) {
            if (measureText <= f5) {
                return textSize;
            }
            f4 = textSize - f2;
        } else {
            if (f >= f3) {
                return f3;
            }
            f4 = textSize + f2;
        }
        return A00(textPaint, aLl, str, f4, f2, f3, i);
    }

    public static final int A01(Context context, String str) {
        Object valueOf;
        C14360o3.A0B(str, 1);
        boolean equals = str.equals("@");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.group_mention_sticker_title_text_size);
        if (equals) {
            valueOf = Float.valueOf(dimensionPixelSize / 2.3f);
        } else {
            valueOf = Integer.valueOf(dimensionPixelSize / 3);
        }
        return AbstractC166987dD.A0H(valueOf);
    }
}

package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

/* renamed from: X.VWd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68576VWd {
    public static final CharSequence A00(Layout layout, SpannableStringBuilder spannableStringBuilder, C57482kN c57482kN, CharSequence charSequence, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, charSequence, spannableStringBuilder);
        if (c57482kN.A00 <= 0) {
            return "";
        }
        int lineStart = layout.getLineStart(i - (A1R ? 1 : 0));
        TextPaint textPaint = c57482kN.A04;
        char[] charArray = charSequence.toString().toCharArray();
        C14360o3.A07(charArray);
        StringBuilder sb = new StringBuilder(charSequence.subSequence(lineStart, Math.min(textPaint.breakText(charArray, lineStart, charSequence.length() - lineStart, c57482kN.A00, null) + lineStart, charSequence.length())));
        textPaint.setFakeBoldText(A1R);
        float lineWidth = c57482kN.A00(spannableStringBuilder).getLineWidth(0);
        int length = sb.length();
        boolean z = true;
        for (float measureText = textPaint.measureText(sb, 0, sb.length()); measureText + lineWidth > c57482kN.A00; measureText = textPaint.measureText(sb, 0, sb.length())) {
            if (z) {
                i2 = Character.codePointCount(spannableStringBuilder, 0, spannableStringBuilder.length());
                int codePointCount = sb.codePointCount(0, length);
                if (i2 > codePointCount) {
                    i2 = codePointCount;
                }
                z = false;
            } else {
                i2 = 1;
            }
            length = sb.offsetByCodePoints(length, -i2);
            sb.setLength(length);
        }
        sb.setLength(length);
        textPaint.setFakeBoldText(false);
        CharSequence subSequence = charSequence.subSequence(0, lineStart + sb.length());
        int length2 = subSequence.length();
        while (length2 > 0 && AbstractC58319PtB.A1T(subSequence, length2 - 1)) {
            length2--;
        }
        return subSequence.subSequence(0, length2);
    }
}

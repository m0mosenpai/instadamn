package X;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.text.BreakIterator;

/* renamed from: X.3dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77713dv {
    public static final int A00;
    public static final ColorStateList A01;
    public static final Path A02;
    public static final Rect A03;
    public static final RectF A04;
    public static final Typeface A05;
    public static final Integer A06;
    public static final Typeface A07;
    public static final int[] A08;
    public static final int[][] A09;

    public static CharSequence A01(Layout layout, Layout layout2, CharSequence charSequence, CharSequence charSequence2, float f, int i, boolean z, boolean z2) {
        int lineStart;
        float lineWidth = layout2.getLineWidth(0);
        if (!z2) {
            if (z) {
                lineWidth = f - lineWidth;
            } else {
                lineWidth = (f - lineWidth) + (f - layout.getLineWidth(i));
            }
        } else if (z) {
            lineWidth -= f - layout.getLineWidth(i);
        }
        TextPaint paint = layout.getPaint();
        C14360o3.A07(paint);
        int lineStart2 = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        int offsetForAdvance = paint.getOffsetForAdvance(charSequence, lineStart2, lineEnd, lineStart2, lineEnd, z2, lineWidth);
        if (offsetForAdvance <= 0) {
            return charSequence;
        }
        int i2 = offsetForAdvance - 1;
        if (layout.getEllipsisCount(i) > 0 && i2 > (lineStart = layout.getLineStart(i) + layout.getEllipsisStart(i))) {
            i2 = lineStart;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > charSequence.length()) {
            i2 = charSequence.length();
        } else if (Character.isSurrogate(charSequence.charAt(i2)) && i2 != 0 && i2 != charSequence.length()) {
            if (Build.VERSION.SDK_INT >= 29) {
                i2 = AD5.A01(charSequence, i2);
            } else {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(charSequence.toString());
                i2 = characterInstance.preceding(i2);
            }
        }
        return TextUtils.concat(charSequence.subSequence(0, i2), charSequence2);
    }

    static {
        Typeface typeface = Typeface.DEFAULT;
        A07 = typeface;
        int[][] iArr = {new int[]{0}};
        A09 = iArr;
        int[] iArr2 = {-16777216};
        A08 = iArr2;
        A01 = new ColorStateList(iArr, iArr2);
        A00 = typeface.getStyle();
        A05 = typeface;
        A06 = C05F.A00;
        A02 = new Path();
        A03 = new Rect();
        A04 = new RectF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
    
        if ((r14 == r7) == r6.CcD(r15, 0, r15.length())) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0193, code lost:
    
        if ((r14 == r7) == r6.CcD(r15, 0, r15.length())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019e, code lost:
    
        if (r6.CcD(r15, 0, r15.length()) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a9, code lost:
    
        if (r6.CcD(r15, 0, r15.length()) != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout A00(android.content.res.ColorStateList r10, android.graphics.Typeface r11, android.text.TextUtils.TruncateAt r12, X.C2XE r13, X.EnumC78563fO r14, java.lang.CharSequence r15, java.lang.Integer r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC77713dv.A00(android.content.res.ColorStateList, android.graphics.Typeface, android.text.TextUtils$TruncateAt, X.2XE, X.3fO, java.lang.CharSequence, java.lang.Integer, float, float, float, float, float, float, float, int, int, int, int, int, int, int, int, int, int, int, int, int, int, boolean, boolean):android.text.Layout");
    }
}

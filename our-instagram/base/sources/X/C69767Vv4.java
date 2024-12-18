package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Arrays;

/* renamed from: X.Vv4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69767Vv4 {
    public final int A00;
    public final int A01;
    public final PrecomputedText.Params A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r2.getTypeface() != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r6) goto L93
            boolean r0 = r7 instanceof X.C69767Vv4
            r4 = 0
            if (r0 == 0) goto L7c
            X.Vv4 r7 = (X.C69767Vv4) r7
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L7c
            int r1 = r6.A01
            int r0 = r7.A01
            if (r1 != r0) goto L7c
            android.text.TextPaint r3 = r6.A04
            float r1 = r3.getTextSize()
            android.text.TextPaint r2 = r7.A04
            float r0 = r2.getTextSize()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7c
            float r1 = r3.getTextScaleX()
            float r0 = r2.getTextScaleX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7c
            float r1 = r3.getTextSkewX()
            float r0 = r2.getTextSkewX()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7c
            float r1 = r3.getLetterSpacing()
            float r0 = r2.getLetterSpacing()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7c
            java.lang.String r1 = r3.getFontFeatureSettings()
            java.lang.String r0 = r2.getFontFeatureSettings()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L7c
            int r1 = r3.getFlags()
            int r0 = r2.getFlags()
            if (r1 != r0) goto L7c
            android.os.LocaleList r1 = r3.getTextLocales()
            android.os.LocaleList r0 = r2.getTextLocales()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7c
            android.graphics.Typeface r0 = r3.getTypeface()
            if (r0 != 0) goto L7d
            android.graphics.Typeface r0 = r2.getTypeface()
            if (r0 == 0) goto L8c
        L7c:
            return r4
        L7d:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r0 = r2.getTypeface()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8c
            return r4
        L8c:
            android.text.TextDirectionHeuristic r1 = r6.A03
            android.text.TextDirectionHeuristic r0 = r7.A03
            if (r1 == r0) goto L93
            r5 = 0
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69767Vv4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextPaint textPaint = this.A04;
        return Arrays.hashCode(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        TextPaint textPaint = this.A04;
        sb.append(AnonymousClass001.A0N("textSize=", textPaint.getTextSize()));
        sb.append(AnonymousClass001.A0N(", textScaleX=", textPaint.getTextScaleX()));
        sb.append(AnonymousClass001.A0N(", textSkewX=", textPaint.getTextSkewX()));
        sb.append(AnonymousClass001.A0N(AbstractC111324zv.A00(1430), textPaint.getLetterSpacing()));
        sb.append(AnonymousClass001.A1D(", elegantTextHeight=", textPaint.isElegantTextHeight()));
        StringBuilder A0Y = AbstractC50523MSb.A0Y(textPaint.getTextLocales(), AbstractC166997dE.A11(", textLocale="), sb);
        A0Y.append(", typeface=");
        A0Y.append(textPaint.getTypeface());
        AbstractC58318PtA.A1V(sb, A0Y);
        AbstractC50523MSb.A1N(", variationSettings=", textPaint.getFontVariationSettings(), sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(", textDir=");
        sb2.append(this.A03);
        AbstractC58318PtA.A1V(sb, sb2);
        sb.append(AnonymousClass001.A0O(", breakStrategy=", this.A00));
        return AbstractC50523MSb.A0W(AnonymousClass001.A0O(", hyphenationFrequency=", this.A01), sb);
    }

    public C69767Vv4(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
        this.A02 = Build.VERSION.SDK_INT < 29 ? null : params;
    }
}

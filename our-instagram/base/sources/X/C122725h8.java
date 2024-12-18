package X;

import android.text.BoringLayout;
import android.text.TextPaint;

/* renamed from: X.5h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122725h8 {
    public BoringLayout.Metrics A01;
    public boolean A02;
    public final int A04;
    public final TextPaint A05;
    public final CharSequence A06;
    public float A03 = Float.NaN;
    public float A00 = Float.NaN;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r6.nextSpanTransition(-1, r6.length(), X.C122785hE.class) == r6.length()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r5.getLetterSpacing() == 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r3 < 0.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A00() {
        /*
            r7 = this;
            float r3 = r7.A03
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L73
            boolean r0 = r7.A02
            if (r0 != 0) goto L1f
            int r0 = r7.A04
            android.text.TextDirectionHeuristic r2 = X.AbstractC122735h9.A00(r0)
            java.lang.CharSequence r1 = r7.A06
            android.text.TextPaint r0 = r7.A05
            android.text.BoringLayout$Metrics r0 = X.AbstractC122755hB.A00(r2, r0, r1)
            r7.A01 = r0
            r0 = 1
            r7.A02 = r0
        L1f:
            android.text.BoringLayout$Metrics r0 = r7.A01
            if (r0 == 0) goto L2b
            int r0 = r0.width
            float r3 = (float) r0
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3e
        L2b:
            java.lang.CharSequence r3 = r7.A06
            r2 = 0
            int r1 = r3.length()
            android.text.TextPaint r0 = r7.A05
            float r0 = android.text.Layout.getDesiredWidth(r3, r2, r1, r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r3 = (float) r0
        L3e:
            java.lang.CharSequence r6 = r7.A06
            android.text.TextPaint r5 = r7.A05
            r4 = 0
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 == 0) goto L71
            boolean r0 = r6 instanceof android.text.Spanned
            if (r0 == 0) goto L74
            android.text.Spanned r6 = (android.text.Spanned) r6
            java.lang.Class<X.5hD> r1 = X.C122775hD.class
            int r0 = r6.length()
            r2 = -1
            int r1 = r6.nextSpanTransition(r2, r0, r1)
            int r0 = r6.length()
            if (r1 != r0) goto L6e
            java.lang.Class<X.5hE> r1 = X.C122785hE.class
            int r0 = r6.length()
            int r1 = r6.nextSpanTransition(r2, r0, r1)
            int r0 = r6.length()
            if (r1 == r0) goto L74
        L6e:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
        L71:
            r7.A03 = r3
        L73:
            return r3
        L74:
            float r0 = r5.getLetterSpacing()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L6e
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122725h8.A00():float");
    }

    public C122725h8(TextPaint textPaint, CharSequence charSequence, int i) {
        this.A06 = charSequence;
        this.A05 = textPaint;
        this.A04 = i;
    }
}

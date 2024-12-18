package com.facebook.xapp.messaging.richtext.spans;

import X.AbstractC167007dF;
import X.AbstractC58319PtB;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import android.text.style.StyleSpan;

/* loaded from: classes10.dex */
public final class RichTextHeadingSpan extends StyleSpan implements LineHeightSpan {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;
    public final boolean A07;

    public RichTextHeadingSpan(int i, int i2, boolean z, boolean z2) {
        super(1);
        this.A05 = i;
        this.A04 = i2;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = Integer.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC167007dF.A1G(charSequence, 0, fontMetricsInt);
        if (this.A00 == Integer.MAX_VALUE || this.A02 == Integer.MAX_VALUE || this.A03 == Integer.MAX_VALUE || this.A01 == Integer.MAX_VALUE) {
            this.A00 = fontMetricsInt.ascent;
            this.A02 = fontMetricsInt.descent;
            this.A03 = fontMetricsInt.top;
            this.A01 = fontMetricsInt.bottom;
        }
        Spanned spanned = (Spanned) charSequence;
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        boolean z = true;
        boolean A1P = AbstractC58319PtB.A1P(i, spanStart);
        if (i2 < spanEnd) {
            z = false;
        }
        if (A1P) {
            int i10 = fontMetricsInt.ascent;
            boolean z2 = this.A07;
            if (z2) {
                i8 = this.A05;
            } else {
                i8 = this.A04;
            }
            fontMetricsInt.ascent = i10 - i8;
            int i11 = fontMetricsInt.top;
            if (z2) {
                i9 = this.A05;
            } else {
                i9 = this.A04;
            }
            fontMetricsInt.top = i11 - i9;
        } else {
            fontMetricsInt.ascent = this.A00;
            fontMetricsInt.descent = this.A02;
        }
        if (z) {
            int i12 = fontMetricsInt.descent;
            boolean z3 = this.A06;
            if (z3) {
                i6 = this.A05;
            } else {
                i6 = this.A04;
            }
            fontMetricsInt.descent = i12 + i6;
            int i13 = fontMetricsInt.bottom;
            if (z3) {
                i7 = this.A05;
            } else {
                i7 = this.A04;
            }
            i5 = i13 + i7;
        } else {
            fontMetricsInt.descent = this.A02;
            i5 = this.A01;
        }
        fontMetricsInt.bottom = i5;
    }
}

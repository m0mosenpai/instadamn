package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.So4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63490So4 implements LineHeightSpan, InterfaceC71843X7b {
    public final int A00;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C14360o3.A0B(fontMetricsInt, 5);
        if (C62856SUd.A00.enableAndroidLineHeightCentering()) {
            int i11 = fontMetricsInt.descent;
            i5 = this.A00;
            if (i11 > i5) {
                fontMetricsInt.descent = i5;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                return;
            }
            int i12 = fontMetricsInt.ascent;
            if ((-i12) + i11 > i5) {
                int i13 = (-((i5 + i12) - i11)) / 2;
                int i14 = i12 + i13;
                fontMetricsInt.ascent = i14;
                i10 = (i11 - i13) - (i13 % 2);
                fontMetricsInt.descent = i10;
                fontMetricsInt.top = i14;
            } else {
                i7 = fontMetricsInt.top;
                i6 = fontMetricsInt.bottom;
                i8 = (-i7) + i6;
                if (i8 > i5) {
                    int i15 = (i8 - i5) / 2;
                    fontMetricsInt.top = i7 + i15;
                    i10 = i6 - i15;
                }
                float f = i7;
                double d = (i5 - i8) / 2.0f;
                int ceil = (int) (f - ((float) Math.ceil(d)));
                i10 = (int) (i6 + ((float) Math.floor(d)));
                fontMetricsInt.top = ceil;
                fontMetricsInt.ascent = ceil;
                fontMetricsInt.descent = i10;
            }
        } else {
            int i16 = fontMetricsInt.descent;
            i5 = this.A00;
            if (i16 > i5) {
                int min = (int) Math.min(i5, i16);
                fontMetricsInt.descent = min;
                fontMetricsInt.bottom = min;
                i9 = 0;
            } else {
                int i17 = fontMetricsInt.ascent;
                int i18 = -i17;
                if (i18 + i16 > i5) {
                    fontMetricsInt.bottom = i16;
                    i9 = (-i5) + i16;
                } else {
                    i6 = fontMetricsInt.bottom;
                    if (i18 + i6 > i5) {
                        fontMetricsInt.top = i17;
                        i10 = i17 + i5;
                    } else {
                        i7 = fontMetricsInt.top;
                        i8 = (-i7) + i6;
                        if (i8 > i5) {
                            i9 = i6 - i5;
                            fontMetricsInt.top = i9;
                            return;
                        }
                        float f2 = i7;
                        double d2 = (i5 - i8) / 2.0f;
                        int ceil2 = (int) (f2 - ((float) Math.ceil(d2)));
                        i10 = (int) (i6 + ((float) Math.floor(d2)));
                        fontMetricsInt.top = ceil2;
                        fontMetricsInt.ascent = ceil2;
                        fontMetricsInt.descent = i10;
                    }
                }
            }
            fontMetricsInt.ascent = i9;
            fontMetricsInt.top = i9;
            return;
        }
        fontMetricsInt.bottom = i10;
    }

    public C63490So4(float f) {
        this.A00 = (int) Math.ceil(f);
    }
}

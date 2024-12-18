package X;

import android.graphics.Paint;
import android.text.Editable;
import android.text.style.LineHeightSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes10.dex */
public final class R8M extends R8N implements LineHeightSpan {
    public final float A00;
    public final String A01;
    public final int A02;

    public R8M(Editable editable, DisplayMetrics displayMetrics, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(editable, displayMetrics, i, i2, i3, i4);
        String A0l;
        StringBuilder A1C;
        this.A02 = i5;
        if (z && i != 0) {
            int i6 = ((R8K) this).A01;
            if (i != 1) {
                if (i6 <= 0) {
                    A0l = "";
                } else {
                    int[] iArr = {1000, 900, 500, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                    int i7 = 0;
                    String[] strArr = {"m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
                    A1C = AbstractC166987dD.A1C();
                    while (true) {
                        if (i6 >= iArr[i7]) {
                            A1C.append(strArr[i7]);
                            i6 -= iArr[i7];
                        } else {
                            i7++;
                            if (i7 >= 13) {
                                break;
                            }
                        }
                    }
                }
            } else {
                A1C = AbstractC166987dD.A1C();
                while (i6 > 0) {
                    int i8 = i6 - 1;
                    A1C.insert(0, (char) ((i8 % 26) + 97));
                    i6 = i8 / 26;
                }
            }
            A1C.append('.');
            A0l = AbstractC166987dD.A19(A1C);
        } else {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append(((R8K) this).A01);
            A0l = MSX.A0l(A1C2, '.');
        }
        this.A01 = A0l;
        this.A00 = TypedValue.applyDimension(2, 8.0f, displayMetrics);
        ((AbstractC63487So1) this).A00 = TypedValue.applyDimension(2, 28.0f, displayMetrics) * (i + 1);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C14360o3.A0B(fontMetricsInt, 5);
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = this.A02;
        if (i7 > i8) {
            float f = i8 / i7;
            fontMetricsInt.ascent = (int) (i6 * f);
            fontMetricsInt.descent = (int) (i5 * f);
        } else {
            int i9 = (i8 - i7) / 2;
            fontMetricsInt.descent = i5 + i9;
            fontMetricsInt.ascent = i6 - i9;
        }
    }
}

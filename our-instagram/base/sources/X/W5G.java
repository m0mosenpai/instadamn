package X;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class W5G {

    @Deprecated
    public static final W5G A0G;
    public static final String A0H;
    public static final String A0I;
    public static final String A0J;
    public static final String A0K;
    public static final String A0L;
    public static final String A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final Layout.Alignment A0E;
    public final CharSequence A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            W5G w5g = (W5G) obj;
            if (TextUtils.equals(this.A0F, w5g.A0F) && this.A0E == w5g.A0E && this.A0D == w5g.A0D) {
                Bitmap bitmap = this.A0C;
                Bitmap bitmap2 = w5g.A0C;
                if (bitmap == null) {
                    if (bitmap2 != null) {
                        return false;
                    }
                } else if (bitmap2 == null || !bitmap.sameAs(bitmap2)) {
                    return false;
                }
                if (this.A01 != w5g.A01 || this.A07 != w5g.A07 || this.A06 != w5g.A06 || this.A02 != w5g.A02 || this.A08 != w5g.A08 || this.A04 != w5g.A04 || this.A00 != w5g.A00 || this.A0B != w5g.A0B || this.A09 != w5g.A09 || this.A05 != w5g.A05 || this.A0A != w5g.A0A || this.A03 != w5g.A03) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    static {
        C69660Vt1 c69660Vt1 = new C69660Vt1();
        c69660Vt1.A0E = "";
        A0G = c69660Vt1.A00();
        A0S = Integer.toString(0, 36);
        A0J = Integer.toString(17, 36);
        A0T = Integer.toString(1, 36);
        A0N = Integer.toString(2, 36);
        A0H = Integer.toString(18, 36);
        A0K = Integer.toString(4, 36);
        A0M = Integer.toString(5, 36);
        A0L = Integer.toString(6, 36);
        A0O = Integer.toString(7, 36);
        A0P = Integer.toString(8, 36);
        A0V = Integer.toString(9, 36);
        A0U = Integer.toString(10, 36);
        A0R = Integer.toString(11, 36);
        A0I = Integer.toString(12, 36);
        A0X = Integer.toString(13, 36);
        A0Y = Integer.toString(14, 36);
        A0W = Integer.toString(15, 36);
        A0Q = Integer.toString(16, 36);
    }

    public W5G(Bitmap bitmap, Layout.Alignment alignment, Layout.Alignment alignment2, CharSequence charSequence, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4, int i5) {
        CharSequence charSequence2;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            WDn.A01(AbstractC25229BEm.A1Z(bitmap));
        }
        if (charSequence instanceof Spanned) {
            charSequence2 = SpannedString.valueOf(charSequence);
        } else {
            charSequence2 = charSequence != null ? charSequence.toString() : charSequence2;
            this.A0E = alignment;
            this.A0D = alignment2;
            this.A0C = bitmap;
            this.A01 = f;
            this.A07 = i;
            this.A06 = i2;
            this.A02 = f2;
            this.A08 = i3;
            this.A04 = f4;
            this.A00 = f5;
            this.A0B = -16777216;
            this.A09 = i4;
            this.A05 = f3;
            this.A0A = i5;
            this.A03 = f6;
        }
        this.A0F = charSequence2;
        this.A0E = alignment;
        this.A0D = alignment2;
        this.A0C = bitmap;
        this.A01 = f;
        this.A07 = i;
        this.A06 = i2;
        this.A02 = f2;
        this.A08 = i3;
        this.A04 = f4;
        this.A00 = f5;
        this.A0B = -16777216;
        this.A09 = i4;
        this.A05 = f3;
        this.A0A = i5;
        this.A03 = f6;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0F, this.A0E, this.A0D, this.A0C, Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Float.valueOf(this.A02), Integer.valueOf(this.A08), Float.valueOf(this.A04), Float.valueOf(this.A00), false, Integer.valueOf(this.A0B), Integer.valueOf(this.A09), Float.valueOf(this.A05), Integer.valueOf(this.A0A), Float.valueOf(this.A03)});
    }
}

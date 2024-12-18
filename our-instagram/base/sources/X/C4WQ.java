package X;

import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.4WQ, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4WQ {
    public static final C4WQ A0D = new C4WQ(null, "", -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, -16777216, Integer.MIN_VALUE);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Layout.Alignment A0B;
    public final CharSequence A0C;

    public C4WQ(Layout.Alignment alignment, CharSequence charSequence, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, int i4, int i5, int i6) {
        CharSequence charSequence2;
        Object obj = null;
        if (charSequence == null) {
            obj.getClass();
            throw C00O.createAndThrow();
        }
        if (charSequence instanceof Spanned) {
            charSequence2 = SpannedString.valueOf(charSequence);
        } else {
            charSequence2 = charSequence.toString();
        }
        this.A0C = charSequence2;
        this.A0B = alignment;
        this.A01 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = f2;
        this.A07 = i3;
        this.A03 = f4;
        this.A00 = f5;
        this.A0A = i5;
        this.A08 = i4;
        this.A04 = f3;
        this.A09 = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4WQ c4wq = (C4WQ) obj;
            if (!TextUtils.equals(this.A0C, c4wq.A0C) || this.A0B != c4wq.A0B || this.A01 != c4wq.A01 || this.A06 != c4wq.A06 || this.A05 != c4wq.A05 || this.A02 != c4wq.A02 || this.A07 != c4wq.A07 || this.A03 != c4wq.A03 || this.A00 != c4wq.A00 || this.A0A != c4wq.A0A || this.A08 != c4wq.A08 || this.A04 != c4wq.A04 || this.A09 != c4wq.A09) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0C, this.A0B, null, null, Float.valueOf(this.A01), Integer.valueOf(this.A06), Integer.valueOf(this.A05), Float.valueOf(this.A02), Integer.valueOf(this.A07), Float.valueOf(this.A03), Float.valueOf(this.A00), false, Integer.valueOf(this.A0A), Integer.valueOf(this.A08), Float.valueOf(this.A04), Integer.valueOf(this.A09), Float.valueOf(0.0f)});
    }
}

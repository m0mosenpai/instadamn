package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;

/* renamed from: X.5JH, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5JH {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C5JI A04;
    public String A05;
    public String A06;
    public String A07;
    public final float A08;
    public final MediaEffect A09;
    public final Float A0A;

    public C5JH(MediaEffect mediaEffect, C5JI c5ji, Float f, String str, String str2, String str3, float f2, float f3, int i, int i2, int i3) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A07 = str2;
        this.A04 = c5ji;
        this.A06 = str3;
        this.A09 = mediaEffect;
        this.A08 = f3;
        this.A0A = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5JH)) {
            return false;
        }
        C5JH c5jh = (C5JH) obj;
        return Float.compare(c5jh.A00, this.A00) == 0 && this.A02 == c5jh.A02 && this.A03 == c5jh.A03 && this.A01 == c5jh.A01 && C14360o3.A0K(this.A05, c5jh.A05) && this.A04 == c5jh.A04 && C14360o3.A0K(this.A07, c5jh.A07) && C14360o3.A0K(this.A09, c5jh.A09) && this.A08 == c5jh.A08 && C14360o3.A0J(this.A0A, c5jh.A0A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Float.valueOf(this.A00), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A04, this.A07, this.A09, Float.valueOf(this.A08), this.A0A});
    }

    public C5JH() {
        this(null, C5JI.A08, null, "", null, null, 1.0f, 1.0f, 0, 0, -1);
    }
}

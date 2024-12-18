package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.VsX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69630VsX {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final String A06;

    public C69630VsX(String str, float f, float f2, float f3, float f4, float f5, float f6) {
        C14360o3.A0B(str, 7);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = str;
    }

    public final String toString() {
        String format = String.format(Locale.US, "WordLayout[fs=%.2f, fh=%.2f, x=%.2f, y=%.2f, t=%s]", Arrays.copyOf(new Object[]{Float.valueOf(this.A01), Float.valueOf(this.A00), Float.valueOf(this.A04), Float.valueOf(this.A05), this.A06}, 5));
        C14360o3.A07(format);
        return format;
    }
}

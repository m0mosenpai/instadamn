package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.VsN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69620VsN {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final String A04;
    public final boolean A05;

    public C69620VsN(String str, float f, float f2, float f3, float f4, boolean z) {
        C14360o3.A0B(str, 5);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = str;
        this.A05 = z;
    }

    public final String toString() {
        String format = String.format(Locale.US, "WordLayout[fs=%.2f, fh=%.2f, x=%.2f, y=%.2f, t=%s]", Arrays.copyOf(new Object[]{Float.valueOf(this.A01), Float.valueOf(this.A00), Float.valueOf(this.A02), Float.valueOf(this.A03), this.A04}, 5));
        C14360o3.A07(format);
        return format;
    }
}

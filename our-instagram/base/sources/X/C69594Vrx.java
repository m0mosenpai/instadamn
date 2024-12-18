package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Vrx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69594Vrx {
    public final float A00;
    public final float A01;
    public final float A02;
    public final String A03;

    public final String toString() {
        String format = String.format(Locale.US, "LayoutChunk[baseline=%.2f, start=%.2f, end=%.2f, text=%s]", Arrays.copyOf(new Object[]{Float.valueOf(this.A00), Float.valueOf(this.A02), Float.valueOf(this.A01), this.A03}, 4));
        C14360o3.A07(format);
        return format;
    }

    public C69594Vrx(String str, float f, float f2, float f3) {
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = str;
    }
}

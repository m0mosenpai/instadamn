package X;

import java.util.Locale;

/* loaded from: classes12.dex */
public final class Y1o {
    public static final Y1o A03 = new Y1o();
    public final float A01 = 1.0f;
    public final float A00 = 1.0f;
    public final int A02 = Math.round(1.0f * 1000.0f);

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    public final int hashCode() {
        int floatToRawIntBits = Float.floatToRawIntBits(1.0f);
        return JQ0.A01(floatToRawIntBits) + floatToRawIntBits;
    }

    public final String toString() {
        Float valueOf = Float.valueOf(1.0f);
        Object[] objArr = {valueOf, valueOf};
        return String.format(Locale.US, AbstractC111324zv.A00(1716), objArr);
    }
}

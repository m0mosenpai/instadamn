package X;

import java.util.Arrays;

/* renamed from: X.5FE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FE {
    public static final C5FE A01 = new C5FE();
    public final int A00 = -2;

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof C5FE);
    }

    public final int hashCode() {
        Integer num = -2;
        Boolean bool = false;
        return ((num.hashCode() + 31) * 31) + bool.hashCode();
    }

    public final String toString() {
        String format = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{-2, false}, 2));
        C14360o3.A07(format);
        return format;
    }
}

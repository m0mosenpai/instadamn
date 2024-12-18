package X;

import java.util.Arrays;

/* renamed from: X.4WK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WK {
    public static final C4WK A01 = new C4WK(new C4WL[0]);
    public static final C4WL A02;
    public final C4WL[] A00;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max);
        Arrays.fill(copyOf2, 0, max, -9223372036854775807L);
        A02 = new C4WL(copyOf, copyOf2, (android.net.Uri[]) Arrays.copyOf(new android.net.Uri[0], 0));
    }

    public final C4WL A00(int i) {
        if (i < 0) {
            return A02;
        }
        return this.A00[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((C4WK) obj).A00);
        }
        return true;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC58317Pt9.A00(454));
        sb.append((Object) null);
        sb.append(AbstractC58317Pt9.A00(418));
        sb.append(0L);
        sb.append(AbstractC58317Pt9.A00(417));
        sb.append("])");
        return sb.toString();
    }

    public C4WK(C4WL[] c4wlArr) {
        this.A00 = c4wlArr;
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.SaD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62989SaD {
    public static final SO0 A01;
    public static final C62989SaD A02 = new C62989SaD(new SO0[0]);
    public final SO0[] A00;

    static {
        SO0 so0 = new SO0(new int[0], new long[0], new C62972SZr[0], -1);
        int[] iArr = so0.A01;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = so0.A02;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        A01 = new SO0(copyOf, copyOf2, (C62972SZr[]) Arrays.copyOf(so0.A04, 0), 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((C62989SaD) obj).A00);
        }
        return true;
    }

    public final int hashCode() {
        return 961 + Arrays.hashCode(this.A00);
    }

    public C62989SaD(SO0[] so0Arr) {
        this.A00 = so0Arr;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AdPlaybackState(adsId=");
        A1C.append((Object) null);
        A1C.append(", adResumePositionUs=");
        A1C.append(0L);
        A1C.append(", adGroups=[");
        return AbstractC166997dE.A0x("])", A1C);
    }
}

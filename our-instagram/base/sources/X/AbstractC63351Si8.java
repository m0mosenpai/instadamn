package X;

/* renamed from: X.Si8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63351Si8 {
    public static int A02(int i) {
        return C60802RTn.A00(i << 3);
    }

    public static void A04(C60802RTn c60802RTn, int i) {
        c60802RTn.A04((i << 3) | 2);
    }

    public static void A05(C60802RTn c60802RTn, int i, int i2) {
        c60802RTn.A04((i << 3) | 5);
        c60802RTn.A03(i2);
    }

    public static void A06(C60802RTn c60802RTn, int i, long j) {
        c60802RTn.A04((i << 3) | 1);
        c60802RTn.A07(j);
    }

    public static void A07(C60802RTn c60802RTn, int i, long j) {
        c60802RTn.A04(i << 3);
        c60802RTn.A08(j);
    }

    public static int A03(AbstractC58536Px4 abstractC58536Px4) {
        int A02 = abstractC58536Px4.A02();
        return C60802RTn.A00(A02) + A02;
    }
}

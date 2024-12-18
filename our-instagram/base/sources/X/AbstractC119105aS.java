package X;

/* renamed from: X.5aS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC119105aS {
    public static float A00(InterfaceC1128957x interfaceC1128957x, long j) {
        if (C118135Vx.A01(j) == 4294967296L) {
            return interfaceC1128957x.EqT(interfaceC1128957x.EqG(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static int A01(InterfaceC1128957x interfaceC1128957x, float f) {
        float EqT = interfaceC1128957x.EqT(f);
        if (Float.isInfinite(EqT)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(EqT);
    }

    public static long A02(InterfaceC1128957x interfaceC1128957x, float f) {
        return interfaceC1128957x.F7l(interfaceC1128957x.EqH(f));
    }

    public static long A03(InterfaceC1128957x interfaceC1128957x, long j) {
        if (j != 9205357640488583168L) {
            float EqH = interfaceC1128957x.EqH(C5YC.A02(j));
            float EqH2 = interfaceC1128957x.EqH(C5YC.A00(j));
            return (Float.floatToRawIntBits(EqH2) & 4294967295L) | (Float.floatToRawIntBits(EqH) << 32);
        }
        return 9205357640488583168L;
    }

    public static long A04(InterfaceC1128957x interfaceC1128957x, long j) {
        if (j != 9205357640488583168L) {
            return C5YB.A00(interfaceC1128957x.EqT(Float.intBitsToFloat((int) (j >> 32))), interfaceC1128957x.EqT(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}

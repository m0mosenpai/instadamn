package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Ty6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66011Ty6 {
    public static final long[] A04 = new long[0];
    public long A00;
    public final InterfaceC16620sF A01;
    public final SerialDescriptor A02;
    public final long[] A03;

    public C66011Ty6(InterfaceC16620sF interfaceC16620sF, SerialDescriptor serialDescriptor) {
        long[] jArr;
        this.A02 = serialDescriptor;
        this.A01 = interfaceC16620sF;
        int B10 = serialDescriptor.B10();
        if (B10 <= 64) {
            this.A00 = B10 != 64 ? (-1) << B10 : 0L;
            jArr = A04;
        } else {
            this.A00 = 0L;
            int i = (B10 - 1) >>> 6;
            jArr = new long[i];
            if ((B10 & 63) != 0) {
                jArr[i - 1] = (-1) << B10;
            }
        }
        this.A03 = jArr;
    }
}

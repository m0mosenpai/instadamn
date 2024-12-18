package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BHE implements InterfaceC31139Dme {
    public final BHB A00;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0w4, X.01I] */
    @Override // X.InterfaceC31139Dme
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final BHG FDa(InterfaceC118485Xk interfaceC118485Xk) {
        BHB bhb = this.A00;
        C18750w2 c18750w2 = bhb.A01;
        int i = c18750w2.A01;
        ?? c01i = new C01I(i + 2);
        C18750w2 c18750w22 = new C18750w2(i);
        int[] iArr = c18750w2.A02;
        Object[] objArr = c18750w2.A04;
        long[] jArr = c18750w2.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            BHD bhd = (BHD) objArr[i5];
                            c01i.A02(i6);
                            c18750w22.A08(i6, new BHF((AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(bhd.A01), bhd.A00));
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (!c18750w2.A04(0)) {
            int i7 = c01i.A00;
            if (0 <= i7) {
                c01i.A03(i7 + 1);
                int[] iArr2 = c01i.A01;
                int i8 = c01i.A00;
                if (0 != i8) {
                    AbstractC06960Yn.A0U(iArr2, iArr2, 1, 0, i8);
                }
                iArr2[0] = 0;
                c01i.A00++;
            } else {
                throw AbstractC25229BEm.A0l("Index ", " must be in 0..", 0, i7);
            }
        }
        int i9 = bhb.A00;
        if (!c18750w2.A04(i9)) {
            c01i.A02(i9);
        }
        Arrays.sort(c01i.A01, 0, c01i.A00);
        return new BHG(c01i, c18750w22, AbstractC25328BIx.A02, bhb.A00);
    }

    public BHE(BHB bhb) {
        this.A00 = bhb;
    }
}

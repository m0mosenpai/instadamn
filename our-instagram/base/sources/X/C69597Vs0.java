package X;

import java.util.Arrays;

/* renamed from: X.Vs0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69597Vs0 {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public boolean A02;
    public byte[] A03;

    public final void A00(byte[] bArr, int i, int i2) {
        if (this.A02) {
            int i3 = i2 - i;
            byte[] bArr2 = this.A03;
            int length = bArr2.length;
            int i4 = this.A00 + i3;
            if (length < i4) {
                bArr2 = Arrays.copyOf(bArr2, i4 * 2);
                this.A03 = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, this.A00, i3);
            this.A00 += i3;
        }
    }
}

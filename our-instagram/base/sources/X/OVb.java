package X;

import com.facebook.common.dextricks.StringTreeSet;

/* loaded from: classes9.dex */
public final class OVb {
    public int A00;
    public final byte[] A01;

    public final int A00() {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        do {
            byte[] bArr = this.A01;
            int i4 = this.A00;
            byte b = bArr[i4];
            this.A00 = i4 + 1;
            int i5 = b & 255;
            i |= (i5 & StringTreeSet.MAX_SYMBOL_COUNT) << (i2 * 7);
            i3 <<= 7;
            i2++;
            if ((i5 & 128) != 128) {
                if (((i3 >> 1) & i) != 0) {
                    return i | i3;
                }
                return i;
            }
        } while (i2 < 5);
        throw AbstractC166987dD.A12("LEB128 larger than 28bit");
    }

    public OVb(OVb oVb) {
        this.A00 = 0;
        this.A01 = oVb.A01;
        this.A00 = oVb.A00;
    }

    public OVb(byte[] bArr) {
        this.A00 = 0;
        this.A01 = bArr;
    }
}

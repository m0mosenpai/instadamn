package X;

import java.util.Arrays;

/* renamed from: X.UFx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66411UFx extends AbstractC69657Vsy {
    public boolean A00;
    public static final byte[] A02 = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A01 = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean A00(WFa wFa, byte[] bArr) {
        int i = wFa.A00;
        int i2 = wFa.A01;
        if (i - i2 < 8) {
            return false;
        }
        byte[] bArr2 = new byte[8];
        wFa.A0R(bArr2, 0, 8);
        wFa.A0O(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // X.AbstractC69657Vsy
    public final void A01(boolean z) {
        super.A01(z);
        if (z) {
            this.A00 = false;
        }
    }
}

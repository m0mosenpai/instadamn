package org.tukaani.xz.lz;

import X.C20520zT;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes.dex */
public abstract class LZEncoder {
    public static final LZEncoder $redex_init_class = null;
    public final int A05;
    public final int A06;
    public final int A07;
    public final byte[] A08;
    public int A02 = -1;
    public int A01 = -1;
    public boolean A04 = false;
    public int A03 = 0;
    public int A00 = 0;

    public static void A02(LZEncoder lZEncoder) {
        int i;
        int i2 = lZEncoder.A00;
        if (i2 <= 0 || (i = lZEncoder.A02) >= lZEncoder.A01) {
            return;
        }
        lZEncoder.A02 = i - i2;
        lZEncoder.A00 = 0;
        lZEncoder.A06(i2);
    }

    public static void A03(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 <= i) {
                iArr[i2] = 0;
            } else {
                iArr[i2] = i3 - i;
            }
        }
    }

    public final int A04(int i, int i2) {
        int i3 = this.A02;
        int i4 = (i3 - i) - 1;
        int i5 = 0;
        while (i5 < i2) {
            byte[] bArr = this.A08;
            if (bArr[i3 + i5] != bArr[i4 + i5]) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public abstract C20520zT A05();

    public abstract void A06(int i);

    public LZEncoder(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        int i6 = i3 + 273;
        this.A08 = new byte[i5 + i6 + Math.min((i / 2) + Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 536870912)];
        this.A06 = i5;
        this.A05 = i6;
        this.A07 = i4;
    }

    static {
        try {
            Class.forName("org.tukaani.xz.lz.LZEncoder");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}

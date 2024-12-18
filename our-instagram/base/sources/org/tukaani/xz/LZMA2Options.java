package org.tukaani.xz;

import X.C14590oX;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import java.io.IOException;

/* loaded from: classes.dex */
public final class LZMA2Options implements Cloneable {
    public static final int[] A07;
    public static final int[] A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }

    public final void A00(int i) {
        int i2;
        if (i >= 0 && i <= 9) {
            this.A02 = 3;
            this.A06 = 2;
            this.A01 = A08[i];
            if (i <= 3) {
                this.A04 = 1;
                this.A03 = 4;
                int i3 = 273;
                if (i <= 1) {
                    i3 = 128;
                }
                this.A05 = i3;
                this.A00 = A07[i];
                return;
            }
            this.A04 = 2;
            this.A03 = 20;
            if (i == 4) {
                i2 = 16;
            } else {
                i2 = 64;
                if (i == 5) {
                    i2 = 32;
                }
            }
            this.A05 = i2;
            this.A00 = 0;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported preset: ");
        stringBuffer.append(i);
        throw new IOException(stringBuffer.toString());
    }

    static {
        try {
            Class.forName("org.tukaani.xz.LZMA2Options");
            A08 = new int[]{Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 1048576, 2097152, 4194304, 4194304, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE, 16777216, 33554432, 67108864};
            A07 = new int[]{4, 8, 24, 48};
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public LZMA2Options() {
        try {
            A00(6);
        } catch (C14590oX unused) {
            throw new RuntimeException();
        }
    }
}

package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.SgY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63274SgY {
    public SJM A01;
    public ByteBuffer A02;
    public final byte[] A03 = new byte[256];
    public int A00 = 0;

    public static int A00(C63274SgY c63274SgY) {
        try {
            return c63274SgY.A02.get() & 255;
        } catch (Exception unused) {
            c63274SgY.A01.A05 = 1;
            return 0;
        }
    }

    public static int[] A02(C63274SgY c63274SgY, int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            c63274SgY.A02.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = i4 + 1;
                int i7 = bArr[i4] & 255;
                i2 = i6 + 1;
                iArr[i3] = (i5 << 16) | (-16777216) | (i7 << 8) | (bArr[i6] & 255);
            }
        } catch (BufferUnderflowException unused) {
            android.util.Log.isLoggable("GifHeaderParser", 3);
            c63274SgY.A01.A05 = 1;
        }
        return iArr;
    }

    public static void A01(C63274SgY c63274SgY) {
        int A00 = A00(c63274SgY);
        c63274SgY.A00 = A00;
        if (A00 > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = c63274SgY.A00;
                    if (i < i2) {
                        int i3 = i2 - i;
                        c63274SgY.A02.get(c63274SgY.A03, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    android.util.Log.isLoggable("GifHeaderParser", 3);
                    c63274SgY.A01.A05 = 1;
                    return;
                }
            }
        }
    }
}

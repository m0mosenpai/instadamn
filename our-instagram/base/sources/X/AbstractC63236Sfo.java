package X;

import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: X.Sfo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63236Sfo {
    public static int A02(DataOutputStream dataOutputStream, int i) {
        int i2 = 0;
        do {
            int i3 = i % 128;
            i /= 128;
            if (i > 0) {
                i3 |= 128;
            }
            dataOutputStream.writeByte(i3);
            i2++;
        } while (i > 0);
        return i2;
    }

    public static int A00(SXC sxc) {
        int i = 0;
        if (sxc.A05) {
            i = 128;
        }
        if (sxc.A04) {
            i |= 64;
        }
        if (sxc.A07) {
            i |= 32;
        }
        int i2 = i | ((sxc.A02 & 3) << 3);
        if (sxc.A06) {
            i2 |= 4;
        }
        if (sxc.A03) {
            return i2 | 2;
        }
        return i2;
    }

    public static int A01(C63146Sds c63146Sds) {
        int i = c63146Sds.A03.A00 << 4;
        if (c63146Sds.A04) {
            i |= 8;
        }
        int i2 = i | (c63146Sds.A02 << 1);
        if (c63146Sds.A01) {
            return i2 | 1;
        }
        return i2;
    }

    public static byte[] A03(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}

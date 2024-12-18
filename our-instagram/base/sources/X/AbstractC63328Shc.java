package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.Shc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63328Shc {
    public static final C63292Sgs A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = AbstractC58318PtA.A0u();
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    public static int A01(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C63292Sgs c63292Sgs = new C63292Sgs(bArr);
        try {
            c63292Sgs.A02();
            A00 = c63292Sgs;
        } catch (C61035Re7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String A02(byte[] bArr) {
        return AbstractC58318PtA.A0m(A03, bArr);
    }

    public static void A03(Object obj) {
        if (obj != null) {
        } else {
            throw AbstractC166987dD.A15("messageType");
        }
    }

    public static int A00(boolean z) {
        return AbstractC58322PtE.A02(z ? 1 : 0);
    }
}

package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y49 {
    public static final byte[] A05;
    public final OutputStream A03;
    public List A01 = AbstractC25225BEi.A17(15);
    public short A02 = 0;
    public Short A00 = null;
    public final byte[] A04 = new byte[10];

    public static void A00(Y49 y49, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i & (-128);
            byte[] bArr = y49.A04;
            int i4 = i2 + 1;
            if (i3 == 0) {
                bArr[i2] = (byte) i;
                y49.A03.write(bArr, 0, i4);
                return;
            } else {
                bArr[i2] = (byte) ((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                i >>>= 7;
                i2 = i4;
            }
        }
    }

    public final void A03(long j) {
        long j2 = (j >> 63) ^ (j << 1);
        int i = 0;
        while (true) {
            long j3 = (-128) & j2;
            byte[] bArr = this.A04;
            int i2 = i + 1;
            if (j3 == 0) {
                bArr[i] = (byte) j2;
                this.A03.write(bArr, 0, i2);
                return;
            } else {
                bArr[i] = (byte) ((127 & j2) | 128);
                j2 >>>= 7;
                i = i2;
            }
        }
    }

    static {
        A05 = r5;
        byte[] bArr = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9, 0, 0, 0, DalvikInternals.IOPRIO_CLASS_SHIFT};
    }

    public final void A01() {
        this.A01.add(Short.valueOf(this.A02));
        this.A02 = (short) 0;
    }

    public final void A02(int i, byte b) {
        if (i <= 14) {
            this.A03.write((byte) (A05[b] | (i << 4)));
        } else {
            this.A03.write((byte) (A05[b] | 240));
            A00(this, i);
        }
    }

    public final void A04(String str) {
        try {
            byte[] bytes = str.getBytes(ReactWebViewManager.HTML_ENCODING);
            int length = bytes.length;
            A00(this, length);
            this.A03.write(bytes, 0, length);
        } catch (UnsupportedEncodingException unused) {
            throw new IOException("UTF-8 not supported!");
        }
    }

    public Y49(OutputStream outputStream) {
        this.A03 = outputStream;
    }
}

package X;

import com.facebook.common.dextricks.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public abstract class WU2 implements XF1 {
    public static final W5O A02 = new W5O(32);
    public int A00;
    public final AtomicLong A01 = new AtomicLong(0);

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.VJK] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, X.VJK] */
    public static VJK A00(InputStream inputStream, boolean z) {
        W5O w5o = A02;
        VJK vjk = (VJK) w5o.A00();
        VJK vjk2 = vjk;
        if (vjk == null) {
            byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP];
            ?? obj = new Object();
            obj.A01 = null;
            obj.A02 = bArr;
            obj.A00 = 0;
            vjk2 = obj;
        }
        byte[] bArr2 = vjk2.A02;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr2, i, bArr2.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr2.length;
                if (i >= length) {
                    byte[] bArr3 = new byte[length << 1];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    bArr2 = bArr3;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    w5o.A02(vjk2);
                    if (z) {
                        C42961yO.A0R.A04(e);
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (bArr2 != bArr2) {
            w5o.A02(vjk2);
            ?? obj2 = new Object();
            obj2.A01 = null;
            obj2.A02 = bArr2;
            obj2.A00 = i;
            return obj2;
        }
        vjk2.A00 = i;
        return vjk2;
    }

    public static void A01(VJK vjk) {
        if (vjk.A02.length == 131072) {
            vjk.A01 = null;
            A02.A02(vjk);
        }
    }

    public WU2(int i) {
        this.A00 = i;
    }
}

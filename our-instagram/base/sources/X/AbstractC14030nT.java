package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* renamed from: X.0nT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14030nT extends AbstractC20560zZ {
    public static long A00(InputStream inputStream) {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        long j = read & StringTreeSet.MAX_SYMBOL_COUNT;
        int i = 0;
        while ((read & 128) != 0) {
            i++;
            if (i >= 9) {
                throw new C14800ou();
            }
            read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 0) {
                throw new C14800ou();
            }
            j |= (read & StringTreeSet.MAX_SYMBOL_COUNT) << (i * 7);
        }
        return j;
    }

    public static boolean A01(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        int i4 = 0;
        while (((byte) (value >>> (i4 * 8))) == bArr[i3 + i4]) {
            i4++;
            if (i4 >= 4) {
                return true;
            }
        }
        return false;
    }
}

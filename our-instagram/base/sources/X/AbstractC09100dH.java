package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.0dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09100dH {
    public static byte[] A01(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
                if (i2 > i) {
                    throw new IllegalStateException("Read more bytes than expected");
                }
            } else {
                throw new EOFException("EOF found unexpectedly");
            }
        }
        return bArr;
    }

    public static void A00(File file, byte b) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE), "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}

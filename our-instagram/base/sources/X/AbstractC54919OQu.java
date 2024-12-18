package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.OQu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54919OQu {
    public static final byte[] A01(InputStream inputStream) {
        C14360o3.A0B(inputStream, 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        A00(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C14360o3.A07(byteArray);
        return byteArray;
    }

    public static final void A00(InputStream inputStream, OutputStream outputStream) {
        C14360o3.A0B(inputStream, 0);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}

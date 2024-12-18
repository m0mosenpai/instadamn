package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: X.0gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10110gQ {
    public static final byte[] A00(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        Deflater deflater = new Deflater(9);
        deflater.setInput(bArr);
        deflater.finish();
        int length = bArr.length + 32;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        byte[] bArr2 = new byte[length];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            C0K8.A0K("ZlibCompressionUtil", "got io exception closing ByteArrayOutputStream", e);
        }
        deflater.end();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C14360o3.A07(byteArray);
        return byteArray;
    }
}

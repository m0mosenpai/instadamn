package X;

import java.io.ByteArrayInputStream;

/* loaded from: classes10.dex */
public abstract class S3K {
    public static PxS A00(byte[] serializedKeyset) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedKeyset);
        try {
            AbstractC58533Px1 A05 = AbstractC58533Px1.A05(new C58557PxZ(byteArrayInputStream), C58534Px2.A00(), PxJ.DEFAULT_INSTANCE);
            AbstractC58533Px1.A09(A05);
            PxJ pxJ = (PxJ) A05;
            byteArrayInputStream.close();
            return PxS.A00(C58549PxM.A01(pxJ));
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }
}

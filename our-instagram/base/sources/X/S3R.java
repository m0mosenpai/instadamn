package X;

/* loaded from: classes10.dex */
public abstract class S3R {
    public static byte[] A00(final byte[] value) {
        if (value.length == 16) {
            byte[] bArr = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = (byte) ((value[i] << 1) & 254);
                bArr[i] = b;
                if (i < 15) {
                    bArr[i] = (byte) (((byte) ((value[i + 1] >> 7) & 1)) | b);
                }
            }
            bArr[15] = (byte) (((byte) ((value[0] >> 7) & 135)) ^ bArr[15]);
            return bArr;
        }
        throw AbstractC166987dD.A12("value must be a block.");
    }
}

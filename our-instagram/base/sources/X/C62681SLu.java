package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

/* renamed from: X.SLu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62681SLu {
    public final SEZ A02 = new Object();
    public ByteBuffer A01 = null;
    public Bitmap A00 = null;

    public final ByteBuffer A00() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = this.A00.getHeight();
            int i = width * height;
            this.A00.getPixels(new int[i], 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) ((Color.red(r6[i2]) * 0.299f) + (Color.green(r6[i2]) * 0.587f) + (Color.blue(r6[i2]) * 0.114f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return this.A01;
    }
}

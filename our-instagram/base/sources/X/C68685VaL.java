package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.VaL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68685VaL {
    public final C22824A4t A00;

    public C68685VaL(MediaFormat mediaFormat) {
        C14360o3.A0B(mediaFormat, 1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        C22824A4t c22824A4t = null;
        if (byteBuffer != null) {
            try {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                c22824A4t = new C22824A4t(byteBuffer.getShort(21));
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        this.A00 = c22824A4t;
    }
}

package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public abstract class VN3 {
    public static boolean A00(MediaFormat mediaFormat, XD8 xd8) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        if (byteBuffer != null) {
            xd8.EQc(0, byteBuffer.limit(), 0L, 2);
            ByteBuffer AjR = xd8.AjR();
            AjR.position(0);
            byteBuffer.position(0);
            AjR.limit(byteBuffer.limit());
            AjR.put(byteBuffer);
            return true;
        }
        return false;
    }
}

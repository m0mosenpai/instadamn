package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;

/* loaded from: classes12.dex */
public abstract class XgV {
    public static MediaCodec A00(MediaCodec.Callback callback, MediaFormat mediaFormat, String str) {
        MediaCodec mediaCodec = null;
        int i = 0;
        Exception e = null;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                MediaCodec A02 = C0fT.A02(str, 514872199);
                if (callback != null) {
                    A02.setCallback(callback);
                }
                C0fT.A07(A02, null, mediaFormat, null, 1, -718889878);
                mediaCodec = A02;
                break;
            } catch (Exception e2) {
                e = e2;
                i++;
            }
        }
        if (mediaCodec == null) {
            if (e == null) {
                throw new IOException("Failed to create media codec encode");
            }
            throw e;
        }
        return mediaCodec;
    }
}

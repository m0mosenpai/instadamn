package X;

import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public abstract class VSK {
    public static void A00(FFMpegAVStream fFMpegAVStream, FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        int i = 5;
        do {
            try {
                fFMpegAVStream.writeFrame(fFMpegBufferInfo, byteBuffer);
                return;
            } catch (IllegalArgumentException e) {
                long j = fFMpegBufferInfo.presentationTimeUs + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                fFMpegBufferInfo.presentationTimeUs = j;
                C0K8.A0L("FFMpegUtil", "ffmpeg write error, retry with incremented pts %s", e, AbstractC58319PtB.A1Y(j));
                i--;
            }
        } while (i > 0);
        throw e;
    }
}

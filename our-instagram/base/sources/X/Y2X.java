package X;

import android.media.MediaCodec;
import android.util.Range;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Y2X {
    public static final Exception A00(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            C0fT.A03(mediaCodec, 495570346);
            return null;
        } catch (Exception e) {
            try {
                Thread.sleep(10L);
                C0fT.A03(mediaCodec, 390960291);
                return null;
            } catch (Exception e2) {
                return new Exception(e2.getMessage(), e);
            }
        }
    }

    public static final Exception A01(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            C0fT.A06(mediaCodec, 2017659072);
            return null;
        } catch (Exception e) {
            try {
                Thread.sleep(10L);
                C0fT.A06(mediaCodec, 1309428391);
                return null;
            } catch (Exception e2) {
                return new Exception(e2.getMessage(), e);
            }
        }
    }

    public static final void A02(Range range, String str, Map map) {
        if (range != null) {
            map.put(str, AbstractC16960so.A1Q(range.getLower(), range.getUpper()));
        }
    }
}

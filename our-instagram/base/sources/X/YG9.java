package X;

import android.media.MediaCodec;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class YG9 implements Runnable {
    public final /* synthetic */ C72169XRd A00;

    public YG9(C72169XRd c72169XRd) {
        this.A00 = c72169XRd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaCodec mediaCodec;
        long j;
        C72169XRd c72169XRd = this.A00;
        if (c72169XRd.A08 == C05F.A0C && (mediaCodec = ((Y9S) c72169XRd).A01) != null) {
            int i = 1;
            try {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(c72169XRd.A04.A04);
                if (dequeueInputBuffer >= 0) {
                    i = c72169XRd.A01(((Y9S) c72169XRd).A01, dequeueInputBuffer);
                }
                C72169XRd.A00(((Y9S) c72169XRd).A01, c72169XRd);
            } catch (Exception e) {
                c72169XRd.A06.A01(e);
            }
            Handler handler = c72169XRd.A03;
            Runnable runnable = c72169XRd.A01;
            if (i == 0) {
                j = 0;
            } else {
                j = c72169XRd.A00;
            }
            handler.postDelayed(runnable, j);
        }
    }
}

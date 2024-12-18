package X;

import android.media.MediaCodec;

/* renamed from: X.WwX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71580WwX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C71154Wop A02;

    public RunnableC71580WwX(C71154Wop c71154Wop, int i, long j) {
        this.A02 = c71154Wop;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C71154Wop c71154Wop = this.A02;
        c71154Wop.A02.queueInputBuffer(this.A00, 0, c71154Wop.A06, c71154Wop.A00, 0);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = c71154Wop.A02.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer >= 0) {
            try {
                c71154Wop.A0A.A00(bufferInfo, c71154Wop.A02.getOutputBuffer(dequeueOutputBuffer));
            } catch (Exception e) {
                c71154Wop.A03 = e;
                c71154Wop.A0B.countDown();
            }
            c71154Wop.A02.releaseOutputBuffer(dequeueOutputBuffer, false);
        }
        long j = c71154Wop.A00 + this.A01;
        c71154Wop.A00 = j;
        if (j >= c71154Wop.A01) {
            c71154Wop.A03 = null;
            c71154Wop.A0B.countDown();
        } else {
            C69267Vkb c69267Vkb = c71154Wop.A09;
            if (!c69267Vkb.A04) {
                return;
            }
            c69267Vkb.A03.processNext();
        }
    }
}

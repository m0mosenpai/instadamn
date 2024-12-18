package X;

import android.media.MediaCodec;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WxV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71623WxV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaCodec.BufferInfo A01;
    public final /* synthetic */ MediaCodec A02;
    public final /* synthetic */ C69663Vt4 A03;
    public final /* synthetic */ C69428VnD A04;
    public final /* synthetic */ Semaphore A05;

    public RunnableC71623WxV(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, C69663Vt4 c69663Vt4, C69428VnD c69428VnD, Semaphore semaphore, int i) {
        this.A05 = semaphore;
        this.A01 = bufferInfo;
        this.A04 = c69428VnD;
        this.A02 = mediaCodec;
        this.A00 = i;
        this.A03 = c69663Vt4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Semaphore semaphore = this.A05;
        semaphore.acquire();
        MediaCodec.BufferInfo bufferInfo = this.A01;
        if ((bufferInfo.flags & 4) != 0) {
            this.A04.A02 = true;
        }
        this.A02.releaseOutputBuffer(this.A00, true);
        C69428VnD c69428VnD = this.A04;
        if (c69428VnD.A01 == -1) {
            c69428VnD.A01 = bufferInfo.presentationTimeUs;
            if (!c69428VnD.A06.A0B.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                C0f5 AEp = C18950wb.A01.AEp(C69663Vt4.class.getSimpleName(), 817892340);
                AEp.ABW(DialogModule.KEY_MESSAGE, "awaitNewImage failed");
                AEp.report();
            }
        }
        long j = bufferInfo.presentationTimeUs;
        c69428VnD.A00 = j;
        double d = (j + c69428VnD.A03) - c69428VnD.A01;
        C69663Vt4 c69663Vt4 = this.A03;
        if (d < c69663Vt4.A00 + (c69663Vt4.A06 * 0.1d) && !c69428VnD.A02) {
            semaphore.release();
        } else {
            c69663Vt4.A08.post(new RunnableC71388Wsx(c69663Vt4));
        }
    }
}

package X;

import android.media.MediaCodec;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class YHC implements Runnable {
    public final /* synthetic */ C73396YBi A00;
    public final /* synthetic */ C73398YBk A01;

    public YHC(C73396YBi c73396YBi, C73398YBk c73398YBk) {
        this.A01 = c73398YBk;
        this.A00 = c73396YBi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C73398YBk c73398YBk = this.A01;
        C73396YBi c73396YBi = this.A00;
        Handler A00 = c73396YBi.A00();
        c73398YBk.A07.append("asyncStop, ");
        c73398YBk.A03 = c73396YBi;
        c73398YBk.A02 = A00;
        MediaCodec mediaCodec = c73398YBk.A00;
        if (mediaCodec != null) {
            try {
                mediaCodec.signalEndOfInputStream();
            } catch (IllegalStateException unused) {
                C73398YBk.A01(A00, c73396YBi, c73398YBk);
            }
        }
    }
}

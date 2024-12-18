package X;

import android.media.MediaCodec;

/* renamed from: X.WqD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71222WqD implements Runnable {
    public final /* synthetic */ C70107W4e A00;

    public RunnableC71222WqD(C70107W4e c70107W4e) {
        this.A00 = c70107W4e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaCodec mediaCodec = this.A00.A07.A02;
        if (mediaCodec != null) {
            mediaCodec.signalEndOfInputStream();
        }
    }
}

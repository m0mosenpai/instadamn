package X;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;

/* renamed from: X.YGb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73497YGb implements Runnable {
    public final /* synthetic */ YJy A00;

    public RunnableC73497YGb(YJy yJy) {
        this.A00 = yJy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        YJy yJy = this.A00;
        yJy.A03.stopListening();
        yJy.A02.onCapturerStopped();
        VirtualDisplay virtualDisplay = yJy.A00;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            yJy.A00 = null;
        }
        MediaProjection mediaProjection = yJy.A01;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(yJy.A0A);
            yJy.A01.stop();
            yJy.A01 = null;
        }
    }
}

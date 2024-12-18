package X;

import android.media.AudioManager;

/* renamed from: X.PPe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56963PPe implements Runnable {
    public final /* synthetic */ C50739Mat A00;
    public final /* synthetic */ OEF A01;

    public RunnableC56963PPe(C50739Mat c50739Mat, OEF oef) {
        this.A01 = oef;
        this.A00 = c50739Mat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        AudioManager audioManager = this.A01.A04;
        int i = 0;
        if (audioManager.isBluetoothScoOn()) {
            i = 6;
        }
        int streamVolume = audioManager.getStreamVolume(i);
        C50739Mat c50739Mat = this.A00;
        if (streamVolume != c50739Mat.A00) {
            c50739Mat.A00 = streamVolume;
            int streamMaxVolume = audioManager.getStreamMaxVolume(i);
            if (streamMaxVolume > 0) {
                f = streamVolume / streamMaxVolume;
            } else {
                f = -1.0f;
            }
            OMu oMu = c50739Mat.A01.A00;
            oMu.A05.A00("Volume level changed to %f", Float.valueOf(f));
            oMu.audioManagerQplLogger.Cnc("set_volume", String.valueOf(f));
        }
    }
}

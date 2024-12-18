package X;

import android.media.AudioManager;
import java.util.Arrays;

/* renamed from: X.PKf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractRunnableC56835PKf implements Runnable {
    public static void A00(N09 n09, int i, boolean z) {
        Integer num;
        try {
            C55000OUz c55000OUz = ((OMu) n09).A05;
            Integer valueOf = Integer.valueOf(i);
            c55000OUz.A00("safeSetMode to %d", valueOf);
            AudioManager audioManager = ((OMu) n09).A02;
            int mode = audioManager.getMode();
            if (i != mode || (num = n09.A01) == null || i != num.intValue()) {
                audioManager.setMode(i);
                n09.A01 = valueOf;
                n09.audioManagerQplLogger.Cnc("set_audio_mode", String.valueOf(i));
                if (n09.aomSavedAudioMode == -2) {
                    n09.aomSavedAudioMode = mode;
                }
            }
        } catch (Exception e) {
            C0K8.A0L("RtcAudioOutputManager", "Failed to set audio mode", e, Arrays.copyOf(new Object[0], 0));
        }
        if (z) {
            n09.aomSavedAudioMode = -2;
        }
    }
}

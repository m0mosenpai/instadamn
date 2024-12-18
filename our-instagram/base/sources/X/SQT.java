package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SQT {
    public static SAD A01(AudioManager audioManager, Y1h y1h) {
        try {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(y1h.A00().A00);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new SAD((AudioDeviceInfo) AbstractC166987dD.A16(audioDevicesForAttributes));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static C63299Sh1 A00(AudioManager audioManager, Y1h y1h) {
        return new C63299Sh1(C63299Sh1.A01(audioManager.getDirectProfilesForAttributes(y1h.A00().A00)));
    }
}

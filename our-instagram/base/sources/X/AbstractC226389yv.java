package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226389yv {
    public static final boolean A00(Context context) {
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, MSV.A00(7));
        AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
        C14360o3.A07(devices);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 4) {
                return true;
            }
        }
        return false;
    }
}

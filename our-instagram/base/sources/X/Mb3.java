package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes9.dex */
public final class Mb3 extends AudioDeviceCallback {
    public String A00;
    public boolean A01;
    public final /* synthetic */ C55100ObB A02;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C14360o3.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        if (!this.A01) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                    this.A01 = true;
                    this.A00 = audioDeviceInfo.getAddress();
                    OGv oGv = this.A02.A0G;
                    if (oGv != null) {
                        oGv.A00(2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C14360o3.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        if (this.A01) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (C14360o3.A0K(audioDeviceInfo.getAddress(), this.A00)) {
                    OGv oGv = this.A02.A0G;
                    if (oGv != null) {
                        oGv.A00(0);
                    }
                    this.A01 = false;
                    this.A00 = null;
                    return;
                }
            }
        }
    }

    public Mb3(C55100ObB c55100ObB) {
        this.A02 = c55100ObB;
    }
}

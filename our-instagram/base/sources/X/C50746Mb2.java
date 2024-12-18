package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.Mb2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50746Mb2 extends AudioDeviceCallback {
    public final /* synthetic */ OMO A00;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C14360o3.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                OMO omo = this.A00;
                omo.A01 = AbstractC001800i.A0T(audioDeviceInfo, omo.A01);
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C14360o3.A0B(audioDeviceInfoArr, 0);
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.isSink()) {
                AbstractC001800i.A0f(this.A00.A01, audioDeviceInfo);
            }
        }
    }

    public C50746Mb2(OMO omo) {
        this.A00 = omo;
    }
}

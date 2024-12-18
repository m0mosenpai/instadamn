package com.facebook.react.modules.sound;

import X.AbstractC58321PtD;
import X.C14360o3;
import X.MSV;
import X.R3M;
import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.module.annotations.ReactModule;
import org.webrtc.MediaStreamTrack;

@ReactModule(name = NativeSoundManagerSpec.NAME)
/* loaded from: classes10.dex */
public final class SoundManagerModule extends NativeSoundManagerSpec {
    public SoundManagerModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeSoundManagerSpec
    public void playTouchSound() {
        Object systemService = AbstractC58321PtD.A0b(this).getBaseContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, MSV.A00(7));
        ((AudioManager) systemService).playSoundEffect(0);
    }
}

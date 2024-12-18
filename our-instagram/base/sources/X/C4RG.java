package X;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* renamed from: X.4RG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RG {
    public final AudioManager A00;

    public C4RG(AudioManager audioManager) {
        C14360o3.A0B(audioManager, 1);
        this.A00 = audioManager;
    }

    public final int A00(AH6 ah6) {
        C14360o3.A0B(ah6, 0);
        return this.A00.abandonAudioFocusRequest((AudioFocusRequest) ah6.A01);
    }

    public final int A01(AH6 ah6) {
        return this.A00.requestAudioFocus((AudioFocusRequest) ah6.A01);
    }
}

package X;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes12.dex */
public final class Y0s {
    public final Spatializer A00;
    public final boolean A01;

    public static Y0s A00(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return null;
        }
        return new Y0s(audioManager.getSpatializer());
    }

    public Y0s(Spatializer spatializer) {
        this.A00 = spatializer;
        this.A01 = AbstractC167007dF.A1M(spatializer.getImmersiveAudioLevel());
    }

    public final boolean A01() {
        return this.A01;
    }
}

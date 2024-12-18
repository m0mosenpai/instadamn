package X;

import android.media.AudioTrack;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class W26 {
    public static final long A02 = TimeUnit.SECONDS.toMicros(1);
    public final long A00;
    public final AudioTrack A01;

    public W26(AudioTrack audioTrack) {
        this.A01 = audioTrack;
        this.A00 = audioTrack.getSampleRate();
    }
}

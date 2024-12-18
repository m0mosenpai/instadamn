package X;

import android.media.AudioTrack;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class Xnb {
    public int A00;
    public int A01;
    public AudioTrack A02;
    public Thread A03;
    public ByteBuffer A04;
    public final C0JO A05;
    public final AndroidAudioEnhancementHybrid A06;
    public final C72679Xkz A07;
    public final ByteBuffer A08 = ByteBuffer.allocateDirect(C3OO.FLAG_MOVED);
    public final AtomicBoolean A09 = new AtomicBoolean(false);

    public Xnb(AndroidAudioEnhancementHybrid androidAudioEnhancementHybrid, C72679Xkz c72679Xkz) {
        this.A06 = androidAudioEnhancementHybrid;
        this.A07 = c72679Xkz;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A05 = awakeTimeSinceBootClock;
        this.A01 = 44100;
        this.A00 = 1;
    }
}

package X;

import android.media.AudioRecord;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.mediastreaming.opt.audioenhancement.AndroidAudioEnhancementHybrid;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Xne, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72815Xne {
    public AudioRecord A04;
    public OutputStream A05;
    public Thread A06;
    public final C0JO A07;
    public final AndroidAudioEnhancementHybrid A08;
    public final C72679Xkz A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public int A03 = 44100;
    public int A01 = C3OO.FLAG_MOVED;
    public int A02 = 16;
    public double A00 = 7.0d;

    public C72815Xne(AndroidAudioEnhancementHybrid androidAudioEnhancementHybrid, C72679Xkz c72679Xkz) {
        this.A08 = androidAudioEnhancementHybrid;
        this.A09 = c72679Xkz;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A07 = awakeTimeSinceBootClock;
    }
}

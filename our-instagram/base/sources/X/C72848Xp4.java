package X;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.Xp4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72848Xp4 {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler(Looper.myLooper());
    public final /* synthetic */ DefaultAudioSink A02;

    public C72848Xp4(DefaultAudioSink defaultAudioSink) {
        this.A02 = defaultAudioSink;
        this.A00 = new XPX(this, defaultAudioSink);
    }

    public final void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        handler.getClass();
        audioTrack.registerStreamEventCallback(new ExecutorC64804TUs(handler, 0), this.A00);
    }

    public final void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages(null);
    }
}

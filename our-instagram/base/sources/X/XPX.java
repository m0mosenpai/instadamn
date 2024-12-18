package X;

import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* loaded from: classes12.dex */
public final class XPX extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ C72848Xp4 A00;
    public final /* synthetic */ DefaultAudioSink A01;

    public XPX(C72848Xp4 c72848Xp4, DefaultAudioSink defaultAudioSink) {
        this.A00 = c72848Xp4;
        this.A01 = defaultAudioSink;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        InterfaceC96204Ud interfaceC96204Ud;
        DefaultAudioSink defaultAudioSink = this.A00.A02;
        if (audioTrack.equals(defaultAudioSink.A0B) && (interfaceC96204Ud = defaultAudioSink.A0E) != null && defaultAudioSink.A0Q) {
            interfaceC96204Ud.DWQ();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        InterfaceC96204Ud interfaceC96204Ud;
        DefaultAudioSink defaultAudioSink = this.A00.A02;
        if (audioTrack.equals(defaultAudioSink.A0B) && (interfaceC96204Ud = defaultAudioSink.A0E) != null && defaultAudioSink.A0Q) {
            interfaceC96204Ud.DWQ();
        }
    }
}

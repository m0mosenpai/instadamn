package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.KeM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46290KeM implements InterfaceC02530Ab {
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    DWELL("dwell"),
    SEND("send"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC46290KeM(String str) {
        this.A00 = str;
    }
}

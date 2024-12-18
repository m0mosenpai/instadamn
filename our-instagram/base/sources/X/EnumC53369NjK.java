package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.NjK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53369NjK implements InterfaceC02530Ab {
    CAROUSEL("carousel"),
    CAROUSEL_PHOTO("carousel_photo"),
    CAROUSEL_VIDEO("carousel_video"),
    IGTV("igtv"),
    PHOTO("photo"),
    REELS("reels"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53369NjK(String str) {
        this.A00 = str;
    }
}

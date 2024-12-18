package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.Nj5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53355Nj5 implements InterfaceC02530Ab {
    CAROUSEL("carousel"),
    PHOTO("photo"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC53355Nj5(String str) {
        this.A00 = str;
    }
}

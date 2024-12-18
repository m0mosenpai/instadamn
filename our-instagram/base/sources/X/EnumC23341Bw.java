package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.1Bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC23341Bw {
    Undefined("undefined"),
    Video(MediaStreamTrack.VIDEO_TRACK_KIND),
    VideoCoverImage("video-cover-image"),
    Image("image"),
    Other("other"),
    API("api"),
    CriticalAPI("critical-api"),
    MediaUpload("media-upload"),
    Analytics("analytics"),
    VideoCall("video-call"),
    GraphQL("graphql");

    public final String A00;

    EnumC23341Bw(String str) {
        this.A00 = str;
    }
}

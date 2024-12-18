package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.LCm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47866LCm {
    public static String A01(EnumC40111tc enumC40111tc) {
        if (enumC40111tc == EnumC40111tc.A0Q) {
            return "photo";
        }
        if (enumC40111tc == EnumC40111tc.A0a) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (enumC40111tc == EnumC40111tc.A09) {
            return "album";
        }
        if (enumC40111tc == EnumC40111tc.A06) {
            return "animated_media";
        }
        if (enumC40111tc == EnumC40111tc.A08) {
            return "avatar_sticker";
        }
        if (enumC40111tc == EnumC40111tc.A0E) {
            return "file";
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0R("Unknown MediaType ", enumC40111tc.toString()));
    }

    public static EnumC40111tc A00(C16L c16l) {
        String A1P = c16l.A1P();
        if ("photo".equals(A1P)) {
            return EnumC40111tc.A0Q;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A1P)) {
            return EnumC40111tc.A0a;
        }
        if ("album".equals(A1P)) {
            return EnumC40111tc.A09;
        }
        if ("avatar_sticker".equals(A1P)) {
            return EnumC40111tc.A08;
        }
        if ("file".equals(A1P)) {
            return EnumC40111tc.A0E;
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0R("Unknown MediaType ", A1P));
    }
}

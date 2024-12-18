package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.1ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40091ta {
    public static final EnumC40111tc A01(String str) {
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != 3556653) {
            if (hashCode != 100313435) {
                if (hashCode == 112202875 && str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    return EnumC40111tc.A0a;
                }
                return null;
            }
            if (str.equals("image")) {
                return EnumC40111tc.A0Q;
            }
            return null;
        }
        if (str.equals("text")) {
            return EnumC40111tc.A0X;
        }
        return null;
    }

    public static final EnumC40111tc A00(Integer num) {
        if (num == null) {
            return null;
        }
        return (EnumC40111tc) EnumC40111tc.A01.get(num);
    }
}

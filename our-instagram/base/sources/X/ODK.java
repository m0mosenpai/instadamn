package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public final class ODK {
    public final MediaStats A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ODK(MediaStats mediaStats) {
        String str;
        String str2;
        String str3;
        C14360o3.A0B(mediaStats, 1);
        this.A00 = mediaStats;
        int i = mediaStats.channelType;
        String str4 = "unknown";
        if (i != 0) {
            if (i != 1) {
                str = "unknown";
            } else {
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
            }
        } else {
            str = MediaStreamTrack.AUDIO_TRACK_KIND;
        }
        this.A01 = str;
        int i2 = mediaStats.streamDirection;
        if (i2 != 0) {
            if (i2 != 1) {
                str2 = "unknown";
            } else {
                str2 = "incoming";
            }
        } else {
            str2 = "outgoing";
        }
        this.A03 = str2;
        int i3 = mediaStats.streamType;
        if (i3 != 1) {
            if (i3 != 2) {
                str3 = "unknown";
            } else {
                str3 = "screen share";
            }
        } else {
            str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        this.A04 = str3;
        int i4 = mediaStats.mediaPath;
        if (i4 != 1) {
            if (i4 == 2) {
                str4 = "P2P";
            }
        } else {
            str4 = "SFU";
        }
        this.A02 = str4;
    }
}

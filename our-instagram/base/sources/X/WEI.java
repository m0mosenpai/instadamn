package X;

import android.text.TextUtils;
import com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.IGBackupUpdateGeneratorPluginImplPostmailbox;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public abstract class WEI {
    public static final ArrayList A00 = new ArrayList();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String A01(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static String A02(String str) {
        if (str == null) {
            return null;
        }
        String A002 = C4B2.A00(str);
        switch (A002.hashCode()) {
            case -1007807498:
                if (!A002.equals("audio/x-flac")) {
                    return A002;
                }
                return "audio/flac";
            case -979095690:
                if (!A002.equals("application/x-mpegurl")) {
                    return A002;
                }
                return "application/x-mpegURL";
            case -586683234:
                if (!A002.equals("audio/x-wav")) {
                    return A002;
                }
                return "audio/wav";
            case -432836268:
                if (!A002.equals("audio/mpeg-l1")) {
                    return A002;
                }
                return "audio/mpeg-L1";
            case -432836267:
                if (!A002.equals("audio/mpeg-l2")) {
                    return A002;
                }
                return "audio/mpeg-L2";
            case 187090231:
                if (!A002.equals("audio/mp3")) {
                    return A002;
                }
                return "audio/mpeg";
            default:
                return A002;
        }
    }

    public static int A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A01(str))) {
                return 1;
            }
            if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A01(str))) {
                return 2;
            }
            if (!"text".equals(A01(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                if (!"image".equals(A01(str)) && !"application/x-image-uri".equals(str)) {
                    if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
                        if (AbstractC111324zv.A00(728).equals(str)) {
                            return 6;
                        }
                        ArrayList arrayList = A00;
                        if (0 < arrayList.size()) {
                            arrayList.get(0);
                            throw new NullPointerException(IGBackupUpdateGeneratorPluginImplPostmailbox.KEY_MIME_TYPE);
                        }
                        return -1;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return -1;
    }
}

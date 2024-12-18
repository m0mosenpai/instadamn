package X;

import android.text.TextUtils;
import com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.IGBackupUpdateGeneratorPluginImplPostmailbox;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2IH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2IH {
    public static final ArrayList A00 = new ArrayList();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String A01(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String A02(String str) {
        boolean z;
        String A012;
        int i = 0;
        if (str == null) {
            return null;
        }
        String A002 = C4B2.A00(str.trim());
        if (!A002.startsWith("avc1") && !A002.startsWith("avc3")) {
            if (!A002.startsWith("hev1") && !A002.startsWith("hvc1")) {
                if (!A002.startsWith("dvav") && !A002.startsWith("dva1") && !A002.startsWith("dvhe") && !A002.startsWith("dvh1")) {
                    if (A002.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!A002.startsWith("vp9") && !A002.startsWith("vp09")) {
                        if (!A002.startsWith("vp8") && !A002.startsWith("vp08")) {
                            if (A002.startsWith("mp4a")) {
                                if (A002.startsWith("mp4a.")) {
                                    Matcher matcher = A01.matcher(A002);
                                    if (!matcher.matches()) {
                                        z = false;
                                    } else {
                                        String group = matcher.group(1);
                                        group.getClass();
                                        String group2 = matcher.group(2);
                                        try {
                                            int parseInt = Integer.parseInt(group, 16);
                                            if (group2 != null) {
                                                Integer.parseInt(group2);
                                            }
                                            i = parseInt;
                                            z = true;
                                        } catch (NumberFormatException unused) {
                                            z = false;
                                        }
                                    }
                                    if (z && (A012 = A01(i)) != null) {
                                        return A012;
                                    }
                                    return "audio/mp4a-latm";
                                }
                                return "audio/mp4a-latm";
                            }
                            if (A002.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (A002.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!A002.startsWith("ac-3") && !A002.startsWith("dac3")) {
                                if (!A002.startsWith("ec-3") && !A002.startsWith("dec3")) {
                                    if (A002.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!A002.startsWith("ac-4") && !A002.startsWith("dac4")) {
                                        if (A002.startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if (A002.startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if (!A002.startsWith("dtsh") && !A002.startsWith("dtsl")) {
                                            if (A002.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (A002.startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if (A002.startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if (A002.startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if (A002.startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if (A002.startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if (A002.contains("cea708")) {
                                                return "application/cea-708";
                                            }
                                            if (!A002.contains("eia608") && !A002.contains("cea608")) {
                                                ArrayList arrayList = A00;
                                                if (0 >= arrayList.size()) {
                                                    return null;
                                                }
                                                arrayList.get(0);
                                                throw new NullPointerException("codecPrefix");
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String A03(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A07(String str, String str2) {
        String str3;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    str3 = "audio/eac3-joc";
                    break;
                case -432837260:
                    str3 = "audio/mpeg-L1";
                    break;
                case -432837259:
                    str3 = "audio/mpeg-L2";
                    break;
                case -53558318:
                    if (str.equals("audio/mp4a-latm") && str2 != null) {
                        Matcher matcher = A01.matcher(str2);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            String group2 = matcher.group(2);
                            int i = 0;
                            try {
                                Integer.parseInt(group, 16);
                                if (group2 != null) {
                                    i = Integer.parseInt(group2);
                                }
                                int A002 = AbstractC97204Yf.A00(i);
                                if (A002 != 0 && A002 != 16) {
                                    return true;
                                }
                            } catch (NumberFormatException unused) {
                                break;
                            }
                        }
                    }
                    break;
                case 187078296:
                    str3 = "audio/ac3";
                    break;
                case 187094639:
                    str3 = "audio/raw";
                    break;
                case 1504578661:
                    str3 = "audio/eac3";
                    break;
                case 1504619009:
                    str3 = "audio/flac";
                    break;
                case 1504831518:
                    str3 = "audio/mpeg";
                    break;
                case 1903231877:
                    str3 = "audio/g711-alaw";
                    break;
                case 1903589369:
                    str3 = "audio/g711-mlaw";
                    break;
            }
            if (str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public static int A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (A04(str)) {
                return 1;
            }
            if (A06(str)) {
                return 2;
            }
            if (A05(str)) {
                return 3;
            }
            if ("image".equals(A03(str))) {
                return 4;
            }
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
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
        return -1;
    }

    public static boolean A04(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(A03(str));
    }

    public static boolean A05(String str) {
        if (!"text".equals(A03(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A06(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(A03(str));
    }
}

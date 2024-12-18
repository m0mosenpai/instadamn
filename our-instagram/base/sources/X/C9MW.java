package X;

import android.graphics.Rect;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9MW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9MW {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    public static int A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 109935:
                    if (str.equals("off")) {
                        return 0;
                    }
                    break;
                case 1628397:
                    if (str.equals("50hz")) {
                        return 1;
                    }
                    break;
                case 1658188:
                    if (str.equals("60hz")) {
                        return 2;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 3;
                    }
                    break;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    public static int A01(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1635350969:
                    if (str.equals("blackboard")) {
                        return 7;
                    }
                    break;
                case 3002044:
                    if (str.equals("aqua")) {
                        return 8;
                    }
                    break;
                case 3357411:
                    if (str.equals("mono")) {
                        return 1;
                    }
                    break;
                case 3387192:
                    if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                        return 0;
                    }
                    break;
                case 109324790:
                    if (str.equals("sepia")) {
                        return 4;
                    }
                    break;
                case 261182557:
                    if (str.equals("whiteboard")) {
                        return 6;
                    }
                    break;
                case 921111605:
                    if (str.equals("negative")) {
                        return 2;
                    }
                    break;
                case 1473417203:
                    if (str.equals("solarize")) {
                        return 3;
                    }
                    break;
                case 2008448231:
                    if (str.equals("posterize")) {
                        return 5;
                    }
                    break;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    public static int A02(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -194628547:
                    if (str.equals("continuous-video")) {
                        return 3;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 1;
                    }
                    break;
                case 3108534:
                    if (str.equals("edof")) {
                        return 5;
                    }
                    break;
                case 97445748:
                    if (str.equals("fixed")) {
                        return 0;
                    }
                    break;
                case 103652300:
                    if (str.equals("macro")) {
                        return 2;
                    }
                    break;
                case 173173288:
                    if (str.equals("infinity")) {
                        return 6;
                    }
                    break;
                case 910005312:
                    if (str.equals("continuous-picture")) {
                        return 4;
                    }
                    break;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A04(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -939299377:
                    if (str.equals("incandescent")) {
                        return 2;
                    }
                    break;
                case -719316704:
                    if (str.equals("warm-fluorescent")) {
                        return 4;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 1;
                    }
                    break;
                case 109399597:
                    if (str.equals("shade")) {
                        return 8;
                    }
                    break;
                case 474934723:
                    if (str.equals("cloudy-daylight")) {
                        return 6;
                    }
                    break;
                case 1650323088:
                    if (str.equals("twilight")) {
                        return 7;
                    }
                    break;
                case 1902580840:
                    if (str.equals("fluorescent")) {
                        return 3;
                    }
                    break;
                case 1942983418:
                    return !str.equals("daylight") ? -1 : 5;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        return 2;
                    }
                    break;
                case -1350043241:
                    if (str.equals("theatre")) {
                        return 7;
                    }
                    break;
                case -895760513:
                    if (str.equals("sports")) {
                        return 13;
                    }
                    break;
                case -891172202:
                    if (str.equals("sunset")) {
                        return 10;
                    }
                    break;
                case -333584256:
                    if (str.equals("barcode")) {
                        return 16;
                    }
                    break;
                case -300277408:
                    if (str.equals("steadyphoto")) {
                        return 11;
                    }
                    break;
                case -264202484:
                    if (str.equals("fireworks")) {
                        return 12;
                    }
                    break;
                case 103158:
                    if (str.equals("hdr")) {
                        return 17;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 0;
                    }
                    break;
                case 3535235:
                    if (str.equals("snow")) {
                        return 9;
                    }
                    break;
                case 93610339:
                    if (str.equals("beach")) {
                        return 8;
                    }
                    break;
                case 104817688:
                    if (str.equals("night")) {
                        return 5;
                    }
                    break;
                case 106437350:
                    if (str.equals("party")) {
                        return 14;
                    }
                    break;
                case 729267099:
                    if (str.equals("portrait")) {
                        return 3;
                    }
                    break;
                case 1430647483:
                    if (str.equals("landscape")) {
                        return 4;
                    }
                    break;
                case 1664284080:
                    if (str.equals("night-portrait")) {
                        return 6;
                    }
                    break;
                case 1900012073:
                    return !str.equals("candlelight") ? -1 : 15;
            }
        }
        return -1;
    }

    public static String A05(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return "action";
                case 3:
                    return "portrait";
                case 4:
                    return "landscape";
                case 5:
                    return "night";
                case 6:
                    return "night-portrait";
                case 7:
                    return "theatre";
                case 8:
                    return "beach";
                case 9:
                    return "snow";
                case 10:
                    return "sunset";
                case 11:
                    return "steadyphoto";
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    return "fireworks";
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return "sports";
                case 14:
                    return "party";
                case Process.SIGTERM /* 15 */:
                    return "candlelight";
                case 16:
                    return "barcode";
                case 17:
                    Rect rect = C9MZ.A00;
                    return "hdr";
                default:
                    return null;
            }
        }
        return "auto";
    }
}

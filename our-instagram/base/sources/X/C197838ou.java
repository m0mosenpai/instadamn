package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;

/* renamed from: X.8ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197838ou {
    public static final C197838ou A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0032. Please report as an issue. */
    public static final void A01(C82G c82g, C82H c82h, UserSession userSession) {
        InterfaceC19610xo ARD;
        long currentTimeMillis;
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c82h, 1);
        Integer A002 = A00.A00(c82g, c82h);
        if (A002 != C05F.A0C && A002 != C05F.A01) {
            C46552Bt A003 = AbstractC46542Bs.A00(userSession);
            Iterator it = AbstractC197848ov.A01(c82h).iterator();
            while (it.hasNext()) {
                switch (((EnumC197858ow) it.next()).ordinal()) {
                    case 0:
                        ARD = A003.A04.ARD();
                        currentTimeMillis = System.currentTimeMillis() / 1000;
                        str = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY";
                        ARD.E7G(str, currentTimeMillis);
                        ARD.apply();
                    case 1:
                    case 5:
                        ARD = A003.A04.ARD();
                        currentTimeMillis = System.currentTimeMillis() / 1000;
                        str = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED";
                        ARD.E7G(str, currentTimeMillis);
                        ARD.apply();
                    case 2:
                    case 3:
                        ARD = A003.A04.ARD();
                        currentTimeMillis = System.currentTimeMillis() / 1000;
                        str = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL";
                        ARD.E7G(str, currentTimeMillis);
                        ARD.apply();
                    case 4:
                    default:
                        throw new RuntimeException();
                }
            }
            InterfaceC19610xo ARD2 = A003.A04.ARD();
            ARD2.E7G("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL", System.currentTimeMillis() / 1000);
            ARD2.apply();
        }
    }

    public static final boolean A02(long j, long j2) {
        if (j == 0) {
            return true;
        }
        if (j2 < 0) {
            return false;
        }
        return j2 == 0 || (System.currentTimeMillis() / 1000) - j > j2 * 3600;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x018f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x00d8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[LOOP:0: B:30:0x017f->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[LOOP:1: B:60:0x00c8->B:69:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(X.C82G r12, X.C82H r13, com.instagram.common.session.UserSession r14) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197838ou.A03(X.82G, X.82H, com.instagram.common.session.UserSession):boolean");
    }

    private final Integer A00(C82G c82g, C82H c82h) {
        switch (c82g.ordinal()) {
            case 21:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 35:
            case 55:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 64:
            case 71:
            case 80:
            case 82:
            case 89:
                break;
            default:
                switch (c82h.ordinal()) {
                    case 0:
                    case 1:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGSTOP /* 19 */:
                    case 28:
                    case 31:
                    case 32:
                    case 39:
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                    case 43:
                    case 44:
                    case 47:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 57:
                    case 58:
                    case 59:
                    case 61:
                    case 62:
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    case 64:
                    case 67:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 102:
                    case 104:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 14:
                    case Process.SIGTERM /* 15 */:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    case 30:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 40:
                    case Seq.NULL_REFNUM /* 41 */:
                    case 45:
                    case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    case 48:
                    case 49:
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    case 55:
                    case 56:
                    case 60:
                    case 65:
                    case 66:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 100:
                        return C05F.A00;
                    case 93:
                    case 94:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 101:
                    case 103:
                        return C05F.A01;
                    default:
                        throw new RuntimeException();
                }
        }
        return C05F.A0C;
    }

    public static final boolean A04(C82H c82h) {
        switch (c82h.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 28:
            case 31:
            case 32:
            case 39:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 47:
            case 51:
            case 52:
            case 53:
            case 54:
            case 57:
            case 58:
            case 59:
            case 61:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 64:
            case 67:
            case 68:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 93:
            case 95:
            case 102:
            case 103:
            case 104:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 55:
            case 56:
            case 60:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 94:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return true;
            default:
                throw new RuntimeException();
        }
    }
}

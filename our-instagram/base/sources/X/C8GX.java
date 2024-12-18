package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.8GX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8GX {
    public static final int A00(C81W c81w) {
        C14360o3.A0B(c81w, 1);
        int ordinal = c81w.ordinal();
        if (ordinal != 33) {
            if (ordinal != 10) {
                if (ordinal != 8) {
                    switch (ordinal) {
                        case 5:
                        case 31:
                            return 0;
                        case 32:
                            return 1;
                        case 34:
                            return 3;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("camera tool is not secondary menu tool: ");
                            sb.append(c81w);
                            throw new IllegalArgumentException(sb.toString());
                    }
                }
                return 0;
            }
            return 2;
        }
        return 0;
    }

    public static final Integer A04(C81W c81w) {
        C14360o3.A0B(c81w, 0);
        int ordinal = c81w.ordinal();
        if (ordinal != 0) {
            if (ordinal != 6) {
                if (ordinal != 4) {
                    if (ordinal != 1) {
                        if (ordinal != 28) {
                            if (ordinal != 16) {
                                return null;
                            }
                            return C05F.A1F;
                        }
                        return C05F.A03;
                    }
                    return C05F.A01;
                }
                return C05F.A0u;
            }
            return C05F.A0Y;
        }
        return C05F.A0N;
    }

    public static final int A01(C81W c81w) {
        int ordinal = c81w.ordinal();
        if (ordinal == 33 || ordinal == 10 || ordinal == 8) {
            return 1;
        }
        switch (ordinal) {
            case 5:
            case 31:
            case 32:
            case 34:
                return 1;
            case 11:
                return 2;
            default:
                return 3;
        }
    }

    public static final long A02(C81W c81w) {
        int ordinal = c81w.ordinal();
        if (ordinal != 14) {
            if (ordinal == 8) {
                return 30000L;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("camera tool is not status menu tool: ");
            sb.append(c81w);
            throw new IllegalArgumentException(sb.toString());
        }
        return -1L;
    }

    public static final C81W A03(String str) {
        long parseLong = Long.parseLong(str);
        for (C81W c81w : C81W.values()) {
            Long valueOf = Long.valueOf(c81w.A00.A00);
            if (valueOf != null && valueOf.longValue() == parseLong) {
                return c81w;
            }
        }
        return null;
    }

    public static final boolean A05(C81W c81w) {
        switch (c81w.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 33:
            case 37:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return true;
            case 2:
            case 5:
            case 11:
            case 16:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 38:
            case 39:
            case 43:
            case 44:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
            case 49:
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0011. Please report as an issue. */
    public static final boolean A06(C81W c81w) {
        int ordinal = c81w.ordinal();
        if (ordinal != 33 && ordinal != 10) {
            if (ordinal != 8) {
                switch (ordinal) {
                    case 5:
                    case 31:
                    case 32:
                        break;
                    case 11:
                    case 34:
                        return true;
                    default:
                        AbstractC12120kG.A07("CameraTool", "This tool cannot have a secondary picker", null);
                        break;
                }
            }
            return false;
        }
        return true;
    }
}

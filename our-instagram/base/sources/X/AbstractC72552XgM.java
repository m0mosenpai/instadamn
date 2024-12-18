package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.XgM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72552XgM {
    public static byte A00(byte b) {
        switch (b) {
            case 1:
                return (byte) 1;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 4;
            case 5:
            case 7:
            case 9:
            case 17:
            case 18:
            default:
                throw AbstractC25230BEn.A0n("type=", b);
            case 6:
                return (byte) 6;
            case 8:
            case 16:
                return (byte) 8;
            case 10:
                return (byte) 10;
            case 11:
            case 20:
                return (byte) 11;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return (byte) 12;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return DalvikInternals.IOPRIO_CLASS_SHIFT;
            case 14:
                return (byte) 14;
            case Process.SIGTERM /* 15 */:
                return (byte) 15;
            case Process.SIGSTOP /* 19 */:
                return (byte) 19;
        }
    }
}

package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Rz9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62100Rz9 {
    public static String A00(int i) {
        if (i == 1) {
            return "SUPERPACK_CREATE_SECONDAY_DEX_ARCHIVE";
        }
        if (i == 2) {
            return "SUPERPACK_NEXT_SECONDARY_DEX";
        }
        if (i == 3) {
            return "SUPERPACK_TOTAL_SECONDARY_DEX_UNPACKING";
        }
        if (i == 4) {
            return "SUPERPACK_TOTAL_SECONDARY_DEX_XZS_UNPACKING";
        }
        if (i == 3008) {
            return "SUPERPACK_FB_SO_LOADER_SUPERPACK_DECOMPRESSION_TOTAL";
        }
        switch (i) {
            case 7:
                return "SUPERPACK_SUPERPACK_CREATE_SECONDAY_DEX_ARCHIVE";
            case 8:
                return "SUPERPACK_SUPERPACK_NEXT_SECONDARY_DEX";
            case 9:
                return "SUPERPACK_SUPERPACK_TOTAL_SECONDARY_DEX_UNPACKING";
            case 10:
                return "SUPERPACK_SUPERPACK_TOTAL_SECONDARY_DEX_XZS_UNPACKING";
            case 11:
                return "SUPERPACK_FB_SO_LOADER_SUPERPACK_XZ_TOTAL";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SUPERPACK_FB_SO_LOADER_SUPERPACK_ZSTD_TOTAL";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "SUPERPACK_FB_SO_LOADER_COMPRESSION_TOTAL";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}

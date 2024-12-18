package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.clips.intf.ClipsViewerSource;

/* loaded from: classes7.dex */
public abstract class IB0 {
    public static final C22P A00(ClipsViewerSource clipsViewerSource) {
        if (clipsViewerSource != null) {
            switch (clipsViewerSource.ordinal()) {
                case 3:
                    return C22P.A1h;
                case 11:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return C22P.A1g;
                case 17:
                case 18:
                    return C22P.A1i;
                case 22:
                    return C22P.A1b;
                case 26:
                    return C22P.A2B;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 31:
                    return C22P.A1j;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    return C22P.A1m;
                case 52:
                case 53:
                    return C22P.A1p;
                case 54:
                    return C22P.A1r;
                case 55:
                    return C22P.A1Y;
                case 57:
                    return C22P.A1s;
                case 58:
                case 60:
                    return C22P.A1P;
                case 59:
                    return C22P.A1Z;
                case 64:
                    return C22P.A1o;
                case 69:
                    return C22P.A1t;
                case 78:
                    return C22P.A1k;
                case 79:
                    return C22P.A1c;
                case 82:
                    return C22P.A1u;
                case 84:
                    return C22P.A1e;
            }
        }
        return C22P.A2q;
    }
}

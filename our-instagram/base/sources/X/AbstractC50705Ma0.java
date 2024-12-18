package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ma0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50705Ma0 {
    public static final Integer A00(EnumC40111tc enumC40111tc) {
        switch (AbstractC25227BEk.A05(enumC40111tc, 0)) {
            case 0:
                return C05F.A01;
            case 1:
                return C05F.A0C;
            case 7:
                return C05F.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C05F.A0Y;
            case 17:
                return C05F.A1F;
            case 27:
                return C05F.A15;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return C05F.A0j;
            case 30:
                return C05F.A0u;
            case 31:
                return C05F.A1I;
            default:
                IllegalArgumentException A0M = AbstractC37303Gc4.A0M(enumC40111tc, "media type not supported ", AbstractC166987dD.A1C());
                C0w9.A07("logging_media_type_not_supported", A0M);
                throw A0M;
        }
    }
}

package X;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.OpG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55747OpG implements OverlayConfigLayerInterface {
    public int[] A00;
    public final C28510Ci4 A01;

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int getLayerSource() {
        return 17;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int[] getValues() {
        int i;
        int[] iArr = this.A00;
        if (iArr == null) {
            synchronized (this) {
                int[] iArr2 = this.A00;
                if (iArr2 != null) {
                    return iArr2;
                }
                int[] iArr3 = new int[4682];
                for (int i2 = 0; i2 < 4682; i2++) {
                    Long A0X = this.A01.A0X(i2);
                    if (A0X != null) {
                        long longValue = A0X.longValue();
                        i = (int) longValue;
                        if (i != longValue) {
                            C0w9.A01.EmN("LauncherOverlayConfigLayerUtils", AnonymousClass001.A0Q("Value out of range: ", longValue));
                        } else {
                            iArr3[i2] = i;
                        }
                    }
                    i = -1;
                    iArr3[i2] = i;
                }
                this.A00 = iArr3;
                return iArr3;
            }
        }
        return iArr;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final void logExposure(int i) {
        if (this.A01.A0W(i) == null) {
            C0w9.A03("LauncherOverlayConfigLayer", AnonymousClass001.A0O("Invalid id for logExposureForIds: ", i));
        }
    }

    public C55747OpG(UserSession userSession) {
        this.A01 = new C28510Ci4(userSession);
    }
}

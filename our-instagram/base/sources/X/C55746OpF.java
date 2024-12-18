package X;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.Arrays;

/* renamed from: X.OpF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55746OpF implements OverlayConfigLayerInterface {
    public final O1Z A00;

    public C55746OpF(O1Z o1z) {
        C14360o3.A0B(o1z, 1);
        this.A00 = o1z;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final void logExposure(int i) {
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int getLayerSource() {
        return 45;
    }

    @Override // com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface
    public final int[] getValues() {
        int[] copyOf = Arrays.copyOf(this.A00.A00, 4682);
        C14360o3.A07(copyOf);
        return copyOf;
    }
}

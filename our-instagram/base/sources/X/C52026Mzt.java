package X;

import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;

/* renamed from: X.Mzt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52026Mzt extends ScreenShareProxy {
    public final /* synthetic */ C55074OaU A00;

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public final void setApi(ScreenShareApi screenShareApi) {
        C14360o3.A0B(screenShareApi, 0);
        this.A00.A00 = screenShareApi;
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public final void setScreenShareFrameCaptureRate(int i) {
    }

    public C52026Mzt(C55074OaU c55074OaU) {
        this.A00 = c55074OaU;
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public final void setScreenShareAvailability(int i) {
        ScreenShareApi screenShareApi = this.A00.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(false, 0);
        }
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public final void setScreenShareStopSharing() {
        ScreenShareApi screenShareApi = this.A00.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(false, 0);
        }
    }
}

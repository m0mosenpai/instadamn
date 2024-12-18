package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* loaded from: classes11.dex */
public final class WU9 implements InterfaceC65635Tpw {
    public final /* synthetic */ C66542ULx A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ boolean A02;

    public WU9(C66542ULx c66542ULx, LiveLocationSession liveLocationSession, boolean z) {
        this.A00 = c66542ULx;
        this.A01 = liveLocationSession;
        this.A02 = z;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        C66542ULx c66542ULx = this.A00;
        AbstractC66543ULy.A04(c66542ULx, th, "ERROR");
        AbstractC66543ULy.A05(c66542ULx, "screen error", new Object[0]);
    }

    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
        C66542ULx c66542ULx = this.A00;
        C69632VsZ c69632VsZ = c66542ULx.A02;
        c69632VsZ.A04.A01(c69632VsZ.A02, c69632VsZ.A03, C05F.A01);
        c69632VsZ.A00 = false;
        AbstractC66543ULy.A04(c66542ULx, null, "LIVE_LOCATION_STOPPED");
        if (this.A02) {
            C66542ULx.A01(c66542ULx);
        }
        C66542ULx.A02(c66542ULx);
    }
}

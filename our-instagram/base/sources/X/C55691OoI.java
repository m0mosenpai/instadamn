package X;

import android.os.Handler;
import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;

/* renamed from: X.OoI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55691OoI implements TransportCallbacks {
    public TransportCallbacks A00;
    public final Handler A01;

    @Override // com.facebook.mediastreaming.opt.transport.TransportCallbacks
    public final void onSpeedTestResult(SpeedTestStatus speedTestStatus) {
        C14360o3.A0B(speedTestStatus, 0);
        this.A01.post(new PPP(this, speedTestStatus));
    }

    @Override // com.facebook.mediastreaming.opt.transport.TransportCallbacks
    public final void onTransportEvent(TransportEvent transportEvent, TransportError transportError) {
        C14360o3.A0B(transportEvent, 0);
        this.A01.post(new PS5(this, transportError, transportEvent));
    }

    public C55691OoI(Handler handler, TransportCallbacks transportCallbacks) {
        this.A00 = transportCallbacks;
        this.A01 = handler;
    }
}

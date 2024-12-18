package X;

import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;

/* loaded from: classes9.dex */
public final class PS5 implements Runnable {
    public final /* synthetic */ C55691OoI A00;
    public final /* synthetic */ TransportError A01;
    public final /* synthetic */ TransportEvent A02;

    public PS5(C55691OoI c55691OoI, TransportError transportError, TransportEvent transportEvent) {
        this.A00 = c55691OoI;
        this.A02 = transportEvent;
        this.A01 = transportError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.onTransportEvent(this.A02, this.A01);
    }
}

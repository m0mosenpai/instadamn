package X;

/* loaded from: classes9.dex */
public final class P6x implements InterfaceC30998Djx {
    public final /* synthetic */ C006802i A00;

    @Override // X.InterfaceC30998Djx
    public final void DG4(String str) {
        C0K8.A0P("proxy_service", "Connectivity probe failed: %s.", str);
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(79499422, "has_meta_connectivity", false);
        c006802i.markerAnnotate(79499422, "connection_race_failure", str);
    }

    @Override // X.InterfaceC30998Djx
    public final void Dph(int i, int i2) {
        C0K8.A0P("proxy_service", "Connectivity probe succeeded: %d.", Integer.valueOf(i));
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(79499422, "has_meta_connectivity", true);
        synchronized (C51975MyI.A06) {
            C51975MyI.A05 = true;
            C51975MyI c51975MyI = C51975MyI.A04;
            if (c51975MyI != null) {
                C0K8.A0C("proxy_service", "Shutdown proxyservice due to connection race.");
                c51975MyI.A04.stop();
                c006802i.markerAnnotate(79499422, "cancel_reason", "connection_race");
                c006802i.markerAnnotate(79499422, "connection_probe_won_race", false);
                c006802i.markerEnd(79499422, (short) 4);
            }
        }
    }

    public P6x(C006802i c006802i) {
        this.A00 = c006802i;
    }
}

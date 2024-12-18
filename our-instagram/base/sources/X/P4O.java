package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes9.dex */
public final class P4O implements InterfaceC191378do {
    public final /* synthetic */ C006802i A00;
    public final /* synthetic */ C217914f A01;

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        C14360o3.A0B(str, 0);
        C0K8.A0O("proxy_service", "Unable to download ProxyService module, errorMessage=%s.", str);
        C006802i c006802i = this.A00;
        c006802i.markerAnnotate(79499422, TraceFieldType.FailureReason, "download_failed");
        MSY.A1D(c006802i, "voltron_failure_reason", str, 79499422);
    }

    public P4O(C006802i c006802i, C217914f c217914f) {
        this.A00 = c006802i;
        this.A01 = c217914f;
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        short s;
        C0K8.A0D("proxy_service", "Successfully downloaded ProxyService module.");
        C006802i c006802i = this.A00;
        c006802i.markerPoint(79499422, "downloaded_service");
        C13920nI c13920nI = C13920nI.A00;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        C14360o3.A0B(c13920nI, 1);
        C64919TZu c64919TZu = new C64919TZu(new ExecutorC14040nU(new C18220v9(c13920nI, A00), 201569894, 3, false, true));
        C54115NwD c54115NwD = C51975MyI.A06;
        C217914f c217914f = this.A01;
        AbstractC12990ll A08 = ((AnonymousClass122) c217914f.A00.A00()).A08();
        synchronized (c54115NwD) {
            C0K8.A0D("proxy_service", "Building proxy service.");
            if (C51975MyI.A05) {
                C0K8.A0D("proxy_service", "Cancel due to user already has external connectivity.");
                c006802i.markerAnnotate(79499422, "cancel_reason", "connection_race");
                c006802i.markerAnnotate(79499422, "connection_probe_won_race", true);
                s = 4;
            } else {
                try {
                    C51975MyI c51975MyI = new C51975MyI(c64919TZu, c006802i, A08);
                    C51975MyI.A04 = c51975MyI;
                    c006802i.markerPoint(79499422, "loaded_library");
                    try {
                        C0K8.A0D("proxy_service", "Start proxying.");
                        c51975MyI.A04.startTunneling("");
                    } catch (Exception e) {
                        C0K8.A0G("proxy_service", "Error while starting Psiphon Tunnel.", e);
                    }
                    c217914f.A01.A01(new C56716PFi());
                    return;
                } catch (Exception e2) {
                    C0K8.A0G("proxy_service", "Error while building Psiphon Tunnel.", e2);
                    c006802i.markerAnnotate(79499422, TraceFieldType.FailureReason, "build_tunnel");
                    s = 3;
                    c006802i.markerEnd(79499422, s);
                } catch (UnsatisfiedLinkError e3) {
                    C0K8.A0G("proxy_service", "Error loading libraries.", e3);
                    c006802i.markerAnnotate(79499422, TraceFieldType.FailureReason, "load_library");
                    s = 3;
                    c006802i.markerEnd(79499422, s);
                }
            }
            c006802i.markerEnd(79499422, s);
        }
    }
}

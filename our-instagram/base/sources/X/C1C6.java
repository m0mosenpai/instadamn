package X;

import com.instagram.debug.network.DebugNetworkShapingRequestCallbackWrapper;

/* renamed from: X.1C6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1C6 {
    public static InterfaceC216113n A02;
    public static C1C6 A03;
    public static DebugNetworkShapingRequestCallbackWrapper A04;
    public final C1G4 A00;
    public final C18240vB A01;

    public static synchronized C1C6 A00() {
        C1C6 c1c6;
        synchronized (C1C6.class) {
            c1c6 = A03;
            if (c1c6 == null) {
                InterfaceC216113n interfaceC216113n = A02;
                if (interfaceC216113n != null) {
                    C1G4 c1g4 = (C1G4) interfaceC216113n.get();
                    c1g4.getClass();
                    c1c6 = new C1C6(c1g4);
                    A03 = c1c6;
                } else {
                    throw new IllegalStateException("AsyncHttpService has not been initialized");
                }
            }
        }
        return c1c6;
    }

    public static synchronized void A01() {
        synchronized (C1C6.class) {
            if (A03 == null) {
                InterfaceC216113n interfaceC216113n = A02;
                interfaceC216113n.getClass();
                C1G4 c1g4 = (C1G4) interfaceC216113n.get();
                c1g4.getClass();
                A03 = new C1C6(c1g4);
            }
        }
    }

    public final InterfaceC27191Tt A02(InterfaceC26491Qe interfaceC26491Qe, C1QW c1qw, C1QY c1qy) {
        C26511Qg c26511Qg;
        DebugNetworkShapingRequestCallbackWrapper debugNetworkShapingRequestCallbackWrapper = A04;
        if (debugNetworkShapingRequestCallbackWrapper == null) {
            c26511Qg = new C26511Qg(interfaceC26491Qe, c1qy);
        } else {
            c26511Qg = new C26511Qg(debugNetworkShapingRequestCallbackWrapper.maybeWrapCallback(interfaceC26491Qe, c1qw.A09.toString()), c1qy);
        }
        return this.A00.startRequest(c1qw, c1qy, c26511Qg);
    }

    public C1C6(C1G4 c1g4) {
        this.A00 = c1g4;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "AsyncHttpService";
        this.A01 = new C18240vB(A00);
    }
}

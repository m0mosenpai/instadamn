package X;

/* renamed from: X.1WP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WP implements InterfaceC27591Vm {
    public static InterfaceC27591Vm A00;
    public static final C1WP A01 = new Object();

    @Override // X.InterfaceC27591Vm
    public final synchronized C27641Vr AqA() {
        return A00().AqA();
    }

    @Override // X.InterfaceC27591Vm
    public final synchronized C1WN Arf() {
        return A00().Arf();
    }

    @Override // X.InterfaceC27591Vm
    public final synchronized C27651Vs BGl() {
        return A00().BGl();
    }

    @Override // X.InterfaceC27591Vm
    public final synchronized C27711Vz Bfa() {
        return A00().Bfa();
    }

    public static final synchronized InterfaceC27591Vm A00() {
        InterfaceC27591Vm interfaceC27591Vm;
        synchronized (C1WP.class) {
            interfaceC27591Vm = A00;
            if (interfaceC27591Vm == null) {
                throw new RuntimeException("Fresco context provider must be set");
            }
        }
        return interfaceC27591Vm;
    }
}

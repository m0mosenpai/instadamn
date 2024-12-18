package X;

/* loaded from: classes10.dex */
public final class TC1 implements InterfaceC65668Tqy {
    public static final TC1 A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;
    public static final C63200Sf3 A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TC1, java.lang.Object] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("window");
        EnumC61088Rf2 enumC61088Rf2 = EnumC61088Rf2.DEFAULT;
        A04 = C63407Sjf.A0K(A032, enumC61088Rf2, 1);
        A03 = C63407Sjf.A0K(C63407Sjf.A03("logSourceMetrics"), enumC61088Rf2, 2);
        A02 = C63407Sjf.A0K(C63407Sjf.A03("globalMetrics"), enumC61088Rf2, 3);
        A01 = C63407Sjf.A0K(C63407Sjf.A03("appNamespace"), enumC61088Rf2, 4);
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        C62911SWs c62911SWs = (C62911SWs) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A04, c62911SWs.A01);
        interfaceC65523Tls.A7W(A03, c62911SWs.A03);
        interfaceC65523Tls.A7W(A02, c62911SWs.A00);
        interfaceC65523Tls.A7W(A01, c62911SWs.A02);
    }
}

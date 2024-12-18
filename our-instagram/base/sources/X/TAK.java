package X;

/* loaded from: classes10.dex */
public final class TAK implements InterfaceC65668Tqy {
    public static final TAK A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TAK, java.lang.Object] */
    static {
        C63407Sjf A03 = C63407Sjf.A03("startMs");
        EnumC61088Rf2 enumC61088Rf2 = EnumC61088Rf2.DEFAULT;
        A02 = C63407Sjf.A0K(A03, enumC61088Rf2, 1);
        A01 = C63407Sjf.A0K(C63407Sjf.A03("endMs"), enumC61088Rf2, 2);
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SEI sei = (SEI) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7V(A02, sei.A01);
        interfaceC65523Tls.A7V(A01, sei.A00);
    }
}

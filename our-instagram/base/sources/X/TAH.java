package X;

/* loaded from: classes10.dex */
public final class TAH implements InterfaceC65668Tqy {
    public static final TAH A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.TAH] */
    static {
        C63407Sjf A03 = C63407Sjf.A03("eventsDroppedCount");
        EnumC61088Rf2 enumC61088Rf2 = EnumC61088Rf2.DEFAULT;
        A01 = C63407Sjf.A0K(A03, enumC61088Rf2, 1);
        A02 = C63407Sjf.A0K(C63407Sjf.A03("reason"), enumC61088Rf2, 3);
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SEG seg = (SEG) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7V(A01, seg.A00);
        interfaceC65523Tls.A7W(A02, seg.A01);
    }
}

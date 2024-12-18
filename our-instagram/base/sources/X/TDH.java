package X;

/* loaded from: classes10.dex */
public final class TDH implements InterfaceC65668Tqy {
    public static final TDH A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;
    public static final C63200Sf3 A04;
    public static final C63200Sf3 A05;
    public static final C63200Sf3 A06;
    public static final C63200Sf3 A07;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.TDH] */
    static {
        C63407Sjf A032 = C63407Sjf.A03("durationMs");
        EnumC61071Rel enumC61071Rel = EnumC61071Rel.DEFAULT;
        A01 = C63407Sjf.A04(enumC61071Rel, A032);
        A02 = C63407Sjf.A06(enumC61071Rel, "imageSource");
        A03 = C63407Sjf.A07(enumC61071Rel, "imageFormat");
        A04 = C63407Sjf.A08(enumC61071Rel, "imageByteSize");
        A05 = C63407Sjf.A09(enumC61071Rel, "imageWidth");
        A06 = C63407Sjf.A0A(enumC61071Rel, "imageHeight");
        A07 = C63407Sjf.A0B(enumC61071Rel, "rotationDegrees");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        SJ3 sj3 = (SJ3) obj;
        InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
        interfaceC65523Tls.A7W(A01, sj3.A06);
        interfaceC65523Tls.A7W(A02, sj3.A01);
        interfaceC65523Tls.A7W(A03, sj3.A00);
        interfaceC65523Tls.A7W(A04, sj3.A02);
        interfaceC65523Tls.A7W(A05, sj3.A03);
        interfaceC65523Tls.A7W(A06, sj3.A04);
        interfaceC65523Tls.A7W(A07, sj3.A05);
    }
}

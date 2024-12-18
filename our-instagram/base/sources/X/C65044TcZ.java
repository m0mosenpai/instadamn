package X;

/* renamed from: X.TcZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65044TcZ extends C0YY implements InterfaceC16660sJ {
    public static final C65044TcZ A00 = new C65044TcZ();

    public C65044TcZ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC65584TnN interfaceC65584TnN = (InterfaceC65584TnN) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(interfaceC65584TnN);
        A0x.append(interfaceC65584TnN.BKS());
        A0x.append('=');
        switch (interfaceC65584TnN.CBL().ordinal()) {
            case 0:
                A0x.append(interfaceC65584TnN.AhD());
                return A0x;
            case 1:
                A0x.append(interfaceC65584TnN.BIi());
                return A0x;
            case 2:
                A0x.append(interfaceC65584TnN.Az9());
                return A0x;
            case 3:
                A0x.append('\"');
                A0x.append(interfaceC65584TnN.C2w());
                A0x.append('\"');
                return A0x;
            case 4:
                AbstractC58318PtA.A1V(A0x, interfaceC65584TnN.BPd());
                return A0x;
            case 5:
                A0x.append(interfaceC65584TnN.BPC());
                return A0x;
            default:
                return A0x;
        }
    }
}

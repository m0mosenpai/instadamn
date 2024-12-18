package X;

/* renamed from: X.Tcx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65068Tcx extends C0YY implements InterfaceC16660sJ {
    public static final C65068Tcx A00 = new C65068Tcx();

    public C65068Tcx() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(str);
        A0x.append("\"");
        A0x.append(str);
        A0x.append("\"");
        return A0x;
    }
}

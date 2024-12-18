package X;

/* renamed from: X.Tco, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65059Tco extends C0YY implements InterfaceC16660sJ {
    public static final C65059Tco A00 = new C65059Tco();

    public C65059Tco() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C14360o3.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            return "UNKNOWN";
        }
        return message;
    }
}

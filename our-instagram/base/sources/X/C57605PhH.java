package X;

/* renamed from: X.PhH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57605PhH extends C0YY implements InterfaceC16660sJ {
    public static final C57605PhH A00 = new C57605PhH();

    public C57605PhH() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        try {
            C14360o3.A0A(str);
            return AbstractC25228BEl.A13(AbstractC43592JPx.A0z(str, 27));
        } catch (NumberFormatException unused) {
            C0K8.A0D("com.fbpay.w3c.security.SecurityProviderEphemeral", AnonymousClass001.A0R("Broken alias for the ephemeral key:", str));
            return null;
        }
    }
}

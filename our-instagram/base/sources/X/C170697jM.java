package X;

/* renamed from: X.7jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170697jM extends AbstractC170707jN {
    public final AbstractC50812Vc A00;
    public final C2V9 A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.7jK] */
    public static C170697jM A00() {
        ?? obj = new Object();
        obj.A00 = new C75723ad();
        return new C170697jM(obj);
    }

    @Override // X.InterfaceC170717jO
    public final String getName() {
        return this.A00.A0H();
    }

    public C170697jM(C170677jK c170677jK) {
        super.A00 = ((AbstractC170687jL) c170677jK).A00;
        AbstractC50812Vc abstractC50812Vc = c170677jK.A00;
        if (abstractC50812Vc != null) {
            this.A00 = abstractC50812Vc;
            this.A01 = c170677jK.A01;
            return;
        }
        throw new IllegalStateException("Component must be provided.");
    }
}

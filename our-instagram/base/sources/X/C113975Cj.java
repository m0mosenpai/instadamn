package X;

/* renamed from: X.5Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113975Cj extends C0YY implements InterfaceC16660sJ {
    public static final C113975Cj A00 = new C113975Cj();

    public C113975Cj() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long intValue;
        if (C14360o3.A0K(obj, false)) {
            intValue = C1132359l.A08;
        } else {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((Number) obj).intValue() << 32;
        }
        return new C1132359l(intValue);
    }
}

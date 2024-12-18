package X;

/* renamed from: X.40q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C903140q extends C0YY implements InterfaceC16660sJ {
    public static final C903140q A00 = new C903140q();

    public C903140q() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        if (intValue < 0) {
            i = 10;
        } else {
            i = 5;
            if (intValue == 0) {
                i = 1;
            }
        }
        return Integer.valueOf(i);
    }
}

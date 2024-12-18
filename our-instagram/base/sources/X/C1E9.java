package X;

/* renamed from: X.1E9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1E9 extends C0YY implements InterfaceC16620sF {
    public static final C1E9 A00 = new C1E9();

    public C1E9() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Number number;
        if (obj2 instanceof C1EC) {
            if ((obj instanceof Integer) && (number = (Number) obj) != null) {
                i = number.intValue();
                if (i == 0) {
                    return obj2;
                }
            } else {
                i = 1;
            }
            return Integer.valueOf(i + 1);
        }
        return obj;
    }
}

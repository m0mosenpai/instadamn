package X;

/* loaded from: classes5.dex */
public abstract class CCM {
    public static final C25906Bd9 A00(C2Z1 c2z1, C2Z3 c2z3, C2Z3 c2z32, C2Z3 c2z33) {
        Integer num;
        Integer valueOf = Integer.valueOf(AbstractC25228BEl.A0A(c2z1, c2z3.A00));
        if (c2z32 != null) {
            num = Integer.valueOf(AbstractC25228BEl.A0A(c2z1, c2z32.A00));
        } else {
            num = null;
        }
        return new C25906Bd9(valueOf, num, c2z33 != null ? Integer.valueOf(AbstractC25228BEl.A0A(c2z1, c2z33.A00)) : null);
    }
}

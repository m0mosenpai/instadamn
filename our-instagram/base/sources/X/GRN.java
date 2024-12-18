package X;

import java.util.function.Function;

/* loaded from: classes6.dex */
public final class GRN implements Function {
    public final int A00;

    public GRN(int i) {
        this.A00 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            return ((C84923qg) obj).A08;
        }
        return ((InterfaceC37225Gaa) obj).getUsername();
    }
}

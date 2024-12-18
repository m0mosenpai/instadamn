package X;

import java.util.function.Function;

/* loaded from: classes7.dex */
public final class J6G implements Function {
    public final int A00;

    public J6G(int i) {
        this.A00 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            return ((C139196Sa) ((InterfaceC139206Sb) obj)).A02.getId();
        }
        return ((RBL) obj).A0B();
    }
}

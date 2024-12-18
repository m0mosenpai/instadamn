package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class Ss0 implements InterfaceC65310Thm {
    public final String A00;
    public final List A01;
    public final boolean A02;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        return new C63672Srf(sq2, q2o, this, abstractC63678Srl);
    }

    public final String toString() {
        return AnonymousClass001.A0v("ShapeGroup{name='", this.A00, "' Shapes: ", Arrays.toString(this.A01.toArray()), '}');
    }

    public Ss0(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }
}

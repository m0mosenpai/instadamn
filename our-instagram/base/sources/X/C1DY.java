package X;

import java.util.LinkedHashSet;

/* renamed from: X.1DY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DY {
    public final C1DV A00;
    public final java.util.Set A01;
    public final boolean A02;

    public /* synthetic */ C1DY(C1DV c1dv, int i, boolean z) {
        this(c1dv, (i & 2) != 0 ? new LinkedHashSet() : null, (i & 4) != 0 ? false : z);
    }

    public final C17M A00(C17M c17m) {
        C14360o3.A0B(c17m, 0);
        return this.A00.E7H(this, c17m);
    }

    public C1DY(C1DV c1dv, java.util.Set set, boolean z) {
        C14360o3.A0B(c1dv, 1);
        C14360o3.A0B(set, 2);
        this.A00 = c1dv;
        this.A01 = set;
        this.A02 = z;
    }
}

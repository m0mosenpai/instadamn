package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1TO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TO {
    public final int A00;
    public final int A01;
    public final C1TK A02;
    public final Integer A03;
    public final java.util.Set A04;
    public final boolean A05;

    public C1TO(C1TK c1tk, Integer num, java.util.Set set, int i, int i2, boolean z) {
        this.A05 = z;
        this.A03 = num;
        this.A02 = c1tk;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = Collections.unmodifiableSet(new HashSet(set));
    }
}

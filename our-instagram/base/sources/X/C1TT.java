package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1TT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TT {
    public final C1SI A00;
    public final C1TO A01;
    public final Integer A02;
    public final List A03;
    public final java.util.Set A04;
    public final boolean A05;
    public final boolean A06;

    public C1TT(C1SI c1si, C1TO c1to, Integer num, List list, java.util.Set set, boolean z, boolean z2) {
        this.A01 = c1to;
        this.A00 = c1si;
        this.A02 = num;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = Collections.unmodifiableSet(new HashSet(set));
        this.A03 = Collections.unmodifiableList(new ArrayList(list));
    }
}

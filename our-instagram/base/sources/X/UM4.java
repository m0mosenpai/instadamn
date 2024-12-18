package X;

import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UM4 extends UM5 {
    public Object A00;
    public Object A01;
    public final X96 A02;
    public final X96 A03;
    public final C69692Vtm A04;
    public final C69692Vtm A05;
    public final Comparator A06;

    public UM4(X96 x96, X96 x962, Comparator comparator, Iterator it, Iterator it2) {
        this.A06 = comparator;
        this.A04 = new C69692Vtm(it);
        this.A05 = new C69692Vtm(it2);
        this.A02 = x96;
        this.A03 = x962;
    }
}

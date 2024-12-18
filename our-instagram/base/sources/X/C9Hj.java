package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Hj, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Hj implements InterfaceC224417g {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ InterfaceC224417g A01;

    public C9Hj(Comparator comparator, InterfaceC224417g interfaceC224417g) {
        this.A01 = interfaceC224417g;
        this.A00 = comparator;
    }

    @Override // X.InterfaceC224417g
    public final Iterator iterator() {
        List A03 = AbstractC224517h.A03(this.A01);
        C01T.A1D(A03, this.A00);
        return A03.iterator();
    }
}

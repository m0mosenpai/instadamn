package X;

import java.util.Comparator;

/* loaded from: classes11.dex */
public final class U5J implements Comparator {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;

    public U5J(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = interfaceC103384lE;
        this.A00 = c6fq;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC103384lE interfaceC103384lE = this.A01;
        C6FX c6fx = new C6FX();
        c6fx.A03(obj, 0);
        c6fx.A02(obj2);
        Object A00 = C131845xK.A00(this.A00, c6fx.A00(), interfaceC103384lE);
        if (!(A00 instanceof Integer)) {
            AbstractC25241Le.A02("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
            return 0;
        }
        return ((Number) A00).intValue();
    }
}

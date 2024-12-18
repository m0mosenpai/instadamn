package X;

/* renamed from: X.4ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100374ez {
    public final InterfaceC100264eo[] A00;

    public final void A00(C88023wA c88023wA) {
        if (c88023wA.A0C) {
            for (InterfaceC100264eo interfaceC100264eo : this.A00) {
                interfaceC100264eo.Cpa(c88023wA);
            }
            c88023wA.A0C = false;
            return;
        }
        if (c88023wA.A0B) {
            for (InterfaceC100264eo interfaceC100264eo2 : this.A00) {
                interfaceC100264eo2.CpU(c88023wA);
            }
            c88023wA.A0B = false;
        }
    }

    public AbstractC100374ez(InterfaceC100264eo[] interfaceC100264eoArr) {
        this.A00 = interfaceC100264eoArr;
    }
}

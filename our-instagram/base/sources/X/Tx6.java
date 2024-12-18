package X;

/* loaded from: classes11.dex */
public final class Tx6 implements InterfaceC71954XCg {
    public final /* synthetic */ C65953Twy A00;

    public Tx6(C65953Twy c65953Twy) {
        this.A00 = c65953Twy;
    }

    @Override // X.InterfaceC71954XCg
    public final int getCount() {
        InterfaceC65242xM AZU;
        C65953Twy c65953Twy = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C3FQ c3fq = c65953Twy.A00;
        if (c3fq != null && (AZU = c3fq.AZU()) != null) {
            return AZU.getCount();
        }
        C3FQ c3fq2 = c65953Twy.A00;
        if (c3fq2 != null) {
            return c3fq2.getCount();
        }
        throw new IllegalStateException("Adapter is null");
    }

    @Override // X.InterfaceC71954XCg
    public final Object getItem(int i) {
        InterfaceC65242xM AZU;
        C65953Twy c65953Twy = this.A00;
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C3FQ c3fq = c65953Twy.A00;
        if (c3fq != null && (AZU = c3fq.AZU()) != null) {
            return AZU.getItem(i);
        }
        return null;
    }
}

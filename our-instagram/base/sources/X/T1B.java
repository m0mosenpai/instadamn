package X;

/* loaded from: classes10.dex */
public final class T1B implements InterfaceC65366Tiy {
    public final int A00;
    public final Object A01;

    public T1B(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65366Tiy
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00 != 0) {
            return Boolean.valueOf(((SN5) this.A01).A0J.A00());
        }
        return ((C64082Syy) this.A01).A04.getRequestRoutingRegion();
    }
}

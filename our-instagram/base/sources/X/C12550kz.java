package X;

/* renamed from: X.0kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12550kz extends C18140uy {
    public final Object A00;

    @Override // X.C18140uy, X.C02Q
    public final boolean EE6(Object obj) {
        boolean EE6;
        C14360o3.A0B(obj, 0);
        synchronized (this.A00) {
            EE6 = super.EE6(obj);
        }
        return EE6;
    }

    @Override // X.C18140uy, X.C02Q
    public final Object A7H() {
        Object A7H;
        synchronized (this.A00) {
            A7H = super.A7H();
        }
        return A7H;
    }

    public C12550kz(int i) {
        super(i);
        this.A00 = new Object();
    }
}

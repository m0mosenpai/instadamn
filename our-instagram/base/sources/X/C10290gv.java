package X;

/* renamed from: X.0gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10290gv implements C0h7 {
    public InterfaceC08830cm A00;
    public Object A01;

    @Override // X.C0h7, X.InterfaceC08830cm
    public final Object get() {
        if (this.A00 != null) {
            synchronized (this) {
                InterfaceC08830cm interfaceC08830cm = this.A00;
                if (interfaceC08830cm != null) {
                    this.A01 = interfaceC08830cm.get();
                    this.A00 = null;
                }
            }
        }
        return this.A01;
    }
}

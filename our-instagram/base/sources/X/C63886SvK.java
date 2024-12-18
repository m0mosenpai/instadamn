package X;

/* renamed from: X.SvK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63886SvK implements InterfaceC65610To1 {
    public volatile Object A00;
    public final /* synthetic */ InterfaceC65610To1 A01;

    public C63886SvK(InterfaceC65610To1 interfaceC65610To1) {
        this.A01 = interfaceC65610To1;
    }

    @Override // X.InterfaceC65610To1
    public final Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    Object obj = this.A01.get();
                    Rs8.A00(obj);
                    this.A00 = obj;
                }
            }
        }
        return this.A00;
    }
}

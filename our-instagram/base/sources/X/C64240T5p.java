package X;

/* renamed from: X.T5p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64240T5p implements InterfaceC65411Tji {
    public static final InterfaceC65411Tji A02 = C64241T5q.A00;
    public Object A00;
    public volatile InterfaceC65411Tji A01;

    @Override // X.InterfaceC65411Tji
    public final Object FFc() {
        InterfaceC65411Tji interfaceC65411Tji = this.A01;
        InterfaceC65411Tji interfaceC65411Tji2 = A02;
        if (interfaceC65411Tji != interfaceC65411Tji2) {
            synchronized (this) {
                if (this.A01 != interfaceC65411Tji2) {
                    Object FFc = this.A01.FFc();
                    this.A00 = FFc;
                    this.A01 = interfaceC65411Tji2;
                    return FFc;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        if (obj == A02) {
            obj = AnonymousClass001.A0g("<supplier that returned ", String.valueOf(this.A00), ">");
        }
        return AnonymousClass001.A0g("Suppliers.memoize(", String.valueOf(obj), ")");
    }
}

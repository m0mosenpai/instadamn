package X;

/* renamed from: X.Syk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64068Syk implements C0h7 {
    public final int A00;
    public volatile Object A01;

    @Override // X.C0h7, X.InterfaceC08830cm
    public final Object get() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = Y4b.A00(this.A00);
                }
            }
        }
        return this.A01;
    }

    public C64068Syk(int i) {
        this.A00 = i;
    }
}

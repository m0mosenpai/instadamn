package X;

/* renamed from: X.4kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102934kU {
    public final C1LY A00;
    public volatile Object A01;

    public final Object A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = this.A00.get();
                }
            }
        }
        return this.A01;
    }

    public C102934kU(C1LY c1ly) {
        this.A00 = c1ly;
    }
}

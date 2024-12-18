package X;

/* renamed from: X.7la, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172057la implements AnonymousClass851 {
    public boolean A00;
    public final InterfaceC25175BBx A01;

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        boolean z = true;
        if ((f == 1.0f && !this.A00) || (f == 0.0f && this.A00)) {
            if (f != 1.0f) {
                z = false;
            }
            this.A00 = z;
            this.A01.DJ3(z);
        }
    }

    public C172057la(InterfaceC25175BBx interfaceC25175BBx) {
        this.A01 = interfaceC25175BBx;
    }
}

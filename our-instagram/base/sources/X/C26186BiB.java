package X;

/* renamed from: X.BiB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26186BiB extends C0T6 implements InterfaceC30990Djp {
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public C26186BiB(Object obj, String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = z;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26186BiB) {
                C26186BiB c26186BiB = (C26186BiB) obj;
                if (!C14360o3.A0K(this.A01, c26186BiB.A01) || this.A02 != c26186BiB.A02 || !C14360o3.A0K(this.A00, c26186BiB.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0M(this.A00);
    }

    @Override // X.InterfaceC30990Djp
    public final boolean getEnabled() {
        return this.A02;
    }

    @Override // X.InterfaceC30990Djp
    public final Object getKey() {
        return this.A00;
    }
}

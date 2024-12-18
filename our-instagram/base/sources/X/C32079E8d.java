package X;

/* renamed from: X.E8d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32079E8d extends C0T6 implements InterfaceC66482zP {
    public final C5QE A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32079E8d) {
                C32079E8d c32079E8d = (C32079E8d) obj;
                if (!C14360o3.A0K(this.A01, c32079E8d.A01) || !C14360o3.A0K(this.A00, c32079E8d.A00) || this.A02 != c32079E8d.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public C32079E8d(C5QE c5qe, String str, boolean z) {
        AbstractC167017dG.A1P(str, c5qe);
        this.A01 = str;
        this.A00 = c5qe;
        this.A02 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}

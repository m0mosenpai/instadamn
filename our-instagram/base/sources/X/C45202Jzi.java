package X;

/* renamed from: X.Jzi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45202Jzi extends C0T6 implements InterfaceC66482zP {
    public final JWd A00;
    public final C51751Mta A01;
    public final C45026JwH A02;

    public C45202Jzi(JWd jWd, C51751Mta c51751Mta, C45026JwH c45026JwH) {
        C14360o3.A0B(c45026JwH, 1);
        this.A02 = c45026JwH;
        this.A01 = c51751Mta;
        this.A00 = jWd;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45202Jzi) {
                C45202Jzi c45202Jzi = (C45202Jzi) obj;
                if (!C14360o3.A0K(this.A02, c45202Jzi.A02) || !C14360o3.A0K(this.A01, c45202Jzi.A01) || !C14360o3.A0K(this.A00, c45202Jzi.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A01.A05;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}

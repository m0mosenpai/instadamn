package X;

/* renamed from: X.Mvi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51840Mvi extends C0T6 implements InterfaceC58252Prw {
    public final C38594Gxx A00;
    public final C38595Gxy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51840Mvi) {
                C51840Mvi c51840Mvi = (C51840Mvi) obj;
                if (!C14360o3.A0K(this.A00, c51840Mvi.A00) || !C14360o3.A0K(this.A01, c51840Mvi.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C51840Mvi(C38594Gxx c38594Gxx, C38595Gxy c38595Gxy) {
        this.A00 = c38594Gxx;
        this.A01 = c38595Gxy;
    }
}

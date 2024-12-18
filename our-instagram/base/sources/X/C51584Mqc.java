package X;

/* renamed from: X.Mqc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51584Mqc extends C0T6 {
    public final C38595Gxy A00;
    public final C50679MYx A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51584Mqc) {
                C51584Mqc c51584Mqc = (C51584Mqc) obj;
                if (!C14360o3.A0K(this.A01, c51584Mqc.A01) || !C14360o3.A0K(this.A00, c51584Mqc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C51584Mqc(C50679MYx c50679MYx, C38595Gxy c38595Gxy) {
        this.A01 = c50679MYx;
        this.A00 = c38595Gxy;
    }
}

package X;

/* renamed from: X.Mqe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51586Mqe extends C0T6 {
    public final C54044Nuu A00;
    public final C38595Gxy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51586Mqe) {
                C51586Mqe c51586Mqe = (C51586Mqe) obj;
                if (!C14360o3.A0K(this.A01, c51586Mqe.A01) || !C14360o3.A0K(this.A00, c51586Mqe.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C51586Mqe(C54044Nuu c54044Nuu, C38595Gxy c38595Gxy) {
        this.A01 = c38595Gxy;
        this.A00 = c54044Nuu;
    }
}

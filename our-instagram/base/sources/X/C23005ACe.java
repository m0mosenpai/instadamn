package X;

/* renamed from: X.ACe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23005ACe {
    public InterfaceC137546La A01 = null;
    public AnonymousClass585 A00 = null;
    public AnonymousClass580 A03 = null;
    public C60Y A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23005ACe) {
                C23005ACe c23005ACe = (C23005ACe) obj;
                if (!C14360o3.A0K(this.A01, c23005ACe.A01) || !C14360o3.A0K(this.A00, c23005ACe.A00) || !C14360o3.A0K(this.A03, c23005ACe.A03) || !C14360o3.A0K(this.A02, c23005ACe.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BorderCache(imageBitmap=");
        A1C.append(this.A01);
        A1C.append(", canvas=");
        A1C.append(this.A00);
        A1C.append(", canvasDrawScope=");
        A1C.append(this.A03);
        A1C.append(", borderPath=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}

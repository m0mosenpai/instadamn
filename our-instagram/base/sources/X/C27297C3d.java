package X;

/* renamed from: X.C3d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27297C3d extends AbstractC27455C9x {
    public final int A00;
    public final CWM A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27297C3d) {
                C27297C3d c27297C3d = (C27297C3d) obj;
                if (!C14360o3.A0K(this.A01, c27297C3d.A01) || this.A00 != c27297C3d.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C27297C3d(CWM cwm, int i) {
        this.A01 = cwm;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FocusedImageUpdated(focusedImage=");
        A1C.append(this.A01);
        A1C.append(", itemIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}

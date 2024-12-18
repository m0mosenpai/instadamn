package X;

/* renamed from: X.Tdu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65119Tdu extends AbstractC64541TIx implements C17w {
    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable B1t() {
        return Character.valueOf(this.A01);
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable BzZ() {
        return Character.valueOf(this.A00);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C65119Tdu) {
            if (!isEmpty() || !((C65119Tdu) obj).isEmpty()) {
                AbstractC64541TIx abstractC64541TIx = (AbstractC64541TIx) obj;
                if (this.A00 == abstractC64541TIx.A00 && this.A01 == abstractC64541TIx.A01) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C17w
    public final boolean isEmpty() {
        return AbstractC167007dF.A1O(C14360o3.A00(this.A00, this.A01));
    }

    public final String toString() {
        return AnonymousClass001.A0E("..", this.A00, this.A01);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }
}

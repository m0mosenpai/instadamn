package X;

/* renamed from: X.CVy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28001CVy {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C29466Cyg A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28001CVy) {
                C28001CVy c28001CVy = (C28001CVy) obj;
                if (!C14360o3.A0K(this.A03, c28001CVy.A03) || this.A00 != c28001CVy.A00 || this.A02 != c28001CVy.A02 || this.A01 != c28001CVy.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0G(this.A03) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31) - 2;
    }

    public C28001CVy(C29466Cyg c29466Cyg, int i, int i2, int i3) {
        this.A03 = c29466Cyg;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StackedPhotoStyleValues(photoVariant=");
        A1C.append(this.A03);
        A1C.append(", horizontalOffsetDp=");
        A1C.append(this.A00);
        A1C.append(", verticalOffsetDp=");
        A1C.append(this.A02);
        A1C.append(", photoSizeDp=");
        A1C.append(this.A01);
        A1C.append(", photoBoxClippingMarginDp=");
        return AbstractC25236BEt.A0Z(A1C, -2);
    }
}

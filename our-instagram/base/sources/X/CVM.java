package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class CVM {
    public final int A00;
    public final Drawable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVM) {
                CVM cvm = (CVM) obj;
                if (!C14360o3.A0K(this.A01, cvm.A01) || this.A00 != cvm.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public CVM(Drawable drawable, int i) {
        this.A01 = drawable;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IconStyleValues(drawable=");
        A1C.append(this.A01);
        A1C.append(", sizeDp=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}

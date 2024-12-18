package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.MvT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51825MvT extends C0T6 implements InterfaceC57817Pkj {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51825MvT) {
                C51825MvT c51825MvT = (C51825MvT) obj;
                if (!C14360o3.A0K(this.A02, c51825MvT.A02) || this.A00 != c51825MvT.A00 || this.A01 != c51825MvT.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + this.A00) * 31) + this.A01;
    }

    public C51825MvT(Drawable drawable, int i, int i2) {
        this.A02 = drawable;
        this.A00 = i;
        this.A01 = i2;
    }
}

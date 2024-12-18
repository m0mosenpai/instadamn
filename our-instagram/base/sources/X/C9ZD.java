package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9ZD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZD extends C0T6 {
    public boolean A00 = true;
    public int A01;
    public final int A02;
    public final Drawable A03;
    public final float A04;

    public C9ZD(Drawable drawable, float f, int i, int i2) {
        this.A03 = drawable;
        this.A01 = i;
        this.A04 = f;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZD) {
                C9ZD c9zd = (C9ZD) obj;
                if (!C14360o3.A0K(this.A03, c9zd.A03) || this.A01 != c9zd.A01 || this.A00 != c9zd.A00 || Float.compare(this.A04, c9zd.A04) != 0 || this.A02 != c9zd.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC167007dF.A0D(this.A00, (AbstractC166987dD.A0G(this.A03) + this.A01) * 31), this.A04) + this.A02;
    }
}

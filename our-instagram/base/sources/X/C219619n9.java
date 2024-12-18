package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219619n9 extends AbstractC223919ua {
    public final int A00;
    public final Drawable A01;

    public C219619n9(Drawable drawable, int i) {
        C14360o3.A0B(drawable, 1);
        this.A01 = drawable;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C219619n9) {
                C219619n9 c219619n9 = (C219619n9) obj;
                if (!C14360o3.A0K(this.A01, c219619n9.A01) || this.A00 != c219619n9.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }
}

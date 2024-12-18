package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219549n2 extends AbstractC223909uZ {
    public final Drawable A00;

    public C219549n2(Drawable drawable) {
        C14360o3.A0B(drawable, 1);
        this.A00 = drawable;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C219549n2) && C14360o3.A0K(this.A00, ((C219549n2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

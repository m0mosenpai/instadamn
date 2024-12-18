package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class CV9 {
    public final Drawable A00;

    public final boolean equals(Object obj) {
        Drawable drawable = this.A00;
        if (!(obj instanceof CV9) || !C14360o3.A0K(drawable, ((CV9) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        Drawable drawable = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CachedDrawable(wrappedDrawable=");
        return AbstractC167017dG.A0o(drawable, A1C);
    }

    public /* synthetic */ CV9(Drawable drawable) {
        this.A00 = drawable;
    }
}

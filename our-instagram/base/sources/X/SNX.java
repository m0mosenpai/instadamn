package X;

import android.view.View;

/* loaded from: classes10.dex */
public final class SNX {
    public final int A00;
    public final View A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof SNX) && ((SNX) obj).A00 == this.A00;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(Integer.valueOf(this.A00));
    }

    public SNX(View view, int i) {
        this.A00 = i;
        this.A01 = view;
    }
}

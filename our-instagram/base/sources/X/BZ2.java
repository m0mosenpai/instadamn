package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes5.dex */
public final class BZ2 extends ViewOutlineProvider {
    public final int A00;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public final boolean equals(Object obj) {
        BZ2 bz2;
        if (obj instanceof BZ2) {
            bz2 = (BZ2) obj;
        } else {
            bz2 = null;
        }
        if (bz2 == null || this.A00 != bz2.A00) {
            return false;
        }
        return true;
    }

    public BZ2(int i) {
        this.A00 = i;
    }

    public final int hashCode() {
        return this.A00;
    }
}

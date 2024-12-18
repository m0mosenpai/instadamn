package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2G extends Drawable.ConstantState {
    public final C62976SZw A00;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new Q2P(this);
    }

    public Q2G(C62976SZw c62976SZw) {
        this.A00 = c62976SZw;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new Q2P(this);
    }
}

package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2E extends Drawable.ConstantState {
    public int A00;
    public Drawable A01;
    public boolean A02;
    public boolean A03;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new Q2Q(resources, this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new Q2Q(null, this);
    }
}

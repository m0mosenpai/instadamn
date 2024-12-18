package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2F extends Drawable.ConstantState {
    public final int A00;
    public final String A01;
    public final Typeface A02;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new Q2J(this.A02, this.A01, this.A00);
    }

    public Q2F(Typeface typeface, String str, int i) {
        this.A01 = str;
        this.A02 = typeface;
        this.A00 = i;
    }
}

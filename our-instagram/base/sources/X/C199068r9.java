package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.8r9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199068r9 extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C199038r6 c199038r6 = new C199038r6();
        Drawable newDrawable = this.A00.newDrawable(resources);
        ((AbstractC55872hT) c199038r6).A00 = newDrawable;
        newDrawable.setCallback(c199038r6.A02);
        return c199038r6;
    }

    public C199068r9(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C199038r6 c199038r6 = new C199038r6();
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        ((AbstractC55872hT) c199038r6).A00 = newDrawable;
        newDrawable.setCallback(c199038r6.A02);
        return c199038r6;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C199038r6 c199038r6 = new C199038r6();
        Drawable newDrawable = this.A00.newDrawable();
        ((AbstractC55872hT) c199038r6).A00 = newDrawable;
        newDrawable.setCallback(c199038r6.A02);
        return c199038r6;
    }
}

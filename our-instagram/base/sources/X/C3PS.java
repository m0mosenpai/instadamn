package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.3PS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PS extends Drawable.ConstantState {
    public final Paint A00;
    public final C3PT A01;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3PR, android.graphics.drawable.Drawable] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? drawable = new Drawable();
        drawable.A00 = this;
        return drawable;
    }

    public C3PS(Paint paint) {
        this.A01 = new C3PT(paint);
        this.A00 = new Paint(6);
    }

    public C3PS(C3PS c3ps) {
        this.A01 = c3ps.A01;
        this.A00 = new Paint(c3ps.A00);
    }
}

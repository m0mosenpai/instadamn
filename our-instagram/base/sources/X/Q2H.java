package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2H extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ColorStateList A03 = null;
    public PorterDuff.Mode A07 = C55862hS.A08;
    public C63303Sh9 A08 = new C63303Sh9();

    public final void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        C63303Sh9 c63303Sh9 = this.A08;
        C63303Sh9.A00(canvas, C63303Sh9.A0G, c63303Sh9.A0F, c63303Sh9, i, i2);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C55862hS(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C55862hS(this);
    }
}

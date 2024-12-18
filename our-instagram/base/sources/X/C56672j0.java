package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.2j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56672j0 extends Drawable.ConstantState {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public ColorFilter A05;
    public PorterDuff.Mode A06;
    public Rect A07;
    public Rect A08;
    public boolean A09;
    public final C56682j1 A0A;
    public final C56662iz A0B;
    public final C56712j4 A0C;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return newDrawable(resources, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        ColorStateList colorStateList = this.A04;
        if (colorStateList != null) {
            return colorStateList.getChangingConfigurations();
        }
        return 0;
    }

    public C56672j0(ColorStateList colorStateList, ColorFilter colorFilter, PorterDuff.Mode mode, C56662iz c56662iz, int i, int i2) {
        this.A0B = c56662iz;
        this.A05 = colorFilter;
        this.A04 = colorStateList;
        this.A06 = mode;
        this.A03 = i2;
        C56682j1 c56682j1 = new C56682j1(c56662iz.A02);
        this.A0A = c56682j1;
        c56682j1.A06 = true;
        try {
            C56712j4 A00 = C56712j4.A00(c56682j1.A0E, c56682j1);
            this.A0C = A00;
            this.A02 = i;
            if (i != 255) {
                A00.A09(i);
            }
            if (colorFilter == null) {
                this.A05 = null;
            } else {
                this.A05 = colorFilter;
                A00.A0C(colorFilter);
            }
        } catch (C40U e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        if (resources == null) {
            resources = Resources.getSystem();
        }
        C56662iz c56662iz = this.A0B;
        return new C56792jC(this, AbstractC56782jB.A00(resources, c56662iz.A01), AbstractC56782jB.A00(resources, c56662iz.A00));
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null, null);
    }
}

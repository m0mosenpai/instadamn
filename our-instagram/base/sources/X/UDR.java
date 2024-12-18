package X;

import android.R;
import android.content.res.ColorStateList;

/* loaded from: classes11.dex */
public final class UDR extends UBJ {
    public static final int[][] A02 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList == null) {
            int[][] iArr = A02;
            int A01 = AbstractC1343565e.A01(this, com.facebook.R.attr.colorControlActivated);
            int A012 = AbstractC1343565e.A01(this, com.facebook.R.attr.colorSurface);
            int A013 = AbstractC1343565e.A01(this, com.facebook.R.attr.colorOnSurface);
            ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{AbstractC69853Vwe.A00(1.0f, A012, A01), AbstractC69853Vwe.A00(0.54f, A012, A013), AbstractC69853Vwe.A00(0.38f, A012, A013), AbstractC69853Vwe.A00(0.38f, A012, A013)});
            this.A01 = colorStateList2;
            return colorStateList2;
        }
        return colorStateList;
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A00 = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        setButtonTintList(colorStateList);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1262754598);
        super.onAttachedToWindow();
        if (this.A00 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
        C0f9.A0D(1972891852, A06);
    }
}

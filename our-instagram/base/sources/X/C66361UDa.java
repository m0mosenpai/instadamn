package X;

import android.R;
import android.content.res.ColorStateList;

/* renamed from: X.UDa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66361UDa extends UCq {
    public static final int[][] A02 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList == null) {
            int A01 = AbstractC1343565e.A01(this, com.facebook.R.attr.colorControlActivated);
            int A012 = AbstractC1343565e.A01(this, com.facebook.R.attr.colorOnSurface);
            int A013 = AbstractC1343565e.A01(this, com.facebook.R.attr.colorSurface);
            ColorStateList colorStateList2 = new ColorStateList(A02, new int[]{AbstractC69853Vwe.A00(1.0f, A013, A01), AbstractC69853Vwe.A00(0.54f, A013, A012), AbstractC69853Vwe.A00(0.38f, A013, A012), AbstractC69853Vwe.A00(0.38f, A013, A012)});
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
        int A06 = C0f9.A06(-699965372);
        super.onAttachedToWindow();
        if (this.A00 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
        C0f9.A0D(-1503073769, A06);
    }
}

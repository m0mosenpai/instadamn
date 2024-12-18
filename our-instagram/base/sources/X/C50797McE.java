package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.McE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50797McE extends Animation {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C50797McE(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = marginLayoutParams;
        switch (i3) {
            case 0:
            case 1:
                this.A01 = i;
                this.A02 = i2;
                break;
            default:
                this.A02 = i;
                this.A01 = i2;
                break;
        }
        this.A04 = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03;
        if (2 - i != 0) {
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = this.A01 + ((int) ((this.A02 - r1) * f));
            }
        } else {
            marginLayoutParams.topMargin = (int) (this.A02 + ((this.A01 - r2) * f));
        }
        ((View) this.A04).setLayoutParams(marginLayoutParams);
    }
}

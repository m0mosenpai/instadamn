package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.McF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50798McF extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ ViewGroup.MarginLayoutParams A05;

    public C50798McF(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        this.A05 = marginLayoutParams;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A05;
        marginLayoutParams.topMargin = (int) (this.A03 + ((this.A01 - r2) * f));
        marginLayoutParams.bottomMargin = (int) (this.A02 + ((this.A00 - r2) * f));
        this.A04.setLayoutParams(marginLayoutParams);
    }
}

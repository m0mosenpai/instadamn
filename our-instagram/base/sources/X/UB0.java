package X;

import android.graphics.Matrix;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;

/* loaded from: classes11.dex */
public final class UB0 extends ScaleAnimation {
    public final C68745VbO A00;
    public final float[] A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UB0(C68745VbO c68745VbO, float f, float f2, float f3, float f4, float f5, float f6) {
        super(f, f2, f3, f4, f5, f6);
        C14360o3.A0B(c68745VbO, 7);
        this.A00 = c68745VbO;
        this.A01 = new float[9];
    }

    @Override // android.view.animation.ScaleAnimation, android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C14360o3.A0B(transformation, 1);
        super.applyTransformation(f, transformation);
        Matrix matrix = transformation.getMatrix();
        float[] fArr = this.A01;
        matrix.getValues(fArr);
        C68745VbO c68745VbO = this.A00;
        float f2 = fArr[0];
        float f3 = fArr[4];
        WjD wjD = c68745VbO.A00;
        wjD.A00 = f2;
        wjD.A01 = f3;
    }
}

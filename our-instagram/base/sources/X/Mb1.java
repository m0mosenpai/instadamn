package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes9.dex */
public final class Mb1 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int[] A00;

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, this.A00, O0R.A00, Shader.TileMode.REPEAT);
    }

    public Mb1(int[] iArr) {
        this.A00 = iArr;
    }
}

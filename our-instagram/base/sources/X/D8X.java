package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;

/* loaded from: classes5.dex */
public final class D8X extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ Canvas A03;
    public final /* synthetic */ C25735BYv A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8X(Canvas canvas, C25735BYv c25735BYv, float f, float f2, float f3) {
        super(0);
        this.A03 = canvas;
        this.A01 = f;
        this.A02 = f2;
        this.A04 = c25735BYv;
        this.A00 = f3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Canvas canvas = this.A03;
        canvas.translate(this.A01, this.A02);
        C25735BYv c25735BYv = this.A04;
        int[] iArr = C25735BYv.A0b;
        float f = c25735BYv.A00;
        canvas.scale(f, f, 0.0f, 0.0f);
        canvas.clipOutPath(c25735BYv.A0S);
        Matrix matrix = c25735BYv.A0P;
        matrix.setScale(2.3f, 2.3f, 0.0f, 0.0f);
        matrix.preTranslate(-50.0f, -50.0f);
        LinearGradient linearGradient = c25735BYv.A0A;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        c25735BYv.A0R.setShader(c25735BYv.A0A);
        float f2 = this.A00;
        AbstractC25235BEs.A1D(canvas, new BF8(canvas, c25735BYv, f2, 3));
        AbstractC25235BEs.A1D(canvas, new BF8(canvas, c25735BYv, f2, 4));
        AbstractC25235BEs.A1D(canvas, new BF8(canvas, c25735BYv, f2, 5));
        AbstractC25235BEs.A1D(canvas, C29896DGk.A00(canvas, c25735BYv, 8));
        AbstractC25235BEs.A1D(canvas, C29896DGk.A00(canvas, c25735BYv, 9));
        return C0eB.A00;
    }
}

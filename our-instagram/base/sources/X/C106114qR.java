package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.4qR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106114qR extends AbstractC56722j5 implements InterfaceC56762j9 {
    public float A00;
    public float A01;
    public final Matrix A02;
    public final Paint A03;

    @Override // X.InterfaceC56762j9
    public final void ERi(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public C106114qR(AbstractC56612iu abstractC56612iu, C56682j1 c56682j1) {
        super(abstractC56612iu, c56682j1);
        C1349268q A02 = c56682j1.A02(abstractC56612iu.A0L);
        this.A00 = A02.A01.A01 / A02.A00.getWidth();
        this.A01 = A02.A01.A00 / A02.A00.getHeight();
        Matrix matrix = new Matrix();
        this.A02 = matrix;
        matrix.preScale(this.A00, this.A01);
        this.A03 = new Paint(1);
    }

    @Override // X.AbstractC56722j5
    public final void A07() {
        super.A07();
        Matrix matrix = this.A02;
        matrix.reset();
        float f = this.A00;
        float f2 = this.A0B.A00;
        matrix.preScale(f * f2, this.A01 * f2);
    }
}

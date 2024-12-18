package X;

import android.content.Context;
import android.graphics.RectF;

/* renamed from: X.Vqu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69530Vqu {
    public final Context A00;

    public final C68969Vf7 A00(RectF rectF, Float f, Float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i) {
        float width;
        float f14;
        float f15;
        float f16 = f6;
        float A0A = AbstractC13880nE.A0A(this.A00);
        boolean A1O = AbstractC167007dF.A1O((f3 > (f6 / f5) ? 1 : (f3 == (f6 / f5) ? 0 : -1)));
        if (f3 > rectF.width() / rectF.height()) {
            width = rectF.height() / (A0A / f3);
            f14 = rectF.left - (((A0A * width) - rectF.width()) / 2.0f);
        } else {
            width = rectF.width() / A0A;
            f14 = rectF.left;
        }
        float height = (rectF.top + f12) - (((width * f4) - rectF.height()) / 2.0f);
        if (f != null) {
            f15 = f.floatValue();
        } else if (A1O) {
            f15 = f6 / f3;
        } else {
            f15 = f5;
        }
        if (f2 != null) {
            f16 = f2.floatValue();
        } else if (!A1O) {
            f16 = f5 * f3;
        }
        return new C68969Vf7(new C69412Vmw(width, f14, height, rectF.height() / width, rectF.width() / width, f7 / width, f13, 0), new C69412Vmw(f9, f10, f11, f15, f16, f8, 0.0f, i));
    }

    public C69530Vqu(Context context) {
        this.A00 = context;
    }
}

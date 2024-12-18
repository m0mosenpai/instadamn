package X;

import android.graphics.RectF;

/* renamed from: X.Wcd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70547Wcd implements XDD {
    @Override // X.XDD
    public final C69337Vlj AT3(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f4;
        RectF rectF = WGK.A00;
        if (f >= 0.0f && f <= 1.0f) {
            if (f >= f2) {
                if (f > f3) {
                    f8 = f6;
                } else {
                    f = (f - f2) / (f3 - f2);
                }
            }
            float f9 = f8 / f4;
            float f10 = f8 / f6;
            return new C69337Vlj(f9, f10, f8, f5 * f9, f8, f7 * f10);
        }
        f8 = f4 + (f * (f6 - f4));
        float f92 = f8 / f4;
        float f102 = f8 / f6;
        return new C69337Vlj(f92, f102, f8, f5 * f92, f8, f7 * f102);
    }

    @Override // X.XDD
    public final void ACB(RectF rectF, C69337Vlj c69337Vlj, float f) {
        rectF.bottom -= Math.abs(c69337Vlj.A00 - c69337Vlj.A02) * f;
    }

    @Override // X.XDD
    public final boolean Eiy(C69337Vlj c69337Vlj) {
        return AbstractC167007dF.A1O((c69337Vlj.A02 > c69337Vlj.A00 ? 1 : (c69337Vlj.A02 == c69337Vlj.A00 ? 0 : -1)));
    }
}

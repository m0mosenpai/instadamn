package X;

import android.graphics.RectF;

/* renamed from: X.Wce, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70548Wce implements XDD {
    @Override // X.XDD
    public final C69337Vlj AT3(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f5;
        RectF rectF = WGK.A00;
        if (f >= 0.0f && f <= 1.0f) {
            if (f >= f2) {
                if (f > f3) {
                    f8 = f7;
                } else {
                    f = (f - f2) / (f3 - f2);
                }
            }
            float f9 = f8 / f5;
            float f10 = f8 / f7;
            return new C69337Vlj(f9, f10, f4 * f9, f8, f6 * f10, f8);
        }
        f8 = f5 + (f * (f7 - f5));
        float f92 = f8 / f5;
        float f102 = f8 / f7;
        return new C69337Vlj(f92, f102, f4 * f92, f8, f6 * f102, f8);
    }

    @Override // X.XDD
    public final void ACB(RectF rectF, C69337Vlj c69337Vlj, float f) {
        float abs = (Math.abs(c69337Vlj.A01 - c69337Vlj.A03) / 2.0f) * f;
        rectF.left += abs;
        rectF.right -= abs;
    }

    @Override // X.XDD
    public final boolean Eiy(C69337Vlj c69337Vlj) {
        return AbstractC167007dF.A1O((c69337Vlj.A03 > c69337Vlj.A01 ? 1 : (c69337Vlj.A03 == c69337Vlj.A01 ? 0 : -1)));
    }
}

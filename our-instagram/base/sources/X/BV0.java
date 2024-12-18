package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import com.facebook.R;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public abstract class BV0 {
    public static final C51722Yv A00(Context context, C51722Yv c51722Yv, InterfaceC30978DjZ interfaceC30978DjZ, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        InterfaceC51732Yw A0n;
        double d;
        long j;
        Integer num;
        if (interfaceC30978DjZ != null) {
            Size BK8 = interfaceC30978DjZ.BK8();
            float width = BK8.getWidth();
            float height = BK8.getHeight();
            float f4 = width / height;
            if (f > f4) {
                float f5 = width / f;
                C51722Yv A0d = AbstractC25230BEn.A0d(c51722Yv, C05F.A01, (f5 / height) * 100.0f, 0);
                if (z2) {
                    if ((z3 && !z) || (z4 && !z)) {
                        return A0d;
                    }
                    if (z3 || (z && !z4)) {
                        return AbstractC25672BWi.A00(A0d, f5, height, f2, f3);
                    }
                    float A01 = (AbstractC13880nE.A01(context, height) - 172.0f) - AbstractC13880nE.A01(context, f5);
                    if (A01 <= 24.0f) {
                        d = 0.0d;
                    } else {
                        int i2 = (int) A01;
                        for (C09530e4 c09530e4 : AbstractC25672BWi.A01) {
                            if (i2 >= ((Number) c09530e4.A00).intValue()) {
                                j = AbstractC25225BEi.A0A(AbstractC25229BEm.A0A(c09530e4) + 172);
                                num = C05F.A0j;
                                return C9CU.A00(A0d, num, 1, j);
                            }
                        }
                        throw new NoSuchElementException(MSV.A00(1));
                    }
                } else {
                    float f6 = 0.0f;
                    if (f > 0.5625f) {
                        float A012 = ((AbstractC13880nE.A01(context, height) - 168.0f) - i) - 16.0f;
                        Resources A0M = AbstractC166997dE.A0M(context);
                        float dimension = (A012 - (A0M.getDimension(R.dimen.abc_button_padding_horizontal_material) / A0M.getDisplayMetrics().density)) - AbstractC13880nE.A01(context, f5);
                        if (dimension > 0.0f) {
                            f6 = dimension / 2.0f;
                        }
                    }
                    d = f6;
                }
                j = Double.doubleToRawLongBits(d);
                num = C05F.A0N;
                return C9CU.A00(A0d, num, 1, j);
            }
            if (f < f4) {
                if (z4 && z2) {
                    A0n = AbstractC25225BEi.A0m(C05F.A01, ((width / f) / height) * 100.0f, 0);
                } else {
                    float f7 = height * f;
                    float A00 = AbstractC25227BEk.A00(width, f7);
                    c51722Yv = AbstractC25234BEr.A0C(c51722Yv, AbstractC25225BEi.A0m(C05F.A00, (f7 / width) * 100.0f, 0), 0);
                    A0n = AbstractC25225BEi.A0n(C05F.A0C, 1, AbstractC25229BEm.A0K((int) A00));
                }
                return AbstractC25225BEi.A0h(c51722Yv, A0n);
            }
            return c51722Yv;
        }
        return c51722Yv;
    }
}

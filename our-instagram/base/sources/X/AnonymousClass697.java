package X;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.697, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass697 {
    public static Shader A00(C1349768w c1349768w, AbstractC1348968m abstractC1348968m, C3LS c3ls, C1349968y c1349968y, float f, float f2, float f3, float f4) {
        C1349768w c1349768w2 = (C1349768w) C3LT.A00(abstractC1348968m.A01, c1349768w, abstractC1348968m.A02, f, f4);
        float[] fArr = null;
        if (c1349768w2 != null) {
            C1349968y c1349968y2 = (C1349968y) C3LT.A00(abstractC1348968m.A08, c1349968y, abstractC1348968m.A03, f, f4);
            C3LS c3ls2 = (C3LS) C3LT.A00(abstractC1348968m.A07, c3ls, abstractC1348968m.A05, f, f4);
            if (c3ls2 != null) {
                float f5 = c3ls2.A00 * f2;
                float f6 = c3ls2.A01 * f3;
                C3LS c3ls3 = (C3LS) C3LT.A00(abstractC1348968m.A06, c3ls, abstractC1348968m.A04, f, f4);
                if (c3ls3 != null) {
                    float f7 = c3ls3.A00 * f2;
                    float f8 = c3ls3.A01 * f3;
                    if (abstractC1348968m.A00 == 1) {
                        float max = Math.max((float) Math.hypot(f7 - f5, f8 - f6), 0.001f);
                        int[] A00 = c1349768w2.A00();
                        if (c1349968y2 != null) {
                            fArr = c1349968y2.A01;
                        }
                        return new RadialGradient(f5, f6, max, A00, fArr, Shader.TileMode.CLAMP);
                    }
                    int[] A002 = c1349768w2.A00();
                    if (c1349968y2 != null) {
                        fArr = c1349968y2.A01;
                    }
                    return new LinearGradient(f5, f6, f7, f8, A002, fArr, Shader.TileMode.CLAMP);
                }
            }
        }
        return null;
    }
}

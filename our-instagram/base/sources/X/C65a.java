package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.65a, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65a {

    @Deprecated
    public float A00;

    @Deprecated
    public float A01;

    @Deprecated
    public float A02;

    @Deprecated
    public float A03;

    @Deprecated
    public float A04;
    public final List A06 = new ArrayList();
    public final List A05 = new ArrayList();

    public final void A02(float f, float f2, float f3) {
        this.A04 = f;
        this.A02 = 0.0f;
        this.A03 = f;
        this.A00 = f2;
        this.A01 = (f2 + f3) % 360.0f;
        this.A06.clear();
        this.A05.clear();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.72J, X.72K] */
    public static void A00(C65a c65a, float f) {
        float f2 = c65a.A00;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = c65a.A02;
                float f5 = c65a.A03;
                ?? c72k = new C72K();
                c72k.A01 = f4;
                c72k.A05 = f5;
                c72k.A02 = f4;
                c72k.A00 = f5;
                c72k.A03 = c65a.A00;
                c72k.A04 = f3;
                c65a.A05.add(new C72L(c72k));
                c65a.A00 = f;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.72N, X.72K, java.lang.Object] */
    public final void A01(float f, float f2) {
        ?? c72k = new C72K();
        c72k.A00 = f;
        c72k.A01 = f2;
        this.A06.add(c72k);
        C72O c72o = new C72O(c72k, this.A02, this.A03);
        C72N c72n = c72o.A02;
        float degrees = ((float) Math.toDegrees(Math.atan((c72n.A01 - c72o.A01) / (c72n.A00 - c72o.A00)))) + 270.0f;
        A00(this, degrees);
        this.A05.add(c72o);
        this.A00 = degrees;
        this.A02 = f;
        this.A03 = f2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.72J, X.72K, java.lang.Object] */
    public final void A03(float f, float f2, float f3, float f4, float f5) {
        float f6;
        float f7 = 180.0f;
        ?? c72k = new C72K();
        c72k.A01 = f;
        c72k.A05 = f2;
        c72k.A02 = f3;
        c72k.A00 = f4;
        c72k.A03 = 180.0f;
        c72k.A04 = f5;
        this.A06.add(c72k);
        C72L c72l = new C72L(c72k);
        float f8 = 180.0f + f5;
        if (f5 < 0.0f) {
            f7 = (180.0f + 180.0f) % 360.0f;
            f6 = (180.0f + f8) % 360.0f;
        } else {
            f6 = f8;
        }
        A00(this, f7);
        this.A05.add(c72l);
        this.A00 = f6;
        double radians = Math.toRadians(f8);
        this.A02 = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(radians)));
        this.A03 = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(radians)));
    }

    public final void A04(Matrix matrix, Path path) {
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C72K c72k = (C72K) list.get(i);
            if (c72k instanceof C72J) {
                C72J c72j = (C72J) c72k;
                Matrix matrix2 = ((C72K) c72j).A00;
                matrix.invert(matrix2);
                path.transform(matrix2);
                RectF rectF = C72J.A06;
                rectF.set(c72j.A01, c72j.A05, c72j.A02, c72j.A00);
                path.arcTo(rectF, c72j.A03, c72j.A04, false);
            } else {
                C72N c72n = (C72N) c72k;
                Matrix matrix3 = ((C72K) c72n).A00;
                matrix.invert(matrix3);
                path.transform(matrix3);
                path.lineTo(c72n.A00, c72n.A01);
            }
            path.transform(matrix);
        }
    }

    public C65a() {
        A02(0.0f, 270.0f, 0.0f);
    }
}

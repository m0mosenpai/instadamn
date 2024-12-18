package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.util.List;

/* renamed from: X.Vv7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69770Vv7 {
    public int A00;
    public C69104Vhu A02;
    public final AccelerateDecelerateInterpolator A03 = new AccelerateDecelerateInterpolator();
    public final AccelerateInterpolator A04 = new AccelerateInterpolator();
    public List A01 = C16930sl.A00;

    public final void A02(List list) {
        C14360o3.A0B(list, 0);
        if (!C14360o3.A0K(this.A01, list)) {
            this.A01 = list;
            this.A02 = null;
        }
    }

    public final C69104Vhu A00() {
        C69104Vhu c69104Vhu = this.A02;
        if (c69104Vhu == null) {
            if (this.A01.isEmpty()) {
                c69104Vhu = null;
            } else {
                int A00 = VW8.A00(this.A01, this.A00);
                US9 us9 = (US9) this.A01.get(A00);
                float A002 = this.A00 - us9.A00();
                AccelerateInterpolator accelerateInterpolator = this.A04;
                float f = us9.A02;
                float f2 = us9.A01;
                float f3 = ((int) (f / f2)) - ((int) (us9.A04 / f2));
                float f4 = 500.0f - 0.0f;
                float f5 = 1.0f - 0.0f;
                float f6 = 0.0f;
                if (f4 != 0.0f) {
                    f6 = (f3 - 0.0f) / f4;
                }
                float A02 = C17s.A02(accelerateInterpolator.getInterpolation((f6 * f5) + 0.0f), 0.0f, 1.0f) * 400.0f;
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.A03;
                float f7 = A02 - 0.0f;
                float f8 = 0.0f;
                if (f7 != 0.0f) {
                    f8 = (A002 - 0.0f) / f7;
                }
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(C17s.A02((f8 * f5) + 0.0f, 0.0f, 1.0f));
                boolean z = false;
                if (((US9) this.A01.get(0)).A04 <= this.A00) {
                    z = true;
                }
                c69104Vhu = new C69104Vhu(A00, interpolation, z);
            }
            this.A02 = c69104Vhu;
        }
        return c69104Vhu;
    }

    public final void A01(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A02 = null;
        }
    }
}

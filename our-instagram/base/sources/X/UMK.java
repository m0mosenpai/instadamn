package X;

import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public abstract class UMK extends AbstractC58712mU {
    public abstract void A04(Bitmap bitmap);

    @Override // X.AbstractC58712mU
    public final void A02(C1W1 c1w1) {
        if (c1w1.A08()) {
            C1VO c1vo = (C1VO) c1w1.A02();
            Bitmap bitmap = null;
            if (c1vo != null && (c1vo.A04() instanceof C3QE)) {
                bitmap = ((C3QE) c1vo.A04()).CCP();
            }
            try {
                A04(bitmap);
            } finally {
                C1VO.A01(c1vo);
            }
        }
    }
}

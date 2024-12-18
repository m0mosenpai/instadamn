package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: X.BkV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26324BkV extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C29467Cyh A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC30923Dia A00 = AbstractC28337CeP.A00(c76223bS);
        C29467Cyh c29467Cyh = this.A01;
        CVM cvm = (CVM) AbstractC28337CeP.A02(c76223bS, c29467Cyh);
        Drawable drawable = (Drawable) AbstractC77183d4.A00(c76223bS, C29890DGe.A00(cvm, 7), Arrays.copyOf(new Object[]{c29467Cyh, A00}, 2));
        if (drawable == null) {
            drawable = null;
        }
        if (drawable == null) {
            return null;
        }
        long A0A = AbstractC25225BEi.A0A(cvm.A00);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0L = AbstractC25234BEr.A0L(null, C05F.A00, 0, A0A);
        C51722Yv c51722Yv = this.A00;
        if (c51722Yv != null) {
            A0L = c51722Yv.A00(A0L);
        }
        return new C26611Bp8(drawable, ImageView.ScaleType.CENTER_CROP, A0L, 0, false);
    }

    public C26324BkV(C51722Yv c51722Yv, C29467Cyh c29467Cyh) {
        this.A01 = c29467Cyh;
        this.A00 = c51722Yv;
    }
}

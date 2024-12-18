package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.BkW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26325BkW extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C29464Cye A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        CVN cvn = (CVN) AbstractC28337CeP.A02(c76223bS, this.A01);
        long A0A = AbstractC25225BEi.A0A(cvn.A00);
        Drawable A00 = AbstractC27723CKq.A00(c76223bS, C29890DGe.A00(cvn, 10), new Object[]{cvn});
        C51722Yv c51722Yv = this.A00;
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A00, 0, A0A);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        return new C26611Bp8(A00, ImageView.ScaleType.CENTER_CROP, C9CU.A00(AbstractC25225BEi.A0h(c51722Yv, A0n), C05F.A01, 0, A0A), 0, false);
    }

    public C26325BkW(C51722Yv c51722Yv, C29464Cye c29464Cye) {
        this.A01 = c29464Cye;
        this.A00 = c51722Yv;
    }
}

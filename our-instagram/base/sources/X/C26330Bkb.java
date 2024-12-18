package X;

import android.widget.ImageView;

/* renamed from: X.Bkb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26330Bkb extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C87 A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        return new C26436BmJ(AbstractC28406CgC.A03(c76223bS, this.A01, null, null), ImageView.ScaleType.CENTER_CROP, this.A00, 0, false);
    }

    public C26330Bkb(C51722Yv c51722Yv, C87 c87) {
        this.A01 = c87;
        this.A00 = c51722Yv;
    }
}

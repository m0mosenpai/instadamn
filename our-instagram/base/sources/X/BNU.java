package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public final class BNU extends AbstractC77583di {
    public static final C51532Yb A04 = AbstractC25230BEn.A0i(BNY.A00, 5);
    public final Drawable A00;
    public final ImageView.ScaleType A01;
    public final boolean A02;
    public final C51722Yv A03;

    public BNU(Drawable drawable, ImageView.ScaleType scaleType, C51722Yv c51722Yv, boolean z) {
        C14360o3.A0B(drawable, 1);
        this.A00 = drawable;
        this.A02 = z;
        this.A01 = scaleType;
        this.A03 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return new C78053eX(this.A03, new BNV(this.A00, this.A01), new C2YP(A04, BNZ.A00, new C57745PjY(this, 3), c77993eR.A01()));
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Bp8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26611Bp8 extends AbstractC77583di {
    public final int A00;
    public final Drawable A01;
    public final ImageView.ScaleType A02;
    public final boolean A03;
    public final C51722Yv A04;

    public C26611Bp8(Drawable drawable, ImageView.ScaleType scaleType, C51722Yv c51722Yv, int i, boolean z) {
        C14360o3.A0B(scaleType, 2);
        this.A01 = drawable;
        this.A02 = scaleType;
        this.A03 = z;
        this.A00 = i;
        this.A04 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        Drawable drawable = this.A01;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        return AbstractC25225BEi.A0g(this.A04, new C2YY(intrinsicWidth / intrinsicHeight, intrinsicWidth | 9221401712017801216L, intrinsicHeight | 9221401712017801216L), new C2YP(AbstractC25230BEn.A0i(C29004Cqt.A00, 15), null, C30179DRk.A01(this, 49), c77993eR.A01()));
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.BpS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26631BpS extends AbstractC77583di {
    public static final C51532Yb A04 = AbstractC25232BEp.A1A(C28995Cqk.A00);
    public final int A00;
    public final Drawable A01;
    public final ImageView.ScaleType A02;
    public final C51722Yv A03;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A03, C29054Crh.A00, AbstractC25229BEm.A0c(c77993eR, A04, C29794DCm.A00, new C57745PjY(this, 2)));
    }

    public C26631BpS(Drawable drawable, ImageView.ScaleType scaleType, C51722Yv c51722Yv, int i) {
        this.A02 = scaleType;
        this.A00 = i;
        this.A01 = drawable;
        this.A03 = c51722Yv;
    }
}

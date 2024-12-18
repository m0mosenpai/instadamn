package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.BmJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26436BmJ extends AbstractC51572Yf {
    public final Drawable A00;
    public final int A01;
    public final ImageView.ScaleType A02;
    public final C51722Yv A03;
    public final boolean A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Drawable A00 = AbstractC27723CKq.A00(c76223bS, C29905DGt.A01(this, 9), new Object[]{this.A00});
        C51722Yv c51722Yv = this.A03;
        return new C26611Bp8(A00, this.A02, c51722Yv, this.A01, this.A04);
    }

    public C26436BmJ(Drawable drawable, ImageView.ScaleType scaleType, C51722Yv c51722Yv, int i, boolean z) {
        this.A00 = drawable;
        this.A02 = scaleType;
        this.A04 = z;
        this.A01 = i;
        this.A03 = c51722Yv;
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

/* renamed from: X.BnA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26489BnA extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final long A02;
    public final boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C51722Yv A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        int i = this.A04;
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(AbstractC25228BEl.A07(c76223bS, this.A06), i);
        Drawable A00 = AbstractC27723CKq.A00(c76223bS, C29896DGk.A00(c76223bS, this, 1), new Object[]{Boolean.valueOf(this.A03), Integer.valueOf(this.A01), AbstractC25225BEi.A0p(this.A02), Integer.valueOf(this.A00)});
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        C51722Yv c51722Yv = this.A07;
        long j = this.A05;
        Integer num = C05F.A00;
        C9CU A0n = AbstractC25225BEi.A0n(num, 0, j);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        return new C26611Bp8(A00, scaleType, AbstractC25233BEq.A0V(AbstractC25225BEi.A0h(c51722Yv, A0n), AbstractC25225BEi.A0n(C05F.A01, 0, j), num, gradientDrawable, 4), 0, false);
    }

    public C26489BnA(C51722Yv c51722Yv, int i, int i2, int i3, long j, long j2, long j3, boolean z) {
        C14360o3.A0B(c51722Yv, 8);
        this.A00 = i;
        this.A02 = j;
        this.A05 = j2;
        this.A04 = i2;
        this.A06 = j3;
        this.A03 = z;
        this.A01 = i3;
        this.A07 = c51722Yv;
    }
}

package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.BpC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26615BpC extends AbstractC77583di {
    public final Drawable A02;
    public final Drawable A03;
    public final Drawable A04;
    public final C51722Yv A05;
    public final int A01 = 125;
    public final int A00 = 238;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        long A01 = c77993eR.A01();
        Drawable drawable = this.A03;
        Drawable drawable2 = this.A02;
        Drawable drawable3 = this.A04;
        return new C78053eX(this.A05, new C2YM(new C2YW(0, 0), new C2YP(AbstractC25230BEn.A0j(new C28967CqI(drawable, drawable2, drawable3, this.A01, this.A00), false), null, new C30184DRp(41, drawable, drawable2, drawable3), A01)));
    }

    public C26615BpC(Drawable drawable, Drawable drawable2, Drawable drawable3, C51722Yv c51722Yv) {
        this.A05 = c51722Yv;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A04 = drawable3;
    }
}

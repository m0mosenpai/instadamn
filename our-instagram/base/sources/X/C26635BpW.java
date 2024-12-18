package X;

import android.view.View;

/* renamed from: X.BpW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26635BpW extends AbstractC77583di {
    public static final C51532Yb A05 = AbstractC25232BEp.A1A(C28994Cqj.A00);
    public final View.OnClickListener A00;
    public final EnumC99714dp A01;
    public final EnumC99704do A02;
    public final String A03;
    public final C51722Yv A04;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A04, new C29043CrW(this.A01, this.A02, this.A03), AbstractC25229BEm.A0c(c77993eR, A05, C29793DCl.A00, new C57745PjY(this, 1)));
    }

    public C26635BpW(View.OnClickListener onClickListener, C51722Yv c51722Yv, EnumC99714dp enumC99714dp, EnumC99704do enumC99704do, String str) {
        this.A02 = enumC99704do;
        this.A01 = enumC99714dp;
        this.A03 = str;
        this.A00 = onClickListener;
        this.A04 = c51722Yv;
    }
}

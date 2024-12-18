package X;

import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Wn0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71045Wn0 implements InterfaceC150976qx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ WEW A04;
    public final /* synthetic */ RoundedCornerFrameLayout A05;

    public C71045Wn0(WEW wew, RoundedCornerFrameLayout roundedCornerFrameLayout, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A05 = roundedCornerFrameLayout;
        this.A04 = wew;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        double d = f;
        float A03 = (float) AbstractC70163Da.A03(d, this.A00, this.A02);
        float A032 = (float) AbstractC70163Da.A03(d, this.A01, this.A03);
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A05;
        WEW wew = this.A04;
        roundedCornerFrameLayout.setCornerRadius((int) AbstractC70163Da.A03(d, AbstractC13880nE.A04(wew.A06, 20), 0.0d));
        wew.A07.setAlpha(f);
        AbstractC65702TsY.A11(roundedCornerFrameLayout, A03, A032);
    }
}

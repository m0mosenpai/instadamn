package X;

import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Wmy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71043Wmy implements InterfaceC150976qx {
    public final /* synthetic */ WEW A00;
    public final /* synthetic */ C69412Vmw A01;
    public final /* synthetic */ C69412Vmw A02;
    public final /* synthetic */ boolean A03;

    public C71043Wmy(WEW wew, C69412Vmw c69412Vmw, C69412Vmw c69412Vmw2, boolean z) {
        this.A02 = c69412Vmw;
        this.A01 = c69412Vmw2;
        this.A00 = wew;
        this.A03 = z;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        float f2 = this.A02.A00;
        C69412Vmw c69412Vmw = this.A01;
        double d = f;
        float A03 = (float) AbstractC70163Da.A03(d, f2, c69412Vmw.A00);
        float A032 = (float) AbstractC70163Da.A03(d, r1.A01, c69412Vmw.A01);
        WEW wew = this.A00;
        RoundedCornerFrameLayout roundedCornerFrameLayout = wew.A0C;
        AbstractC65702TsY.A11(roundedCornerFrameLayout, A03, A032);
        roundedCornerFrameLayout.setCornerRadius((int) AbstractC70163Da.A03(d, r1.A03, c69412Vmw.A03));
        if (this.A03) {
            wew.A07.setAlpha((float) AbstractC70163Da.A03(d, r1.A07, c69412Vmw.A07));
        }
    }
}

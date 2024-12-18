package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.Wls, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70984Wls implements InterfaceC81393k9 {
    public final /* synthetic */ C1571173q A00;

    @Override // X.InterfaceC81393k9
    public final void DKx(C6T7 c6t7, C69244VkC c69244VkC) {
        C1571173q c1571173q = this.A00;
        C1571173q.A00(c1571173q);
        FrameLayout frameLayout = c1571173q.A00;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        c1571173q.A02 = c6t7;
        C126545np c126545np = c1571173q.A01;
        if (c126545np != null) {
            c126545np.setVisibility(8);
            C6T7 c6t72 = c1571173q.A02;
            if (c6t72 != null) {
                c6t72.A07(c126545np);
            }
            c126545np.measure(View.MeasureSpec.makeMeasureSpec(AbstractC13880nE.A0A(AbstractC166997dE.A0L(c126545np)), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
            c126545np.setTranslationY(c126545np.getMeasuredHeight());
            c126545np.setVisibility(0);
        }
        C55982hj c55982hj = c1571173q.A03;
        c55982hj.A08(-1.0d, true);
        c55982hj.A04();
        c69244VkC.A02.Dcq(c69244VkC.A01);
    }

    public C70984Wls(C1571173q c1571173q) {
        this.A00 = c1571173q;
    }

    @Override // X.InterfaceC81393k9
    public final void DPm(String str) {
        AbstractC167007dF.A0x(this.A00.A00);
    }
}
